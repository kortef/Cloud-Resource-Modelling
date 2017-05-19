package de.swz.dist.batch;

import java.util.ArrayList;
import java.util.List;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;


import de.swz.dist.utils.EpsilonExecutor;

import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;


public class JobscriptGenerator extends EpsilonExecutor {
	String inputModelPath;
	String inputMetamodelPath;
	String templatePath;
	//String outputFilePath;

	public String getResult() {
		return result.toString();
	}

	@Override
	public IEolExecutableModule createModule() {
		//System.out.println("...createModule");
		EglTemplateFactory factory = new EglTemplateFactory();
		return new EglTemplateFactoryModuleAdapter(factory);
	}

	@Override
	public String getSource() throws Exception {
		//System.out.println("...getSource");
		return templatePath;
	}

	@Override
	public List<IModel> getModels() throws Exception {
		//System.out.println("...getModels");
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModel("jobscript", inputModelPath, inputMetamodelPath, true, false));
		return models; 
	}

	@Override
	public URI getFileURI(String fileName) throws URISyntaxException {
		//System.out.println("...getFileURI(" + fileName + ")");
		URI uri = URI.create(fileName);
		System.out.println("-> " + uri.toString());
		return uri;
	}

	public String getSourceFromClasspath (String name) {
		URL sourceURL = this.getClass().getResource("/" + name);
		return sourceURL.getPath();
	}

	public JobscriptGenerator(String inputModelPath, String inputMetamodelPath, String templatePath) {
		//System.out.println("This is jobscriptGenerator.");
		this.inputModelPath = inputModelPath;
		this.inputMetamodelPath = inputMetamodelPath;
		this.templatePath = templatePath;
	}
}
