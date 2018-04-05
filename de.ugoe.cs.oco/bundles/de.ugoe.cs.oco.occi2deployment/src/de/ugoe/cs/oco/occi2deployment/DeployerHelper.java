package de.ugoe.cs.oco.occi2deployment;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public final class DeployerHelper {
	
	public DeployerHelper() {}
	
	public File loadFile(String filepath) {
    	URL url = null;
		File file= null;
		
		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		if (bundle != null) {
			System.out.println("BUNDLE");
			url = FrameworkUtil.getBundle(this.getClass()).getResource(filepath);
			System.out.println("URL: " + url);
			try {
				file = new File(FileLocator.resolve(url).toURI());
				System.out.println("File: " + file);
			} catch (URISyntaxException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("NO BUNDLE");
			url = this.getClass().getResource(filepath);
			try {
				file = new File(url.toURI());
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return file;
	}
	
	
	public Path loadPath(String filename) {
    	URL url = null;
		Path path = null;
		
		Bundle bundle = FrameworkUtil.getBundle(this.getClass());
		if (bundle != null) {
			System.out.println("BUNDLE");
			url = FrameworkUtil.getBundle(this.getClass()).getResource(filename);
			try {
				System.out.println("URL: " + url);
				System.out.println("URI: " + FileLocator.resolve(url).toURI());
				path = Paths.get(FileLocator.resolve(url).toURI());
				System.out.println("Path: " + path);
			} catch (URISyntaxException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			System.out.println("NO BUNDLE");
			url = this.getClass().getResource(filename);

			try {
				path = Paths.get(url.toURI());
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		System.out.println(url);
		System.out.println(path);
		
		return path;
	}
}
