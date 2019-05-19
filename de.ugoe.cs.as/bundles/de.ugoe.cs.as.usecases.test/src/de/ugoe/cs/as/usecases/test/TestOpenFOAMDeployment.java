package de.ugoe.cs.as.usecases.test;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.BeforeAll;

public class TestOpenFOAMDeployment extends TestProvisioningAndDeployment {
	
	@BeforeAll
	public static void setup() throws FileNotFoundException{
		basedir = "/home/fkorte/git/Case-Studies/openfoam/CSAR/Definitions";
		cut = "/home/fkorte/git/Case-Studies/openfoam/CSAR/Definitions/openfoamcluster.tosca";
		testname = "openfoam-test";
		
		deprovisionEverything();
	}
}
