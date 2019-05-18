package de.ugoe.cs.as.tosca.yamlparser.commands;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import com.esotericsoftware.yamlbeans.YamlReader;

import de.ugoe.cs.as.tosca.DocumentRoot;
import de.ugoe.cs.as.tosca.ToscaPackage;
import de.ugoe.cs.as.tosca.util.ToscaResourceFactoryImpl;
import de.ugoe.cs.as.tosca.yamlparser.TOSCAYamlTemplateParser;
import de.ugoe.cs.util.console.Command;
import de.ugoe.cs.util.console.Console;


public class CMDconvertTemplate2ecore implements Command {

	@Override
	public void run(List<Object> parameters) {	
		Path outputPath = Paths.get("output");
		Path filePath = null;
		String fileName = "";
		String fileSeparator = System.getProperty("file.separator");
				
		try {
			filePath = Paths.get((String) parameters.get(0));
			
			if (parameters.size() >= 2){
				outputPath = Paths.get((String) parameters.get(1));
			}
		}
		catch (Exception e){
			throw new IllegalArgumentException();
		}
		
		//ToscaFactory factory = ToscaFactory.eINSTANCE;
		TOSCAYamlTemplateParser parser = new TOSCAYamlTemplateParser();
		DocumentRoot template = null;
		
		if (!filePath.isAbsolute()){
			filePath = Paths.get(System.getProperty("user.dir") 
					+ fileSeparator
					+ filePath);
		}
		
		if (!outputPath.isAbsolute()){
			outputPath = Paths.get(System.getProperty("user.dir") 
					+ fileSeparator
					+ outputPath);
		}
		
		try {
			FileReader reader = new FileReader(filePath.toFile());
			YamlReader yamlreader = new YamlReader(reader);
			Object object = yamlreader.read();
			Map<String, ?> map = (Map<String, ?>) object;
			template = (DocumentRoot) parser.parse(map, null);
		} catch (IOException e) {
			Console.printerrln("Could not parse " + filePath + ": " + e.getMessage());
			e.printStackTrace();
			return;
		}
		
	    ToscaPackage.eINSTANCE.eClass();

	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("tosca", new ToscaResourceFactoryImpl());
	    ResourceSet resSet = new ResourceSetImpl();
	    
	    fileName = filePath.getFileName().toString();
		String fileNameWithoutExtn = fileName.substring(0, fileName.lastIndexOf('.'));
    
	    Resource resource = resSet.createResource(URI
	        .createURI("file://" + outputPath + fileSeparator + fileNameWithoutExtn + ".tosca"));
	    
	    resource.getContents().add(template);
	    
	    try {
	     	resource.save(Collections.EMPTY_MAP);
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
	}

	@Override
	public String help() {
		return "convertTemplate2ecore <path to tosca service template> [<output directory>]";
	}

}
