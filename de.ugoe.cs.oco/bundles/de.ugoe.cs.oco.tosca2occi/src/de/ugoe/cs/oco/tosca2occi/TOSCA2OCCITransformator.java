/**
 * 
 */
package de.ugoe.cs.oco.tosca2occi;
import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.etl.EtlModule;
import org.occiware.clouddesigner.occi.OCCIPackage;
import org.occiware.clouddesigner.occi.infrastructure.InfrastructurePackage;
import org.occiware.clouddesigner.occi.util.OCCIResourceFactoryImpl;

import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.types.TypesPackage;
import de.ugoe.cs.oco.tosca.util.ToscaResourceFactoryImpl;

/**
 * Class responsible for handling the transformation of TOSCA models to OCCI models.
 * @author fglaser
 */
public class TOSCA2OCCITransformator {
	/**
	 * @param toscaModelPath The input path to the TOSCA model
	 * @param occiModelPath The output path where the generated OCCI model will be stored. 
	 * @return
	 * @throws Exception
	 */
	public static String transform(Path toscaModelPath, Path occiModelPath) throws Exception{
		ToscaPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();
		InfrastructurePackage.eINSTANCE.eClass();
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("tosca", new ToscaResourceFactoryImpl());
		m.put("occie", new OCCIResourceFactoryImpl());
		
		IEolExecutableModule module = new EtlModule();
		Object result = null;		
		// TODO: Remove path
		File transformationFile = new File("/home/fglaser/workspace/TOSCA2OCCI/src/transformation/OCCI2TOSCA.etl");    
		try {
			module.parse(transformationFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}   
		}

		try {
			String toscaURI = "http://swe.simpaas.tosca.de/tosca, http://swe.simpaas.tosca.de/PropertyTypes";
			String path = toscaModelPath.getParent().toString() + "/";
			IModel toscaModel = createEmfModel("TOSCA", 
					path + toscaModelPath.getFileName().toString(),  
					toscaURI,
					true, 
					false);
			
			String occiURI = "http://schemas.ogf.org/occi/core/ecore";
			path = occiModelPath.getParent().toString() + "/";
			IModel occiModel = createEmfModel("OCCI",
					path + occiModelPath.getFileName().toString(),
					occiURI,
					false,
					true);
			
			String occiCoreURI = OCCIPackage.class.getClassLoader().getResource("model/Core.occie").toString();
			IModel occiCoreModel = createEmfModel("Core",
					occiCoreURI,
					occiURI,
					true,
					false
					);
			
			module.getContext().getModelRepository().addModel(toscaModel);
			module.getContext().getModelRepository().addModel(occiModel);
			module.getContext().getModelRepository().addModel(occiCoreModel);
			
			result = module.execute();
			occiModel.store();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();
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

