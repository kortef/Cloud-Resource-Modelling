package de.ugoe.cs.oco.occi2deployment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.uml.InitialNode;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;

import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.util.OCCIResourceFactoryImpl;
import org.eclipse.cmf.occi.infrastructure.InfrastructurePackage;

import de.ugoe.cs.oco.occi.extractor.wrapper.OCCIModelExtractorWrapper;
import de.ugoe.cs.oco.occi2deployment.connector.Connection;
import de.ugoe.cs.oco.pog.Graph;
import de.ugoe.cs.oco.pog.PogPackage;
import pcg.PcgPackage;




/**Responsible for EMF Model Utility Operations.
 * @author rockodell
 *
 */
@SuppressWarnings("restriction")
public class ModelUtility {
	
	public static EList<EObject> loadOCCI (Path configuration, List<Path> extensions) {
		InfrastructurePackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("occie", new OCCIResourceFactoryImpl());
		m.put("occic", new OCCIResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		
		for(Path path: extensions) {
			String filePath = new File(path.toString()).getAbsolutePath();
			Resource extResource =resSet.getResource(URI.createFileURI(filePath), true);
			if(extResource.getContents().get(0) instanceof Extension) {
				 Extension ext = (Extension) extResource.getContents().get(0);
			     URI realURI = URI.createURI(ext.getScheme()).trimFragment();
			     extResource.setURI(realURI);

			}
			resSet.getResources().add(extResource);
		}
		
		String file = new File(configuration.toString()).getAbsolutePath();
	    //URI fileURI = URI.createURI(path.toString());
	    URI fileURI = URI.createFileURI(file);
	    Resource resource = resSet.getResource(fileURI, true);
		
	       
		EcorePlugin.ExtensionProcessor.process(null);
		EcoreUtil.resolveAll(resSet);
		
        for(EObject obj: resource.getContents()) {
        	if(obj instanceof Configuration) {
        		return ((Configuration)obj).eContents();
        	}
        }
        
		return resource.getContents();
	}
	
	public static Resource loadOCCIResource (Path configuration, List<Path> extensions) {
		InfrastructurePackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("occie", new OCCIResourceFactoryImpl());
		m.put("occic", new OCCIResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		
		if(extensions != null) {
			for(Path path: extensions) {
				String filePath = new File(path.toString()).getAbsolutePath();
				Resource extResource =resSet.getResource(URI.createFileURI(filePath), true);
				if(extResource.getContents().get(0) instanceof Extension) {
					 Extension ext = (Extension) extResource.getContents().get(0);
				     URI realURI = URI.createURI(ext.getScheme()).trimFragment();
				     extResource.setURI(realURI);
				}
				resSet.getResources().add(extResource);
			}
		}
		
		String file = new File(configuration.toString()).getAbsolutePath();
	    Resource resource = resSet.getResource(URI.createFileURI(file), true);
	    
		
		/*
		String file = new File(configuration.toString()).getAbsolutePath();
	    URI fileURI = URI.createFileURI(file);
	    Resource resource = resSet.getResource(fileURI, true);
		*/
		
		EcorePlugin.ExtensionProcessor.process(null);
		EcoreUtil.resolveAll(resSet);
        
		return resource;
	}
	
	
	/**Loads EObjects contained within the Configuration of the OCCI Model. If no Configuration is available every EObject of the model is loaded.
	 * @param path to the OCCI Model
	 * @return OCCI Model as List of EObjects
	 */
	public static EList<EObject> loadOCCI (Path path){
		OCCIPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("occie", new OCCIResourceFactoryImpl());
		
       ResourceSet resSet = new ResourceSetImpl();
       
       String file = new File(path.toString()).getAbsolutePath();
       URI fileURI = URI.createFileURI(file);
       Resource resource = resSet.getResource(fileURI, true);

       resSet.getResources().add(resource);
       
       EcorePlugin.ExtensionProcessor.process(null);
        for(EObject obj: resource.getContents()) {
        	if(obj instanceof Configuration) {
        		return ((Configuration)obj).eContents();
        	}
        }
       
        
		return resource.getContents();
	}
	
	public static EList<EObject> getOCCIConfigurationContents(Resource resource) {
		for(EObject obj: resource.getContents()) {
        	if(obj instanceof Configuration) {
        		return ((Configuration)obj).eContents();
        	}
        }
		return null;
	}
	
	
	/**Loads OCCI Model as Resource Set (required for EMFCompare).
	 * @param path to the OCCI Model
	 * @return resourceSet of OCCI Model
	 */
	public static ResourceSet loadOCCIinResourceSet(Path path) {
		URI uri = URI.createFileURI(path.toString());
		OCCIPackage.eINSTANCE.eClass();
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("occie", new XMIResourceFactoryImpl());
		// Resource will be loaded within the resource set
		resourceSet.getResource(uri, true);
		return resourceSet;
	}
	
	/**Loads POG model as List of EObjects.
	 * @param path to the POG model
	 * @return POG model as List of EObjects
	 */
	public static EList<EObject> loadPOG (Path path){
		PogPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("pog", new XMIResourceFactoryImpl());
		
        ResourceSet resSet = new ResourceSetImpl();
       
        //URI fileURI = URI.createURI(path.toString());
        URI fileURI = URI.createFileURI(path.toString());
        Resource resource = resSet.getResource(fileURI, true);
               
		return resource.getContents();
	}
	
	/**Stores POG at the given Path path.
	 * @param path Path in which the POG gets stored.
	 * @param graph Toplevel element of the POG.
	 */
	public static void storePOG(Path path, Graph graph){
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("pog", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		URI fileURI = URI.createFileURI(path.toString());
		Resource resource = resSet.createResource(fileURI);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		resource.getContents().add(graph);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/**Stores OCCI model at the given Path path.
	 * @param path Path in which the OCCI Model gets stored.
	 * @param model Model in terms of EObjects.
	 */
	public static void storeOCCI(Path path, EList<EObject> model){
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("pog", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		URI fileURI = URI.createFileURI(path.toString());
		Resource resource = resSet.createResource(fileURI);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		resource.getContents().addAll(model);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**Stores PCG at the given Path path.
	 * @param path Path in which the PCG gets stored.
	 * @param graph Toplevel element of the PCG.
	 */
	public static void storePCG(Path path, pcg.Graph graph){
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("pcg", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		//URI fileURI = URI.createURI(path.toString());
		URI fileURI = URI.createFileURI(path.toString());
		Resource resource = resSet.createResource(fileURI);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		resource.getContents().add(graph);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**Loads PCG model as List of EObjects.
	 * @param path to the PCG model
	 * @return PCG model as List of EObjects
	 */
	public static EList<EObject> loadPCG(Path pcgPath) {
		PcgPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("pcg", new XMIResourceFactoryImpl());
		
        ResourceSet resSet = new ResourceSetImpl();
       
        //URI fileURI = URI.createURI(pcgPath.toString());
        URI fileURI = URI.createFileURI(pcgPath.toString());
        Resource resource = resSet.getResource(fileURI, true);
               
		return resource.getContents();
	}	
	
	/**Loads an UML Model
	 * @param path to the UML Model
	 * @return UML Model Element
	 */
	public static Model loadUML(Path path) {	
        // Initialize the model
        UMLPackage.eINSTANCE.eClass();
        // Register the XMI resource factory for the .website extension
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("uml", new UMLResourceFactoryImpl());
        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();
        // Get the resource
        Resource resource = resSet.getResource(URI
                        .createFileURI(path.toString()), true);
        // Get the first model element and cast it to the right type, in my
        // example everything is hierarchical included in this first node
        Model model = (Model) resource.getContents().get(0);
        return model;
	}
	
	/**Returns first InitialNode of the Model
	 * @param model containing activity diagram
	 * @return InitialNode of the activity diagram
	 */
	public InitialNode findInitialNode(Model model) {
		 for(Iterator<EObject> iterator = model.eAllContents(); iterator.hasNext();){
	        	EObject element = iterator.next();
	            if(element.eClass().getName().equals("InitialNode")){
	            	return (InitialNode) element;
	            } 
	        }
		return null;
	}
	
	/**Returns all of the models top level and nested Entities as EObject List.
	 * @param model
	 * @return EObject List containing all Entity elements contained in the model
	 */
	public static EList<EObject> getEntities(EList<EObject> model) {
		EList<EObject> entities = new BasicEList<EObject>();
		entities.addAll(getTopLevelEntities(model));
		entities.addAll(getNestedEntities(model));	
		return entities;
	}
	
	/**Returns all of the models top level and nested Resources as EObject List.
	 * @param model OCCI Model
	 * @return EObject List containing all Entity elements contained in the model
	 */
	public static EList<org.eclipse.cmf.occi.core.Resource> getResources(EList<EObject> model) {
		EList<EObject> entities = new BasicEList<EObject>();
		EList<org.eclipse.cmf.occi.core.Resource> resources = new BasicEList<org.eclipse.cmf.occi.core.Resource>();
		entities.addAll(getTopLevelEntities(model));
		entities.addAll(getNestedEntities(model));
		for(EObject entity: entities){
			if(entity instanceof org.eclipse.cmf.occi.core.Resource){
				//Guess that is not correct
				resources.add((org.eclipse.cmf.occi.core.Resource) entity);
			}
		}
		return resources;
	}
	
	/**Returns nested Entities in the Model.
	 * @param model
	 * @return List of nested Entities of the OCCI Model.
	 */
	private static EList<EObject> getNestedEntities(EList<EObject> model) {
		EList<EObject> entities = new BasicEList<EObject>();
		for(EObject topLevelElement: getTopLevelEntities(model)){
			for(Iterator<EObject> iterator = ((Entity)topLevelElement).eAllContents(); iterator.hasNext();){
				EObject nested = iterator.next();
				if(checkIfEntityElement(nested)){
					entities.add(nested);
				}
			}
		}
		return entities;
	}

	
	/**Returns Top level Entities in the Model.
	 * @param model
	 * @return
	 */
	private static EList<EObject> getTopLevelEntities(EList<EObject> model) {
		EList<EObject> entities = new BasicEList<EObject>();
		for(EObject element: model){
			if(checkIfEntityElement(element)){
				entities.add(element);
			}
		}
		return entities;
	}

	/**Checks whether the element instantiates Entity.
	 * @param element
	 * @return
	 */
	public static boolean checkIfEntityElement(EObject element){
		if(element instanceof org.eclipse.cmf.occi.core.Entity){
			return true;
		}
		else{
			return false;
		}
	}

	/**Extracts the runtimeModel from the cloud using the passed Connection conn.
	 * @param conn from which the runtime model should be extracted.
	 * @return the extracted runtimeModel.
	 */
	public static EList<EObject> extractRuntimeModel(Connection conn, Path runtimePath) {
		OCCIModelExtractorWrapper.extractRuntimeModel(conn.getAdress(), conn.getUser(), conn.getPassword(), runtimePath, null);
		EList<EObject> runtimeModel = ModelUtility.loadOCCI(runtimePath);
		return runtimeModel;
	}
	
	
	public static EList<EObject> extractRuntimeModel(Connection conn, Path runtimePath, String publicNetworkId) {
		OCCIModelExtractorWrapper.extractRuntimeModel(conn.getAdress(), conn.getUser(), conn.getPassword(), runtimePath, publicNetworkId);
		EList<EObject> runtimeModel = ModelUtility.loadOCCI(runtimePath);
		return runtimeModel;
	}

	public static Configuration loadOCCIConfiguration(Path occic) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("occie", new OCCIResourceFactoryImpl());
		m.put("occic", new OCCIResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		
		String file = new File(occic.toString()).getAbsolutePath();
	    //URI fileURI = URI.createURI(path.toString());
	    URI fileURI = URI.createFileURI(file);
	    Resource resource = resSet.getResource(fileURI, true);
		
	       
		EcorePlugin.ExtensionProcessor.process(null);
		EcoreUtil.resolveAll(resSet);
		
        for(EObject obj: resource.getContents()) {
        	if(obj instanceof Configuration) {
        		return ((Configuration)obj);
        	}
        }
        
		return (Configuration) resource.getContents();
	}
}
