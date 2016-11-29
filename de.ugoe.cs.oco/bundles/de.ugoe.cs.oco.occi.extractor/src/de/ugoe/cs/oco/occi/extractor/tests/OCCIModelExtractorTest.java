/**
 * 
 */
package de.ugoe.cs.oco.occi.extractor.tests;

import java.net.URI;
import java.nio.file.Paths;

import org.junit.Test;

import cz.cesnet.cloud.occi.api.Client;
import cz.cesnet.cloud.occi.api.exception.CommunicationException;
import cz.cesnet.cloud.occi.api.http.HTTPClient;
import cz.cesnet.cloud.occi.api.http.auth.BasicAuthentication;
import cz.cesnet.cloud.occi.parser.MediaType;
import de.ugoe.cs.oco.occi.extractor.OCCIModel;
import de.ugoe.cs.oco.occi.extractor.OCCIModelExtractor;
import de.ugoe.cs.oco.occi.serializer.OCCIModelSerializer;

/**
 * @author fglaser
 *
 */
public class OCCIModelExtractorTest {

	/**
	 * Test method for {@link de.ugoe.cs.oco.occi.extractor.OCCIModelExtractor#extractModel(cz.cesnet.cloud.occi.api.Client)}.
	 */
	@Test
	public void testExtractModel() {
		try {
			Client client =  new HTTPClient(URI.create("http://192.168.34.1:51245/occi1.1"), 
					new BasicAuthentication("fglaser", "eCzA2015"), MediaType.TEXT_PLAIN, true);
			
			OCCIModelExtractor extractor = new OCCIModelExtractor();
			
			OCCIModel model = extractor.extractModel(client);
			
			OCCIModelSerializer serializer = new OCCIModelSerializer();
			serializer.serializeOCCIModel(model, Paths.get("test.occie"));
			
		} catch (CommunicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
