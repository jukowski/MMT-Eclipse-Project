package apc;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public class APCUtils {
	
	public static EObject getDocumentRoot(XtextDocument doc) {
		EObject rootObj = doc.readOnly(new IUnitOfWork<EObject, XtextResource>(){
			@Override
			public EObject exec(XtextResource state) throws Exception {
				EObject root = ((XtextResource)state).getContents().get(0);
				return root;
			}
		});
		return rootObj;
	}	
	
	public static String SaveToString(InputStream stream) {
		byte [] buffer = new byte[4096];
		StringBuilder builder = new StringBuilder();
		int read =0;
		try {
			do {
				read = stream.read(buffer);
				if (read > 0)
					builder.append(buffer);
			} while (read > 0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return builder.toString();	
	}

	public static String getPath(URI uri) {
		/*IWorkspaceRoot root;
		root = ResourcesPlugin.getWorkspace().getRoot();
		String path = uri.toPlatformString(true); 
		IResource res = root.findMember(path); 
		return res.getLocation().toOSString();	*/
		return "/home/costea/runtime-EclipseApplication/test/background";
	}

	public static String SaveToString(Reader reader) {
		char [] buffer = new char[4096];
		StringBuilder builder = new StringBuilder();
		int read =0;
		try {
			do {
				read = reader.read(buffer);
				if (read > 0)
					builder.append(buffer,0,read);
			} while (read > 0);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return builder.toString();	
	}
}
