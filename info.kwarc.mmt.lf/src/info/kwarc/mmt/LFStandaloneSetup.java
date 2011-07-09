
package info.kwarc.mmt;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class LFStandaloneSetup extends LFStandaloneSetupGenerated{

	public static void doSetup() {
		new LFStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

