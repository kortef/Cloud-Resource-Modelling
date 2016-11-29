package de.ugoe.cs.oco.tosca.yamlgenerator.commands;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import de.ugoe.cs.util.console.Command;
import de.ugoe.cs.oco.tosca.yamlgenerator.BlueprintGenerator;

public class CMDconvert2blueprint implements Command {

	@Override
	public void run(List<Object> parameters) {
		String result = null;		
		Path outputPath = Paths.get(System.getProperty("user.dir"));
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
		
		fileName = filePath.getFileName().toString();
		
		try{
		result = BlueprintGenerator.generate(filePath);		 
		} catch (Exception e) {
			e.printStackTrace();
		}
		String fileNameWithoutExtn = fileName.substring(0, fileName.lastIndexOf('.'));
		Path output = Paths.get(outputPath.toString() 
				+ fileSeparator 
				+ fileNameWithoutExtn + ".yaml");
		 
		try {
			Files.write(output, result.toString().getBytes(), StandardOpenOption.CREATE);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String help() {
		return "convert2blueprint <path to ecore model> [<output directory>]";
	}
}
