package de.ugoe.cs.oco.occi2deployment.tests;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import de.ugoe.cs.oco.occi2deployment.transformation.Transformator;
import de.ugoe.cs.oco.occi2deployment.transformation.TransformatorFactory;

public class TransformatorTest {

	public static void main(String[] args) throws Exception {
		Logger.getRootLogger().setLevel(Level.FATAL);
		
		Transformator occiToPog = TransformatorFactory.getTransformator("OCCI2POG");
		Path inputpath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample.occie");
		Path outputpath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/POG.pog");
		occiToPog.transform(inputpath, outputpath);

		Transformator pogToProvPlan = TransformatorFactory.getTransformator("POG2ProvPlan");
		inputpath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/POG.pog");
		outputpath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/ProvisioningPlanSkeleton.uml");
		pogToProvPlan.transform(inputpath, outputpath);

	}
}
