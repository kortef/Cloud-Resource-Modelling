package de.ugoe.cs.as.tosca2occi;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/*
 * Helper class to load ecore models at runtime
 */
public class EcoreModelLoader {
	public List<Resource> searchAndLoadEcoreModels(URI inputDirURI) {
		ResourceSet set = new ResourceSetImpl();
		return searchAndLoadEcoreModels(inputDirURI, set);
	}
	
	
	
	/* Loads all ecore models from provided uri and returns them as a
	 * set of resources.
	 */
	public List<Resource> searchAndLoadEcoreModels(URI inputDirURI, ResourceSet set) {
		List<File> ecoreFileList =  new LinkedList<File>();
		List<Resource> ecoreResources = new LinkedList<Resource>();
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("ecore", new EcoreResourceFactoryImpl());
		File inputDir = new File(inputDirURI.toFileString());
	    
	    try {
			for (File file: inputDir.listFiles()) {
				if (file.getName().endsWith(".ecore")) {
					ecoreFileList.add(file);
				}
			}
			
			for (File file: ecoreFileList) {
				URI uri = URI.createFileURI(file.getAbsolutePath());
				Resource resource = set.getResource(uri, true);
				
				ecoreResources.add(resource);
				
				EPackage pack = (EPackage) resource.getContents().get(0);
				set.getPackageRegistry().put(pack.getNsURI(), pack);
				set.getURIConverter().getURIMap().put(URI.createURI(pack.getNsURI()), uri);
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return ecoreResources;
	}
}