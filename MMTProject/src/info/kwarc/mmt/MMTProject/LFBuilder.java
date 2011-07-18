package info.kwarc.mmt.MMTProject;

import info.kwarc.mmt.api.wrappers.MMTArchive;
import info.kwarc.mmt.api.wrappers.MMTController;
import info.kwarc.mmt.api.wrappers.MMTReport;

import java.util.ArrayList;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public class LFBuilder extends IncrementalProjectBuilder {

	class MMTVisitor implements IResourceDeltaVisitor {
		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse.core.resources.IResourceDelta)
		 */
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				// handle added resource
				break;
			case IResourceDelta.REMOVED:
				// handle removed resource
				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
				break;
			}
			//return true to continue visiting children.
			return true;
		}
	}

	class SampleResourceVisitor implements IResourceVisitor {
		public boolean visit(IResource resource) {
			//return true to continue visiting children.
			return true;
		}
	}

	public static final String BUILDER_ID = "MMTProject.lfbuilder";

	private static final String MARKER_TYPE = "MMTProject.TWELFProblem";

	private void addMarker(IFile file, String message, int lineBegin, int lineEnd, int colBegin, int colEnd,
			int severity) {
		try {
			IMarker marker = file.createMarker(MARKER_TYPE);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.SEVERITY, severity);
			marker.setAttribute(IMarker.LINE_NUMBER, lineBegin);
		} catch (CoreException e) {
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 *      java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		if (kind == FULL_BUILD) {
			fullBuild(monitor);
		} else {
			/*IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}*/
			fullBuild(monitor);			
		}
		return null;
	}



	private void deleteMarkers(IFile file) {
		try {
			file.deleteMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
		} catch (CoreException ce) {
		}
	}

	class CompileErrorHandler implements MMTReport {

		String currentFile;
	
		public String getProjectRelativePath(String fullPath) {
			String search = getProject().getName()+"/"+"source/";
			int pos = fullPath.indexOf(search);
			if (pos == -1) 
				return "/";
			return "source/"+fullPath.substring(pos+search.length());
		}
		
		@Override
		public void handle(String arg0, String arg1) {
			Matcher m;
			if (arg0.equals("archive")) {
				m = compileFilePattern.matcher(arg1);
				if (m.matches()) {
					currentFile = getProjectRelativePath(m.group(1));
					deleteMarkers(getProject().getFile(currentFile));
					return;
				}
				m = errorPattern.matcher(arg1);
				if (m.find()) {
					currentFile = getProjectRelativePath(m.group(1));
					int firstLine = Integer.parseInt(m.group(2));
					int lastLine = Integer.parseInt(m.group(4));
					int firstColumn = Integer.parseInt(m.group(3));
					int lastColumn = Integer.parseInt(m.group(5));
					LFBuilder.this.addMarker(getProject().getFile(currentFile), arg1.substring(m.end()), firstLine, lastLine, firstColumn, lastColumn, IMarker.SEVERITY_ERROR);
				} else
				Logger.getAnonymousLogger().info(arg1);
			}
			if (arg0.equals("eclipse_error")) {
				IMarker err;
				try {
					err = getProject().getFolder("source").createMarker(MARKER_TYPE);
					err.setAttribute(IMarker.MESSAGE, arg1);
					err.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	static boolean initialized = false;
	final Pattern compileFilePattern = Pattern.compile("\\[[A-Za-z\\->]*\\] ([^>]*) -> (.*)");
	final Pattern errorPattern = Pattern.compile("\\[[A-Za-z\\->]*\\] ([^#]*)#([0-9]+)\\.([0-9]+)-([0-9]+)\\.([0-9]+)(.*)$", Pattern.MULTILINE);
	
	protected void initLogger(MMTNature nature) {
		if (!initialized) {
			nature.addErrorHandler(new CompileErrorHandler());
			initialized = true;
		}
	}
	
	protected void fullBuild(final IProgressMonitor monitor)
			throws CoreException {
		try {
			MMTNature nature = (MMTNature) getProject().getNature(MMTNature.NATURE_ID);
			initLogger(nature);
			MMTController controller = nature.getController();
			if (controller != null) {
				ArrayList<String> paths = new ArrayList<String>();
				paths.add("/");
				MMTArchive arch = controller.getArchive(getProject().getName()); 
				arch.compile(paths);
			}
		} catch (CoreException e) {
		}
	}

	protected void incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor) throws CoreException {
		// the visitor does the work.
		delta.accept(new MMTVisitor());
	}
}
