package apc;

import java.io.Reader;
import java.io.StringReader;

import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.util.ReplaceRegion;

public abstract class AbstractFileParser implements IParser, FileBasedParser {
	String filePath;
	String source;
	
	public abstract IParseResult performParsing(Reader source);
	
	public String getFilePath() {
		return filePath;
	}
	
	@Override
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public IParseResult parse(Reader reader) {
		return performParsing(reader);
	}

	@Override
	public IParseResult parse(ParserRule arg0, Reader arg1) {
		return performParsing(arg1);
	}

	@Override
	public IParseResult parse(RuleCall arg0, Reader arg1, int arg2) {
		return performParsing(arg1);
	}

	@Override
	public IParseResult reparse(IParseResult arg0, ReplaceRegion arg1) {
		String oldText= arg0.getRootNode().getText();
		String newText = oldText.substring(0, arg1.getOffset()) + arg1.getText() + oldText.substring(arg1.getEndOffset());
		return performParsing(new StringReader(newText));
	}

}
