package de.ugoe.cs.oco.occi2deployment.transformation;

import java.net.URISyntaxException;

import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;

/**Class containing the method to create an EMF Model, required for the run configuration of
 * ETL transformations.
 * @author rockodell
 *
 */
public abstract class AbsTransformator implements Transformator {
	
	/**Creates EMF Model, required for the run configuration of ETL transformations.
	 * @param name
	 * @param uri
	 * @param metauri
	 * @param readOnLoad
	 * @param storeOnDisposal
	 * @return
	 * @throws EolModelLoadingException
	 * @throws URISyntaxException
	 */
	protected EmfModel createEmfModel(String name, String uri,
	 		String metauri, boolean readOnLoad, boolean storeOnDisposal)
					throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();

		StringProperties properties = new StringProperties();
		if (metauri != null){
			properties.put(EmfModel.PROPERTY_METAMODEL_URI, metauri);
		}
		properties.put(EmfModel.PROPERTY_EXPAND, "true");
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_MODEL_URI, uri);
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.getAliases().add(name);
		emfModel.load(properties, (IRelativePathResolver)null);
		//System.out.println(emfModel.allContents());		
		return emfModel;
	}
}
