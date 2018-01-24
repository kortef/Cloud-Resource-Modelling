package de.ugoe.cs.oco.occi2deployment.tests;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.epsilon.emc.emf.CachedResourceSet;

import de.ugoe.cs.oco.occi2deployment.ModelUtility;
import de.ugoe.cs.oco.occi2deployment.comparator.Comparator;
import de.ugoe.cs.oco.occi2deployment.comparator.ComparatorFactory;


public class ComparatorTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		BasicConfigurator.configure();
		Logger.getLogger(Comparator.class.getName()).setLevel(Level.DEBUG);
		Logger.getRootLogger().setLevel(Level.FATAL);
		
		String version = "Complex";
		
		List<Path> extensions = new ArrayList<Path>();
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/platform.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/lamp.occie"));
		extensions.add(Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/placement.occie"));
		
		/*
		System.out.println("test2 -> test2:");
		Path oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/test2.occie");
		Path newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/test2.occie");
		
		Comparator comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		*/
		
		System.out.println("test2 -> LAMP:");
		Path oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/test2.occie");
		Path newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/LAMP-cluster.occic");
		org.eclipse.emf.ecore.resource.Resource oldModelResource = ModelUtility.loadOCCIResource(oldOCCI, null);	
		org.eclipse.emf.ecore.resource.Resource newModelResource = ModelUtility.loadOCCIResource(newOCCI, extensions);	
		Comparator comparator = ComparatorFactory.getComparator(version, oldModelResource, newModelResource, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		/*
		System.out.println("LAMP ->test2:");
		comparator = ComparatorFactory.getComparator(version, newModelResource, oldModelResource, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("LAMP ->LAMP:");
		comparator = ComparatorFactory.getComparator(version, newModelResource, newModelResource, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		*/
		
		/*
		System.out.println("Basic Example + NWVM:");
		Path oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample.occie");
		Path newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample+NWVM.occie");
		
		Comparator comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("Basic Example + VM:");
		oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample.occie");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample+VM.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("Empty:");
		Path oldOCCI2 = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample.occie");
		Path newOCCI2 = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/empty.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI2, newOCCI2, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("Basic Example - VM:");
		oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample.occie");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample-VM.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("Basic Example Without Link:");
		oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample.occie");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExampleWithoutLink.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("Without Link to Basic Example:");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample.occie");
		oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExampleWithoutLink.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("Basic Example + NWVM Different Id:");
		oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample.occie");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample+NWVM_DiffID.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("BasicExample+NWVM -> TOTest:");
		oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/toTest.occie");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample+NWVM.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		*/
	}
}