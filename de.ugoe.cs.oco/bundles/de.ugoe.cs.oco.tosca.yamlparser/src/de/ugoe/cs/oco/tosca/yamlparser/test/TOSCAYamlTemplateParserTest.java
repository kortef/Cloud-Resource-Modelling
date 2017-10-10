/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser.test;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLInfoImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLOptionsImpl;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDPackage;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.impl.type.XSDTypeRegister;
import org.eclipse.xsd.util.XSDResourceFactoryImpl;
import org.junit.Test;

import de.ugoe.cs.oco.tosca.DocumentRoot;
import de.ugoe.cs.oco.tosca.ToscaFactory;
import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.util.ToscaResourceFactoryImpl;
import de.ugoe.cs.oco.tosca.yamlparser.ParseException;
import de.ugoe.cs.oco.tosca.yamlparser.Parser;
import de.ugoe.cs.oco.tosca.yamlparser.TOSCAYamlTemplateParser;


/**
 * @author fglaser
 *
 */
public class TOSCAYamlTemplateParserTest extends ParserTest {

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.ServiceTemplateParser#parse(java.util.Map, Parser)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParse() throws ParseException {
		XSDPackage.eINSTANCE.eClass();
		TOSCAYamlTemplateParser parser = new TOSCAYamlTemplateParser();
		
		parser.setTargetNamespace("http://de.ugoe.cs.oco.test/test");
		
		DocumentRoot rootElement = (DocumentRoot) parser.parse(testmap, null);
		rootElement.getXSISchemaLocation().put("xs", "test");
		
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("tosca", new ToscaResourceFactoryImpl());
		m.put("xsd", new XSDResourceFactoryImpl());
		m.put("ecore", new EcoreResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
				
		resSet.getPackageRegistry().put(ToscaPackage.eINSTANCE.getNsURI(), ToscaPackage.eINSTANCE);
		resSet.getPackageRegistry().put(XSDPackage.eINSTANCE.getNsURI(), XSDPackage.eINSTANCE);
					    
	    XMLResource resource = (XMLResource) resSet.createResource(URI
	        .createURI("data/serviceTemplateExample.tosca"));
	    
	    Resource xsd = resSet.createResource(URI
	    		.createURI("data/serviceTemplateExample.xsd"));
	    	    
	    resource.getContents().add(rootElement);
	    xsd.getContents().add(parser.getPropertyTypesSchema());
	    
	    ExtendedMetaData extendedMetaData =
			new BasicExtendedMetaData(resSet.getPackageRegistry());	   
	    
//	    EStructuralFeature feature = extendedMetaData.demandFeature(XSDPackage.eINSTANCE.getNsURI(), 
//	    		"schema", true);
//	    
//		reg.getContentTypeToFactoryMap().put(XSDPackage.eCONTENT_TYPE, new XSDResourceFactoryImpl());
//	    
//	    rootElement.getDefinitions().setTypes(ToscaFactory.eINSTANCE.createTypesType());   	    
//	    rootElement.getDefinitions().getTypes().getAny().add(feature, parser.getPropertyTypesSchema());
	
	    
	    try {
	    	Map<String,Object> savingOptions = new HashMap<String, Object>();
	    	savingOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
	    	savingOptions.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.FALSE);
	    	savingOptions.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
	     	resource.save(savingOptions);
	     	xsd.save(savingOptions);
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
		
	}
	
	protected String getFileToParse(){
		return "data/normative-types.yml";
	}
}
