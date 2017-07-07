package de.ugoe.cs.oco.tosca.xsdgenerator.test;

import static org.junit.Assert.*;

import java.nio.file.Paths;

import org.junit.Test;

import de.ugoe.cs.oco.tosca.xsdgenerator.TOSCA2XSDTransformator;

public class TOSCA2XSDTransformatorTest {

	@Test
	public final void testTransform() throws Exception {
		new TOSCA2XSDTransformator().transform(Paths.get("data/mongodbcluster.tosca"), Paths.get("data/output.xsd"));
	}

}
