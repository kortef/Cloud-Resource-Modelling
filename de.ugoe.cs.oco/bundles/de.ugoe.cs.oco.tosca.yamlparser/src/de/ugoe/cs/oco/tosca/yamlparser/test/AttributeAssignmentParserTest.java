/**
 * 
 */
package de.ugoe.swe.simpaas.tosca.parser.test;

import java.util.List;

import org.junit.Test;

import de.ugoe.swe.simpaas.tosca.Attribute;
import de.ugoe.swe.simpaas.tosca.AttributeAssignment;
import de.ugoe.swe.simpaas.tosca.NodeTemplate;
import de.ugoe.swe.simpaas.tosca.NodeType;
import de.ugoe.swe.simpaas.tosca.parser.AttributeAssignmentParser;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;

/**
 * @author fglaser
 *
 */
public class AttributeAssignmentParserTest extends ParserTest {

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.AttributeAssignmentParser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParseMapOfStringQEObject() throws ParseException {
		NodeTemplate nodeTemplate = factory.createNodeTemplate();
		NodeType nodeType = factory.createNodeType();
		nodeTemplate.setType(nodeType);
		Attribute test01 = factory.createAttribute();
		Attribute test02 = factory.createAttribute();
		test01.setName("test01");
		test02.setName("test02");
		nodeType.getAttributes().add(test01);
		nodeType.getAttributes().add(test02);
		
		List<AttributeAssignment> outcome = new AttributeAssignmentParser().parse(testmap, nodeTemplate);
		
		for (AttributeAssignment actual: outcome){
			System.out.println(actual);
		}
	}
	
	protected String getFileToParse(){
		return "data/attributeAssignment_example.yml";
	}

}
