package info.kwarc.mmt.api.wrappers;

import java.io.File;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class MMTArchiveTest {

	MMTController cont;
	
	MMTReport report; 
	
	MMTArchive arch;
	
	@Before
	public void init() {
		report = new MMTReport() {
			
			@Override
			public void handle(String messageType, String message) {
				System.out.println(messageType+":"+message);
			}
		};
		cont = new MMTController(report);
		cont.addCatalogFile("/home/costea/kwarc/runtime-EclipseApplication/catalog.xml");
		cont.setCompiler("/home/costea/kwarc/twelf/twelf-mod/bin/twelf-server");
	}
	
	@Test
	public void test() {
		arch = cont.RegisterArchive(new File("/home/costea/kwarc/runtime-EclipseApplication/lala"));
		ArrayList<String> paths = new ArrayList<String>();
		paths.add("");
		arch.compile(paths);
	}

	@Test
	public void modtest() {
		MMTModule mod = cont.getModule("http://cds.omdoc.org/test?A");
		System.out.println("writing symbols ");
		for (MMTCompletion a : mod.getSymbols("s")) {
			System.out.println(a.top);
		}
		System.out.println("done ");
	}

	
	public static void main(String [] args) {
		MMTArchiveTest test = new MMTArchiveTest();
		test.init();
		test.test();
		test.modtest();
	}  
}