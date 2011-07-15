package info.kwarc.mmt.api.wrappers;

import info.kwarc.mmt.api.backend.Archive;
import info.kwarc.mmt.api.backend.Compiler;
import info.kwarc.mmt.api.frontend.ArchiveBuild;
import info.kwarc.mmt.api.frontend.Controller;
import info.kwarc.mmt.api.frontend.Report;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import scala.Function0;
import scala.Option;
import scala.Option$;
import scala.collection.JavaConverters$;
import scala.collection.Map;
import scalaj.collection.j2s.ListWrapper;

public class MMTArchive {
	Archive arch;
	Report rep;
	Controller controller;
	
	public MMTArchive(Archive arch, Controller controller) {
		this.arch = arch;
		this.controller = controller;
	}

	public String getID() {
		return getProperties().get("id");
	}
	
	public java.util.Map<String, String> getProperties() {
		return JavaConverters$.MODULE$.asJavaMapConverter(arch.properties()).asJava();
	}
	
	public void compile(List<String> paths) {
		ListWrapper<String> wrapper = new ListWrapper<String>(paths);
		scala.collection.immutable.List<String> res = wrapper.toSeq().toList();
		controller.handle(new ArchiveBuild("test", "compile", res));		
	}
}
