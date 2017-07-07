package de.ugoe.cs.oco.tosca.xsdgenerator.commands;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


import de.ugoe.cs.oco.tosca.xsdgenerator.TOSCA2XSDTransformator;
import de.ugoe.cs.util.console.Command;

public class CMDconvert2xsd implements Command {

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
		String fileNameWithoutExtn = fileName.substring(0, fileName.lastIndexOf('.'));
		Path output = Paths.get(outputPath.toString() 
				+ fileSeparator 
				+ fileNameWithoutExtn + ".xsd");
		
		
		try{
			result = new TOSCA2XSDTransformator().transform(filePath, output);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
//		try {
//			Files.write(output, result.toString().getBytes(), StandardOpenOption.CREATE);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	@Override
	public String help() {
		return "convert2xsd <path to tosca model> [<output directory>]";
	}
}
