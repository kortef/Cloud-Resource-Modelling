package de.ugoe.cs.oco.occi2deployment.comparator;

import java.nio.file.Path;

import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;

import de.ugoe.cs.oco.occi2deployment.connector.Connection;

public class ComparatorFactory {
	/**Returns a comparator instance. Comparing model1 (sourceModel) with model2(targetModel).
	 * A connection has to be passed due to the requirements of a idSwapList for the Simple/Mixed comparison approach.
	 * @param criteria accepts "Simple","Emf","Complex","POG".
	 * @param model1
	 * @param model2
	 * @return
	 */
	public static Comparator getComparator(String criteria, Path model1, Path model2, Connection conn){
		if(criteria.equals("Simple")){
			return new SimpleComparator(model1, model2, conn);
		}
		if(criteria.equals("Complex")){
			return new ComplexComparator(model1, model2);
		}
		if(criteria.equals("POG")){
			return new POGComparator(model1, model2);
		}
		if(criteria.equals("Mixed")){
			return new MixedComparator(model1, model2, conn);
		}
		return null;
	}	
	
	public static Comparator getComparator(String criteria, Resource model1, Resource model2, Connection conn){
		if(criteria.equals("Simple")){
			return new SimpleComparator(model1, model2, conn);
		}
		if(criteria.equals("Complex")){
			return new ComplexComparator(model1, model2);
		}
		if(criteria.equals("POG")){
			return new POGComparator(model1, model2);
		}
		if(criteria.equals("Mixed")){
			return new MixedComparator(model1, model2, conn);
		}
		return null;
	}
}
