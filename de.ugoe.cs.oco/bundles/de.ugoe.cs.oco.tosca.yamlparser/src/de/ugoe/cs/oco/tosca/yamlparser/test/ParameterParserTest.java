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

import de.ugoe.swe.simpaas.tosca.ConstraintClause;
import de.ugoe.swe.simpaas.tosca.Parameter;
import de.ugoe.swe.simpaas.tosca.parser.ParameterParser;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;

/**
 * @author fglaser
 *
 */
public class ParameterParserTest {
	private Map<String, ?> testmap;
	/**
	 * @throws java.lang.Exception
	 */
	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws Exception {
		FileReader reader = new FileReader("data/parameter_example.yml");
		YamlReader yamlreader = new YamlReader(reader);
		Object object = yamlreader.read();
		testmap = (Map<String, ?>) object;
	}

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.ParameterParser#parse(Map, org.eclipse.emf.ecore.EObject)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParseMapOfQQEObject() throws ParseException {
		List<Parameter> outcome = (List<Parameter>) new ParameterParser().parse(testmap, null);
		for (Parameter actual: outcome){
			System.out.println(actual);
			System.out.println(actual.getDescription());
			for (ConstraintClause clause: actual.getConstraints()){
				System.out.println(clause);
			}
		}
	}

}
