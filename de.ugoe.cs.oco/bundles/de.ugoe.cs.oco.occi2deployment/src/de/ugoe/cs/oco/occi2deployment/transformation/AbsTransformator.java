package de.ugoe.cs.oco.occi2deployment.transformation;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.epsilon.flock.FlockModule;

/**Class containing the method to create an EMF Model, required for the run configuration of
 * ETL transformations.
 * @author rockodell
 *
 */
public abstract class AbsTransformator implements Transformator {
	
	
	protected FlockModule flockModuleSetup(File flockFile) {
		FlockModule module = new FlockModule(); 
		try {
			module.parse(flockFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}  
		}
		return module;
	}
	
	
	protected IEolExecutableModule etlModuleSetup(File etlFile) {
		IEolExecutableModule module = new EtlModule();    
		try {
			module.parse(etlFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}   
		}
		return module;
	}
	
	
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
		return emfModel;
	}
	
	protected EmfModel createEmfModel(String name, org.eclipse.emf.common.util.URI uri,
	 		String pcgURI, boolean readOnLoad, boolean storeOnDisposal)
					throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();

		StringProperties properties = new StringProperties();
		if (pcgURI != null){
			properties.put(EmfModel.PROPERTY_METAMODEL_URI, pcgURI);
		}
		
		properties.put(EmfModel.PROPERTY_EXPAND, "true");
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_MODEL_URI, uri);
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.getAliases().add(name);
		emfModel.load(properties, (IRelativePathResolver)null);
		return emfModel;
	}
}
