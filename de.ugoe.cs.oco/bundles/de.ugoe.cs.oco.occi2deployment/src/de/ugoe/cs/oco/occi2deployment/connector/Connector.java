package de.ugoe.cs.oco.occi2deployment.connector;

import java.util.List;

import org.eclipse.cmf.occi.core.Entity;

public interface Connector {
	public List<String[]> getIdSwapList();
	public void idSwapListAdd(String[] swap);
	public void idSwapListRemove(Entity entity);
	public List<String[]> deserializeIdSwapList();
	public void serializeIdSwapList();
	
	
	public int getPort();
	public String getAdress();
	public String getToken();
}
