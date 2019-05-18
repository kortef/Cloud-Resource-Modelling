package de.ugoe.cs.as.usecases.test;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.BeforeAll;

class TestSugarCRMDeployment extends TestProvisioningAndDeployment {
	
	@BeforeAll
	protected static void setup() throws FileNotFoundException{
		basedir = "/home/fkorte/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions";
		cut = "/home/fkorte/de.ugoe.cs.oco.usecases/sugarcrm/CSAR/Definitions/SugarCRM-Interop-Definitions.tosca";
		testname = "sugarcrm-test";
		userdata = TestUtil.CENTOS_USERDATA;
		
		deprovisionEverything();
	}
}
