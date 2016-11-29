package de.ugoe.cs.oco.tosca.yamlgenerator;

import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;

import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.types.TypesPackage;
import de.ugoe.cs.oco.tosca.util.ToscaResourceFactoryImpl;


public class BlueprintGenerator {
	public static String generate(Path emfFilePath) throws Exception{
		ToscaPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("tosca", new ToscaResourceFactoryImpl());
		
		IEolExecutableModule module = new EglTemplateFactoryModuleAdapter(new EglTemplateFactory());
		Object result = null;		
		// TODO: Remove path
		File file = new File("/home/fglaser/workspace/simpaas-tosca-template-generator/src/BlueprintGenerator.egl");    
		try {
			module.parse(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}   
		}
		Path toscaMetamodelPath = Paths.get("/home/fglaser/workspace/simpaas-tosca-model2/model/tosca.ecore");
		module.getContext()
		.getModelRepository()
		.addModel(
				createEmfModel("tosca", 
						toscaMetamodelPath.getFileName().toString(),
						toscaMetamodelPath.toString(), 
						null, true, false));

		Path typesMetamodelPath = Paths.get("/home/fglaser/workspace/simpaas-tosca-extensions-model/model/types.ecore");

		module.getContext()
		.getModelRepository()
		.addModel(
				createEmfModel("types", 
						typesMetamodelPath.getFileName().toString(),
						typesMetamodelPath.toString(), 
						null, true, false));


		try {
			module.getContext().getModelRepository().addModel(getModel(emfFilePath, "input", true));
			result = module.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();
	}
	
	public static IModel getModel(Path inputFilePath, String modelAlias, boolean readOnLoad) throws Exception {
		String path = inputFilePath.getParent().toString() + "/";
		//TODO: Remove absolute path
		String metamodelPath = "/home/fglaser/workspace/simpaas-tosca-model2/model/tosca.ecore, "
		+ "/home/fglaser/workspace/simpaas-tosca-extensions-model/model/types.ecore";
		//String metamodelPath = "/home/fglaser/workspace/simpaas-tosca-model2/model/types.ecore";
		
		IModel model = createEmfModel(modelAlias, 
				inputFilePath.getFileName().toString(), 
				path + inputFilePath.getFileName().toString(), 
				metamodelPath, 
				readOnLoad, 
				true);
		
		return model;
	}
	
	private static EmfModel createEmfModel(String name, String model, String uri,
			String metauri, boolean readOnLoad, boolean storeOnDisposal)
					throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_EXPAND, "true");
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, metauri);
		properties.put(EmfModel.PROPERTY_MODEL_URI, uri);
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties);
		emfModel.load();
		return emfModel;
	}
}
