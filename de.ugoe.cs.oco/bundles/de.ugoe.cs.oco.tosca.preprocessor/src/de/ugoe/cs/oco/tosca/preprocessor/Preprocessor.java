/**
 * 
 */
package de.ugoe.cs.oco.tosca.preprocessor;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;

import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.types.TypesPackage;
import de.ugoe.cs.oco.tosca.types.util.TypesResourceFactoryImpl;
import de.ugoe.cs.oco.tosca.util.ToscaResourceFactoryImpl;

/**
 * @author fglaser
 *
 */
public class Preprocessor {
	public Path preprocess(Path toscaTemplate){
	ToscaPackage.eINSTANCE.eClass();
	TypesPackage.eINSTANCE.eClass();
	Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    m.put("tosca", new ToscaResourceFactoryImpl());
    
    EolModule module = new EolModule();
	URL eolCode = this.getClass().getResource("/de/ugoe/cs/oco/tosca/preprocessor/model/preprocessor.eol");
	System.out.println(eolCode);
	try{
		module.parse(eolCode.toURI());
	} catch (Exception e) {
		e.printStackTrace();
	}
	if (module.getParseProblems().size() > 0) {
		System.err.println("Parse errors occured...");
		for (ParseProblem problem : module.getParseProblems()) {
			System.err.println(problem.toString());
		}   
	}
	String toscaURI = "http://oco.cs.ugoe.de/tosca, http://swe.simpaas.tosca.de/PropertyTypes";
	String path = toscaTemplate.getParent().toString() + "/";

	try {
		IModel inputModel = createEmfModel("input", 
				path + toscaTemplate.getFileName().toString(),  
				toscaURI,
				true, 
				false);
		
		module.getContext().getModelRepository().addModel(inputModel);
		module.execute();
		inputModel.store();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return toscaTemplate;
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
	emfModel.load(properties,( IRelativePathResolver) null);
	return emfModel;
}
}
