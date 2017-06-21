package de.ugoe.cs.oco.occi2deployment.provisioner;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.OCCIFactory;

import de.ugoe.cs.oco.occi2deployment.Connection;
import de.ugoe.cs.oco.occi2deployment.Deployer;
import de.ugoe.cs.oco.occi2deployment.ModelUtility;
import de.ugoe.cs.oco.occi2deployment.execution.Executor;
import de.ugoe.cs.oco.occi2deployment.execution.ExecutorFactory;
import de.ugoe.cs.oco.occi2deployment.extraction.Extractor;
import de.ugoe.cs.oco.occi2deployment.extraction.ExtractorFactory;
import pcg.PcgFactory;
import pcg.Resource;
import pcg.Vertex;

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
	
	public static String stubId;
	private static EObject stubNw;
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
		Path stubNWpath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/stubNW.occie");
		EList<EObject> stubNWModel = ModelUtility.loadOCCI(stubNWpath);
		Executor executor = ExecutorFactory.getExecutor("Openstack", this.connection);
		stubNw = stubNWModel.get(stubNWModel.size()-1);
		executor.executePostOperation(stubNw);
		this.provisionNextNode();
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
	 * Prints out that the final node is reached.
	 */
	private void performFinal() {
		//DELETE STUBNET
		Executor executor = ExecutorFactory.getExecutor("Openstack", this.connection);
		executor.executeDeleteOperation(stubNw);
		connection.logIdSwapList();
		connection.serializeIdSwapList();
	}

	/**
	 * An extractor is created to search the topology model for the element with the 
	 * id of the current node. Based upon that element an executor is created provisioning
	 * a resource based upon the information contained in the extracted element.
	 */
	private void performAction() {
    	Extractor extractor = ExtractorFactory.getExtractor("OCCI");	
    	Executor executor = ExecutorFactory.getExecutor("OCCI", this.connection);
    	String id = new String();
    	EObject extracted = extractor.extractElement(this.currentNode, this.occiModel);

    	if(((Entity) extracted).getKind().getTerm().equals("network")
    			&& !(((Entity) extracted).getKind().getTerm().equals("networkinterface"))){
    		Executor openstack = ExecutorFactory.getExecutor("Openstack", this.connection);
    		
    		openstack.executePostOperation(extracted);
    	}
    	else{
    		executor.executePostOperation(extracted);
    	}

	    executor.waitForActiveState(extracted);	      	

	    performed.add(this.currentNode.getOutgoings().get(0));
	    this.provisionNextNode();
    	
    	
    	/*
    	if(((Entity) extracted).getKind().getTerm().equals("network")
    			&& !(((Entity) extracted).getKind().getTerm().equals("networkinterface"))){
    		Executor openstack = ExecutorFactory.getExecutor("Openstack", this.connection);
    		
    		id = openstack.executePostOperation(extracted);
    	}
    	else{
    		id = executor.executePostOperation(extracted);
    	}
    	if(id != null){
	    	String[] swap = {((Entity) extracted).getId(), id};
	    	if(((Entity) extracted).getTitle() == null){
	    		log.debug("ID Swap: "+((Entity) extracted).getKind().getTerm() + " Model ID: " + ((Entity) extracted).getId() + " Actual ID: " + id);
	    	}
	    	else{
	    		log.debug("ID Swap: "+((Entity) extracted).getTitle()+ " Model ID: " + ((Entity) extracted).getId() + " Actual ID: " + id);
	    	}
	    	connection.getIdSwapList().add(swap);
	    	
	    	//Change IDs in Model itself
	    	//extractor.adjustID(((Entity) extracted).getId(), id);
	    	executor.waitForActiveState(extracted);	      	
	
	    	performed.add(this.currentNode.getOutgoings().get(0));
	    	this.provisionNextNode();
    	}*/
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
}
