package de.ugoe.cs.oco.occi2deployment.provisioner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;

import de.ugoe.cs.oco.occi2deployment.execution.Executor;

public abstract class AbsProvisioner implements Provisioner, Runnable {
	static Logger log = Logger.getLogger(Provisioner.class.getName());
	protected Executor executor;
	protected EList<EObject> occiModel;
	protected ActivityNode currentNode;
	
	protected final static Object lock = new Object();
	protected static boolean done;
	
	protected static volatile List<ActivityEdge> performed = Collections.synchronizedList(new ArrayList<ActivityEdge>());

	abstract void performInitial();
	abstract void performFork();
	abstract void performAction();
	abstract void performJoin();
	abstract void performFinal();
	
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
	 * Continues the control flow with the next element.
	 * Therefore, the currentNode is set to the following node
	 * and the method provisionElements is executed.
	 */
	protected void provisionNextNode() {
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
		System.out.println(output);
		output = output.replaceAll("\\s+","");
		System.out.println(output);
		if(output.contains("occi.network.state=\"active\"")
				|| output.contains("occi.compute.state=\"active\"")
				|| output.contains("occi.storage.state=\"online\"")
				|| output.contains("\"occi.network.state\":\"active\"")
				|| output.contains("\"occi.compute.state\":\"active\"")
				|| output.contains("\"occi.storage.state\":\"active\"")){
			return true;
		}
		return false;
	}
}
