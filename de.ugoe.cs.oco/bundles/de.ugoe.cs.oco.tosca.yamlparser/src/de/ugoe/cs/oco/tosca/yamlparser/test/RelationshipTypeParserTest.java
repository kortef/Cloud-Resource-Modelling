/**
 * 
 */
package de.ugoe.swe.simpaas.tosca.parser.test;

import java.io.FileReader;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.esotericsoftware.yamlbeans.YamlReader;

import de.ugoe.swe.simpaas.tosca.RelationshipType;
import de.ugoe.swe.simpaas.tosca.ServiceTemplate;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;
import de.ugoe.swe.simpaas.tosca.parser.RelationshipTypeParser;

/**
 * @author fglaser
 *
 */
public class RelationshipTypeParserTest extends ParserTest {

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.RelationshipTypeParser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParseMapOfStringQEObject() throws ParseException {
		RelationshipType root = factory.createRelationshipType();
		root.setName("tosca.relationships.DependsOn");
		template.getRelationshipTypes().put(root.getName(), root);
		
		List<RelationshipType> outcome = new RelationshipTypeParser().parse(testmap, template);
		for (RelationshipType actual: outcome){
			System.out.println(actual);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testParseOfNormativeTypes() throws Exception {
		ServiceTemplate template = factory.createServiceTemplate();
		FileReader reader = new FileReader("normativetypes/relationshipTypes.yml");
		YamlReader yamlreader = new YamlReader(reader);
		Object object = yamlreader.read();
		Map<String, ?> map = (Map<String, ?>) object;
		
		List<RelationshipType> relationshipTypes = new RelationshipTypeParser().parse(map, template);
		for (RelationshipType actual: relationshipTypes){
			System.out.println(actual);
		}
	}
	
	protected String getFileToParse(){
		return "data/relationshipType_example.yml";
	}

}
