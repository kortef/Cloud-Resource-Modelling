/**
 * 
 */
package de.ugoe.swe.simpaas.tosca.parser.test;

import java.util.List;

import org.junit.Test;

import de.ugoe.swe.simpaas.tosca.Policy;
import de.ugoe.swe.simpaas.tosca.PolicyType;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;
import de.ugoe.swe.simpaas.tosca.parser.PolicyParser;

/**
 * @author fglaser
 *
 */
public class PolicyParserTest extends ParserTest{

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.PolicyParser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParseMapOfStringQEObject() throws ParseException {
		PolicyType rootType = factory.createPolicyType();
		rootType.setName("tosca.policies.placement");
		
		template.getPolicyTypes().put(rootType.getName(), rootType);
		
		List<Policy> outcome = new PolicyParser().parse(testmap, template);
		for (Policy actual: outcome){
			System.out.println(actual);
		}
	}
	
	protected String getFileToParse(){
		return "data/policy_example.yml";
	}
}
