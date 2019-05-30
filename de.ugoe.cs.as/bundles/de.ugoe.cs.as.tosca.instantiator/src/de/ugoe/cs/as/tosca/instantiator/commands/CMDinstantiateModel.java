package de.ugoe.cs.as.tosca.instantiator.commands;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.ugoe.cs.as.evaluator.Evaluator;
import de.ugoe.cs.as.mspec.model.mapping.Parameter;
import de.ugoe.cs.as.tosca.DocumentRoot;
import de.ugoe.cs.as.tosca.ToscaPackage;
import de.ugoe.cs.as.tosca.instantiator.TOSCAInstantiator;
import de.ugoe.cs.as.tosca.util.ToscaResourceFactoryImpl;
import de.ugoe.cs.as.tosca2occi.EcoreModelLoader;
import de.ugoe.cs.util.console.Command;

public class CMDinstantiateModel implements Command {

	@Override
	public void run(List<Object> parameters) {
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
		
		String fileNameWithoutExtn = fileName.substring(0, fileName.lastIndexOf('.'));
		Path output = Paths.get(outputPath.toString() 
				+ fileSeparator 
				+ fileNameWithoutExtn + 
				"_instantiated.tosca");
		
		ToscaPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("tosca", new ToscaResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		
		new EcoreModelLoader().searchAndLoadEcoreModels(
				URI.createFileURI(modelPath.toString()).trimSegments(1), resSet);
		
		Resource outputResource = resSet.createResource(URI.createFileURI(output.toString()));
		Resource inputResource = resSet.getResource(URI.createFileURI(modelPath.toString()), true);
		
		documentRoot = (DocumentRoot) inputResource.getContents().get(0);
		
		DocumentRoot copy = EcoreUtil.copy(documentRoot);
		outputResource.getContents().add(copy);
		
		try {
			Evaluator evaluator = new Evaluator();
			evaluator.load(mappingPath.toString());
			List<Parameter> domainModelPars = evaluator.evaluate(domainModelPath.toString());
			TOSCAInstantiator instantiator = new TOSCAInstantiator();
			copy = instantiator.instantiate(copy, domainModelPars);
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
