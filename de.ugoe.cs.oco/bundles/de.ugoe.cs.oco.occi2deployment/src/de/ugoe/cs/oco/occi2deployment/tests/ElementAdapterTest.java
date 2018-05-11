package de.ugoe.cs.oco.occi2deployment.tests;


import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.epsilon.emc.emf.CachedResourceSet;

import de.ugoe.cs.oco.occi2deployment.adapter.ElementAdapter;
import de.ugoe.cs.oco.occi2deployment.comparator.Comparator;
import de.ugoe.cs.oco.occi2deployment.comparator.ComparatorFactory;
import de.ugoe.cs.oco.occi2deployment.connector.Connection;
import de.ugoe.cs.oco.occi2deployment.execution.Executor;


public class ElementAdapterTest {

	public static void main(String[] args) {
		Logger.getLogger(ElementAdapter.class.getName()).setLevel(Level.DEBUG);
		Logger.getLogger(Executor.class.getName()).setLevel(Level.DEBUG);
		Logger.getRootLogger().setLevel(Level.FATAL);
		
		String version = "Mixed";
		
		System.out.println("Basic Example + NWVM:");
		Path oldOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/basicExample+NWVM.occie");
		Path newOCCI = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/toTest.occie");
		Comparator comparator = ComparatorFactory.getComparator(version, oldOCCI, newOCCI, null);
		CachedResourceSet.getCache().clear();
		System.out.println("");
		
		Connection conn = new Connection("jerbel", "UV2.7F62", "tosca2occi", "http://192.168.34.1:8787/occi1.1", "http://192.168.34.1:35357/v3/auth/tokens","9b24a620-bee8-4526-bcc9-bbfde769a152");
		
		//ElementAdapter adapter = new ElementAdapter(conn);
		//adapter.update(comparator.getAdaptedElements(), comparator.getMatches());
		

	}

}