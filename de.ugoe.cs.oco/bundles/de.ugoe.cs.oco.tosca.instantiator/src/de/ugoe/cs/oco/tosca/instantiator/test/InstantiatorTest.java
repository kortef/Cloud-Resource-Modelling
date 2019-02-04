package de.ugoe.cs.oco.tosca.instantiator.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.e4.emf.xpath.EcoreXPathContextFactory;
import org.eclipse.e4.emf.xpath.XPathContext;
import org.eclipse.e4.emf.xpath.XPathContextFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xsd.XSDPackage;
import org.eclipse.xsd.util.XSDResourceFactoryImpl;
import org.junit.jupiter.api.Test;

import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.util.ToscaResourceFactoryImpl;

class InstantiatorTest {

	@Test
	void test() {
		ToscaPackage.eINSTANCE.eClass();
		XSDPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("tosca", new ToscaResourceFactoryImpl());
		reg.getExtensionToFactoryMap().put("xsd", new XSDResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		
		Resource inputResource = resSet.getResource(URI.createFileURI("/home/fkorte/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.ugoe.cs.oco.tosca.instantiator/testdata/CSAR/Definitions/openfoamcluster.tosca"), true
				);
		try {
			inputResource.load(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XPathContextFactory<EObject> f = EcoreXPathContextFactory.newInstance();
		XPathContext xpathContext = f.newContext(inputResource.getContents().get(0));
		Iterator<Object> i = xpathContext.iterate("definitions/serviceTemplate/boundaryDefinitions/properties/propertyMappings/propertyMapping");
		System.out.println(i.hasNext());
		while (i.hasNext()){
			System.out.println(i.next());
		}
	}

}
