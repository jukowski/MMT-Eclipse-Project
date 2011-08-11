package info.kwarc.mmt.api.wrappers;

import info.kwarc.mmt.api.DPath;
import info.kwarc.mmt.api.MPath;
import info.kwarc.mmt.api.Path;
import info.kwarc.mmt.api.Path$;
import info.kwarc.mmt.api.backend.Archive;
import info.kwarc.mmt.api.backend.Compiler;
import info.kwarc.mmt.api.backend.LocalCopy;
import info.kwarc.mmt.api.backend.Storage;
import info.kwarc.mmt.api.frontend.AddCatalog;
import info.kwarc.mmt.api.frontend.Controller;
import info.kwarc.mmt.api.frontend.LoggingOn;
import info.kwarc.mmt.api.frontend.Report;
import info.kwarc.mmt.api.lf.Twelf;
import info.kwarc.mmt.api.libraries.DefaultFoundation$;
import info.kwarc.mmt.api.libraries.FoundChecker;
import info.kwarc.mmt.api.libraries.Foundation;
import info.kwarc.mmt.api.objects.OMMOD;
import info.kwarc.mmt.api.utils.URI;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import scala.Function0;
import scala.concurrent.JavaConversions$;

public class MMTController {
	Controller controller;
	Compiler compiler;
	Map<String, MMTArchive> archiveMap;

	public void finalize() throws Throwable {
		controller.cleanup();
	}
	
	public MMTModule getModule(String modulePath) {
		Path dpath = new DPath(URI.apply("http://cds.omdoc.org/foundations/lf/lf.omdoc?lf"));
		MPath path = Path$.MODULE$.parseM(modulePath, dpath);
		System.out.println(dpath.toString());
		System.out.println(path.toString());
		OMMOD module = new OMMOD(path);
		return new MMTModule(module, controller);
	}

	public MMTArchive RegisterArchive(File path) {
		MMTArchive result = new MMTArchive(path, controller);
		String id = result.getID();
		archiveMap.put(id, result);
		return result;
	}

	public void setCompiler(String path) {
		File f = new File(path);
		compiler = new Twelf(new info.kwarc.mmt.api.utils.File(f));
		controller.backend().addCompiler(compiler);
	}

	public MMTArchive getArchive(String id) {
		return archiveMap.get(id);
	}
	
	public void addCatalogFile(String catalogPath) {
		controller.handle(new AddCatalog(new File(catalogPath)));			
	}

	public MMTController(final MMTReport report) {
		Foundation foundation = DefaultFoundation$.MODULE$;
		FoundChecker checker = new FoundChecker(foundation);

		Report reportObj = new Report() {
			@Override
			public String handle(Function0<String> arg0, Function0<String> arg1) {
				if (report != null)
					report.handle(arg0.apply(), arg1.apply());
				return null;
			}
		};
		
		controller = new Controller(checker, reportObj);
		controller.handle(new LoggingOn("archive"));
		controller.handle(new LoggingOn("library"));
		controller.handle(new LoggingOn("error_eclipse"));
		controller.handle(new LoggingOn("error"));
		archiveMap = new HashMap<String, MMTArchive>();
	}

	public String[] getKnownNamespaces() {
		return null;
	}
}
