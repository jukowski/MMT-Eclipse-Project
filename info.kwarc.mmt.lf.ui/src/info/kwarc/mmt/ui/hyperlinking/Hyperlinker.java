package info.kwarc.mmt.ui.hyperlinking;

import info.kwarc.mmt.lF.signatureDeclaration;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.Region;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;
import org.eclipse.xtext.ui.editor.hyperlinking.XtextHyperlink;

import com.google.inject.Provider;

public class Hyperlinker extends HyperlinkHelper {
	@Override
	public void createHyperlinksTo(XtextResource from, Region region,
			EObject to, IHyperlinkAcceptor acceptor) {

		final URIConverter uriConverter = from.getResourceSet().getURIConverter();
		final URI uri = EcoreUtil.getURI(to);
		final URI normalized = uriConverter.normalize(uri);

		if (to instanceof signatureDeclaration) {
			XtextHyperlink result = getHyperlinkProvider().get();
			result.setHyperlinkRegion(region);
			result.setURI(normalized);
			result.setHyperlinkText("lala");
			acceptor.accept(result);
		} else
			super.createHyperlinksTo(from, region, to, acceptor);
	}
	
	@Override
	protected Provider<XtextHyperlink> getHyperlinkProvider() {
		return super.getHyperlinkProvider();
	}
}
