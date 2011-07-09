
package info.kwarc;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ElfStandaloneSetup extends ElfStandaloneSetupGenerated{

	public static void doSetup() {
		new ElfStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

