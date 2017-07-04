package de.ugoe.cs.oco.occi2deployment.comparator;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**Comparator interface defining methods to recieve comparisson results.
 * @author rockodell
 *
 */
public interface Comparator {
		static Logger log = Logger.getLogger(Comparator.class.getName());
		public EList<EObject> getNewElements();
		public EList<EObject> getOldElements();
		public EList<EObject> getMissingElements();
		public EList<EObject> getAdaptedElements();
		EList<Match> getMatches();
}