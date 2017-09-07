/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser.test;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

import de.ugoe.cs.oco.tosca.DocumentRoot;
import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.util.ToscaResourceFactoryImpl;
import de.ugoe.cs.oco.tosca.yamlparser.ParseException;
import de.ugoe.cs.oco.tosca.yamlparser.TOSCAYamlTemplateParser;


/**
 * @author fglaser
 *
 */
public class TOSCAYamlTemplateParserTest extends ParserTest {

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.ServiceTemplateParser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParse() throws ParseException {
		ToscaPackage.eINSTANCE.eClass();
		DocumentRoot rootElement = (DocumentRoot) new TOSCAYamlTemplateParser().parse(testmap, null);
		
	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("tosca", new ToscaResourceFactoryImpl());
	    ResourceSet resSet = new ResourceSetImpl();
	    
	    Resource resource = resSet.createResource(URI
	        .createURI("data/serviceTemplateExample.tosca"));
	    
	    resource.getContents().add(rootElement);
	    
	    try {
	     	resource.save(Collections.EMPTY_MAP);
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
		
	}
	
	protected String getFileToParse(){
		return "data/serviceTemplate_example_withPropertyDefs.yml";
	}
}
