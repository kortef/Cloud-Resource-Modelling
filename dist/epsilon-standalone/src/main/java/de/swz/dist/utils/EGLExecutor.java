package de.swz.dist.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.examples.standalone.EpsilonExecutor;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;


public class EGLExecutor extends EpsilonExecutor {
	String inputModelPath;
	String inputMetamodelPath;
	String templatePath;
	String modelName;

	public String getResult() {
		return result.toString();
	}

	@Override
	public IEolExecutableModule createModule() {
		EglTemplateFactory factory = new EglTemplateFactory();
		return new EglTemplateFactoryModuleAdapter(factory);
	}

	@Override
	public String getSource() throws Exception {
		return templatePath;
	}

	@Override
	public List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModel(modelName, inputModelPath, inputMetamodelPath, true, false));
		return models;
	}

	public EGLExecutor(String inputModelPath, String inputMetamodelPath, String templatePath, String modelName) {
		this.inputModelPath = inputModelPath;
		this.inputMetamodelPath = inputMetamodelPath;
		this.templatePath = templatePath;
		this.modelName = modelName;
	}
}