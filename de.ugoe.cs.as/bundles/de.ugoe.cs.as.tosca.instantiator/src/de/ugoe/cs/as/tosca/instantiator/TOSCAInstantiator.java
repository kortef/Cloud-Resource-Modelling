package de.ugoe.cs.as.tosca.instantiator;

import java.math.BigInteger;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.ugoe.cs.as.mspec.model.mapping.Parameter;
import de.ugoe.cs.as.mspec.model.mapping.ParameterValueType;
import de.ugoe.cs.as.tosca.DocumentRoot;
import de.ugoe.cs.as.tosca.PropertiesType1;
import de.ugoe.cs.as.tosca.TBoundaryDefinitions;
import de.ugoe.cs.as.tosca.TServiceTemplate;

public class TOSCAInstantiator {
	protected final static Logger LOGGER = Logger.getLogger(TOSCAInstantiator.class.getName());
	
	private boolean isConsistent(TBoundaryDefinitions boundary, 
			List<Parameter> domainModelPars){
		for (Parameter domainModelPar: domainModelPars){
			String name = domainModelPar.getName();
			PropertiesType1 properties = boundary.getProperties();
			EObject propertiesObject = (EObject) properties.getAny().get(0).getValue();
			LOGGER.info("Looking for parameter: " + name);
			EStructuralFeature feature = propertiesObject.eClass().getEStructuralFeature(name);
			if (feature == null) {
				LOGGER.warning("Parameter " + name + " not found in aPDM.");
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
			
			LOGGER.info("Looking for parameter: " + name);
			EStructuralFeature feature = propertiesObject.eClass().getEStructuralFeature(name);
			
			if (feature != null) {
				if (domainModelPar.getType() == ParameterValueType.FLOAT){
					propertiesObject.eSet(feature, Float.parseFloat(value));
				}
				if (domainModelPar.getType() == ParameterValueType.INTEGER) {
					propertiesObject.eSet(feature, BigInteger.valueOf(Integer.parseInt(value)));
				}
				
			} else {
				LOGGER.warning("Parameter " + name + " not found in aPDM.");
				return false;
			}
		}
		
		return true;
	}
	
	public TBoundaryDefinitions getBoundaryDefinitions(DocumentRoot model){
		TServiceTemplate serviceTemplate = model.getDefinitions().get(0).getServiceTemplate().get(0);
		return serviceTemplate.getBoundaryDefinitions();
	}

	
	public DocumentRoot instantiate(DocumentRoot documentRoot, List<Parameter> domainModelPars) {						
		TBoundaryDefinitions boundary = getBoundaryDefinitions(documentRoot);
		boolean result = initializeToscaPars(boundary, domainModelPars);
		
		if (result == false) {
			LOGGER.warning("Provided parameters are inconsistent with aPDM parameters. Nothing changed...");
		}
		
		return documentRoot;		
	}

}
