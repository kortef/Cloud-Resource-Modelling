/**
 * 
 */
package de.ugoe.swe.simpaas.tosca.parser.test;

import java.util.List;

import org.junit.Test;

import de.ugoe.swe.simpaas.tosca.NodeTemplate;
import de.ugoe.swe.simpaas.tosca.NodeType;
import de.ugoe.swe.simpaas.tosca.Property;
import de.ugoe.swe.simpaas.tosca.PropertyAssignment;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;
import de.ugoe.swe.simpaas.tosca.parser.PropertyAssignmentParser;

/**
 * @author fglaser
 *
 */
public class PropertyAssignmentParserTest extends ParserTest{

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.PropertyAssignmentParser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParseMapOfStringQEObject() throws ParseException {
		NodeTemplate nodeTemplate = factory.createNodeTemplate();
		NodeType nodeType = factory.createNodeType();
		nodeTemplate.setType(nodeType);
		Property test01 = factory.createProperty();
		Property test02 = factory.createProperty();
		test01.setName("test01");
		test02.setName("test02");
		nodeType.getProperties().add(test01);
		nodeType.getProperties().add(test02);
		
		List<PropertyAssignment> outcome = new PropertyAssignmentParser().parse(testmap, nodeTemplate);
		
		for (PropertyAssignment actual: outcome){
			System.out.println(actual);
		}
	}
	
	protected String getFileToParse(){
		return "data/propertyAssignment_example.yml";
	}

}
