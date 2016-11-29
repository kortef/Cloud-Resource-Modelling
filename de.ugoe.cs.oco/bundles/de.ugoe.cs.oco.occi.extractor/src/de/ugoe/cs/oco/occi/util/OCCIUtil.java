/**
 * 
 */
package de.ugoe.cs.oco.occi.util;

import java.net.URISyntaxException;
import java.nio.file.Path;

import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;

/**
 * @author fglaser
 *
 */
public class OCCIUtil {
	public static IModel getOCCIModel(Path inputFilePath, String modelAlias, boolean readOnLoad) throws Exception {
		String path = inputFilePath.getParent().toString() + "/";
		String metamodelURI = "http://schemas.ogf.org/occi/core/ecore";

		IModel model = createEmfModel(modelAlias, 
				path + inputFilePath.getFileName().toString(),
				metamodelURI,
				readOnLoad, 
				true);

		return model;
	}
	
	private static EmfModel createEmfModel(String name, String uri,
			String metauri, boolean readOnLoad, boolean storeOnDisposal)
					throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_CACHED, "true");
		if (metauri != null){
			properties.put(EmfModel.PROPERTY_METAMODEL_URI, metauri);
		}
		properties.put(EmfModel.PROPERTY_EXPAND, "true");
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_MODEL_URI, uri);
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties, (IRelativePathResolver)null);
		return emfModel;
	}
}
