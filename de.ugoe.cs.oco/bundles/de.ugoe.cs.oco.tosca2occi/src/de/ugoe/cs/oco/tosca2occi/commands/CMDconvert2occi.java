package de.ugoe.cs.oco.tosca2occi.commands;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import de.ugoe.cs.oco.tosca.util.ToscaResourceFactoryImpl;
import de.ugoe.cs.oco.tosca2occi.TOSCA2OCCITransformator;
import de.ugoe.cs.util.console.Command;

public class CMDconvert2occi implements Command {

	@Override
	public void run(List<Object> parameters) {
		Path outputPath = Paths.get(System.getProperty("user.dir"));
		Path filePath = null;
		String fileName = "";
		String fileSeparator = System.getProperty("file.separator");
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("tosca", new ToscaResourceFactoryImpl());
		m.put("occie", new OCCIResourceFactoryImpl());
				
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
				+ fileNameWithoutExtn + ".occie");
		
		
		try{
			new TOSCA2OCCITransformator().transform(URI.createFileURI(filePath.toString()), 
					URI.createFileURI(output.toString()));
		
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
		return "convert2occi <path to tosca model> [<output directory>]";
	}
}
