package de.ugoe.cs.oco.occi2deployment.comparator;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Resource;

import de.ugoe.cs.oco.occi2deployment.Connection;
import de.ugoe.cs.oco.occi2deployment.ModelUtility;
import pcg.Vertex;

/**Abstract class containing the attributes newElements, oldElements, missingElements and adaptedElements.
 * Defines getter, setter and log methods for inheriting classes.
 * @author rockodell
 *
 */
public abstract class AbsComparator implements Comparator {
	
	abstract void createResourceMatch(Path oldModelPath, EList<EObject> oldModel, Path newModelPath, EList<EObject> newModel);
	abstract void createResourceMatch(org.eclipse.emf.ecore.resource.Resource oldModelResource, org.eclipse.emf.ecore.resource.Resource newModelResource);
	protected Connection connection;
	EList<Match> matches = new BasicEList<Match>();
	EList<EObject> newElements = new BasicEList<EObject>();
	EList<EObject> oldElements = new BasicEList<EObject>();
	EList<EObject> missingElements = new BasicEList<EObject>();
	EList<EObject> adaptedElements = new BasicEList<EObject>();
	
	//template method
	/**Standard compare procedure: First a Resource Match is created depending on the kind of Comparator instantiated(Template pattern). 
	 * Based on this Resource match, a Link match is created, followed by a marking procedure filling the Comparator Objects lists.
	 * @param oldModelPath
	 * @param newModelPath
	 */
	protected final void compare(Path oldModelPath, Path newModelPath){
		EList<EObject> oldModel = ModelUtility.loadOCCI(oldModelPath);
		EList<EObject> newModel = ModelUtility.loadOCCI(newModelPath);
		
		
		createResourceMatch(oldModelPath, oldModel, newModelPath, newModel);
		createLinkMatch();
		logMatch(matches);
		
		investigateNewEntities(newModel, matches);
		//Fill missing entities
		investigateMissingEntities(oldModel, matches);
		//Fill adapted/old entities
		investigateOldAndAdaptedEntities(newModel, oldModel, matches);
	}
	
	protected final void compare(org.eclipse.emf.ecore.resource.Resource oldModelResource, org.eclipse.emf.ecore.resource.Resource newModelResource) {
		EList<EObject> oldModel = ModelUtility.getOCCIConfigurationContents(oldModelResource);
		EList<EObject> newModel = ModelUtility.getOCCIConfigurationContents(newModelResource);
		
		createResourceMatch(oldModelResource,newModelResource);
		createLinkMatch();
		logMatch(matches);
		
		investigateNewEntities(newModel, matches);
		//Fill missing entities
		investigateMissingEntities(oldModel, matches);
		//Fill adapted/old entities
		investigateOldAndAdaptedEntities(newModel, oldModel, matches);
		
	}
	
	
	/**Checks whether an Entity is adapted in the New model based on each Attr and its value in the
	 * old and new element. Does not check for missing attributes.
	 * @param oldObj
	 * @param newObj
	 * @return boolean indicating, if the element is adapted or not.
	 */
	protected boolean checkIfAdapted(EObject src, EObject tar) {
		for(AttributeState srcAttr: extractAttr(src)){
			for(AttributeState tarAttr: extractAttr(tar)){
				if(srcAttr.getName().equals(tarAttr.getName()) 
				&& inBlacklist(srcAttr.getName()) == false){
					if(srcAttr.getValue().equals(tarAttr.getValue()) == false){
						return true;
					}
				}
			}
		}
		return false;
	}

	/**Checks whether the passed String string corresponds to an Attribute contained within the Blacklist.
	 * Currently the Blacklist is hardcoded.
	 * @param string
	 * @return
	 */
	private boolean inBlacklist(String string) {
		if(string.contains("core.source")
		|| string.contains("core.target")
		|| string.contains("core.id")){
			return true;
		}
		else{
			return false;
		}
	}

	/**Returns attributes of a passed object, whereby the obj should either be a Resource or Link.
	 * The passed obj could be changed to Entity.
	 * @param obj
	 * @return
	 */
	private EList<AttributeState> extractAttr(EObject obj) {
		if(obj.eClass().getName().equals("Resource")){
			Resource res = (Resource) obj;
			return res.getAttributes();
		}
		else if(obj.eClass().getName().equals("Link")){
			Link link = (Link) obj;
			return link.getAttributes();
		}
		else{
			return new BasicEList<AttributeState>();
		}
	}
	
	/**Standard procedure creating the Link match.
	 * Each match of the comparator (at this point holding only Resource maches) is checked, 
	 * whether a direct match or a non direct match is found. If a direct match is found, the Links
	 * of the matched Resources are compared. Otherwise, on a non direct match, either each Link
	 * of the Resource is added on the Src or Tar side of the matching table indicating its deletion
	 * or creation.
	 */
	protected void createLinkMatch() {
		List<Match> linkMatches = new ArrayList<Match>();
		for(Match match: this.matches){
			if(match.getSrc() != null && match.getTar() != null){
				linkMatches.addAll(matchLinksOfObject(match.getSrc(), match.getTar()));
			}
			else if(match.getSrc() == null){
				for(EObject link: extractLinks(match.getTar())){
					linkMatches.add(new Match(null, link));
				}
			}
			else if(match.getTar() == null){
				for(EObject link: extractLinks(match.getSrc())){
						linkMatches.add(new Match(link, null));
				}
			}	
		}
		this.matches.addAll(linkMatches);
	}
		
	/**Returns a List of Links contained within the Resource.
	 * The passed Object obj could be changed to Resource.
	 * @param obj
	 * @return
	 */
	private EList<Link> extractLinks(EObject obj) {
		if(obj.eClass().getName().equals("Resource")){
			Resource res = (Resource) obj;
				return res.getLinks();
		}
		else{
			return new BasicEList<Link>();
		}	
	}
	
	/**Returns all direct matches of Resources of passed match List matches.
	 * @param matches
	 * @return
	 */
	protected List<Match> extractDirectResourceMatch(List<Match> matches) {
		List<Match> directResourceMatches = new BasicEList<Match>();
		for(Match match: matches){
			if(match.getSrc() != null && match.getTar() != null && match.getSrc().eClass().getName().equals("Resource")){
				directResourceMatches.add(match);
			}
		}
		return directResourceMatches;	
	}
	
	/**Matches Links of the old Resource (obj) and the new Resource (newObj).
	 * Here, equal, new, and missing Links are investigated.
	 * Parameters could be changed to Resource.
	 * @param obj
	 * @param newObj
	 * @return
	 */
	private List<Match> matchLinksOfObject(EObject obj, EObject newObj) {
		List<Match> toReturn = new ArrayList<Match>();
		toReturn.addAll(extractEqualLinks(obj, newObj));
		toReturn.addAll(extractNewLinks(obj, newObj));
		toReturn.addAll(extractMissingLinks(obj, newObj));
		return toReturn;
	}
		
	/**Returns a List of Links having the same Scheme, Term and Target of the passed Resources (obj, newObj).
	 * Hereby, it is checked whether they possess the same target according to the calculated Resource match.
	 * @param obj
	 * @param newObj
	 * @return
	 */
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
	
	/**Returns missing Matches for Links of the passed objects. (Matches indicating a deletion)
	 * @param obj
	 * @param newObj
	 * @return
	 */
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

	/**Returns new Matches for Links of the passed objects. (Matches indicating a creation)
	 * @param obj
	 * @param newObj
	 * @return
	 */
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
	protected void logMatch(List<Match> list){
		log.info("Comparator: " + this.getClass().getSimpleName());
		for(Match match: list){
			if(match.getSrc() == null){
				if(match.getTar().eClass().getName().equals("Link")){
					log.info("Mapped: " + "null" + " : " + ((Link)match.getTar()).getSource().getTitle()
							+ "->"+ ((Link)match.getTar()).getTarget().getTitle());
				}
				else{
					log.info("Mapped: " + "null" + " : " + ((Entity)match.getTar()).getTitle());
				}
			}
			else if(match.getTar() == null){
				if(match.getSrc().eClass().getName().equals("Link")){
					log.info("Mapped: " + ((Link)match.getSrc()).getSource().getTitle()
							+ "->"+ ((Link)match.getSrc()).getTarget().getTitle() + " : null");
				}
				else{
					log.info("Mapped: " + ((Entity) match.getSrc()).getTitle() + " : " + "null");
				}
			}
			else if(match.getTar() != null && match.getSrc() != null){
				if(match.getSrc().eClass().getName().equals("Link") && match.getTar().eClass().getName().equals("Link")){
					log.info("Mapped: " + ((Link)match.getSrc()).getSource().getTitle()
							+ "->"+ ((Link)match.getSrc()).getTarget().getTitle() + " : " + 
							((Link)match.getTar()).getSource().getTitle()
							+ "->"+ ((Link)match.getTar()).getTarget().getTitle());
				}
				else{
					log.info("Mapped: " + ((Entity)match.getSrc()).getTitle() + " : " + ((Entity)match.getTar()).getTitle());
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
	
	/**Logs the passed Vertex.
	 * @param highest
	 */
	protected static void logVertex(Vertex highest) {
		System.out.println(((pcg.Resource)highest.getResources().get(0)).getTitle() + " : " + ((pcg.Resource)highest.getResources().get(1)).getTitle());
	}
	
	/**Investigates Old and Adapted Elements from the matches list in order to add them
	 * to the corresponding elements from the comparator.
	 * @param newModel
	 * @param oldModel
	 * @param matches
	 */
	protected void investigateOldAndAdaptedEntities(EList<EObject> newModel, EList<EObject> oldModel, List<Match> matches) {
		for(Match match: matches){
			if(match.getSrc() != null && match.getTar() != null){
				EObject oldObj = match.getSrc();
				EObject newObj = match.getTar();
				if(checkIfAdapted(oldObj, newObj)){
					adaptedElements.add(newObj);
					logAdapted(newObj);
				}
				else{
					oldElements.add(newObj);
					//logOld(newObj);
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
	protected boolean sameTarget(org.eclipse.cmf.occi.core.Resource target,
			org.eclipse.cmf.occi.core.Resource target2, List<Match> matches) {
		if(target == null || target2 == null) {
			return false;
		}
		for(Match match: matches){
			if(match.getSrc() != null && match.getTar() != null){
				Entity matchSrcEntity = (Entity) match.getSrc(); 
				Entity matchTarEntity = (Entity) match.getTar(); 
				if(matchSrcEntity.getId().equals(target.getId()) && matchTarEntity.getId().equals(target2.getId())){
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
			if(match.getSrc() == null){
				EObject obj = match.getTar();
				newElements.add(obj);
				//logNew(obj);
			}
		}
	}

	/**Investigates old Entities which could not be matched and marks them as missing in the newModel.
	 * @param oldModel
	 * @param list
	 */
	protected void investigateMissingEntities(EList<EObject> oldModel, List<Match> list) {
		for(Match match: list){
			if(match.getTar() == null){
				EObject obj = match.getSrc();
				missingElements.add(obj);
				//logMissing(obj);
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