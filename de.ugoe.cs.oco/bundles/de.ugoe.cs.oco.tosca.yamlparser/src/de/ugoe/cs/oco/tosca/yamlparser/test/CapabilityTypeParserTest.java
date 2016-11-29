/**
 * 
 */
package de.ugoe.swe.simpaas.tosca.parser.test;

import java.io.FileReader;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.esotericsoftware.yamlbeans.YamlReader;

import de.ugoe.swe.simpaas.tosca.CapabilityType;
import de.ugoe.swe.simpaas.tosca.Property;
import de.ugoe.swe.simpaas.tosca.ServiceTemplate;
import de.ugoe.swe.simpaas.tosca.parser.CapabilityTypeParser;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;

/**
 * @author fglaser
 *
 */
public class CapabilityTypeParserTest extends ParserTest {

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.CapabilityTypeParser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParseMapOfStringQEObject() throws ParseException {
		CapabilityType oldtype = factory.createCapabilityType();
		oldtype.setName("tosca.capabilities.Root");
		template.getCapabilityTypes().put(oldtype.getName(), oldtype);
		
		List<CapabilityType> outcome = new CapabilityTypeParser().parse(testmap, template);
		for (CapabilityType type: outcome){
			System.out.println(type);
			for (Property property: type.getProperties()){
				System.out.println(property);
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testParseNormativeTypes() throws Exception {
		ServiceTemplate template = factory.createServiceTemplate();
		FileReader reader = new FileReader("normativetypes/capabilityTypes.yml");
		YamlReader yamlreader = new YamlReader(reader);
		Object object = yamlreader.read();
		Map<String, ?> map = (Map<String, ?>) object;
		
		
		List<CapabilityType> outcome = new CapabilityTypeParser().parse(map, template);
		for (CapabilityType type: outcome){
			System.out.println(type);
			System.out.println(type.getDerivedFrom());
			for (Property property: type.getProperties()){
				System.out.println(property);
			}
		}
	}
	
	protected String getFileToParse(){
		return "data/capabilityType_example.yml";
	}

}
