package de.ugoe.cs.oco.occi2deployment.comparator;

import org.occiware.clouddesigner.occi.Resource;

public class Match {
	Resource oldObj;
	Resource newObj;
	
	public Match(){
		
	}
	
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


