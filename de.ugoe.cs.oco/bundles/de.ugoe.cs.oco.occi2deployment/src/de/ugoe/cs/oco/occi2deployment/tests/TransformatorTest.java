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
		extensions.add(Paths.get("/home/erbel/git/MoDMaCAO/plugins/org.modmacao.occi.platform/model/platform.occie"));
		extensions.add(Paths.get("/home/erbel/git/MoDMaCAO/plugins/org.modmacao.mongodb/model/mongodb.occie"));
		extensions.add(Paths.get("/home/erbel/git/MoDMaCAO/plugins/org.modmacao.placement/model/placement.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/openstackinstance.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/openstacknetwork.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/openstacktemplate.occie"));
		//extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/extendedinfrastructure.occie"));
		
		Path occiPath = Paths.get("/home/erbel/git/MoDMaCAO/plugins/org.modmacao.mongodb.example/MongoDB-Cluster.occic");
		
		org.eclipse.emf.ecore.resource.Resource occi = ModelUtility.loadOCCIResource(occiPath, extensions);
		
		
		Transformator occiToPog = TransformatorFactory.getTransformator("OCCI2POG");
		Path outputpath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/POG.pog");
		occiToPog.transform(occi, outputpath);

		Transformator pogToProvPlan = TransformatorFactory.getTransformator("POG2ProvPlan");
		Path inputpath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/POG.pog");
		outputpath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/ProvisioningPlanSkeleton.uml");
		pogToProvPlan.transform(inputpath, outputpath);

	}
}
