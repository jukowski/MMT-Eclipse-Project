/*
* generated by Xtext
*/
package info.kwarc.ui.outline;

import info.kwarc.elf.signatureDeclaration;

import org.eclipse.xtext.ui.editor.outline.actions.DefaultContentOutlineNodeAdapterFactory;

public class ElfOutlineNodeAdapterFactory extends DefaultContentOutlineNodeAdapterFactory {

	private static final Class<?>[] types = { 
		signatureDeclaration.class
		// provide list of classes to adapt to, e.g.:
		// Entity.class
		// Service.class
	};

	@Override
	public Class<?>[] getAdapterList() {
		return types;
	}

}
