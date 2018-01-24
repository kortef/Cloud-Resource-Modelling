package de.ugoe.cs.oco.occi2deployment.extraction;

/**Factory class for the creation of Extractor objects.
 * These extractor handle the extraction of information from specific models and their elements.
 * @author rockodell
 *
 */
public class ExtractorFactory {
	/**Returns Extractor instance.
	 * @param criteria Accepts: "OCCI"
	 * @return
	 */
	public static Extractor getExtractor(String criteria){
		if(criteria.equals("OCCI")){
			return new OCCIExtractor();
		}
		return null;
	}
}
