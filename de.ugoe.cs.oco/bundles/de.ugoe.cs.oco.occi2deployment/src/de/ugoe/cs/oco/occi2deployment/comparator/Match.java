package de.ugoe.cs.oco.occi2deployment.comparator;

import org.eclipse.emf.ecore.EObject;

/**An entity class storing information about two matching Objects.
 * @author rockodell
 *
 */
public class Match {
	private EObject src;
	private EObject tar;
	
	/**Default Constructor Creates an Empty Match.
	 * 
	 */
	public Match(){}
	
	/**Constructor typically used to instantiate a Match.
	 * Matches oldObj to newObj.
	 * @param oldObj
	 * @param newObj
	 */
	public Match(EObject src, EObject tar){
		this.src = src;
		this.tar = tar;
	}
	
	public void setOldObj(EObject src){
		this.src = src;
	}
	
	public void setNewObj(EObject tar){
		this.tar = tar;
	}
	
	public EObject getSrc(){
		return this.src;
	}
	
	
	public EObject getTar(){
		return this.tar;
	}
}


