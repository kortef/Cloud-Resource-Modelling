package de.ugoe.cs.oco.occi.orchestrator;

import java.net.URI;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.models.IModel;
import org.occiware.clouddesigner.occi.Extension;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.util.OCCIResourceFactoryImpl;

import cz.cesnet.cloud.occi.api.Client;
import cz.cesnet.cloud.occi.api.exception.CommunicationException;
import cz.cesnet.cloud.occi.api.http.HTTPClient;
import cz.cesnet.cloud.occi.api.http.auth.BasicAuthentication;
import cz.cesnet.cloud.occi.parser.MediaType;
import de.ugoe.cs.oco.occi.extractor.OCCIModel;
import de.ugoe.cs.oco.occi.extractor.OCCIModelExtractor;

public class OCCIModelOrchestrator {
	OCCIModel model;
	Client client;
	
	public void init(Client client){
		this.client = client;
	}
	
	public void deployModel(Extension extension){
		
	}
}
