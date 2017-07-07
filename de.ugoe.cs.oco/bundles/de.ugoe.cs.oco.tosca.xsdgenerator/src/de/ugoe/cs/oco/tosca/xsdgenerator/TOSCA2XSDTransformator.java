/**
 * 
 */
package de.ugoe.cs.oco.tosca.xsdgenerator;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.xsd.XSDPackage;
import org.eclipse.xsd.impl.XSDFactoryImpl;
import org.eclipse.xsd.util.XSDResourceFactoryImpl;

import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.types.TypesPackage;
import de.ugoe.cs.oco.tosca.util.ToscaResourceFactoryImpl;

/**
 * @author fglaser
 *
 */
public class TOSCA2XSDTransformator {
	public String transform(Path toscaModelPath, Path xsdModelPath) throws Exception{
		ToscaPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		XSDPackage.eINSTANCE.eClass();
		
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("tosca", new ToscaResourceFactoryImpl());
		m.put("xsd", new XSDResourceFactoryImpl());
		
		IEolExecutableModule module = new EtlModule();
		Object result = null;		
		// TODO: Remove path
		URL transformationFile = this.getClass().getResource("/de/ugoe/cs/oco/tosca/xsdgenerator/model/XSDGenerator.etl");
		
		try {
			module.parse(transformationFile.toURI());
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}   
		}

		try {
			String toscaURI = "http://oco.cs.ugoe.de/tosca, http://swe.simpaas.tosca.de/PropertyTypes";
			String path = toscaModelPath.getParent().toString() + "/";
			IModel toscaModel = createEmfModel("TOSCA", 
					path + toscaModelPath.getFileName().toString(),  
					toscaURI,
					true, 
					false);
			
			String xsdURI = "http://www.eclipse.org/xsd/2002/XSD";
			path = xsdModelPath.getParent().toString() + "/";
			IModel xsdModel = createEmfModel("XSD",
					path + xsdModelPath.getFileName().toString(),
					xsdURI,
					false,
					true);
			
			
			module.getContext().getModelRepository().addModel(toscaModel);
			module.getContext().getModelRepository().addModel(xsdModel);
			
			result = module.execute();
			xsdModel.store();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();
	}

	private static EmfModel createEmfModel(String name, String uri,
			String metauri, boolean readOnLoad, boolean storeOnDisposal)
					throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_CACHED, "true");
		if (metauri != null){
			properties.put(EmfModel.PROPERTY_METAMODEL_URI, metauri);
		}
		properties.put(EmfModel.PROPERTY_EXPAND, "true");
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_MODEL_URI, uri);
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties, (IRelativePathResolver)null);
		return emfModel;
	}
}
