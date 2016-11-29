package de.ugoe.swe.simpaas.tosca.parser.test;

import java.io.FileReader;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.esotericsoftware.yamlbeans.YamlReader;

import de.ugoe.swe.simpaas.tosca.Repository;
import de.ugoe.swe.simpaas.tosca.parser.ParseException;
import de.ugoe.swe.simpaas.tosca.parser.RepositoryParser;

public class RepositoryParserTest {
	static Map<String, ?> testmap;

	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws Exception {
		FileReader reader = new FileReader("data/repository_example.yml");
		YamlReader yamlreader = new YamlReader(reader);
		Object object = yamlreader.read();
		testmap = (Map<String, String>) object;
	}

	@Test
	public void testParseMapOfQQEObject() throws ParseException {
		List<Repository> outcome = (List<Repository>) new RepositoryParser().parse(testmap, null);
		for (Repository actual: outcome){
			System.out.println("Checking " + actual);
			System.out.println(actual.getDescription().getValue());
		}
	}

}
