package de.ugoe.cs.oco.occi2deployment.comparator;

import org.eclipse.emf.ecore.EObject;
import org.occiware.clouddesigner.occi.Resource;

import cz.cesnet.cloud.occi.core.Entity;

/**An entity class storing information about two matching Objects.
 * @author rockodell
 *
 */
public class Match {
	EObject oldObj;
	EObject newObj;
	
	/**Default Constructor Creates an Empty Match.
	 * 
	 */
	public Match(){}
	
	/**Constructor typically used to instantiate a Match.
	 * Matches oldObj to newObj.
	 * @param oldObj
	 * @param newObj
	 */
	public Match(EObject oldObj, EObject newObj){
		this.oldObj = oldObj;
		this.newObj = newObj;
	}
	
	public void setOldObj(EObject oldObj){
		this.oldObj = oldObj;
	}
	
	public void setNewObj(EObject newObj){
		this.newObj = newObj;
	}
	
	public EObject getOldObj(){
		return this.oldObj;
	}
	
	
	public EObject getNewObj(){
		return this.newObj;
	}
}


