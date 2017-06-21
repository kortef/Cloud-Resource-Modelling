package de.ugoe.cs.oco.occi2deployment.tests;


import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.epsilon.emc.emf.CachedResourceSet;

import de.ugoe.cs.oco.occi2deployment.comparator.Comparator;
import de.ugoe.cs.oco.occi2deployment.comparator.ComparatorFactory;


public class ComparatorTest {

	public static void main(String[] args) {
		Logger.getLogger(Comparator.class.getName()).setLevel(Level.DEBUG);
		Logger.getRootLogger().setLevel(Level.FATAL);
		
		String version = "Complex";
		
		System.out.println("Basic Example + NWVM:");
		Path oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample.occie");
		Path newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample+NWVM.occie");
		Comparator comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("Basic Example + VM:");
		oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample.occie");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample+VM.occie");
		Comparator comparator3 = ComparatorFactory.getComparator(version, oldOCCI, newOCCI);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("Empty:");
		Path oldOCCI2 = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample.occie");
		Path newOCCI2 = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/empty.occie");
		Comparator comparator2 = ComparatorFactory.getComparator(version, oldOCCI2, newOCCI2);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("Basic Example - VM:");
		oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample.occie");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample-VM.occie");
		Comparator comparator4 = ComparatorFactory.getComparator(version, oldOCCI, newOCCI);
		CachedResourceSet.getCache().clear();
		
		System.out.println("Basic Example Without Link:");
		oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample.occie");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExampleWithoutLink.occie");
		Comparator comparator5 = ComparatorFactory.getComparator(version, oldOCCI, newOCCI);
		CachedResourceSet.getCache().clear();
		
		System.out.println("Without Link to Basic Example:");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample.occie");
		oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExampleWithoutLink.occie");
		Comparator comparator6 = ComparatorFactory.getComparator(version, oldOCCI, newOCCI);
		CachedResourceSet.getCache().clear();

	}
}