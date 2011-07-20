package info.kwarc.mmt.api.wrappers;

import info.kwarc.mmt.api.Path;
import info.kwarc.mmt.api.backend.Archive;
import info.kwarc.mmt.api.frontend.ArchiveBuild;
import info.kwarc.mmt.api.frontend.Controller;
import info.kwarc.mmt.api.frontend.Report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import scala.collection.JavaConverters$;

public class MMTArchive {
	Archive arch;
	Report rep;
	Controller controller;
	List<Path> loaded;
	File root;
	
	public MMTArchive(File path, Controller controller) {
		arch = controller.backend().openArchive(path);
		root = path;
		this.controller = controller;
		loaded = new ArrayList<Path>();
	}

	private List<Path> getFileListing(File aStartingDir) {
		Logger.getAnonymousLogger().info("loading @ "+aStartingDir.getAbsolutePath());
		List<Path> result = new ArrayList<Path>();
		File[] filesAndDirs = aStartingDir.listFiles();
		if (filesAndDirs == null)
			return result;
		for (File file : filesAndDirs) {
			if (file.isFile() && file.getName().endsWith(".omdoc")) {
				Logger.getAnonymousLogger().info("reading @ "+file.getAbsolutePath());
				result.add(controller.read(file));
			}
			if (!file.isDirectory()) {
				result.addAll(getFileListing(file));
			}
		}
		return result;
	}

	public String getID() {
		return getProperties().get("id");
	}

	public java.util.Map<String, String> getProperties() {
		return JavaConverters$.MODULE$.asJavaMapConverter(arch.properties())
				.asJava();
	}

	public void compile(List<String> paths) {
		scala.collection.immutable.List<String> res = Utils.ListJava2Scala(paths);
		controller.handle(new ArchiveBuild(getID(), "compile", res));
		controller.handle(new ArchiveBuild(getID(), "content", res));
		for (Path p : loaded) {
			controller.delete(p);
		}
		Logger.getAnonymousLogger().info("loading... ");
		loaded = getFileListing(new File(root.getAbsolutePath()+"/compiled"));
	}
}
