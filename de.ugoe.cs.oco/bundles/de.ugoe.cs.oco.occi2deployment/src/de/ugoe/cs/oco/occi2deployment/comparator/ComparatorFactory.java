package de.ugoe.cs.oco.occi2deployment.comparator;

import java.nio.file.Path;

public class ComparatorFactory {
	/**Returns a comparator instance.
	 * @param criteria accepts "Simple","Emf","Complex","POG".
	 * @param model1
	 * @param model2
	 * @return
	 */
	public static Comparator getComparator(String criteria, Path model1, Path model2){
		if(criteria.equals("Simple")){
			return new SimpleComparator(model1, model2);
		}
		if(criteria.equals("Emf")){
			return new EmfCompareComparator(model1, model2);
		}
		if(criteria.equals("Complex")){
			return new ComplexComparator(model1, model2);
		}
		if(criteria.equals("POG")){
			return new POGComparator(model1, model2);
		}
		if(criteria.equals("Mixed")){
			return new MixedComparator(model1, model2);
		}
		return null;
	}	
}
