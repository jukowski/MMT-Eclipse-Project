package apc;

import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;

import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.eclipse.xtext.parsetree.CompositeNode;

import com.google.inject.Inject;

public abstract class APC implements IAntlrParser, FileBasedParser {
	ArrayList<IAntlrParser> parsers = new ArrayList<IAntlrParser>();
	String filePath;
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
		for (IAntlrParser parser : parsers) {
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

	public void addParser(IAntlrParser parser) {
		parsers.add(parser);
	}
	
	IParseResult feedToParsers(String feedText) {
		IParseResult last = null, current = null;
		for (IAntlrParser parser : parsers) {
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
	public IParseResult parse(InputStream in) {
		String inputValue = APCUtils.SaveToString(in);
		return feedToParsers(inputValue);
	}

	@Override
	public IParseResult parse(Reader reader) {
		String inputValue = APCUtils.SaveToString(reader);
		return feedToParsers(inputValue);
	}

	@Override
	public IParseResult reparse(CompositeNode originalRootNode, int offset,
			int length, String change) {
		IParseResult last = null;
		for (IAntlrParser parser : parsers) {
			last = parser.reparse(originalRootNode, offset, length, change);
			if (last == null)
				break;
		}
		return last;
	}

	@Override
	public IParseResult parse(String ruleName, InputStream in) {
		String inputValue = APCUtils.SaveToString(in);
		return feedToParsers(inputValue);
	}

	@Override
	public IParseResult parse(String ruleName, Reader reader) {
		String inputValue = APCUtils.SaveToString(reader);
		return feedToParsers(inputValue);
	}	
}
