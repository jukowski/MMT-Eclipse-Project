import java.io.StringReader;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.Token;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;

import com.google.inject.Injector;

import info.kwarc.mmt.LFInjectorProvider;
import info.kwarc.mmt.parser.antlr.LFParser;
import info.kwarc.mmt.parser.antlr.internal.InternalLFLexer;


public class Test {

	static String src="%read \"test.elf\". \n" + 
			"\n" + 
			"%namespace \"http://cds.omdoc.org/test2\". \n" + 
			"\n" + 
			"%namespace ats = \"test\".\n" + 
			"\n" + 
			"%sig A = {\n" + 
			"   %include t.A.\n" + 
			"   c: a.\n" + 
			"}.\n" + 
			"\n" + 
			"%view v : A -> t.A = {\n" + 
			"   c := c.\n" + 
			"}.\n" + 
			""; 
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LFInjectorProvider inj = new LFInjectorProvider();
		Injector p = inj.getInjector();
		LFParser pp = p.getInstance(LFParser.class);
		StringReader reader = new StringReader(src);
		IParseResult res = pp.parse(reader);
		
		InternalLFLexer lexer = new InternalLFLexer(new ANTLRStringStream(src));
		while (true) {
			Token t = lexer.nextToken();
			if (t == null || t.getText()==null)
				break;
			System.out.println(t.toString()+" "+t.getText());
		};

		for (INode t : res.getSyntaxErrors()) {
			System.out.println("Error"+t.getSyntaxErrorMessage().getMessage());
			System.out.println(t.getText());
		}
	}

}
