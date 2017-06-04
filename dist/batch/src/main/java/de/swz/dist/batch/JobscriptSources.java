package de.swz.dist.batch;

import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;

public class JobscriptSources {

	public URI getSourceFromClasspath (String name) throws URISyntaxException {
		System.out.println("classpath:\t" + System.getProperty("java.class.path") + "\nresource:\t" + name);
		URL resource = this.getClass().getClassLoader().getResource(name);
		System.out.println("resolved:\t" + resource.toString());
		return resource.toURI();
	}

}