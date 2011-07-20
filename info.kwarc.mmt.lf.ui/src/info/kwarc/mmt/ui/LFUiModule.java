/*
 * generated by Xtext
 */
package info.kwarc.mmt.ui;

import info.kwarc.mmt.ui.hover.HoverSupport;
import info.kwarc.mmt.ui.hyperlinking.Hyperlinker;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.XtextSourceViewerConfiguration;
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkHelper;

/**
 * Use this class to register components to be used within the IDE.
 */
public class LFUiModule extends info.kwarc.mmt.ui.AbstractLFUiModule {
	public LFUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends XtextSourceViewerConfiguration> bindSourceViewerConfiguration() {
		return HoverSupport.class;
	}	

	@Override
	public Class<? extends IHyperlinkHelper> bindIHyperlinkHelper() {
		// TODO Auto-generated method stub
		return Hyperlinker.class;
	}
	
	
}
