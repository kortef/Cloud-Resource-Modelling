package de.ugoe.cs.oco.occi2deployment.tests;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.emc.emf.CachedResourceSet;
import org.eclipse.epsilon.emc.emf.EmfModel;

import de.ugoe.cs.oco.occi2deployment.ModelUtility;
import de.ugoe.cs.oco.occi2deployment.comparator.Comparator;
import de.ugoe.cs.oco.occi2deployment.comparator.ComparatorFactory;


public class ProxyResolutionTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BasicConfigurator.configure();
		Logger.getLogger(Comparator.class.getName()).setLevel(Level.DEBUG);
		Logger.getRootLogger().setLevel(Level.FATAL);
		
		System.out.println("LAMP -> LAMP:");
		List<Path> extensions = new ArrayList<Path>();
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/platform.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/lamp.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/placement.occie"));
		Path newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/LAMP-cluster2.occie");

		
		
		
		EList<EObject> newModel = ModelUtility.loadOCCI(newOCCI, extensions);
		org.eclipse.emf.ecore.resource.Resource resource = ModelUtility.loadOCCIResource(newOCCI, extensions);
		EList<Resource> res = ModelUtility.getResources(newModel);
		
		System.out.println("");
		System.out.println("Kinds:");
		for(Resource r : res) {
			System.out.println(r.getKind().getScheme());
		}
		System.out.println("");
		
		Comparator comparator = ComparatorFactory.getComparator("Mixed", resource, resource, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		
	}
}