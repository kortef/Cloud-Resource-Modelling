package de.ugoe.cs.oco.tosca.yamlgenerator.test;

import java.nio.file.Paths;

import org.junit.Test;

import de.ugoe.cs.oco.tosca.yamlgenerator.BlueprintGenerator;

public class BlueprintGeneratorTest {

	@Test
	public void test() throws Exception {
		String result = new BlueprintGenerator().generate(Paths.get("test/mongodbcluster2.tosca"));
		System.out.println(result);
	}

}
