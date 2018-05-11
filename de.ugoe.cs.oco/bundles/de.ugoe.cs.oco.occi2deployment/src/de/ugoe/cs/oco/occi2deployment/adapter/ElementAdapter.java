package de.ugoe.cs.oco.occi2deployment.adapter;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Action;
import org.eclipse.cmf.occi.core.AttributeState;

import de.ugoe.cs.oco.occi2deployment.comparator.Match;
import de.ugoe.cs.oco.occi2deployment.execution.Executor;
import de.ugoe.cs.oco.occi2deployment.extraction.Extractor;
import de.ugoe.cs.oco.occi2deployment.extraction.ExtractorFactory;

/**Handles the adaptation process for single elements.
 * @author rockodell
 *
 */
public class ElementAdapter {
	static Logger log = Logger.getLogger(ElementAdapter.class.getName());
	private Executor executor;
	public static List<String> actionList = new ArrayList<String>();
	
	/**Constructor. Currently hardcoding the attributes that can be handled the updating process.
	 * (occi.compute.state; occi.network.state; occi.storage.state)
	 * @param conn
	 */
	public ElementAdapter(Executor exec){
		this.executor = exec;
		ElementAdapter.actionList.add("occi.compute.state");
		ElementAdapter.actionList.add("occi.network.state");
		ElementAdapter.actionList.add("occi.storage.state");
	}
	
	
	/**Main update procedure. Performs adjusting operations for each element in updatedElements)
	 * @param updatedElements
	 * @param match
	 */
	public void update(EList<EObject> updatedElements, EList<Match> match) {
		for(EObject element: updatedElements){
			EObject counterpart = getCounterpart(element, match);
			EList<AttributeState[]> differences = new BasicEList<AttributeState[]>();
			differences = investigateDifferences(element, counterpart);
			if(canBeHandledByActions(differences)){
				performActions(element, differences);
			}
			else{
				performPut(element); 
			}
		}	
	}

	/**Logs the differences passed.
	 * @param differences
	 */
	@SuppressWarnings("unused")
	private void logDifferences(EList<AttributeState[]> differences) {
		for(AttributeState[] arr: differences){
			log.info("Change: (" + arr[0].getName() +": " + arr[0].getValue() + ") to (" + arr[1].getName() +": " + arr[1].getValue() +")");
		}
		
	}

	/**Currently a stub, as OOI does not provide an implementation for Put operations.
	 * @param element
	 */
	private void performPut(EObject element) {
		log.info("Perform Put Operation on: " + ((Entity) element).getTitle());
    	executor.executeOperation("PUT", element, null);	    	
	}

	/**Performs required Actions to address all evaluated differences.
	 * @param element
	 * @param differences
	 */
	private void performActions(EObject element, EList<AttributeState[]> differences) {
		for(AttributeState[] diff: differences){
			Action correctAction = investigateCorrectAction(element, diff);
			if(correctAction == null){
				log.info("No Action for: " + diff);
			}
			else{
				log.debug(correctAction);
				executor.executeOperation("POST", element, correctAction);
			}
		}
		
	}

	/**Returns required action to address difference.
	 * Currently hardcoded for start and stop.
	 * @param element
	 * @param diff
	 * @return
	 */
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


	/**Returns action of having the passed String as Term.
	 * If no corresponding Action is found, null is returned.
	 * @param string
	 * @param actions
	 * @return
	 */
	private Action getAction(String string, EList<Action> actions) {
		for(Action action: actions){
			if(action.getTerm().equals(string)){
				return action;
			}
		}
		return null;
	}


	/**Evaluates whether the calculated differences of an Entity can be handled by actions only.
	 * @param differences
	 * @return true (can be handled by actions) false (otherwise)
	 */
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

	/**Investigates differences between the element and its counterpart on the Attribute level (AttributeState).
	 * Currently a Blacklist of attributes to be ignored is hardcoded in this function.
	 * Counterpart represents the old state of the resource in the match.
	 * @param element
	 * @param counterpart
	 * @return
	 */
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

	/**Returns the source of the match (the old version of the matched resource)
	 * @param element
	 * @param matches
	 * @return
	 */
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
