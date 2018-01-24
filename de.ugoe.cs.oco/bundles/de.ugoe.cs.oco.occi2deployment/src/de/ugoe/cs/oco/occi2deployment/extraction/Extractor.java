package de.ugoe.cs.oco.occi2deployment.extraction;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.ActivityNode;

/**Interface for the extraction of elements to be provisioned out of a topology Model.
 * @author rockodell
 *
 */
public interface Extractor {
	static Logger log = Logger.getLogger(Extractor.class.getName());
	/**Extracts corresponding element in the topology model of the passed activity.
	 * Therefore it compares the ID in the value of the ValuePin of the activity diagram with
	 * the IDs of the elements in the topology model.
	 * @param activity
	 * @return Corresponding element in the topology model of the passed activity.
	 */
	public EObject extractElement(ActivityNode activity, EList<EObject> model);
}
