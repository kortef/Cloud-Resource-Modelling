/**
 * 
 */
package de.ugoe.cs.oco.occi.extractor.tests;

import java.io.File;
import java.nio.file.Paths;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import de.ugoe.cs.oco.occi.extractor.OCCIModelExtractor;
import de.ugoe.cs.oco.occi.extractor.wrapper.OCCIModelExtractorWrapper;
import de.ugoe.cs.oco.occi.serializer.OCCIModelSerializer;

/**
 * @author fglaser
 *
 */
public class OCCIModelExtractorTest {

	/**
	 * Test method for {@link de.ugoe.cs.oco.occi.extractor.OCCIModelExtractor#extractModel(cz.cesnet.cloud.occi.api.Client)}.
	 */
	public static void main(String args[]) {
		Logger.getLogger(OCCIModelExtractor.class.getName()).setLevel(Level.INFO);
		Logger.getLogger(OCCIModelSerializer.class.getName()).setLevel(Level.INFO);
		Logger.getRootLogger().setLevel(Level.FATAL);
		File log4jfile = new File("./src/de/ugoe/cs/oco/occi/extractor/log4j.properties");
		PropertyConfigurator.configure(log4jfile.getAbsolutePath());
		
		
		OCCIModelExtractorWrapper.extractRuntimeModel("http://192.168.34.1:8787/occi1.1", "jerbel", "UV2.7F62", Paths.get("test2.occie"), "d52754e0-6729-4034-adbb-8f1f3800f2c6");

		/*try {
			
			
			
			Client client =  new HTTPClient(URI.create("http://192.168.34.1:8787/occi1.1"), 
					new BasicAuthentication("jerbel", "UV2.7F62"), MediaType.TEXT_PLAIN, true);
			
			OCCIModelExtractor extractor = new OCCIModelExtractor();
			
			OCCIModel model = extractor.extractModel(client,"d52754e0-6729-4034-adbb-8f1f3800f2c6");
			
			OCCIModelSerializer serializer = new OCCIModelSerializer();
			serializer.serializeOCCIModel(model, Paths.get("test2.occie"));
			
			
		} catch (CommunicationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
