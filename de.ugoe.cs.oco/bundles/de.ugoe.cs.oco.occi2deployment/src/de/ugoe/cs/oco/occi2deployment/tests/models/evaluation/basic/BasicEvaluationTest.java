package de.ugoe.cs.oco.occi2deployment.tests.models.evaluation.basic;


import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.epsilon.emc.emf.CachedResourceSet;

import de.ugoe.cs.oco.occi2deployment.comparator.Comparator;
import de.ugoe.cs.oco.occi2deployment.comparator.ComparatorFactory;


public class BasicEvaluationTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Logger.getLogger(Comparator.class.getName()).setLevel(Level.DEBUG);
		Logger.getRootLogger().setLevel(Level.FATAL);
		
		String version = "Mixed";
		String source = "+VM_NW_Stor";
		Path oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/evaluation/basic/"+source+".occie");
		
		System.out.println(source + " : Basis");
		Path newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/evaluation/basic/basis.occie");
		Comparator comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println(source + " : +VM");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/evaluation/basic/+VM.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println(source + " : +VM_NW");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/evaluation/basic/+VM_NW.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");

		System.out.println(source + " : +VM_Stor");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/evaluation/basic/+VM_Stor.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println(source + " : +VM_NW_Stor");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/evaluation/basic/+VM_NW_Stor.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
	}
}