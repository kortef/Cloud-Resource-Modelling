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
class TestMongoDBDeployment extends TestProvisioningAndDeployment {
	
	@BeforeAll
	protected static void setup() throws FileNotFoundException{
		basedir = "/home/fkorte/MoDMaCAO/plugins/org.modmacao.mongodb/model";
		cut = "/home/fkorte/MoDMaCAO/plugins/org.modmacao.mongodb.example/MongoDB-Cluster-withAnsible.occic";
		testname = "mongodb-test";
	
		deprovisionEverything();
	}

	

}
