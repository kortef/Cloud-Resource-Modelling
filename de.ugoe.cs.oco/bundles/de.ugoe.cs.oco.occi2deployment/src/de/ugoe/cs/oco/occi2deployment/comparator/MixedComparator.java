package de.ugoe.cs.oco.occi2deployment.comparator;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.occiware.clouddesigner.occi.AttributeState;
import org.occiware.clouddesigner.occi.Entity;

import de.ugoe.cs.oco.occi2deployment.ModelUtility;
import de.ugoe.cs.oco.occi2deployment.transformation.Transformator;
import de.ugoe.cs.oco.occi2deployment.transformation.TransformatorFactory;
import pcg.*;


/**Complex Comparator implements the similiarity flooding algorithm combined with the EMF Compare
 * results as intial weighting.
 * @author rockodell
 *
 */
public class MixedComparator extends AbsComparator {
	/**Constructor executing the compare method to fill the ELists of the Object.
	 * @param oldModelPath
	 * @param newModelPath
	 */
	public MixedComparator(Path oldModelPath, Path newModelPath) {
		compare(oldModelPath, newModelPath);
	}

	@Override
	void createResourceMatch(Path oldModelPath, EList<EObject> oldModel, Path newModelPath, EList<EObject> newModel) {		
		Comparator simple = ComparatorFactory.getComparator("Simple", oldModelPath, newModelPath);
		
		Transformator occiToPcg = TransformatorFactory.getTransformator("OCCI2PCG");
		Path pcgPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/My.pcg");
		occiToPcg.transform(oldModelPath, newModelPath, pcgPath);
		
		adaptPCG(pcgPath, simple.getOldElements());
		
		Path ipgPath = Paths.get("./src/de/ugoe/cs/oco/occi2deployment/tests/models/My2.pcg");
		Transformator pcgToIpg = TransformatorFactory.getTransformator("PCG2IPG");
		pcgToIpg.transform(pcgPath, ipgPath);
		
		ComplexComparator complex = new ComplexComparator();
		this.matches = complex.generateMatches(ipgPath, oldModel, newModel);
		
		checkNewAndMissingMatchesForSimilarities(this.matches, oldModel, newModel);
		logMatch(matches);
	}
	
	private void adaptPCG(Path pcgPath, EList<EObject> oldElements) {
		EList<EObject> pcg = ModelUtility.loadPCG(pcgPath);
		Graph pcgGraph = (Graph) pcg.get(0);
		deleteOldElementsFromGraph(pcgGraph, oldElements);
		ModelUtility.storePCG(pcgPath, pcgGraph);
	}

	private void deleteOldElementsFromGraph(Graph pcgGraph, EList<EObject> oldElements) {
		List<Vertex> toRemove = new BasicEList<Vertex>();
		for(Vertex vertex: pcgGraph.getVertices()){
			for(EObject old: oldElements){
				if(vertex.getResources().get(0).getId().equals(((Entity) old).getId())
						&& vertex.getResources().get(1).getId().equals(((Entity) old).getId()) == false){
					toRemove.add(vertex);
				}
			}
		}
		for(Vertex vertex: toRemove){
			EcoreUtil.delete(vertex);
		}
		
		List<Edge> toRemoveE = new BasicEList<Edge>();
		for(Edge edge: pcgGraph.getEdges()){
			if(edge.getTarget() == null || edge.getSource() == null){
				toRemoveE.add(edge);
			}
		}
		for(Edge edge: toRemoveE){
			EcoreUtil.delete(edge);
		}
	}

	/**After the similarity flooding algorithm, missing and new matches are investigated for similarities,
	 * such as name, in order to match matching objects together.
	 * @param matches
	 * @param oldModel
	 * @param newModel
	 */
	private void checkNewAndMissingMatchesForSimilarities(EList<Match> matches, EList<EObject> oldModel, EList<EObject> newModel) {
		EList<Match> toRemove = new BasicEList<Match>();
		EList<Match> toAdd = new BasicEList<Match>();
		for(Match match: matches){
			if(match.getNewObj() == null){
				for(Match match2: matches){
					if(match2.getOldObj() == null){
						if(checkIfEquivalent(match.getOldObj(),match2.getNewObj())){
							Match fusedMatch = new Match(match.getOldObj(), match2.getNewObj());
							toAdd.add(fusedMatch);
							toRemove.add(match);
							toRemove.add(match2);
						}
					}
				}
			}
		}
		for(Match vertex: toRemove){
			matches.remove(vertex);
		}
		for(Match vertex: toAdd){
			matches.add(vertex);
		}
	}
	
	/**Checks, whether two Objects possess identical AttributeStates.
	 * @param oldObj
	 * @param newObj
	 * @return
	 */
	private boolean checkIfEquivalent(EObject oldObj, EObject newObj) {
		boolean equivalentElement = true;
		for(EObject oldContent: oldObj.eContents()){
			if(oldContent.eClass().getName().equals("AttributeState")){
				boolean equivalentAttribute = false;
				for(EObject newContent: newObj.eContents()){
					if(newContent.eClass().getName().equals("AttributeState")){
						AttributeState oldAttr = (AttributeState) oldContent;
						AttributeState newAttr = (AttributeState) newContent;
						if(oldAttr.getName().equals(newAttr.getName())){
							equivalentAttribute = true;
							if(oldAttr.getValue().equals(newAttr.getValue()) == false){
								equivalentElement = false;
							}
						}
					}
				}
				if(equivalentAttribute == false){
					equivalentElement = false;
					break;
				}		
			}
		}
		return equivalentElement;
	}
}


