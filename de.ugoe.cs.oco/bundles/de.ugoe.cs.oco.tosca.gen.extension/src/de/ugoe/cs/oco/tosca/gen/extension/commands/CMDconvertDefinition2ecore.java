package de.ugoe.cs.oco.tosca.gen.extension.commands;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.gen.extension.TOSCADef2Ecore;
import de.ugoe.cs.util.console.Command;


public class CMDconvertDefinition2ecore implements Command {

	@Override
	public void run(List<Object> parameters) {	
		Path outputPath = Paths.get("output");
		Path filePath = null;
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
		
	
		TOSCADef2Ecore.generateEcore(URI.createURI(filePath.toString()), URI.createURI(outputPath.toString()));
	}

	@Override
	public String help() {
		return "convertDefinition2Ecore <path to tosca service template> <path to output file>";
	}

}
