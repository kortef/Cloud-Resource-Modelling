/**
 * 
 */
package de.ugoe.cs.oco.occi.serializer;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.cmf.occi.core.OCCIPackage;
import org.eclipse.cmf.occi.core.util.OCCIResourceFactoryImpl;

import de.ugoe.cs.oco.occi.extractor.OCCIModel;

/**
 * @author fglaser
 * Class that encapsulates functionailty to serialize a OCCIModel.
 */
public class OCCIModelSerializer {
	
	/**
	 * Serialize OCCIModel to file given by path.
	 * @param model The OCCIModel to be serialized.
	 * @param path The Output path to where the model should be written.
	 * @return
	 */
	public boolean serializeOCCIModel(OCCIModel model, Path path){
		OCCIPackage.eINSTANCE.eClass();
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("occie", new OCCIResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		
		Resource resource = resSet.createResource(URI.createURI(path.toString()));
		
		if (model.getExtensions() != null)
			resource.getContents().addAll(model.getExtensions());
		
		if (model.getResources() != null)
			resource.getContents().addAll(model.getResources());
		
		if (model.getConfiguration() != null)
			resource.getContents().add(model.getConfiguration());
		
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
		
	}
}
