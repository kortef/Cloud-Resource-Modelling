/**
 * 
 */
package de.ugoe.cs.as.tosca.yamlparser.test;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.xsd.XSDPackage;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.util.XSDResourceFactoryImpl;
import org.junit.Test;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import de.ugoe.cs.as.tosca.DocumentRoot;
import de.ugoe.cs.as.tosca.ToscaFactory;
import de.ugoe.cs.as.tosca.ToscaPackage;
import de.ugoe.cs.as.tosca.util.ToscaResourceFactoryImpl;
import de.ugoe.cs.as.tosca.yamlparser.ParseException;
import de.ugoe.cs.as.tosca.yamlparser.TOSCAYamlTemplateParser;


/**
 * @author Fabian Korte
 *
 */
public class TOSCAYamlTemplateParserTest extends ParserTest {

	/**
	 * 
	 * @throws ParseException 
	 */
	@Test
	public void testParse() throws ParseException {
		XSDPackage.eINSTANCE.eClass();
		TOSCAYamlTemplateParser parser = new TOSCAYamlTemplateParser();
		
		parser.setTargetNamespace("http://oco.cs.ugoe.de/tosca/normativetypes");
		
		DocumentRoot rootElement = (DocumentRoot) parser.parse(testmap, null);
		
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("tosca", new ToscaResourceFactoryImpl());
		m.put("xsd", new XSDResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
				
		resSet.getPackageRegistry().put(ToscaPackage.eINSTANCE.getNsURI(), ToscaPackage.eINSTANCE);
		resSet.getPackageRegistry().put(XSDPackage.eINSTANCE.getNsURI(), XSDPackage.eINSTANCE);
					    
	    Resource resource = (Resource) resSet.createResource(URI
	        .createURI("swz-testdata/normative-types.tosca"));    
	    
	    resource.getContents().add(rootElement);
	    
	    ExtendedMetaData extendedMetaData =
			new BasicExtendedMetaData(resSet.getPackageRegistry());	   
	    	        
	   rootElement.getDefinitions().get(0).setTypes(ToscaFactory.eINSTANCE.createTypesType());

	    
	    try {
	    	Map<String,Object> savingOptions = new HashMap<String, Object>();
	    	savingOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
	    	savingOptions.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.FALSE);
	    	savingOptions.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
	     	resource.save(savingOptions);
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
	    // save extra xsd file
	    Resource xsd = (Resource) resSet.createResource(URI
		        .createURI("swz-testdata/normative-types.xsd"));
	    xsd.getContents().add(parser.getPropertyTypesSchema());
	    try {
	    	Map<String,Object> savingOptions = new HashMap<String, Object>();
	    	savingOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
	    	savingOptions.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.FALSE);
	    	savingOptions.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
	     	xsd.save(savingOptions);
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
	    
	    // reopen TOSCA file with XSD factory and add schema inside.
		m.put("tosca", new XSDResourceFactoryImpl());
		ResourceSet xsdResourceSet = new ResourceSetImpl();
		Resource xsdResource = xsdResourceSet.createResource(URI.createURI("swz-testdata/normative-types.tosca"));
		
		try {
			xsdResource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		XSDSchema schema = (XSDSchema) xsdResource.getContents().get(0);
		Element element = schema.getElement();
		
		NodeList list = element.getElementsByTagName("tosca:Types");
		Node node = list.item(0);
		Node importedNode = node.getOwnerDocument().importNode(parser.getPropertyTypesSchema().getElement(), true);
		node.appendChild(importedNode);;
		
		
		try {
			Map<String,Object> savingOptions = new HashMap<String, Object>();
	    	savingOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
	    	savingOptions.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.FALSE);
	    	savingOptions.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
			xsdResource.save(savingOptions);
		} catch (IOException e) {
	    	e.printStackTrace();
	    }
				
	}
	
	protected String getFileToParse(){
		return "swz-testdata/normative-types.yml";
	}
}
