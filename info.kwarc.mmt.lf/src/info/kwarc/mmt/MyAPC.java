/*package info.kwarc.mmt;

import info.kwarc.mmt.parser.antlr.LFParser;
import apc.APC;

import com.google.inject.Inject;

public class MyAPC extends APC {

	LFParser elfParser;
	TWELFParser twelfParser;
	
	@Inject
	public MyAPC(LFParser elfParser) {
		this.elfParser = elfParser;
		init();
	}
	
	@Override
	public void init() {
		addParser(elfParser);	
		addParser(new TWELFParser());
	}
}
*/