package de.ugoe.cs.as.tosca.preprocessor.commands;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import de.ugoe.cs.as.tosca.preprocessor.Preprocessor;
import de.ugoe.cs.util.console.Command;

public class CMDexplodeGroups implements Command {

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
		
		Path oldPath = filePath;
	    String templateName = filePath.getFileName().toString();
		String templateNameWithoutExtn = templateName.substring(0, templateName.lastIndexOf('.'));

	    filePath = Paths.get(outputPath.toString() + "/" 
	    + templateNameWithoutExtn + "_exploded" + ".tosca");
	    
	    try {
			Files.copy(oldPath, filePath, REPLACE_EXISTING);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		fileName = filePath.getFileName().toString();
		
		try{
			new Preprocessor().preprocess(filePath);		 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String help() {
		return "explodeGroups <path to tosca model> [<output directory>]";
	}
}
