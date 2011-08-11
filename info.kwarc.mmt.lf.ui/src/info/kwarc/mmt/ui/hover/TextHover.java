package info.kwarc.mmt.ui.hover;

import info.kwarc.mmt.lF.TempType;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public class TextHover implements ITextHover /*, ITextHoverExtension2 */{
	public TextHover(ISourceViewer sourceViewer) {

	}
	
	public static EObject getDocumentRoot(XtextDocument doc) {
		EObject rootObj = doc.readOnly(new IUnitOfWork<EObject, XtextResource>(){
			@Override
			public EObject exec(XtextResource state) throws Exception {
				EObject root = ((XtextResource)state).getContents().get(0);
				return root;
			}
		});
		return rootObj;
	}	
	
	@Override
	public String getHoverInfo(ITextViewer arg0, IRegion arg1) {
		if (arg0.getDocument() instanceof XtextDocument) {
			XtextDocument doc = (XtextDocument) arg0.getDocument();
			EObject rootObj = getDocumentRoot(doc);
			ILeafNode node = NodeModelUtils.findLeafNodeAtOffset(NodeModelUtils.getNode(rootObj), arg1.getOffset());
			EObject semObject = node.getSemanticElement();
			if (semObject instanceof TempType && ((TempType) semObject).getFullURI()!= null) {
				return ((TempType) semObject).getFullURI();
			}
			if (semObject instanceof TempType) {
				return "Some suggestion will be here ";
			}
		}
		return null;
	}

	@Override
	public IRegion getHoverRegion(ITextViewer arg0, int arg1) {
		return new Region(arg1, 1);
	}

}
