/**
 * 
 */
package de.ugoe.cs.oco.tosca2occi;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.cmf.occi.core.util.OCCIResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.etl.EtlModule;

import de.ugoe.cs.oco.tosca.util.ToscaResourceFactoryImpl;

/**
 * Class responsible for handling the transformation of TOSCA models to OCCI models.
 * @author Fabian Korte
 */
public class TOSCA2OCCITransformator {
	/**
	 * @param toscaModelPath The input path to the TOSCA model
	 * @param occiModelPath The output path where the generated OCCI model will be stored. 
	 * @return
	 * @throws Exception
	 */
	public static String transform(Path toscaModelPath, Path occiModelPath) throws Exception{
		//ToscaPackage.eINSTANCE.eClass();
		//NormativePackage.eINSTANCE.eClass();
		//OCCIPackage.eINSTANCE.eClass();
		//InfrastructurePackage.eINSTANCE.eClass();
		
		EcorePlugin.ExtensionProcessor.process(null);

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		
		m.put("tosca", new ToscaResourceFactoryImpl());
		m.put("occie", new OCCIResourceFactoryImpl());
		m.put("occic", new OCCIResourceFactoryImpl());
					
		ResourceSet set = new ResourceSetImpl();
		set.getLoadOptions().put(XMIResource.OPTION_URI_HANDLER, new
				URIHandlerImpl.PlatformSchemeAware());
	
		IEolExecutableModule module = new EtlModule();
		Object result = null;		
		// TODO: Remove path
		File transformationFile = new File("model/TOSCA2OCCI.etl");    
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
			String path = toscaModelPath.getParent().toString() + "/";
			IModel toscaModel = createEmfModelFromResourceSet("TOSCA", path + toscaModelPath.getFileName().toString(), set);
			path = occiModelPath.getParent().toString() + "/";
			InMemoryEmfModel occiModel = createEmfModelFromResourceSet("OCCI", path + occiModelPath.getFileName().toString(), set);
			
			module.getContext().getModelRepository().addModel(toscaModel);
			module.getContext().getModelRepository().addModel(occiModel);
			
			HashMap<String, String> extensionMap = new HashMap<String, String>();
			extensionMap.put("http://schemas.ogf.org/occi/core", "Core");
			extensionMap.put("http://schemas.ogf.org/occi/infrastructure", "Infrastructure");
			extensionMap.put("http://schemas.modmacao.org/placement", "Placement");
			extensionMap.put("http://schemas.modmacao.org/modmacao", "Modmacao");
			extensionMap.put("http://schemas.modmacao.org/occi/platform", "Platform");
					
			for (Entry<String, String> entry: extensionMap.entrySet()) {
				Resource resource = set.getResource(URI.createURI(entry.getKey(), true), true);
				IModel model = new InMemoryEmfModel(resource);
				model.setName(entry.getValue());
				module.getContext().getModelRepository().addModel(model);		
			}
			
			result = module.execute();
			occiModel.getResource().save(null);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();
	}

//	private static EmfModel createEmfModel(String name, String uri,
//			String metauri, boolean readOnLoad, boolean storeOnDisposal)
//					throws EolModelLoadingException, URISyntaxException {
//		EmfModel emfModel = new EmfModel();
//		StringProperties properties = new StringProperties();
//		properties.put(EmfModel.PROPERTY_CACHED, "true");
//		if (metauri != null){
//			properties.put(EmfModel.PROPERTY_METAMODEL_URI, metauri);
//		}
//		properties.put(EmfModel.PROPERTY_EXPAND, "true");
//		properties.put(EmfModel.PROPERTY_NAME, name);
//		properties.put(EmfModel.PROPERTY_MODEL_URI, uri);
//		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
//		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
//		emfModel.load(properties, (IRelativePathResolver)null);
//		return emfModel;
//	}
	
	private static InMemoryEmfModel createEmfModelFromResourceSet(String name, String uri, ResourceSet set) throws IOException {
		Resource resource = set.getResource(URI.createURI(uri), true);
		InMemoryEmfModel model = new InMemoryEmfModel(resource);
		model.setName(name);
		return model;
	}
}

