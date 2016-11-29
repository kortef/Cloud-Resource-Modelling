package de.ugoe.swe.simpaas.tosca.parser.test;

import java.io.FileReader;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.esotericsoftware.yamlbeans.YamlReader;

import de.ugoe.swe.simpaas.tosca.Import;
import de.ugoe.swe.simpaas.tosca.Repository;
import de.ugoe.swe.simpaas.tosca.ServiceTemplate;
import de.ugoe.swe.simpaas.tosca.ToscaFactory;
import de.ugoe.swe.simpaas.tosca.parser.ImportParser;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;

public class ImportParserTest {

	private Map<String, String> testmap;
	private ServiceTemplate template;
	/**
	 * @throws java.lang.Exception
	 */
	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws Exception {
		template = ToscaFactory.eINSTANCE.createServiceTemplate();
		
		Repository expectedRepository = ToscaFactory.eINSTANCE.createRepository();
		expectedRepository.setName("my_service_catalog");
		
		template.getRepositories().add(expectedRepository);
		FileReader reader = new FileReader("data/import_example.yml");
		YamlReader yamlreader = new YamlReader(reader);
		Object object = yamlreader.read();
		testmap = (Map<String, String>) object;
	}

	@Test
	public void testParseMapOfQQEObject() throws ParseException {
		List<Import> imports= (List<Import>) new ImportParser().parse(testmap, template);
		for (Import imp: imports){
			System.out.println(imp);
		}
	}

}
