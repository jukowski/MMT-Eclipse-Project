package info.kwarc.mmt.MMTProject;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public class MMTProjectUtils {

/**
 * 
 * @param projectName
 * @param options
 * @param monitor
 * @return
 */
    public static IProject createProject(String projectName, Map<String, String> options, IProgressMonitor monitor) {
        Assert.isNotNull(projectName);
        Assert.isTrue(projectName.trim().length() > 0);

        IProject project = createBaseProject(projectName, monitor);
        try {
            addNature(project);

            String[] paths = { "source", "content", "compiled", "presentation", "narration", "relational", "META-INF", "mars" }; //$NON-NLS-1$ //$NON-NLS-2$
            addToProjectStructure(project, paths);
            
            addManifest(project, options, monitor);
        } catch (CoreException e) {
            e.printStackTrace();
            project = null;
        }

        return project;
    }

    /**
     * Create the MANIFEST.MF file 
     * @param project
     */
    public static void addManifest(IProject project, Map <String, String> options, IProgressMonitor monitor) {
        IFile manifest = project.getFile("META-INF/MANIFEST.MF");
        String content = "id: "+project.getName()+"\n" +
        				 "source: twelf\n";
        if (options!= null) {
        	for (String key : options.keySet()) {
        		content += key+" : "+options.get(key)+"\n";
        	}
        }
        InputStream buff;
		try {
			buff = new ByteArrayInputStream(content.getBytes("UTF-8"));
			manifest.create(buff, true, monitor);
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    /**
     * Just do the basics: create a basic project.
     *
     * @param location
     * @param projectName
     */
    private static IProject createBaseProject(String projectName, IProgressMonitor monitor) {
        IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
    	
        if (!newProject.exists()) {
            try {
                newProject.create(monitor);
                if (!newProject.isOpen()) {
                    newProject.open(null);
                }
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }

        return newProject;
    }

    private static void createFolder(IFolder folder) throws CoreException {
        IContainer parent = folder.getParent();
        if (parent instanceof IFolder) {
            createFolder((IFolder) parent);
        }
        if (!folder.exists()) {
            folder.create(false, true, null);
        }
    }

    /**
     * Create a folder structure with a parent root, overlay, and a few child
     * folders.
     *
     * @param newProject
     * @param paths
     * @throws CoreException
     */
    private static void addToProjectStructure(IProject newProject, String[] paths) throws CoreException {
        for (String path : paths) {
            IFolder etcFolders = newProject.getFolder(path);
            createFolder(etcFolders);
        }
    }

    private static void addNature(IProject project) throws CoreException {
        if (!project.hasNature(MMTNature.NATURE_ID)) {
            IProjectDescription description = project.getDescription();
            String[] prevNatures = description.getNatureIds();
            String[] newNatures = new String[prevNatures.length + 1];
            System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
            newNatures[prevNatures.length] = MMTNature.NATURE_ID;
            description.setNatureIds(newNatures);

            IProgressMonitor monitor = null;
            project.setDescription(description, monitor);
        }
    }

}
