package de.ugoe.cs.oco.occi2deployment.adapter;

public class AttributeAction {
	private String action;
	private String attribute;
	
	/**Default Constructor Creates an Empty Match.
	 * 
	 */
	public AttributeAction(){}
	
	/**Constructor typically used to instantiate a Match.
	 * Matches oldObj to newObj.
	 * @param oldObj
	 * @param newObj
	 */
	public AttributeAction(String action, String attribute){
		this.action = action;
		this.attribute = attribute;
	}


	public String getAction() {
		return action;
	}


	public void setAction(String action) {
		this.action = action;
	}


	public String getAttribute() {
		return attribute;
	}


	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
}
