/*
 * generated by Xtext 2.32.0
 */
package miniProjet;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class PDLStandaloneSetup extends PDLStandaloneSetupGenerated {

	public static void doSetup() {
		new PDLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
