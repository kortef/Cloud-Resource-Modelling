package de.ugoe.cs.oco.occi2deployment.tests.models.evaluation.adaptation;


import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.epsilon.emc.emf.CachedResourceSet;

import de.ugoe.cs.oco.occi2deployment.comparator.Comparator;
import de.ugoe.cs.oco.occi2deployment.comparator.ComparatorFactory;


public class AComparatorTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Logger.getLogger(Comparator.class.getName()).setLevel(Level.DEBUG);
		Logger.getRootLogger().setLevel(Level.FATAL);
		
		String strategy = "Mixed";
		Path oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/evaluation/adaptation/runtime.occie");
		Path newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/evaluation/adaptation/targetModel.occie");
		Comparator comparator = ComparatorFactory.getComparator(strategy, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
	}
}