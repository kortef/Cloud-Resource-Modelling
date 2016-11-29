/**
 * 
 */
package de.ugoe.swe.simpaas.tosca.parser.test;

import java.io.FileReader;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.esotericsoftware.yamlbeans.YamlReader;

import de.ugoe.swe.simpaas.tosca.GroupType;
import de.ugoe.swe.simpaas.tosca.PolicyType;
import de.ugoe.swe.simpaas.tosca.ServiceTemplate;
import de.ugoe.swe.simpaas.tosca.parser.GroupTypeParser;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;
import de.ugoe.swe.simpaas.tosca.parser.PolicyTypeParser;

/**
 * @author fglaser
 *
 */
public class PolicyTypeParserTest extends ParserTest {

	/**
	 * Test method for {@link de.ugoe.swe.simpaas.tosca.parser.PolicyTypeParser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)}.
	 * @throws ParseException 
	 */
	@Test
	public void testParseMapOfStringQEObject() throws ParseException {
		PolicyType root = factory.createPolicyType();
		root.setName("tosca.policies.Root");
		template.getPolicyTypes().put(root.getName(), root);
		
		List<PolicyType> outcome = new PolicyTypeParser().parse(testmap, template);
		for (PolicyType actual: outcome){
			System.out.println(actual);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testParseOfNormativeTypes() throws Exception {
		ServiceTemplate template = factory.createServiceTemplate();
		FileReader reader = new FileReader("normativetypes/policyTypes.yml");
		YamlReader yamlreader = new YamlReader(reader);
		Object object = yamlreader.read();
		Map<String, ?> map = (Map<String, ?>) object;
		
		List<PolicyType> policyTypes = new PolicyTypeParser().parse(map, template);
		for (PolicyType actual: policyTypes){
			System.out.println(actual);
		}
	}
	
	protected String getFileToParse(){
		return "data/policyType_example.yml";
	}

}
