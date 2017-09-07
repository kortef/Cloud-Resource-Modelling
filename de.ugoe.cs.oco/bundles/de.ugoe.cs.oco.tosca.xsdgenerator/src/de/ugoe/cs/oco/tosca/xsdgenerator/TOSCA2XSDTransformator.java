/**
 * 
 */
package de.ugoe.cs.oco.tosca.xsdgenerator;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.etl.EtlModule;
import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDPackage;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.impl.XSDFactoryImpl;
import org.eclipse.xsd.util.XSDResourceFactoryImpl;

import com.esotericsoftware.yamlbeans.YamlReader;

import de.ugoe.cs.oco.tosca.DocumentRoot;
import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.types.TypesPackage;
import de.ugoe.cs.oco.tosca.util.ToscaResourceFactoryImpl;
import de.ugoe.cs.oco.tosca.yamlparser.PropertyParser;
import de.ugoe.cs.util.console.Console;

/**
 * @author fglaser
 *
 */
public class TOSCA2XSDTransformator {
	public String transform(Path toscaYamlPath, Path xsdModelPath) throws Exception{
		XSDPackage.eINSTANCE.eClass();
		String fileSeparator = System.getProperty("file.separator");
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xsd", new XSDResourceFactoryImpl());
	    ResourceSet resSet = new ResourceSetImpl();
	    
	    PropertyParser parser = new PropertyParser();
	    
		String xsdURI = "http://www.eclipse.org/xsd/2002/XSD";
		String path = xsdModelPath.getParent().toString() + "/";
		XSDSchema schema = XSDFactory.eINSTANCE.createXSDSchema();
		schema.setSchemaForSchemaQNamePrefix("xs");
		schema.setTargetNamespace("http://www.test.com/test");
		schema.getQNamePrefixToNamespaceMap().put("xs", "http://www.w3.org/2001/XMLSchema");
		
		try {
			FileReader reader = new FileReader(toscaYamlPath.toFile());
			YamlReader yamlreader = new YamlReader(reader);
			Object object = yamlreader.read();
			Map<String, ?> map = (Map<String, ?>) object;
			XSDComplexTypeDefinition template = parser.parse(map, null);
		} catch (IOException e) {
			Console.printerrln("Could not parse " + toscaYamlPath + ": " + e.getMessage());
			e.printStackTrace();
		}
		
		try{
			IModel xsdModel = createEmfModel("XSD",
					path + xsdModelPath.getFileName().toString(),
					xsdURI,
					false,
					true);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Resource resource = resSet.createResource(URI
		        .createURI("file://" + xsdModelPath));
		resource.getContents().add(schema);
		try {
		   resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
		   e.printStackTrace();
		}
		return null;
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
