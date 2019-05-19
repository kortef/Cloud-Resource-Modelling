package de.ugoe.cs.as.usecases.test;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.BeforeAll;

public class TestSugarCRMDeployment extends TestProvisioningAndDeployment {
	
	@BeforeAll
	public static void setup() throws FileNotFoundException{
		basedir = "/home/fkorte/git/Case-Studies/sugarcrm/CSAR/Definitions";
		cut = "/home/fkorte/git/Case-Studies/sugarcrm/CSAR/Definitions/SugarCRM-Interop-Definitions.tosca";
		testname = "sugarcrm-test";
		userdata = TestUtil.CENTOS_USERDATA;
		
		deprovisionEverything();
	}
}
