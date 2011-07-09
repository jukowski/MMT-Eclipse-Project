package apc;

import java.io.Reader;

import org.eclipse.xtext.parser.IParseResult;

public abstract class AbstractFileUpdateParser extends AbstractFileParser implements UpdateParser {

	private IParseResult lastResult;
	
	public IParseResult getLastParserResult() {
		return lastResult;
	}
	
	@Override
	public void setLastParseResult(IParseResult result) {
		this.lastResult = result;
	}
	
}
