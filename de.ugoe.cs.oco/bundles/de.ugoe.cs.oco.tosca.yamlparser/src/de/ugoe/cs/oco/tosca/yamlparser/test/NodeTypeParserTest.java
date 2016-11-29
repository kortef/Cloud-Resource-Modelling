/**
 * 
 */
package de.ugoe.swe.simpaas.tosca.parser.test;

import java.io.FileReader;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.esotericsoftware.yamlbeans.YamlReader;

import de.ugoe.swe.simpaas.tosca.ArtifactType;
import de.ugoe.swe.simpaas.tosca.Attribute;
import de.ugoe.swe.simpaas.tosca.CapabilityType;
import de.ugoe.swe.simpaas.tosca.DataType;
import de.ugoe.swe.simpaas.tosca.InterfaceType;
import de.ugoe.swe.simpaas.tosca.NodeType;
import de.ugoe.swe.simpaas.tosca.Property;
import de.ugoe.swe.simpaas.tosca.RelationshipType;
import de.ugoe.swe.simpaas.tosca.Requirement;
import de.ugoe.swe.simpaas.tosca.ServiceTemplate;
import de.ugoe.swe.simpaas.tosca.ToscaFactory;
import de.ugoe.swe.simpaas.tosca.Type;
import de.ugoe.swe.simpaas.tosca.parser.ArtifactTypeParser;
import de.ugoe.swe.simpaas.tosca.parser.CapabilityTypeParser;
import de.ugoe.swe.simpaas.tosca.parser.DataTypeParser;
import de.ugoe.swe.simpaas.tosca.parser.InterfaceTypeParser;
import de.ugoe.swe.simpaas.tosca.parser.NodeTypeParser;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;
import de.ugoe.swe.simpaas.tosca.parser.RelationshipTypeParser;

/**
 * @author fglaser
 *
 */
public class NodeTypeParserTest extends ParserTest {

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.NodeTypeParser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParseMapOfStringQEObject() throws ParseException {
		NodeType type = factory.createNodeType();
		type.setName("tosca.nodes.SoftwareComponent");
		template.getNodeTypes().put(type.getName(), type);
		
		List<NodeType> outcome = new NodeTypeParser().parse(testmap, template);
		for (NodeType actual: outcome){
			System.out.println(actual);
			System.out.println(actual.getDescription().getValue());
			for (Property property: actual.getProperties()){
				System.out.println(property);
			}
			for (Attribute attribute: actual.getAttributes()){
				System.out.println(attribute);
			}
			for (Requirement requirement: actual.getRequirements()){
				System.out.println(requirement);
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testParseOfNormativeTypes() throws Exception {
		ServiceTemplate template = factory.createServiceTemplate();
				
		FileReader reader = new FileReader("normativetypes/dataTypes.yml");
		YamlReader yamlreader = new YamlReader(reader);
		Object object = yamlreader.read();
		Map<String, ?> map = (Map<String, ?>) object;
		
		List<DataType> dataTypes = new DataTypeParser().parse(map, template);
		
		for (Type type: dataTypes){
			template.getDataTypes().put(type.getName(), type);
		}
		
		reader = new FileReader("normativetypes/artifactTypes.yml");
		yamlreader = new YamlReader(reader);
		object = yamlreader.read();
		map = (Map<String, ?>) object;
		
		List<ArtifactType> artifactTypes = new ArtifactTypeParser().parse(map, template);
		for (Type type: artifactTypes){
			template.getArtifactTypes().put(type.getName(), type);
		}
		
		reader = new FileReader("normativetypes/capabilityTypes.yml");
		yamlreader = new YamlReader(reader);
		object = yamlreader.read();
		map = (Map<String, ?>) object;
		
		List<CapabilityType> capabilityTypes = new CapabilityTypeParser().parse(map, template);
		for (Type type: capabilityTypes){
			template.getCapabilityTypes().put(type.getName(), type);
		}		
		reader = new FileReader("normativetypes/interfaceTypes.yml");
		yamlreader = new YamlReader(reader);
		object = yamlreader.read();
		map = (Map<String, ?>) object;
		
		List<InterfaceType> interfaceTypes = new InterfaceTypeParser().parse(map, template);
		for (Type type: interfaceTypes){
			template.getInterfaceTypes().put(type.getName(), type);
		}
		
		reader = new FileReader("normativetypes/relationshipTypes.yml");
		yamlreader = new YamlReader(reader);
		object = yamlreader.read();
		map = (Map<String, ?>) object;
		
		List<RelationshipType> relationshipTypes = new RelationshipTypeParser().parse(map, template);
		for (Type type: relationshipTypes){
			template.getRelationshipTypes().put(type.getName(), type);
		}		
		reader = new FileReader("normativetypes/nodeTypes.yml");
		yamlreader = new YamlReader(reader);
		object = yamlreader.read();
		map = (Map<String, ?>) object;
		List<NodeType> nodeTypes = new NodeTypeParser().parse(map, template);

		for (Type type: nodeTypes){
			template.getNodeTypes().put(type.getName(), type);
		}
		
		for (NodeType actual: nodeTypes){
			System.out.println(actual);
		}
	}
	
	protected String getFileToParse(){
		return "data/nodeType_example.yml";
	}

}
