package de.ugoe.cs.oco.occi2deployment.tests;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.cmf.occi.core.Resource;

import de.ugoe.cs.oco.occi2deployment.ModelUtility;
import de.ugoe.cs.oco.occi2deployment.transformation.Transformator;
import de.ugoe.cs.oco.occi2deployment.transformation.TransformatorFactory;

public class TransformatorTest {

	public static void main(String[] args) throws Exception {
		Logger.getRootLogger().setLevel(Level.FATAL);
		
		List<Path> extensions = new ArrayList<Path>();
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/platform.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/lamp.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/placement.occie"));
		
		Path occiPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/LAMP-clusterPaaS.occic");
		org.eclipse.emf.ecore.resource.Resource occi = ModelUtility.loadOCCIResource(occiPath, extensions);
		
		
		Transformator occiToPog = TransformatorFactory.getTransformator("OCCI2POG");
		Path inputpath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/test2.occie");
		Path outputpath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/POG.pog");
		occiToPog.transform(occi, outputpath);

		Transformator pogToProvPlan = TransformatorFactory.getTransformator("POG2ProvPlan");
		inputpath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/POG.pog");
		outputpath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/ProvisioningPlanSkeleton.uml");
		pogToProvPlan.transform(inputpath, outputpath);

	}
}
