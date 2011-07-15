package info.kwarc.mmt.tests;

import info.kwarc.mmt.api.wrappers.MMTArchive;
import info.kwarc.mmt.api.wrappers.MMTController;
import info.kwarc.mmt.api.wrappers.MMTReport;

import java.io.File;
import java.util.ArrayList;

public class CompileTest {
	
	static class rep implements MMTReport {

		@Override
		public void handle(String arg0, String arg1) {
			if (arg0 == "archive") {
				System.err.println(arg1);				
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		MMTController mmt = new MMTController(new rep());

		mmt.setCompiler("/home/costea/kwarc/twelf/twelf-mod/bin/twelf-server");
		MMTArchive arch = mmt.RegisterArchive(new File("/home/costea/kwarc/runtime-EclipseApplication/test"));
		ArrayList<String> test = new ArrayList<String>();
		test.add("/");
		arch.compile(test);
	}
}
