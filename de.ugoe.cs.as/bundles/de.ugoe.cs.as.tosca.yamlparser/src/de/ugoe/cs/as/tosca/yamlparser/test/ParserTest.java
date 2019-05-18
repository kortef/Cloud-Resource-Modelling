/**
 * 
 */
package de.ugoe.cs.as.tosca.yamlparser.test;

import java.io.FileReader;
import java.util.Map;

import org.junit.Before;

import com.esotericsoftware.yamlbeans.YamlReader;

import de.ugoe.cs.as.tosca.TServiceTemplate;
import de.ugoe.cs.as.tosca.ToscaFactory;

/**
 * @author fglaser
 *
 */
public class ParserTest {
	protected Map<String, ?> testmap;
	protected TServiceTemplate template;
	protected ToscaFactory factory;

	/**
	 * @throws java.lang.Exception
	 */
	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws Exception {
		factory = ToscaFactory.eINSTANCE;
		template = factory.createTServiceTemplate();
		FileReader reader = new FileReader(this.getFileToParse());
		YamlReader yamlreader = new YamlReader(reader);
		Object object = yamlreader.read();
		testmap = (Map<String, ?>) object;
	}

	
	protected String getFileToParse(){
		return "test";
	}

}
