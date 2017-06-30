package de.ugoe.cs.oco.occi2deployment.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Link;

import de.ugoe.cs.oco.occi2deployment.ModelUtility;
import pcg.Vertex;

/**Abstract class containing the attributes newElements, oldElements, missingElements and adaptedElements.
 * Defines getter, setter and log methods for inheriting classes.
 * @author rockodell
 *
 */
public abstract class AbsComparator implements Comparator {
	
	EList<Match> matches = new BasicEList<Match>();
	EList<EObject> newElements = new BasicEList<EObject>();
	EList<EObject> oldElements = new BasicEList<EObject>();
	EList<EObject> missingElements = new BasicEList<EObject>();
	EList<EObject> adaptedElements = new BasicEList<EObject>();
	
	/**Checks whether an Entity is adapted in the New model based on each Attr and its value in the
	 * old and new element. Does not check for missing attributes.
	 * @param oldObj
	 * @param newObj
	 * @return boolean indicating, if the element is adapted or not.
	 */
	protected boolean checkIfAdapted(EObject oldObj, EObject newObj) {
		for(EObject oldContent: oldObj.eContents()){
			if(oldContent.eClass().getName().equals("AttributeState")){
				for(EObject newContent: newObj.eContents()){
					if(newContent.eClass().getName().equals("AttributeState")){
						AttributeState oldAttr = (AttributeState) oldContent;
						AttributeState newAttr = (AttributeState) newContent;
						if(oldAttr.getName().equals(newAttr.getName())){
							if(oldAttr.getValue().equals(newAttr.getValue()) == false){
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}
	
	protected void createLinkMatch() {
		List<Match> linkMatches = new ArrayList<Match>();
		for(Match match: matches){
			if(match.getOldObj() != null && match.getNewObj() != null){
				EObject oldObj = match.getOldObj();
				EObject newObj = match.getNewObj();
				linkMatches.addAll(matchLinksOfObject(oldObj, newObj));
			}
			else if(match.getOldObj() == null){
				for(EObject newLink: match.getNewObj().eContents()){
					if(newLink.eClass().getName().equals("Link")){
						Match newMatch = new Match(null, newLink);
						linkMatches.add(newMatch);
					}
				}
			}
			else if(match.getNewObj() == null){
				for(EObject oldLink: match.getOldObj().eContents()){
					if(oldLink.eClass().getName().equals("Link")){
						Match oldMatch = new Match(oldLink, null);
						linkMatches.add(oldMatch);
					}
				}
			}	
		}
		this.matches.addAll(linkMatches);
	}
	
	private List<Match> matchLinksOfObject(EObject obj, EObject newObj) {
		List<Match> toReturn = new ArrayList<Match>();
		toReturn.addAll(extractEqualLinks(obj, newObj));
		toReturn.addAll(extractNewLinks(obj, newObj));
		toReturn.addAll(extractMissingLinks(obj, newObj));
		return toReturn;
	}
		
	private List<Match> extractEqualLinks(EObject obj, EObject newObj) {
		List<Match> toReturn = new ArrayList<Match>();
		for(EObject link: obj.eContents()){
			if(link.eClass().getName().equals("Link")){
				for(EObject link2: newObj.eContents()){
					if(link2.eClass().getName().equals("Link")){
						Link oldLink = (Link) link;
						Link newLink = (Link) link2;
						if(oldLink.getKind().getScheme().equals(newLink.getKind().getScheme())
						&& oldLink.getKind().getTerm().equals(newLink.getKind().getTerm())){
							if(sameTarget(oldLink.getTarget(), newLink.getTarget(), matches)){
								Match match = new Match(oldLink, newLink);
								toReturn.add(match);
							}
						}	
					}
				}
			}
		}
		return toReturn;
	}	
	
	private List<Match> extractMissingLinks(EObject obj, EObject newObj) {
		List<Match> toReturn = new ArrayList<Match>();
		for(EObject link2: obj.eContents()){
			if(link2.eClass().getName().equals("Link")){
				Boolean missingElement = true;
				for(EObject link: newObj.eContents()){
					if(link.eClass().getName().equals("Link")){
						Link oldLink = (Link) link2;
						Link newLink = (Link) link;
						if(oldLink.getKind().getScheme().equals(newLink.getKind().getScheme())
							&& oldLink.getKind().getTerm().equals(newLink.getKind().getTerm())){
								if(sameTarget(oldLink.getTarget(), newLink.getTarget(), matches)){
									missingElement = false;
								}
						}
					}
				}
				if(missingElement){
					Match match = new Match(((Link)link2),null);
					toReturn.add(match);
				}
			}
		}
		return toReturn;
	}

	private List<Match> extractNewLinks(EObject obj, EObject newObj) {
		List<Match> toReturn = new ArrayList<Match>();
		for(EObject link2: newObj.eContents()){
			if(link2.eClass().getName().equals("Link")){
				Boolean newElement = true;
				for(EObject link: obj.eContents()){
					if(link.eClass().getName().equals("Link")){
						Link oldLink = (Link) link;
						Link newLink = (Link) link2;
						if(oldLink.getKind().getScheme().equals(newLink.getKind().getScheme())
							&& oldLink.getKind().getTerm().equals(newLink.getKind().getTerm())){
								if(sameTarget(oldLink.getTarget(), newLink.getTarget(), matches)){
									newElement = false;
								}
						}
					}
				}
				if(newElement){
					Match match = new Match(null, ((Link)link2));
					toReturn.add(match);
				}
			}
		}
		return toReturn;
	}
	
	
	/**Logs the element missing as Missing element
	 * @param missing
	 */
	protected static void logMissing(EObject missing){
		if(ModelUtility.checkIfEntityElement(missing)){
			Entity entity = (Entity) missing;
			if(entity.getTitle() == null){
				log.debug("Added Missing Element: " + entity.getKind().getTerm());
			}
			else{
				log.debug("Added Missing Element: " + entity.getTitle());
			}
		}
	}
	
	/**Logs the element newElement as New element.
	 * @param newElement
	 */
	protected static void logNew(EObject newElement){
		if(ModelUtility.checkIfEntityElement(newElement)){
			Entity entity = (Entity) newElement;
			if(entity.getTitle() == null){
				log.debug("Added New Element: " + entity.getKind().getTerm());
			}
			else{
				log.debug("Added New Element: " + entity.getTitle());
			}
		}
	}
	
	
	/**Logs the element old as Old element.
	 * @param old
	 */
	protected static void logOld(EObject old){
		if(ModelUtility.checkIfEntityElement(old)){
			Entity entity = (Entity) old;
			if(entity.getTitle() == null){
				log.debug("Added Old Element: " + entity.getKind().getTerm());
			}
			else{
				log.debug("Added Old Element: " + entity.getTitle());
			}
		}
	}
	
	/**Logs the element adapted as adapted element.
	 * @param adapted
	 */
	protected static void logAdapted(EObject adapted){
		if(ModelUtility.checkIfEntityElement(adapted)){
			Entity entity = (Entity) adapted;
			if(entity.getTitle() == null){
				log.debug("Added Adapted Element: " + entity.getKind().getTerm());
			}
			else{
				log.debug("Added Adapted Element: " + entity.getTitle());
			}
		}
	}
	
	/**Logs the Matches of the comparator.
	 * @param list
	 */
	protected static void logMatch(List<Match> list){
		for(Match match: list){
			if(match.getOldObj() == null){
				if(match.getNewObj().eClass().getName().equals("Link")){
					log.info("Mapped: " + "null" + " : " + ((Link)match.getNewObj()).getSource().getTitle()
							+ "->"+ ((Link)match.getNewObj()).getTarget().getTitle());
				}
				else{
					log.info("Mapped: " + "null" + " : " + ((Entity)match.getNewObj()).getTitle());
				}
			}
			else if(match.getNewObj() == null){
				if(match.getOldObj().eClass().getName().equals("Link")){
					log.info("Mapped: " + ((Link)match.getOldObj()).getSource().getTitle()
							+ "->"+ ((Link)match.getOldObj()).getTarget().getTitle() + " : null");
				}
				else{
					log.info("Mapped: " + ((Entity) match.getOldObj()).getTitle() + " : " + "null");
				}
			}
			else if(match.getNewObj() != null && match.getOldObj() != null){
				if(match.getOldObj().eClass().getName().equals("Link") && match.getNewObj().eClass().getName().equals("Link")){
					log.info("Mapped: " + ((Link)match.getOldObj()).getSource().getTitle()
							+ "->"+ ((Link)match.getOldObj()).getTarget().getTitle() + " : " + 
							((Link)match.getNewObj()).getSource().getTitle()
							+ "->"+ ((Link)match.getNewObj()).getTarget().getTitle());
				}
				else{
					log.info("Mapped: " + ((Entity)match.getOldObj()).getTitle() + " : " + ((Entity)match.getNewObj()).getTitle());
				}
			}
		}
	}
	
	/**Logs the Map of the fixpoint values from the simlarity flooding process.
	 * @param map
	 */
	protected static void logMap(Map<String, List<Vertex>> map){
		for(String key: map.keySet()){
			String message = new String();
			message += "\nMap: " + key + ": \n";
			for(Vertex vertex: map.get(key)){
				message +=  vertex.getResources().get(0).getTitle() +" : "+ vertex.getResources().get(1).getTitle() + " " + vertex.getFixpointValue() + "\n";
			}
			log.debug(message);
		}
	}
	
	
	/**Investigates Old and Adapted Elements from the matches list in order to add them
	 * to the corresponding elements from the comparator.
	 * @param newModel
	 * @param oldModel
	 * @param matches
	 */
	protected void investigateOldAndAdaptedEntities(EList<EObject> newModel, EList<EObject> oldModel, List<Match> matches) {
		for(Match match: matches){
			if(match.getOldObj() != null && match.getNewObj() != null){
				EObject oldObj = match.getOldObj();
				EObject newObj = match.getNewObj();
				if(checkIfAdapted(oldObj, newObj)){
					adaptedElements.add(newObj);
					logAdapted(newObj);
				}
				else{
					oldElements.add(newObj);
					logOld(newObj);
				}
			}
		}
	}

	/** Checks whether two Resources are the same as specified in the matching.
	 * Required for link matching.
	 * @param target
	 * @param target2
	 * @param matches
	 * @return
	 */
	protected boolean sameTarget(org.occiware.clouddesigner.occi.Resource target,
			org.occiware.clouddesigner.occi.Resource target2, List<Match> matches) {
		for(Match match: matches){
			if(match.getOldObj() != null && match.getNewObj() != null){
				if(((Entity) match.getOldObj()).getId().equals(target.getId()) && ((Entity) match.getNewObj()).getId().equals(target2.getId())){
					return true;
				}
			}
		}
		return false;
	}

	

	/**Investigates new Model and the given match for OCCI Entities which are not already
	 * registered and marks them as new.
	 * @param newModel
	 * @param list
	 */
	protected void investigateNewEntities(EList<EObject> newModel, List<Match> list) {
		for(Match match: list){
			if(match.getOldObj() == null){
				EObject obj = match.getNewObj();
				newElements.add(obj);
				logNew(obj);
			}
		}
	}

	/**Investigates old Entities which could not be matched and marks them as missing in the newModel.
	 * @param oldModel
	 * @param list
	 */
	protected void investigateMissingEntities(EList<EObject> oldModel, List<Match> list) {
		for(Match match: list){
			if(match.getNewObj() == null){
				EObject obj = match.getOldObj();
				missingElements.add(obj);
				logMissing(obj);
			}
		}	
	}
	
	@Override
	public EList<Match> getMatches() {
		return this.matches;
	}
	
	@Override
	public EList<EObject> getNewElements() {
		return newElements;
	}

	@Override
	public EList<EObject> getOldElements() {
		return oldElements;
	}

	@Override
	public EList<EObject> getMissingElements() {
		return missingElements;
	}
	
	@Override
	public EList<EObject> getAdaptedElements() {
		return adaptedElements;
	}
}
