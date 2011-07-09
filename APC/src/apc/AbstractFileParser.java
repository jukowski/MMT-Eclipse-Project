package apc;

import java.io.InputStream;
import java.io.Reader;

import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.eclipse.xtext.parsetree.CompositeNode;

public abstract class AbstractFileParser implements IAntlrParser, FileBasedParser {
	String filePath;
	String source;
	
	public abstract IParseResult performParsing(String source);
	
	public String getFilePath() {
		return filePath;
	}
	
	@Override
	public IParseResult parse(InputStream in) {
		source = APCUtils.SaveToString(in);
		return performParsing(source);
	}

	@Override
	public IParseResult parse(Reader reader) {
		source = APCUtils.SaveToString(reader);
		return performParsing(source);
	}

	@Override
	public IParseResult reparse(CompositeNode originalRootNode, int offset,
			int length, String change) {
		source = source.substring(0, offset)+change+source.substring(offset); 
		return performParsing(source);
	}

	@Override
	public IParseResult parse(String ruleName, InputStream in) {
		source = APCUtils.SaveToString(in);
		return performParsing(source);
	}

	@Override
	public IParseResult parse(String ruleName, Reader reader) {
		source = APCUtils.SaveToString(reader);
		return performParsing(source);
	}

	@Override
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}
