
/*
 * generated by Xtext
 */
 
package info.kwarc.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class ElfExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return info.kwarc.ui.internal.ElfActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return info.kwarc.ui.internal.ElfActivator.getInstance().getInjector("info.kwarc.Elf");
	}
	
}