package de.ugoe.cs.oco.occi2deployment.transformation;

import java.nio.file.Path;

/**Interfaces handling the transformation of models.
 * @author rockodell
 *
 */
public interface Transformator {
	/**Transformation of a model stored at the inputPath to a model stored in the outputPath.
	 * @param inputPath
	 * @param outputPath
	 * @return
	 */
	public String transform(Path inputPath, Path outputPath);
	
	/**Transformation of a model stored at the inputPath to a model stored in the outputPath.
	 * For the information additional information is required contained in the model stored
	 * in the additionalPath.
	 * @param inputPath
	 * @param outputPath
	 * @param additionalPath
	 * @return
	 */
	public String transform(Path inputPath, Path outputPath, Path additionalPath);
}
