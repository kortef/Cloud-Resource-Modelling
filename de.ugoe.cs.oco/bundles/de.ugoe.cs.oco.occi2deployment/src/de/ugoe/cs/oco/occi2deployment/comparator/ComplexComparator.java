package de.ugoe.cs.oco.occi2deployment.comparator;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.occiware.clouddesigner.occi.Entity;

import de.ugoe.cs.oco.occi2deployment.ModelUtility;
import de.ugoe.cs.oco.occi2deployment.transformation.Transformator;
import de.ugoe.cs.oco.occi2deployment.transformation.TransformatorFactory;
import pcg.PcgFactory;
import pcg.Resource;
import pcg.Vertex;


/**Complex Comparator implements the similiarity flooding algorithm
 * results as intial weighting.
 * @author rockodell
 *
 */
public class ComplexComparator extends AbsComplexComparator {
	/**Constructor executing the compare method to fill the ELists of the Object.
	 * @param oldModelPath
	 * @param newModelPath
	 */
	public ComplexComparator(Path oldModelPath, Path newModelPath) {
		compare(oldModelPath, newModelPath);
	}

	public ComplexComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	void createResourceMatch(Path oldModelPath, EList<EObject> oldModel, Path newModelPath, EList<EObject> newModel) {
		Transformator occiToPcg = TransformatorFactory.getTransformator("OCCI2PCG");
		Path pcgPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/My.pcg");
		occiToPcg.transform(oldModelPath, newModelPath, pcgPath);
				
		Path ipgPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/My2.pcg");
		Transformator pcgToIpg = TransformatorFactory.getTransformator("PCG2IPG");
		pcgToIpg.transform(pcgPath, ipgPath);
		
		this.matches = generateMatches(ipgPath, oldModel, newModel);
	}
	
	EList<Match> generateMatches(Path ipgPath, EList<EObject> oldModel, EList<EObject> newModel) {
		Map<String, List<Vertex>> map = calculateFixpointValueMap(ipgPath);
		return createMatch(map, oldModel, newModel);
	}
	
	/**Returns the highest fixpoint value of the whole map.
	 * @param map
	 * @return
	 */
	@Override
	Vertex getSuitableFixpointValue(Map<String, List<Vertex>> map, EList<EObject> oldModel, EList<EObject> newModel) {
		System.out.println("COMPLEX!");
		Vertex maxVertex = null;
		double max = 0.0;
		for(List<Vertex> vertices: map.values()){
			sortVertices(vertices);
			logList(vertices);
			if(vertices.isEmpty() == false && vertices.get(0).getFixpointValue() > max){
				maxVertex=vertices.get(0);	
				max = vertices.get(0).getFixpointValue();
			}
		}
		return maxVertex;
	}
}


