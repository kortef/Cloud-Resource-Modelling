package de.ugoe.cs.oco.occi.extractor.wrapper;

import java.nio.file.Path;
import java.net.URI;

import cz.cesnet.cloud.occi.api.Client;
import cz.cesnet.cloud.occi.api.exception.CommunicationException;
import cz.cesnet.cloud.occi.api.http.HTTPClient;
import cz.cesnet.cloud.occi.api.http.auth.BasicAuthentication;
import cz.cesnet.cloud.occi.parser.MediaType;
import de.ugoe.cs.oco.occi.extractor.OCCIModel;
import de.ugoe.cs.oco.occi.extractor.OCCIModelExtractor;
import de.ugoe.cs.oco.occi.serializer.OCCIModelSerializer;

public class OCCIModelExtractorWrapper {
	public static void extractRuntimeModel(String address, String user, String password, Path runtimePath, String publicNetworkId) {
		Path runtimeModelPath = runtimePath;
		try {
			Client client =  new HTTPClient(URI.create(address), 
					new BasicAuthentication(user, password), MediaType.TEXT_PLAIN, true);
			
			OCCIModelExtractor extractor = new OCCIModelExtractor();
			OCCIModel model = extractor.extractModel(client, publicNetworkId);
			OCCIModelSerializer serializer = new OCCIModelSerializer();
			serializer.serializeOCCIModel(model, runtimeModelPath);
		} catch (CommunicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
