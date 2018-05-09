package de.ugoe.cs.oco.occi2deployment.tests;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.ugoe.cs.oco.occi2deployment.DeployerHelper;
import de.ugoe.cs.oco.occi2deployment.ModelUtility;
import de.ugoe.cs.oco.occi2deployment.comparator.Comparator;


public class ProxyResolutionTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BasicConfigurator.configure();
		Logger.getLogger(Comparator.class.getName()).setLevel(Level.DEBUG);
		Logger.getRootLogger().setLevel(Level.FATAL);
		
		
		/*
		System.out.println("LAMP:");
		List<Path> extensions = new ArrayList<Path>();
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/platform.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/lamp.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/placement.occie"));
		Path newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/LAMP-cluster2.occie");
		*/
		
		
		
		System.out.println("Mongo:");
		List<Path> extensions = new ArrayList<Path>();
		extensions.add(Paths.get("/home/erbel/git/MoDMaCAO/plugins/org.modmacao.occi.platform/model/platform.occie"));
		extensions.add(Paths.get("/home/erbel/git/MoDMaCAO/plugins/org.modmacao.mongodb/model/mongodb.occie"));
		extensions.add(Paths.get("/home/erbel/git/MoDMaCAO/plugins/org.modmacao.placement/model/placement.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/openstackinstance.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/openstacknetwork.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/openstacktemplate.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/mls/extendedinfrastructure.occie"));
		
		
		Path newOCCI = Paths.get("/home/erbel/git/MoDMaCAO/plugins/org.modmacao.mongodb.example/MongoDB-Cluster.occic");
		
		EList<EObject> newModel = ModelUtility.loadOCCI(newOCCI, extensions);
		for(Resource res: ModelUtility.getResources(newModel)) {
				System.out.println(res.getKind());
		}
		
		
		
		/*
		org.eclipse.emf.ecore.resource.Resource resource = ModelUtility.loadOCCIResource(newOCCI, extensions);
		Configuration config = (Configuration) resource.getContents().get(0);
		for(Resource res2: config.getResources()) {
			System.out.println(res2.getKind());
		}
		*/
		
	}
}