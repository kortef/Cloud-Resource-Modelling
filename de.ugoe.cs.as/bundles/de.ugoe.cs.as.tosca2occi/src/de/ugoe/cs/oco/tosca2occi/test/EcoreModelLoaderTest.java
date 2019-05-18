package de.ugoe.cs.oco.tosca2occi.test;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;

import de.ugoe.cs.oco.tosca2occi.EcoreModelLoader;

public class EcoreModelLoaderTest {

	@Test
	public void test() throws IOException{
		EcoreModelLoader loader = new EcoreModelLoader();
		List<Resource> result = loader.searchAndLoadEcoreModels(URI.createFileURI("testdata/"));
		for (Resource resource: result) {
			resource.load(null);
			EPackage pack = (EPackage) resource.getContents().get(0);
			System.out.println(pack);
		}
	}

}
