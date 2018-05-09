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
public class OOIProvisioner extends AbsProvisioner implements Runnable {
	private Connection connection;
	
	private final static Object lock = new Object();
	private static boolean done;
	
	public static String stubId;
	public static EObject stubNw;
	private static volatile List<ActivityEdge> performed = Collections.synchronizedList(new ArrayList<ActivityEdge>());
	
	/**Creates Provisioner object with the ActivityNode being its current position.
	 * @param node Current position of the provisioner.
	 */
	public OOIProvisioner(ActivityNode node, Connection conn, EList<EObject> model) {
		this.currentNode = node;
		this.connection = conn;
		this.occiModel = model;
		this.executor = ExecutorFactory.getExecutor("OOI", conn);
	}

	/**
	 * Performs provisionElements on next Node.
	 */
	void performInitial() {
		done = false;
		
		Kind networkKind = OCCIFactory.eINSTANCE.createKind();
		networkKind.setScheme("http://schemas.ogf.org/occi/infrastructure#");
		networkKind.setName("network");
		networkKind.setTitle("network resource");
		
		
		Mixin networkMixin = OCCIFactory.eINSTANCE.createMixin();
		networkMixin.setName("ipnetwork");
		networkMixin.setScheme("http://schemas.ogf.org/occi/infrastructure/network#");
		networkMixin.setTitle("IP Networking Mixin");
		
		Resource stubNW = OCCIFactory.eINSTANCE.createResource();
		stubNW.setTitle("stubNetwork");
		stubNW.setKind(networkKind);
		
		MixinBase networkMixinBase = OCCIFactory.eINSTANCE.createMixinBase();
		networkMixinBase.setEntity(stubNW);
		networkMixinBase.setMixin(networkMixin);
		
		AttributeState address = OCCIFactory.eINSTANCE.createAttributeState();
		address.setName("occi.network.address");
		address.setValue("192.168.0.0/24");
		networkMixinBase.getAttributes().add(address);
		AttributeState gateway = OCCIFactory.eINSTANCE.createAttributeState();
		gateway.setName("occi.network.gateway");
		gateway.setValue("192.168.0.1");
		networkMixinBase.getAttributes().add(gateway);
		
		stubNw = stubNW;
		Executor executor = ExecutorFactory.getExecutor("Openstack", this.connection);
		
		executor.executeOperation("POST", stubNw, null);
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
		List<OOIProvisioner> subtasks = new ArrayList<OOIProvisioner>();
	    subtasks.addAll(this.createSubtasks());
	    log.debug("Threads created: " + subtasks.size());
		for(OOIProvisioner subtask : subtasks){
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
		//DELETE STUBNET
		executor.executeOperation("DELETE", stubNw, null);
		connection.logIdSwapList();
		connection.serializeIdSwapList();
		
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

    	if(((Entity) extracted).getKind().getTerm().equals("network")
    			&& !(((Entity) extracted).getKind().getTerm().equals("networkinterface"))){
    		Executor openstack = ExecutorFactory.getExecutor("Openstack", this.connection);
    		
    		openstack.executeOperation("POST", extracted, null);
    	}
    	else{
    		executor.executeOperation("POST", extracted, null);
    	}
    	
    	//executor.executeOperation("POST", extracted);
    	waitForActiveState(extracted);	      	
    	
	    performed.add(this.currentNode.getOutgoings().get(0));
	    this.provisionNextNode();
	}

	/**For every outgoing Edge of the currentNode create a new Provisioner.
	 * (Handle thread execution)
	 * @return List of required Provisioner for parallel execution.
	 */
	private List<OOIProvisioner> createSubtasks() {
        List<OOIProvisioner> subtasks = new ArrayList<OOIProvisioner>();
       
        for(Iterator<ActivityEdge> iterator = (this.currentNode.getOutgoings().iterator()); iterator.hasNext();){
    		ActivityEdge edge = iterator.next();
		    OOIProvisioner subtask = new OOIProvisioner(edge.getTarget(), this.connection, this.occiModel);
		    subtasks.add(subtask);
		    if(edge.getTarget().eClass().getName().equals("JoinNode")){
    			performed.add(edge);
    		}
        }
        return subtasks;
    }
}
