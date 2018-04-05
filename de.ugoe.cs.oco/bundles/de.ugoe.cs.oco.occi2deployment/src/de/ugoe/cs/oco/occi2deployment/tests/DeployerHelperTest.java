package de.ugoe.cs.oco.occi2deployment.tests;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.junit.Test;
import org.osgi.framework.FrameworkUtil;

import de.ugoe.cs.oco.occi2deployment.DeployerHelper;

public class DeployerHelperTest {
	public static void main(String args[]) {
		DeployerHelper test = new DeployerHelper();
		test.loadFile("/de/ugoe/cs/oco/occi2deployment/models/IPG.pcg");
		//test.loadURL("de/ugoe/cs/oco/occi2deployment/models/OCCI2PCG.etl");
		test.loadFile("/de/ugoe/cs/oco/occi2deployment/tests/models/mls/MLS.occic");
		File url = test.loadFile("/de/ugoe/cs/oco/occi2deployment/transformation/etls/occi2pcg/OCCI2PCG.etl");
		test.loadPath("/de/ugoe/cs/oco/occi2deployment/tests/models/mls/MLS.occic");
		System.out.println(test.loadPath("/de/ugoe/cs/oco/occi2deployment/tests/models/mls/MLS.occic"));

	}
}
