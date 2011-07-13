package info.kwarc.mmt.api.wrappers;

import info.kwarc.mmt.api.backend.Compiler;
import info.kwarc.mmt.api.frontend.Controller;
import info.kwarc.mmt.api.frontend.FileReport;
import info.kwarc.mmt.api.lf.Twelf;
import info.kwarc.mmt.api.libraries.DefaultFoundation$;
import info.kwarc.mmt.api.libraries.FoundChecker;
import info.kwarc.mmt.api.libraries.Foundation;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class MMTController {
	Controller controller;
	Compiler compiler;
	Map<String, MMTArchive> archiveMap;
	
	public MMTArchive RegisterArchive(File path) {
		MMTArchive result = new MMTArchive(path, compiler);
		return result;
	}
	
	public void setCompiler(String path) {
		File f = new File(path);
		compiler = new Twelf(new info.kwarc.mmt.api.utils.File(f));
		compiler.init();
	}
	
	
	public void CompileFile(String archiveID) {
		
	}
	
	public MMTController() {
		Foundation foundation = DefaultFoundation$.MODULE$;
		FoundChecker checker = new FoundChecker(foundation);
		FileReport report = new FileReport(new java.io.File("controller.log"));
		controller = new Controller(checker, report);
		archiveMap = new HashMap<String, MMTArchive>();
//		String currentPath = System.getProperty("user.dir"); 
//		System.setProperty("user.dir", bootstrapPath);
//		File startup = new File(bootstrapPath+"/"+fileName);
//		try {
//			Logger.getAnonymousLogger().info(startup.getCanonicalPath().toString());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		File catalogFile = new File(bootstrapPath+"/catalog.xml");
//		controller.handle(new AddCatalog(catalogFile));
		setCompiler("/home/costea/kwarc/twelf/twelf-mod/bin/twelf-server");
		// AddTwelf
		// AddArchive
		// Archive arch = controller.backend.getArchive(id)
		// arch.
//		System.setProperty("user.dir", currentPath);
	}
	
	public String [] getKnownNamespaces() {
		return null;
	}
}
