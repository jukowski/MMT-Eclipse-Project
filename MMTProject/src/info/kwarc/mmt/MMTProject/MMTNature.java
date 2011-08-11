package info.kwarc.mmt.MMTProject;

import info.kwarc.mmt.api.wrappers.MMTController;
import info.kwarc.mmt.api.wrappers.MMTReport;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

public class MMTNature implements IProjectNature {

	/**
	 * ID of this project nature
	 */
	public static final String NATURE_ID = "MMTProject.mmtnature";

	private IProject project;

	Set<String> registeredProjects;
	
	MMTController controller = null;
	NatureLogForwarder logForwarder;
	
	public MMTNature() {
		logForwarder = new NatureLogForwarder();
		registeredProjects = new java.util.HashSet<String>();
	}
	
	public List<String> computeAuto(String URI, String prefix) {
		ArrayList<String> result = new ArrayList<String>();
		info.kwarc.mmt.api.wrappers.MMTModule mod = controller.getModule(URI);
		List<info.kwarc.mmt.api.wrappers.MMTCompletion> rr = mod.getSymbols(prefix);
		for (info.kwarc.mmt.api.wrappers.MMTCompletion c : rr) {
			if (c.getChildren().size()==0)
				result.add(c.getTop());
			else {
				for (String suffix: c.getChildren()) {
					if (suffix.startsWith("["))
						continue;
					result.add(c.getTop()+"/"+suffix);
				}
			}
		}
		return result;
	}
	
	class NatureLogForwarder implements MMTReport {
		
		ArrayList<MMTReport> handlers;
		
		public NatureLogForwarder() {
			handlers = new ArrayList<MMTReport>();
		}
		
		public void addHandler(MMTReport report) {
			handlers.add(report);
		}
		
		@Override
		public void handle(String arg0, String arg1) {
			for (MMTReport rep : handlers) {
				rep.handle(arg0, arg1);
			}
		}
	}
	
	public void addErrorHandler(MMTReport report) {
		logForwarder.addHandler(report);
	}
	
	void initController() {
		try {
			Logger.getAnonymousLogger().info("Init Controller for Project "+project.getName());
			controller = new MMTController(logForwarder);
			String twelf_compiler = Activator.getDefault().getPreferenceStore().getString("TWELF_BIN");
			String catalogFile = Activator.getDefault().getPreferenceStore().getString("CATALOG_FILE");
			File f = new File(catalogFile);
			if (!f.exists()) {
				logForwarder.handle("eclipse_warning", "No catalog file was set! To set one please go to Windows->Preferences->LF->TWELF");				
			} else {
				controller.addCatalogFile(f.getAbsolutePath());
			}
			
			f = new File(twelf_compiler);
			if (!f.exists()) {
				logForwarder.handle("eclipse_error", "TWELF compiler not found! Please change the path by going to Windows->Preferences->LF->TWELF");
				controller = null;
			} else {
				Logger.getAnonymousLogger().info("Setting compiler to "+twelf_compiler);
				controller.setCompiler(twelf_compiler);
			}
		} catch (Exception E) {
			logForwarder.handle("eclipse_error", E.getMessage());
			E.printStackTrace();
			controller = null;
		}
	}

	
	
	public MMTController getController(IProject project) {
		if (controller == null)
			initController();

		if (controller == null)
			return null;
		
		if (registeredProjects.contains(project.getName())) 
			return controller;
		
		IPath path = project.getLocation();
		if (path == null)
			return controller;
		controller.RegisterArchive(new File(project.getLocation().toOSString()));
		registeredProjects.add(project.getName());
		IFolder folder = project.getFolder("mars");
		try {
			for (IResource res : folder.members()) {
				String name = res.getName();
				if (res instanceof IFile) {
					IFile file = (IFile) res;
					if (name.endsWith(".mar")) {
						String marName = name.substring(0, name.length()-4);
						IFolder marFolder = folder.getFolder(marName);
						if (!marFolder.exists()) {
							MMTProjectUtils.createFolder(marFolder);
							MMTProjectUtils.doUnzip(file.getLocation().toOSString(), marFolder.getLocation().toOSString());
							controller.RegisterArchive(new File(marFolder.getLocation().toOSString()));
						}
					}
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return controller;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#configure()
	 */
	public void configure() throws CoreException {
		IProjectDescription desc = project.getDescription();
		ICommand[] commands = desc.getBuildSpec();

		for (int i = 0; i < commands.length; ++i) {
			if (commands[i].getBuilderName().equals(LFBuilder.BUILDER_ID)) {
				return;
			}
		}

		ICommand[] newCommands = new ICommand[commands.length + 1];
		System.arraycopy(commands, 0, newCommands, 0, commands.length);
		ICommand command = desc.newCommand();
		command.setBuilderName(LFBuilder.BUILDER_ID);
		newCommands[newCommands.length - 1] = command;
		desc.setBuildSpec(newCommands);
		project.setDescription(desc, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#deconfigure()
	 */
	public void deconfigure() throws CoreException {
		IProjectDescription description = getProject().getDescription();
		ICommand[] commands = description.getBuildSpec();
		for (int i = 0; i < commands.length; ++i) {
			if (commands[i].getBuilderName().equals(LFBuilder.BUILDER_ID)) {
				ICommand[] newCommands = new ICommand[commands.length - 1];
				System.arraycopy(commands, 0, newCommands, 0, i);
				System.arraycopy(commands, i + 1, newCommands, i,
						commands.length - i - 1);
				description.setBuildSpec(newCommands);
				project.setDescription(description, null);			
				return;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#getProject()
	 */
	public IProject getProject() {
		return project;
	}

	/*
	 * (non-Javadoc) 
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#setProject(org.eclipse.core.resources.IProject)
	 */
	public void setProject(IProject project) {
		this.project = project;
	}

}
