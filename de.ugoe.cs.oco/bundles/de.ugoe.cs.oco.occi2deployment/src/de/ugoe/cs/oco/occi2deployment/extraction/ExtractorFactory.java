package de.ugoe.cs.oco.occi2deployment.extraction;

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
