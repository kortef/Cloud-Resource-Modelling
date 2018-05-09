package de.ugoe.cs.oco.occi2deployment.provisioner;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.ActivityNode;

import de.ugoe.cs.oco.occi2deployment.connector.Connection;
import de.ugoe.cs.oco.occi2deployment.execution.Executor;

public class ProvisionerFactory {

	public static Provisioner getProvisioner(String criteria, ActivityNode startNode, EList<EObject> occiModel, Executor exec, Connection conn){
		if(criteria.equals("OOI")){
			return new OOIProvisioner(startNode, conn, occiModel);
		}
		if(criteria.equals("Mart")){
			return new MartProvisioner(startNode, exec, occiModel);
		}
		return null;
	}	
}
