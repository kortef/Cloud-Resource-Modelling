package de.swz.dist.batch.commands;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import de.swz.dist.utils.EGLExecutor;
import de.ugoe.cs.util.console.Command;

public class CMDgenerateJobScript implements Command{

	@Override
	public String help() {
		return "generateJobScript <path to batch model> [<output directory>]";
	}

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
			// String base = "/home/fglaser/open-cloud-orchestrator/de.ugoe.cs.oco/bundles/de.swz.dist.batch.model/model/";
			String base = "model/";
			EGLExecutor jg = new EGLExecutor("jobscript", filePath.toString(), base + "batch.ecore", base + "jobscript.egl"); 		 
			jg.execute();
			result = jg.getResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String fileNameWithoutExtn = fileName.substring(0, fileName.lastIndexOf('.'));
		Path output = Paths.get(outputPath.toString() 
				+ fileSeparator 
				+ fileNameWithoutExtn + ".sh");
		 
		try {
			Files.write(output, result.toString().getBytes(), StandardOpenOption.CREATE);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
