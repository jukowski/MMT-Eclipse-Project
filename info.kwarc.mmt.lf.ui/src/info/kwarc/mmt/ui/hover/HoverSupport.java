package info.kwarc.mmt.ui.hover;

import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.xtext.ui.editor.XtextSourceViewerConfiguration;

public class HoverSupport extends XtextSourceViewerConfiguration{
	@Override
	public ITextHover getTextHover(ISourceViewer sourceViewer,
			String contentType) {
		return new TextHover(sourceViewer);
	}
}
