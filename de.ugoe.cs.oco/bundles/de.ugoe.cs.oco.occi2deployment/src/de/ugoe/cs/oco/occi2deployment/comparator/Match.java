package de.ugoe.cs.oco.occi2deployment.comparator;

import org.occiware.clouddesigner.occi.Resource;

/**An entity class storing information about two matching Objects.
 * @author rockodell
 *
 */
public class Match {
	Resource oldObj;
	Resource newObj;
	
	/**Default Constructor Creates an Empty Match.
	 * 
	 */
	public Match(){}
	
	/**Constructor typically used to instantiate a Match.
	 * Matches oldObj to newObj.
	 * @param oldObj
	 * @param newObj
	 */
	public Match(Resource oldObj, Resource newObj){
		this.oldObj = oldObj;
		this.newObj = newObj;
	}
	
	public void setOldObj(Resource oldObj){
		this.oldObj = oldObj;
	}
	
	public void setNewObj(Resource newObj){
		this.newObj = newObj;
	}
	
	public Resource getOldObj(){
		return this.oldObj;
	}
	
	
	public Resource getNewObj(){
		return this.newObj;
	}
}


