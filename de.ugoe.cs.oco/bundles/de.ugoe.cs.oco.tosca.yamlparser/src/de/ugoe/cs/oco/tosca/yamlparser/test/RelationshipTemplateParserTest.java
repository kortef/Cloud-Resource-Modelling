/**
 * 
 */
package de.ugoe.swe.simpaas.tosca.parser.test;

import java.util.List;

import org.junit.Test;

import de.ugoe.swe.simpaas.tosca.Property;
import de.ugoe.swe.simpaas.tosca.RelationshipTemplate;
import de.ugoe.swe.simpaas.tosca.RelationshipType;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;
import de.ugoe.swe.simpaas.tosca.parser.RelationshipTemplateParser;

/**
 * @author fglaser
 *
 */
public class RelationshipTemplateParserTest extends ParserTest {

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.RelationshipTemplateParser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParseMapOfStringQEObject() throws ParseException {
		RelationshipType rootType = factory.createRelationshipType();
		rootType.setName("AttachesTo");
		
		Property property = factory.createProperty();
		property.setName("location");
		
		rootType.getProperties().add(property);
		
		template.getRelationshipTypes().put(rootType.getName(), rootType);
		
		List<RelationshipTemplate> outcome = new RelationshipTemplateParser().parse(testmap, template);
		for (RelationshipTemplate actual: outcome){
			System.out.println(actual);
		}
	}
	
	protected String getFileToParse(){
		return "data/relationshipTemplate_example.yml";
	}
	

}
