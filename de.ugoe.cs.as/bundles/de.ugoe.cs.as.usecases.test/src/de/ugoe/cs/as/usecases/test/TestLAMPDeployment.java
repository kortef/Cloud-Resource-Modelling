/**
 * 
 */
package de.ugoe.cs.as.usecases.test;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.BeforeAll;

/**
 * @author fkorte
 *
 */
class TestLAMPDeployment extends TestProvisioningAndDeployment{
	
	@BeforeAll
	protected static void setup() throws FileNotFoundException{
		basedir = "/home/fkorte/MoDMaCAO/plugins/org.modmacao.lamp/model/";
		cut = "/home/fkorte/MoDMaCAO/plugins/org.modmacao.lamp.example/LAMP-simple-withAnsible.occic";
		testname = "lamp-test";
		
		deprovisionEverything();
	}
}
