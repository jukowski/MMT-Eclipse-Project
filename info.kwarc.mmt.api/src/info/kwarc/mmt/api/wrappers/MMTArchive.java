package info.kwarc.mmt.api.wrappers;

import info.kwarc.mmt.api.backend.Archive;
import info.kwarc.mmt.api.backend.Compiler;
import info.kwarc.mmt.api.frontend.Report;
import scala.Function0;
import scala.Option;
import scala.Option$;
import scala.collection.Map;

import java.io.File;
import java.util.logging.Logger;

public class MMTArchive {
	Archive arch;
	Report rep;
	
	public MMTArchive(File root, Compiler compiler) {
		Option<Compiler> opt = Option$.MODULE$.apply(compiler);
		rep = new Report() {
			
			@Override
			public String handle(Function0<String> arg0, Function0<String> arg1) {
				Logger.getAnonymousLogger().info(arg0.apply());
				return arg0.apply();
			}
		};
		
		arch = new Archive(new info.kwarc.mmt.api.utils.File(root), null, opt, rep);
		Map<String, String> props = arch.properties();
		Logger.getAnonymousLogger().info("props");
	}
}
