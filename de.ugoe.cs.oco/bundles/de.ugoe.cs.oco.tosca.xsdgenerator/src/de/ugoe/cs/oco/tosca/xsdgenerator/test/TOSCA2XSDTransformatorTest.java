package de.ugoe.cs.oco.tosca.xsdgenerator.test;

import static org.junit.Assert.*;

import java.nio.file.Paths;

import org.junit.Test;

import de.ugoe.cs.oco.tosca.xsdgenerator.TOSCA2XSDTransformator;
import de.ugoe.cs.oco.tosca.yamlparser.TOSCAYamlTemplateParser;

public class TOSCA2XSDTransformatorTest {

	@Test
	public final void testTransform() throws Exception {
		new TOSCA2XSDTransformator().transform(Paths.get("data/property_example.yml"), Paths.get("data/output.xsd"), "http://www.test.com/property_example");
	}
	

}
