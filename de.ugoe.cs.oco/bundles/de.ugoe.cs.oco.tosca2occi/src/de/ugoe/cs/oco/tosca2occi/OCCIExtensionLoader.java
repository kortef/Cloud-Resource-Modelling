package de.ugoe.cs.oco.tosca2occi;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.util.OCCIResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/*
 * Helper class to load occi extensions models at runtime
 */
public class OCCIExtensionLoader {
	public List<Resource> searchAndLoadOCCIExtensions(File inputDir) {
		ResourceSet set = new ResourceSetImpl();
		return searchAndLoadOCCIExtensions(inputDir, set);
	}
	
	/* Loads all occi extension models from provided path and returns them as a
	 * set of resources.
	 */
	public List<Resource> searchAndLoadOCCIExtensions(File inputDir, ResourceSet set) {
		List<File> occiExtFileList =  new LinkedList<File>();
		List<Resource> occiExtResources = new LinkedList<Resource>();
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("occie", new OCCIResourceFactoryImpl());
		
	    try {
			for (File file: inputDir.listFiles()) {
				if (file.getName().endsWith(".occie")) {
					occiExtFileList.add(file);
				}
			}
			
			for (File file: occiExtFileList) {
				URI uri = URI.createFileURI(file.getAbsolutePath());
				Resource resource = set.getResource(uri, true);
				Extension extension = (Extension) resource.getContents().get(0);
				Resource inMemoryResource = set.createResource(URI.createURI(extension.getScheme()));
				inMemoryResource.getContents().add(extension);
				occiExtResources.add(inMemoryResource);
				//set.getURIConverter().getURIMap().put(uri, URI.createURI(extension.getScheme()));
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return occiExtResources;
	}
}