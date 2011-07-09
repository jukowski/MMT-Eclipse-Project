package apc;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;

import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.util.ReplaceRegion;

import com.google.inject.Inject;

public abstract class APC implements IParser, FileBasedParser {
	ArrayList<IParser> parsers = new ArrayList<IParser>();
	String filePath;
	IParser q;
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
		for (IParser parser : parsers) {
			if (parser instanceof FileBasedParser) {
				((FileBasedParser) parser).setFilePath(filePath);
			}
		}
	};
	
	String getURI() {
		return filePath;
	}
	
	@Inject
	public APC() {
	}
	
	public abstract void init();

	public void addParser(IParser parser) {
		parsers.add(parser);
	}
	
	IParseResult feedToParsers(String feedText) {
		IParseResult last = null, current = null;
		for (IParser parser : parsers) {
			if (parser instanceof UpdateParser) {
				((UpdateParser) parser).setLastParseResult(last);
			}
			current = parser.parse(new StringReader(feedText));
			if (current == null)
				break;
			last = current;
		}		
		return last;
	}
	
	@Override
	public IParseResult parse(Reader reader) {
		String inputValue = APCUtils.SaveToString(reader);
		return feedToParsers(inputValue);
	}

	@Override
	public IParseResult parse(ParserRule rule, Reader reader) {
		for (IParser parser : parsers) {
			parser.parse(rule, reader);
		}
		return null;
	}

	@Override
	public IParseResult parse(RuleCall ruleCall, Reader reader,
			int initialLookAhead) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IParseResult reparse(IParseResult previousParseResult,
			ReplaceRegion replaceRegion) {
		IParseResult last = null;
		for (IParser parser : parsers) {
			last = parser.reparse(previousParseResult, replaceRegion);
			if (last.hasSyntaxErrors())
				break;
		}
		return last;
	}	
}
