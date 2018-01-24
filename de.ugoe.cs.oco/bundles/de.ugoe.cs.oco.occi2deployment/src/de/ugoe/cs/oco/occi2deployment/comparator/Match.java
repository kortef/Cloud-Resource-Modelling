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
	
	/**Sets the src of the Match.
	 * @param src
	 */
	public void setOldObj(EObject src){
		this.src = src;
	}
	
	/**Sets the tar of the Match.
	 * @param tar
	 */
	public void setNewObj(EObject tar){
		this.tar = tar;
	}
	
	/**Returns the src of the Match.
	 * @return
	 */
	public EObject getSrc(){
		return this.src;
	}
	
	/**Returns the tar of the Match.
	 * @return
	 */
	public EObject getTar(){
		return this.tar;
	}
}


