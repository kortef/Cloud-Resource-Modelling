/**
 * 
 */
package de.ugoe.swe.simpaas.tosca.parser.test;

import java.util.List;

import org.junit.Test;

import de.ugoe.swe.simpaas.tosca.Interface;
import de.ugoe.swe.simpaas.tosca.NodeTemplate;
import de.ugoe.swe.simpaas.tosca.NodeType;
import de.ugoe.swe.simpaas.tosca.Property;
import de.ugoe.swe.simpaas.tosca.PropertyAssignment;
import de.ugoe.swe.simpaas.tosca.RequirementAssignment;
import de.ugoe.swe.simpaas.tosca.parser.NodeTemplateParser;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;

/**
 * @author fglaser
 *
 */
public class NodeTemplateParserTest extends ParserTest {

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.NodeTemplateParser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParseMapOfStringQEObject() throws ParseException {
		NodeType rootType = factory.createNodeType();
		rootType.setName("tosca.nodes.DBMS.MySQL");
		template.getNodeTypes().put("tosca.nodes.DBMS.MySQL", rootType);
		
		Property property01 = factory.createProperty();
		property01.setName("port");
		
		rootType.getProperties().add(property01);
		
		Property property02 = factory.createProperty();
		property02.setName("root_password");
		
		rootType.getProperties().add(property02);
		
		List<NodeTemplate> outcome = new NodeTemplateParser().parse(testmap, template);
		for (NodeTemplate actual: outcome){
			System.out.println(actual);
			for (PropertyAssignment property: actual.getProperties()){
				System.out.println(property);
			}
			for (RequirementAssignment requirement: actual.getRequirements()){
				System.out.println(requirement);
			}
			for (Interface interf: actual.getInterfaces()){
				System.out.println(interf);
			}
		}
	}
	
	protected String getFileToParse(){
		return "data/nodeTemplate_example.yml";
	}

}


