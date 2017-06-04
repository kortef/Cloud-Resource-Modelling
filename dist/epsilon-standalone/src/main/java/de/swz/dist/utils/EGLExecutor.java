package de.swz.dist.utils;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.examples.standalone.EpsilonExecutor;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;


public class EGLExecutor extends EpsilonExecutor {
	private String inputModelPath;
	private String inputMetamodelPath;
	private String modelName;
	private URI templatePath;

	public String getResult() {
		return result.toString();
	}

	@Override
	public IEolExecutableModule createModule() {
		EglTemplateFactory factory = new EglTemplateFactory();
		return new EglTemplateFactoryModuleAdapter(factory);
	}

	@Override
	public URI getSource() throws Exception {
		return templatePath;
	}

	@Override
	public List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModelAllURI(modelName, inputModelPath, inputMetamodelPath, true, false));
		return models;
	}

	public EGLExecutor(String modelName, URI inputModelPath, URI inputMetamodelPath, URI templatePath) {
		this.modelName = modelName;
		this.inputModelPath = inputModelPath.toString();
		this.inputMetamodelPath = inputMetamodelPath.toString();
		this.templatePath = templatePath;
	}
	
	public EGLExecutor(String modelName, String inputModelPath, String inputMetamodelPath, String templatePath) throws URISyntaxException {
		this.modelName = modelName;
		this.inputModelPath = getURI(inputModelPath).toString();
		this.inputMetamodelPath = getURI(inputMetamodelPath).toString();
		this.templatePath = getURI(templatePath);
	}
}