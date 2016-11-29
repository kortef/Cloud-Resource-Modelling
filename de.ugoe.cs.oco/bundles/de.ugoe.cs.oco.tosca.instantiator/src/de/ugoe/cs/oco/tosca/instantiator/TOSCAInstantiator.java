package de.ugoe.cs.oco.tosca.instantiator;

import java.nio.file.Path;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.ugoe.cs.oco.mappingdsl.model.mapping.Parameter;
import de.ugoe.cs.oco.tosca.DocumentRoot;
import de.ugoe.cs.oco.tosca.TParameter;
import de.ugoe.cs.oco.tosca.TPlan;
import de.ugoe.cs.oco.tosca.TServiceTemplate;
import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.util.ToscaResourceFactoryImpl;

public class TOSCAInstantiator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	private boolean isConsistent(List<TParameter> toscaModelPars, 
			List<Parameter> domainModelPars){
		for (Parameter domainModelPar: domainModelPars){
			String name = domainModelPar.getName();
			boolean exists = false;
			for (TParameter toscaModelPar: toscaModelPars){
				if (toscaModelPar.getName().equals(name)){
					exists = true;
				}
			}
			if (exists == false){
				return false;
			}
		}
		return true;
	}
	
	private List<TParameter> initializeToscaPars(List<TParameter> toscaModelPars, 
			List<Parameter> domainModelPars){
		if (!isConsistent(toscaModelPars, domainModelPars)){
			return null;
		}
		
		// Set parameters that match the defined target parameters from mapping
		for (Parameter domainModelPar: domainModelPars){
			String value = domainModelPar.getValue();
			String name = domainModelPar.getName();
			for (TParameter toscaModelPar: toscaModelPars){
				if (toscaModelPar.getName().equals(name)){
					toscaModelPar.setValue(value);
				}
			}			
		}
		
		// Set values of parameters that are not target parameters to default values
		for (TParameter toscaModelPar: toscaModelPars){
			if (toscaModelPar.getValue() == null ||  toscaModelPar.getValue().equals("")){
				toscaModelPar.setValue(toscaModelPar.getDefaultValue());
			}
		}
		
		return toscaModelPars;
	}
	
	public List<TParameter> extractInputPars(DocumentRoot model){
		TServiceTemplate serviceTemplate = model.getDefinitions().getServiceTemplate().get(0);
		TPlan plan = serviceTemplate.getPlans().getPlan().get(0);
		return plan.getInputParameters().getInputParameter();
	}

	
	public DocumentRoot instantiate(Path modelPath, List<Parameter> domainModelPars) {
		ToscaPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("tosca", new ToscaResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		
		Resource inputResource = resSet.getResource(URI.createURI(modelPath.toString()), true);
		
		DocumentRoot documentRoot = (DocumentRoot) inputResource.getContents().get(0);
		
		List<TParameter> parameters = extractInputPars(documentRoot);
		parameters = initializeToscaPars(parameters, domainModelPars);
		
		return documentRoot;
		
	}

}
