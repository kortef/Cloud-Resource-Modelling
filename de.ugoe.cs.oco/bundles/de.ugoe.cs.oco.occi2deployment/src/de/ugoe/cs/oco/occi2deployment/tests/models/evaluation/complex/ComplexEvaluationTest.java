package de.ugoe.cs.oco.occi2deployment.tests.models.evaluation.complex;


import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.epsilon.emc.emf.CachedResourceSet;

import de.ugoe.cs.oco.occi2deployment.comparator.Comparator;
import de.ugoe.cs.oco.occi2deployment.comparator.ComparatorFactory;


public class ComplexEvaluationTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Logger.getLogger(Comparator.class.getName()).setLevel(Level.DEBUG);
		Logger.getRootLogger().setLevel(Level.FATAL);
		
		String version = "Complex";
		
		
		System.out.println("Different Ids");
		Path oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/evaluation/complex/sourceDifferentIds.occie");
		Path newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/evaluation/complex/targetDifferentIds.occie");
		Comparator comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("Independent Resources");
		oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/evaluation/complex/sourceIndependentResources.occie");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/evaluation/complex/targetIndependentResources.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("Symmetric Graphs");
		oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/evaluation/complex/sourceSymmetricGraphs.occie");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/evaluation/complex/targetSymmetricGraphs.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("Storage Reattachement");
		oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/evaluation/complex/sourceStorageReattachement.occie");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/evaluation/complex/targetStorageReattachement.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		System.out.println("Split into Subgraphs");
		oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/evaluation/complex/sourceSplitIntoSubgraphs.occie");
		newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/evaluation/complex/targetSplitIntoSubgraphs.occie");
		comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
	}
}