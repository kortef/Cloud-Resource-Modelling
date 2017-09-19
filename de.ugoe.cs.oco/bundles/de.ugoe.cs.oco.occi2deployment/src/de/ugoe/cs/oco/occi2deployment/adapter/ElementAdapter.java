package de.ugoe.cs.oco.occi2deployment.adapter;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.occiware.clouddesigner.occi.Action;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Entity;
//import org.occiware.clouddesigner.occi.Action;
//import org.occiware.clouddesigner.occi.AttributeState;
//import org.occiware.clouddesigner.occi.Entity;

import de.ugoe.cs.oco.occi2deployment.Connection;
import de.ugoe.cs.oco.occi2deployment.comparator.Match;
import de.ugoe.cs.oco.occi2deployment.execution.Executor;
import de.ugoe.cs.oco.occi2deployment.execution.ExecutorFactory;

/**Handles the adaptation process for single elements.
 * @author rockodell
 *
 */
public class ElementAdapter {
	static Logger log = Logger.getLogger(ElementAdapter.class.getName());
	private Connection connection;
	public static List<String> actionList = new ArrayList<String>();
	
	public ElementAdapter(Connection conn){
		this.connection = conn;
		ElementAdapter.actionList.add("occi.compute.state");
		ElementAdapter.actionList.add("occi.network.state");
		ElementAdapter.actionList.add("occi.storage.state");
	}
	
	
	public void update(EList<EObject> updatedElements, EList<Match> match) {
		for(EObject element: updatedElements){
			EObject counterpart = getCounterpart(element, match);
			EList<AttributeState[]> differences = new BasicEList<AttributeState[]>();
			differences = investigateDifferences(element, counterpart);
			if(canBeHandledByActions(differences)){
				performActions(element, differences);
			}
			else{
				performPut(element); //stub
			}
		}	
	}

	private void logDifferences(EList<AttributeState[]> differences) {
		for(AttributeState[] arr: differences){
			log.info("Change: (" + arr[0].getName() +": " + arr[0].getValue() + ") to (" + arr[1].getName() +": " + arr[1].getValue() +")");
		}
		
	}

	private void performPut(EObject element) {
		// TODO Auto-generated method stub
		
	}

	private void performActions(EObject element, EList<AttributeState[]> differences) {
		for(AttributeState[] diff: differences){
			Action correctAction = investigateCorrectAction(element, diff);
			if(correctAction == null){
				log.info("No Action for: " + diff);
			}
			else{
				log.debug(correctAction);
				Executor executor = ExecutorFactory.getExecutor("OCCI", this.connection);
				executor.executeOperation("POST", element, correctAction);
			}
		}
		
	}

	private Action investigateCorrectAction(EObject element, AttributeState[] diff) {
		Entity entity = (Entity) element;
		if(diff[0].getValue().equals("inactive") && diff[1].getValue().equals("active")){
			return getAction("start", entity.getKind().getActions());
		}
		if(diff[0].getValue().equals("active") && diff[1].getValue().equals("inactive")){
			return getAction("stop", entity.getKind().getActions());
		}
		return null;
	}


	private Action getAction(String string, EList<Action> actions) {
		for(Action action: actions){
			if(action.getTerm().equals(string)){
				return action;
			}
		}
		return null;
	}


	private boolean canBeHandledByActions(EList<AttributeState[]> differences) {
		for(AttributeState[] arr: differences){
			boolean canBeHandled = false;
			for(String action: actionList){
				if(arr[0].getName().equals(action)){
					canBeHandled = true;
				}
			}
			if(canBeHandled == false){
				return false;
			}
		}
		return true;
	}

	private EList<AttributeState[]> investigateDifferences(EObject element, EObject counterpart) {
		EList<AttributeState[]> differences = new BasicEList<AttributeState[]>();
		for(EObject oldContent: counterpart.eContents()){
			if(oldContent.eClass().getName().equals("AttributeState")){
				for(EObject newContent: element.eContents()){
					if(newContent.eClass().getName().equals("AttributeState")){
						AttributeState oldAttr = (AttributeState) oldContent;
						AttributeState newAttr = (AttributeState) newContent;
						if(oldAttr.getName().equals(newAttr.getName()) 
								&& oldAttr.getName().contains("target") == false
								&& oldAttr.getName().contains("source") == false
								&& oldAttr.getName().contains("core.id") == false){
							if(oldAttr.getValue().equals(newAttr.getValue()) == false){
								AttributeState[] diff = {oldAttr, newAttr};
								differences.add(diff);
							}
						}
					}
				}
			}
		}
		return differences;
	}

	private EObject getCounterpart(EObject element, EList<Match> matches) {
		Entity entity = (Entity) element;
		for(Match match: matches){
			if(match.getTar() != null && match.getSrc() != null){
				if(entity.getId().equals(((Entity)match.getTar()).getId())){
					return match.getSrc();
				}
			}
		}
		return null;
	}

}
