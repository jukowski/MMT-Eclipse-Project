package info.kwarc;

import com.google.inject.Inject;

import info.kwarc.parser.antlr.ElfParser;
import apc.APC;

public class MyAPC extends APC {

	ElfParser elfParser;
	
	@Inject
	public MyAPC(ElfParser elfParser) {
		this.elfParser = elfParser;
		init();
	}
	
	@Override
	public void init() {
		addParser(elfParser);	
		addParser(new TWELFParser());
	}
}
