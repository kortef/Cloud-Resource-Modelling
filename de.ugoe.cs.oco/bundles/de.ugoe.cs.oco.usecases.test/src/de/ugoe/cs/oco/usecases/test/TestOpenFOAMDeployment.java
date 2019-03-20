package de.ugoe.cs.oco.usecases.test;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.BeforeAll;

class TestOpenFOAMDeployment extends TestProvisioningAndDeployment {
	
	@BeforeAll
	protected static void setup() throws FileNotFoundException{
		basedir = "/home/fkorte/de.ugoe.cs.oco.usecases/openfoam/CSAR/Definitions";
		cut = "/home/fkorte/de.ugoe.cs.oco.usecases/openfoam/CSAR/Definitions/openfoamcluster.occic";
		testname = "openfoam-test";
		
		deprovisionEverything();
	}
}
