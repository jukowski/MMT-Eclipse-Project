package apc;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.parser.IParser;

public class APCResource extends LazyLinkingResource {
	public APCResource() {
		super();
	}	
	
	@Override
	protected void doLinking() {
		IParser t = this.getParser();
		if (t instanceof FileBasedParser) {
			((FileBasedParser) t).setFilePath(APCUtils.getPath(this.uri));
		}
		super.doLinking();
	}
	
	@Override
	public void update(int offset, int replacedTextLength, String newText) {
		IParser t = this.getParser();
		if (t instanceof FileBasedParser) {
			((FileBasedParser) t).setFilePath(APCUtils.getPath(this.uri));
		}
		super.update(offset, replacedTextLength, newText);
	}
	
	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		IParser t = this.getParser();
		if (t instanceof FileBasedParser) {
			((FileBasedParser) t).setFilePath(APCUtils.getPath(this.uri));
		}
		super.doLoad(inputStream, options);
	}
	
}
