package de.ugoe.cs.oco.tosca.instantiator;

import java.nio.file.Path;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.ugoe.cs.oco.mappingdsl.model.mapping.Parameter;
import de.ugoe.cs.oco.tosca.DocumentRoot;
import de.ugoe.cs.oco.tosca.PropertiesType1;
import de.ugoe.cs.oco.tosca.TBoundaryDefinitions;
import de.ugoe.cs.oco.tosca.TServiceTemplate;
import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.util.ToscaResourceFactoryImpl;

public class TOSCAInstantiator {
	
	private boolean isConsistent(TBoundaryDefinitions boundary, 
			List<Parameter> domainModelPars){
		for (Parameter domainModelPar: domainModelPars){
			String name = domainModelPar.getName();
			PropertiesType1 properties = boundary.getProperties();
			EObject propertiesObject = (EObject) properties.getAny().get(0).getValue();
			
			EStructuralFeature feature = propertiesObject.eClass().getEStructuralFeature(name);
			if (feature == null) {
				return false;
			}
		}
		return true;
	}
	
	private boolean initializeToscaPars(TBoundaryDefinitions boundary, 
			List<Parameter> domainModelPars){
		if (!isConsistent(boundary, domainModelPars)){
			return false;
		}
		
		// Set parameters that match the defined target parameters from mapping
		for (Parameter domainModelPar: domainModelPars){
			String value = domainModelPar.getValue();
			String name = domainModelPar.getName();
			
			PropertiesType1 properties = boundary.getProperties();
			EObject propertiesObject = (EObject) properties.getAny().get(0).getValue();
			
			EStructuralFeature feature = propertiesObject.eClass().getEStructuralFeature(name);
			if (feature != null) {
				propertiesObject.eSet(feature, value);
			} else {
				return false;
			}
		}
		
		return true;
	}
	
	public TBoundaryDefinitions getBoundaryDefinitions(DocumentRoot model){
		TServiceTemplate serviceTemplate = model.getDefinitions().get(0).getServiceTemplate().get(0);
		return serviceTemplate.getBoundaryDefinitions();
	}

	
	public DocumentRoot instantiate(Path modelPath, List<Parameter> domainModelPars) {
		ToscaPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("tosca", new ToscaResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		
		Resource inputResource = resSet.getResource(URI.createURI(modelPath.toString()), true);
		
		DocumentRoot documentRoot = (DocumentRoot) inputResource.getContents().get(0);
		
		TBoundaryDefinitions boundary = getBoundaryDefinitions(documentRoot);
		initializeToscaPars(boundary, domainModelPars);
		
		return documentRoot;		
	}

}
