/**
 * 
 */
package de.ugoe.swe.simpaas.tosca.parser.test;

import java.io.FileReader;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.esotericsoftware.yamlbeans.YamlReader;

import de.ugoe.swe.simpaas.tosca.Interface;
import de.ugoe.swe.simpaas.tosca.InterfaceType;
import de.ugoe.swe.simpaas.tosca.Operation;
import de.ugoe.swe.simpaas.tosca.Property;
import de.ugoe.swe.simpaas.tosca.PropertyInterface;
import de.ugoe.swe.simpaas.tosca.ServiceTemplate;
import de.ugoe.swe.simpaas.tosca.ToscaFactory;
import de.ugoe.swe.simpaas.tosca.parser.InterfaceParser;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;

/**
 * @author fglaser
 *
 */
public class InterfaceParserTest {
	private Map<String, ?> testmap;
	private ServiceTemplate template;
	/**
	 * @throws java.lang.Exception
	 */
	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws Exception {
		FileReader reader = new FileReader("data/interface_example.yml");
		YamlReader yamlreader = new YamlReader(reader);
		Object object = yamlreader.read();
		testmap = (Map<String, ?>) object;
		
		template = ToscaFactory.eINSTANCE.createServiceTemplate();
		InterfaceType type = ToscaFactory.eINSTANCE.createInterfaceType();
		type.setName("TestType");
		template.getInterfaceTypes().put(type.getName(), type);
	}

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.InterfaceParser#parse(Map, org.eclipse.emf.ecore.EObject)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParseMapOfQQEObject() throws ParseException {
		List<Interface> outcome = new InterfaceParser().parse(testmap, template);
		for (Interface actual: outcome){
			System.out.println(actual);
			System.out.println(actual.getType());
			for (PropertyInterface interf: actual.getInputs()){
				Property property = (Property) interf;
				System.out.println(property);
			}
			
			for (Operation operation: actual.getOperations()){
				System.out.println(operation);
			}
		}
	}

}
