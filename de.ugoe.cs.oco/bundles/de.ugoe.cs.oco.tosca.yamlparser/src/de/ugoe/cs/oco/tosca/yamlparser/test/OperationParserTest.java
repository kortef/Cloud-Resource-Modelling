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

import de.ugoe.swe.simpaas.tosca.Operation;
import de.ugoe.swe.simpaas.tosca.parser.OperationParser;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;

/**
 * @author fglaser
 *
 */
public class OperationParserTest {
	private Map<String, ?> testmap;
	/**
	 * @throws java.lang.Exception
	 */
	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws Exception {
		FileReader reader = new FileReader("data/operation_example.yml");
		YamlReader yamlreader = new YamlReader(reader);
		Object object = yamlreader.read();
		testmap = (Map<String, ?>) object;
	}

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.OperationParser#parse(Map, org.eclipse.emf.ecore.EObject)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParseMapOfQQEObject() throws ParseException {
		List<Operation> outcome = (List<Operation>) new OperationParser().parse(testmap, null);
		for (Operation actual: outcome){
			System.out.println(actual);
		}
	}

}
