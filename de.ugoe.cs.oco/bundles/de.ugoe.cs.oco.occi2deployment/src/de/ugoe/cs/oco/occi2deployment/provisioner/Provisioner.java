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

import de.ugoe.cs.oco.occi2deployment.Connection;
import de.ugoe.cs.oco.occi2deployment.execution.Executor;
import de.ugoe.cs.oco.occi2deployment.execution.ExecutorFactory;
import de.ugoe.cs.oco.occi2deployment.extraction.Extractor;
import de.ugoe.cs.oco.occi2deployment.extraction.ExtractorFactory;


/**Responsible for processing the workflow of an UML activity diagram and perform
 * corresponding actions.
 * @author rockodell
 *
 */
public class Provisioner implements Runnable {
	static Logger log = Logger.getLogger(Provisioner.class.getName());
	private Connection connection;
	private EList<EObject> occiModel;
	private ActivityNode currentNode;
	
	private final static Object lock = new Object();
	private static boolean done;
	
	public static String stubId;
	public static EObject stubNw;
	private static volatile List<ActivityEdge> performed = Collections.synchronizedList(new ArrayList<ActivityEdge>());
	
	/**Creates Provisioner object with the ActivityNode being its current position.
	 * @param node Current position of the provisioner.
	 */
	public Provisioner(ActivityNode node, Connection conn, EList<EObject> model) {
		this.currentNode = node;
		this.connection = conn;
		this.occiModel = model;
	}
	
	/**Start of the provisioning process at the currentNode of the Provisioner.
	 * Depending on the currentElement specific operations are performed.
	 * 
	 * InitialNode: Jump to the next node.
	 * Fork: Start threads to handle parallel control flows.
	 * OpaqueAction: Provision specific element
	 * Join: Wait for all incoming edges to finish. Starts a new thread handling the next node.
	 * Final: Stores idSwapList.
	 */
	public void provisionElements() {
		if(this.currentNode.getName()!=null){
			log.info("Node Reached: "+this.currentNode.getName().toString());
		}
		else{
			log.info("Node Reached: "+ this.currentNode.eClass().getName());
		}
        if(this.currentNode.eClass().getName().equals("InitialNode")){
        	this.performInitial();
        }
        
        else if(this.currentNode.eClass().getName().equals("ForkNode")){
        	this.performFork();
        }
        
        else if(this.currentNode.eClass().getName().equals("OpaqueAction")){
        	this.performAction();
        }
		
        else if(this.currentNode.eClass().getName().equals("JoinNode")){
        	this.performJoin();
        }
        
        else if(this.currentNode.eClass().getName().equals("ActivityFinalNode")){
        	this.performFinal();
        }
	}

	/**
	 * Performs provisionElements on next Node.
	 */
	private void performInitial() {
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
		
		
		/*
		Path stubNWpath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/stubNW.occie");
		EList<EObject> stubNWModel = ModelUtility.loadOCCI(stubNWpath);
		stubNw = stubNWModel.get(stubNWModel.size()-1);*/
		
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
	private void performFork() {
		List<Provisioner> subtasks = new ArrayList<Provisioner>();
	    subtasks.addAll(this.createSubtasks());
	    log.debug("Threads created: " + subtasks.size());
		for(Provisioner subtask : subtasks){
           Thread thread = new Thread(subtask);          
           thread.start();  
        }	
	}
	
	/**
	 * Checks if all incoming edges of the node already arrived at the join.
	 * Only the last arriving control flow will continue to work on.
	 */
	private void performJoin() {
    	if(performed.containsAll(this.currentNode.getIncomings())){
    		performed.removeAll(this.currentNode.getIncomings());
    		this.provisionNextNode();
    	}
	}
	
	/**
	 * Serializes id swap list and deletes stubNW.
	 */
	private void performFinal() {
		//DELETE STUBNET
		Executor executor = ExecutorFactory.getExecutor("Openstack", this.connection);
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
	private void performAction() {
    	Extractor extractor = ExtractorFactory.getExtractor("OCCI");	
    	Executor executor = ExecutorFactory.getExecutor("OCCI", this.connection);
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
	private List<Provisioner> createSubtasks() {
        List<Provisioner> subtasks = new ArrayList<Provisioner>();
       
        for(Iterator<ActivityEdge> iterator = (this.currentNode.getOutgoings().iterator()); iterator.hasNext();){
    		ActivityEdge edge = iterator.next();
		    Provisioner subtask = new Provisioner(edge.getTarget(), this.connection, this.occiModel);
		    subtasks.add(subtask);
		    if(edge.getTarget().eClass().getName().equals("JoinNode")){
    			performed.add(edge);
    		}
        }
        return subtasks;
    }
	
	/**
	 * Continues the control flow with the next element.
	 * Therefore, the currentNode is set to the following node
	 * and the method provisionElements is executed.
	 */
	private void provisionNextNode() {
		this.currentNode = this.nextNode();	
		this.provisionElements();	
	}
	
	/**Returns the node the current one is connected to.
	 * @return next node.
	 */
	private ActivityNode nextNode(){
		return this.currentNode.getOutgoings().get(0).getTarget();
	}
	
	@Override
	public void run() {
		this.provisionElements();
	}
	
	/**Waits until EObject extracted is ready for further processing. For example,
	 * this function pauses one control flow until the Resource extracted is in state active.
	 * @param extracted
	 */
	public void waitForActiveState(EObject extracted) {
		if(extracted.eClass().getName().equals("Resource")){
			Entity entity = (Entity) extracted;
			
			if(entity.getKind().getTerm().contains("network")){
				log.info("ACTIVE: " + ((Entity)extracted).getTitle());
				return;
			}
			else if(entity.getKind().getTerm().contains("compute")) {
				Executor executor = ExecutorFactory.getExecutor("OCCI", this.connection);
				String output = executor.executeOperation("GET", entity, null);
				if(outputShowsActiveState(output)){
					log.info("ACTIVE: " + ((Entity)extracted).getTitle());
				}
				else{
					try {
						log.debug("INACTIVE: " + ((Entity)extracted).getTitle() + " " + output);
						Thread.sleep(5000);
						waitForActiveState(extracted);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				}
			}
		}
	}
	/**Checks whether the output string contains an active or online.
	 * @param output
	 * @return
	 */
	private boolean outputShowsActiveState(String output) {
		if(output.contains("occi.network.state=\"active\"")
				|| output.contains("occi.compute.state=\"active\"")
				|| output.contains("occi.storage.state=\"online\"")){
			return true;
		}
		return false;
	}
}
