/**
 * 
 */
package de.ugoe.swe.simpaas.tosca.parser.test;

import static org.junit.Assert.assertEquals;

import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.junit.BeforeClass;
import org.junit.Test;

import com.esotericsoftware.yamlbeans.YamlReader;

import de.ugoe.swe.simpaas.tosca.ConstraintClause;
import de.ugoe.swe.simpaas.tosca.ConstraintOperators;
import de.ugoe.swe.simpaas.tosca.ToscaFactory;
import de.ugoe.swe.simpaas.tosca.parser.ConstraintClauseParser;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;

/**
 * @author fglaser
 *
 */
public class ConstraintClauseParserTest {
	static Map<String, String> testmap;
	static HashMap<ConstraintOperators, ConstraintClause> expected_clauses;
	
	@SuppressWarnings("unchecked")
	@BeforeClass
	public static void setUp() throws Exception{
		FileReader reader = new FileReader("data/constraintclause_example.yml");
		YamlReader yamlreader = new YamlReader(reader);
		Object object = yamlreader.read();
		testmap = (Map<String, String>) object;
		expected_clauses = new HashMap<ConstraintOperators, ConstraintClause>();
		
		ConstraintClause expected = ToscaFactory.eINSTANCE.createConstraintClause();
		expected.setOperator(ConstraintOperators.EQUAL);
		expected.getValue().add("2");
		expected_clauses.put(expected.getOperator(), expected);
		
		expected = ToscaFactory.eINSTANCE.createConstraintClause();
		expected.setOperator(ConstraintOperators.GREATERTHAN);
		expected.getValue().add("1");
		expected_clauses.put(expected.getOperator(), expected);
		
		expected = ToscaFactory.eINSTANCE.createConstraintClause();
		expected.setOperator(ConstraintOperators.GREATEROREQUAL);
		expected.getValue().add("2");
		expected_clauses.put(expected.getOperator(), expected);
		
		expected = ToscaFactory.eINSTANCE.createConstraintClause();
		expected.setOperator(ConstraintOperators.LESSTHAN);
		expected.getValue().add("5");
		expected_clauses.put(expected.getOperator(), expected);
		
		expected = ToscaFactory.eINSTANCE.createConstraintClause();
		expected.setOperator(ConstraintOperators.LESSOREQUAL);
		expected.getValue().add("4");
		expected_clauses.put(expected.getOperator(), expected);
		
		expected = ToscaFactory.eINSTANCE.createConstraintClause();
		expected.setOperator(ConstraintOperators.INRANGE);
		expected.getValue().add("1");
		expected.getValue().add("4");
		expected_clauses.put(expected.getOperator(), expected);
		
		expected = ToscaFactory.eINSTANCE.createConstraintClause();
		expected.setOperator(ConstraintOperators.VALIDVALUES);
		expected.getValue().add("1");
		expected.getValue().add("2");
		expected.getValue().add("4");
		expected_clauses.put(expected.getOperator(), expected);
		
		expected = ToscaFactory.eINSTANCE.createConstraintClause();
		expected.setOperator(ConstraintOperators.LENGTH);
		expected.getValue().add("32");
		expected_clauses.put(expected.getOperator(), expected);
		
		expected = ToscaFactory.eINSTANCE.createConstraintClause();
		expected.setOperator(ConstraintOperators.MINLENGTH);
		expected.getValue().add("8");
		expected_clauses.put(expected.getOperator(), expected);
		
		expected = ToscaFactory.eINSTANCE.createConstraintClause();
		expected.setOperator(ConstraintOperators.MAXLENGTH);
		expected.getValue().add("64");
		expected_clauses.put(expected.getOperator(), expected);
			
	}
	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.ConstraintClauseParser#parse(Map, org.eclipse.emf.ecore.EObject)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParse() throws ParseException {
		List<ConstraintClause> outcome = (List<ConstraintClause>) new ConstraintClauseParser().parse(testmap, null);
		
		for (EObject object: outcome){
			ConstraintClause actual = (ConstraintClause) object;
			System.out.println("Check for " + actual.getOperator());
			ConstraintClause expected = expected_clauses.get(actual.getOperator());
			
			if (expected == null){
				System.out.println("Expected value for " + actual.getOperator() + " not found");
			}
			
			assertEquals(actual.getOperator(), expected.getOperator());
			assertEquals(actual.getValue(), expected.getValue());
		}
	}

}
