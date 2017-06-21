package de.ugoe.cs.oco.occi2deployment.adapter;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.occiware.clouddesigner.occi.Entity;

import de.ugoe.cs.oco.occi2deployment.Connection;
import de.ugoe.cs.oco.occi2deployment.Deployer;
import de.ugoe.cs.oco.occi2deployment.execution.Executor;
import de.ugoe.cs.oco.occi2deployment.execution.ExecutorFactory;

public class ElementAdapter {
	static Logger log = Logger.getLogger(ElementAdapter.class.getName());
	private Connection connection;
	
	public void adapt(EList<EObject> adaptedElements) {
		for(EObject element: adaptedElements){
			Entity entity = (Entity) element;
			if(element.eClass().getName().equals("Resource")){
				if(entity.getKind().getTerm().equals("compute")){
					adaptComputeInstance(entity);
				}
				else if(entity.getKind().getTerm().equals("network")){
					adaptNetworkInstance(entity);
				}
				else if(entity.getKind().getTerm().equals("storage")){
					adaptStorageInstance(entity);		
				}
			}
			else if(element.eClass().getName().equals("Link")){
				adaptLinkInstance(entity);
			}
			
		}	
	}

	private void adaptLinkInstance(Entity link) {
		// TODO Auto-generated method stub
		
	}

	private void adaptStorageInstance(Entity entity) {
		// TODO Auto-generated method stub
		
	}

	private void adaptNetworkInstance(Entity entity) {
		// TODO Auto-generated method stub
		
	}

	private void adaptComputeInstance(Entity entity) {
		
	}
}
