package de.ugoe.cs.oco.occi2deployment.provisioner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.Network;
import org.eclipse.cmf.occi.infrastructure.Storage;

import de.ugoe.cs.oco.occi2deployment.connector.Connection;
import de.ugoe.cs.oco.occi2deployment.execution.Executor;
import de.ugoe.cs.oco.occi2deployment.execution.ExecutorFactory;
import de.ugoe.cs.oco.occi2deployment.extraction.Extractor;
import de.ugoe.cs.oco.occi2deployment.extraction.ExtractorFactory;


/**Responsible for processing the workflow of an UML activity diagram and perform
 * corresponding actions.
 * @author rockodell
 *
 */
public class MartProvisioner extends AbsProvisioner implements Runnable {
	/**Creates Provisioner object with the ActivityNode being its current position.
	 * @param node Current position of the provisioner.
	 */
	public MartProvisioner(ActivityNode node, Executor exec, EList<EObject> model) {
		this.currentNode = node;
		this.executor = exec;
		this.occiModel = model;
	}

	/**
	 * Performs provisionElements on next Node.
	 */
	void performInitial() {
		done = false;
		this.provisionNextNode();
		
		
		synchronized(lock){
			while(done == false){
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * Start a thread for every outgoing control flow of the element.
	 */
	void performFork() {
		List<MartProvisioner> subtasks = new ArrayList<MartProvisioner>();
	    subtasks.addAll(this.createSubtasks());
	    log.debug("Threads created: " + subtasks.size());
		for(MartProvisioner subtask : subtasks){
           Thread thread = new Thread(subtask);          
           thread.start();  
        }	
	}
	
	/**
	 * Checks if all incoming edges of the node already arrived at the join.
	 * Only the last arriving control flow will continue to work on.
	 */
	void performJoin() {
    	if(performed.containsAll(this.currentNode.getIncomings())){
    		performed.removeAll(this.currentNode.getIncomings());
    		this.provisionNextNode();
    	}
	}
	
	/**
	 * Serializes id swap list and deletes stubNW.
	 */
	void performFinal() {
		synchronized(lock){
		    //set ready flag to true (so isReady returns true)
		    done = true;
		    lock.notifyAll();
		}
	}

	/**
	 * An extractor is created to search the topology model for the element with the 
	 * id of the current node. Based upon that element an executor is created provisioning
	 * a resource based upon the information contained in the extracted element.
	 */
	void performAction() {
    	Extractor extractor = ExtractorFactory.getExtractor("OCCI");	
    	EObject extracted = extractor.extractElement(this.currentNode, this.occiModel);
    	executor.executeOperation("PUT", extracted, null);
    	
    	if(extracted instanceof Compute || extracted instanceof Network || extracted instanceof Storage) {
    		waitForActiveState(extracted);	  
    	}
    	
	    performed.add(this.currentNode.getOutgoings().get(0));
	    this.provisionNextNode();
	}

	/**For every outgoing Edge of the currentNode create a new Provisioner.
	 * (Handle thread execution)
	 * @return List of required Provisioner for parallel execution.
	 */
	private List<MartProvisioner> createSubtasks() {
        List<MartProvisioner> subtasks = new ArrayList<MartProvisioner>();
       
        for(Iterator<ActivityEdge> iterator = (this.currentNode.getOutgoings().iterator()); iterator.hasNext();){
    		ActivityEdge edge = iterator.next();
		    MartProvisioner subtask = new MartProvisioner(edge.getTarget(), this.executor, this.occiModel);
		    subtasks.add(subtask);
		    if(edge.getTarget().eClass().getName().equals("JoinNode")){
    			performed.add(edge);
    		}
        }
        return subtasks;
    }
}
