package de.ugoe.cs.oco.tosca.instantiator.commands;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.ugoe.cs.oco.evaluator.Evaluator;
import de.ugoe.cs.oco.mappingdsl.model.mapping.Parameter;
import de.ugoe.cs.oco.tosca.DocumentRoot;
import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.instantiator.TOSCAInstantiator;
import de.ugoe.cs.oco.tosca.util.ToscaResourceFactoryImpl;
import de.ugoe.cs.util.console.Command;

public class CMDinstantiateModel implements Command {

	@Override
	public void run(List<Object> parameters) {
		String result = null;		
		Path outputPath = Paths.get(System.getProperty("user.dir"));
		Path modelPath = null;
		Path domainModelPath = null;
		Path mappingPath = null;
		String fileName = "";
		String fileSeparator = System.getProperty("file.separator");
		DocumentRoot documentRoot = null;
				
		try {
			modelPath = Paths.get((String) parameters.get(0));
			domainModelPath = Paths.get((String) parameters.get(1));
			mappingPath = Paths.get((String) parameters.get(2));
			
			if (parameters.size() >= 4){
				outputPath = Paths.get((String) parameters.get(3));
			}
		}
		catch (Exception e){
			throw new IllegalArgumentException();
		}
		
		modelPath = makeAbsolute(modelPath, fileSeparator);
		domainModelPath = makeAbsolute(domainModelPath, fileSeparator);
		mappingPath = makeAbsolute(mappingPath, fileSeparator);
		outputPath = makeAbsolute(outputPath, fileSeparator);
		
		fileName = modelPath.getFileName().toString();
		
		try{
			Evaluator evaluator = new Evaluator();
			evaluator.load(mappingPath.toString());
			List<Parameter> domainModelPars = evaluator.evaluate(domainModelPath.toString());
			TOSCAInstantiator instantiator = new TOSCAInstantiator();
			documentRoot = instantiator.instantiate(modelPath, domainModelPars);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String fileNameWithoutExtn = fileName.substring(0, fileName.lastIndexOf('.'));
		Path output = Paths.get(outputPath.toString() 
				+ fileSeparator 
				+ fileNameWithoutExtn + 
				"_instantiated.tosca");
		
		ToscaPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("tosca", new ToscaResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		
		Resource outputResource = resSet.createResource(URI.createURI(output.toString()));
		outputResource.getContents().add(documentRoot);
		 
		try {
			outputResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private Path makeAbsolute(Path path, String fileSeparator){
		if (!path.isAbsolute()){
			path = Paths.get(System.getProperty("user.dir") 
					+ fileSeparator
					+ path);
		}
		return path;
	}

	@Override
	public String help() {
		return "instantiateModel <path to tosca model> <path to domain model> <path to mapping> [<output directory>]";
	}
}
