package info.kwarc.mmt.MMTProject;

import info.kwarc.mmt.api.wrappers.MMTController;
import info.kwarc.mmt.api.wrappers.MMTReport;

import java.util.ArrayList;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public class MMTNature implements IProjectNature {

	/**
	 * ID of this project nature
	 */
	public static final String NATURE_ID = "MMTProject.mmtnature";

	private IProject project;

	MMTController controller = null;
	NatureLogForwarder logForwarder;
	
	public MMTNature() {
		logForwarder = new NatureLogForwarder();
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
			controller = new MMTController(logForwarder);
			controller.setCompiler("/home/costea/kwarc/twelf/twelf-mod/bin/twelf-server");
			controller.RegisterArchive(project.getLocation().toFile());
		} catch (Exception E) {
			controller = null;
		}
	}
	
	public MMTController getController() {
		if (project != null && controller == null)
			initController();
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
