package info.kwarc.ui.hover;

import info.kwarc.elf.TempType;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.ui.editor.model.XtextDocument;

import apc.APCUtils;

public class TextHover implements ITextHover /*, ITextHoverExtension2 */{
	public TextHover(ISourceViewer sourceViewer) {

	}
	
	@Override
	public String getHoverInfo(ITextViewer arg0, IRegion arg1) {
		if (arg0.getDocument() instanceof XtextDocument) {
			XtextDocument doc = (XtextDocument) arg0.getDocument();
			EObject rootObj = APCUtils.getDocumentRoot(doc);
			AbstractNode node = NodeUtil.findLeafNodeAtOffset(NodeUtil.getNode(rootObj), arg1.getOffset());
			EObject semObject = NodeUtil.getNearestSemanticObject(node);
			if (semObject instanceof TempType) {
				return ((TempType) semObject).getFullURI();
			}
		}
		return null;
	}

	@Override
	public IRegion getHoverRegion(ITextViewer arg0, int arg1) {
		return new Region(arg1, 1);
	}

}
