/*
* generated by Xtext
*/
package info.kwarc.ui.outline;

import info.kwarc.elf.sigDefinitions;
import info.kwarc.elf.signatureDeclaration;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.editor.outline.ContentOutlineNode;
import org.eclipse.xtext.ui.editor.outline.transformer.AbstractDeclarativeSemanticModelTransformer;

import com.google.inject.Inject;

/**
 * customization of the default outline structure
 * 
 */
public class ElfTransformer extends AbstractDeclarativeSemanticModelTransformer {
	
	public ContentOutlineNode createNode(signatureDeclaration semanticNode,
			ContentOutlineNode outlineParentNode) {
		ContentOutlineNode node = super.newOutlineNode(semanticNode, outlineParentNode);
	    node.setLabel("theory " + semanticNode.getSigName());
	    return node;
	}
	
	@Override
	public boolean consumeNode(EObject semanticModelObject) {
		if (semanticModelObject instanceof signatureDeclaration)
			return true;
		if (semanticModelObject instanceof sigDefinitions)
			return true;
		return false;
	}
}
