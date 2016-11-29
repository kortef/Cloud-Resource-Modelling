package de.ugoe.cs.oco.occi.orchestrator.tests;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.junit.Test;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.util.OCCIResourceFactoryImpl;

import cz.cesnet.cloud.occi.api.Client;
import cz.cesnet.cloud.occi.api.exception.CommunicationException;
import cz.cesnet.cloud.occi.api.http.HTTPClient;
import cz.cesnet.cloud.occi.api.http.auth.BasicAuthentication;
import cz.cesnet.cloud.occi.parser.MediaType;
import de.ugoe.cs.oco.occi.orchestrator.OCCIModelOrchestrator;

public class OCCIModelOrchestratorTest {

	@Test
	public void testDeployModel() throws CommunicationException, EolModelLoadingException, URISyntaxException {
		Client client =  new HTTPClient(URI.create("http://192.168.34.1:51245/occi1.1"), 
				new BasicAuthentication("fglaser", "eCzA2015"), MediaType.TEXT_PLAIN, true);
		
		OCCIModelOrchestrator orchestrator = new OCCIModelOrchestrator();
		orchestrator.init(client);
		
		OCCIPackage.eINSTANCE.eClass();
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("occie", new OCCIResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		String path = "testdata/example.occie";
		
		Resource resource = resSet.createResource(org.eclipse.emf.common.util.URI.createURI(path));
		Extension extension = (Extension) resource.getContents().get(0);
		
		orchestrator.deployModel(extension);
	}

}
