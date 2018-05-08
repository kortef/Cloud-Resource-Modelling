/**
 * 
 */
package de.ugoe.cs.oco.tosca2occi;
import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.etl.EtlModule;

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
		EcorePlugin.ExtensionProcessor.process(null);
					
		ResourceSet set = new ResourceSetImpl();
		
		IEolExecutableModule module = new EtlModule();
		Object result = null;		
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
			Resource resource = set.getResource(URI.createURI(path + toscaModelPath.getFileName().toString()), true);
			InMemoryEmfModel toscaModel = new InMemoryEmfModel(resource);
			toscaModel.setName("TOSCA");
			
			path = occiModelPath.getParent().toString() + "/";
			resource = set.createResource(URI.createURI(path + occiModelPath.getFileName().toString()));
			InMemoryEmfModel occiModel = new InMemoryEmfModel(resource);
			occiModel.setName("OCCI");
						
			module.getContext().getModelRepository().addModel(toscaModel);
			module.getContext().getModelRepository().addModel(occiModel);
			
			HashMap<String, String> extensionMap = new HashMap<String, String>();
			extensionMap.put("http://schemas.ogf.org/occi/core", "Core");
			extensionMap.put("http://schemas.ogf.org/occi/infrastructure", "Infrastructure");
			extensionMap.put("http://schemas.modmacao.org/placement", "Placement");
			extensionMap.put("http://schemas.modmacao.org/modmacao", "Modmacao");
			extensionMap.put("http://schemas.modmacao.org/occi/platform", "Platform");
					
			for (Entry<String, String> entry: extensionMap.entrySet()) {
				resource = set.getResource(URI.createURI(entry.getKey(), true), true);
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
}

