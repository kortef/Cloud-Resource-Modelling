package de.ugoe.cs.oco.occi2deployment.comparator;

import java.nio.file.Path;
import java.util.List;

import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.eobject.IdentifierEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl;
import org.eclipse.emf.compare.scope.*;
import org.eclipse.emf.compare.scope.FilterComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.occiware.clouddesigner.occi.Entity;
import org.occiware.clouddesigner.occi.Resource;

import com.google.common.base.Function;

import de.ugoe.cs.oco.occi2deployment.ModelUtility;

/**A comparator that utilizes the EmfCompare framework.
 * Only works on Attribute level.
 * @author rockodell
 *
 */
public class EmfCompareComparator extends AbsComparator {
	
	public EmfCompareComparator(Path model1, Path model2) {
		compare(model1, model2);
	}

	Function<EObject, String> idFunction = new Function<EObject, String>() {
		public String apply(EObject input) {
			if (input instanceof Resource) {
				return ((Resource)input).getTitle();
			}
			// a null return here tells the match engine to fall back to the other matchers
			return null;
		}
	};
	
	public void compare(Path model1, Path model2) {
		ResourceSet resourceSet1 = ModelUtility.loadOCCIinResourceSet(model1);
		ResourceSet resourceSet2 = ModelUtility.loadOCCIinResourceSet(model2);
		
		//Comparison comparison = IgnoreIdentifiers(resourceSet1, resourceSet2);
		//Comparison comparison = CustomIdentifiers(resourceSet1, resourceSet2);
		Comparison comparison = DefaultIdentifiers(resourceSet1, resourceSet2);
		
		List<Match> matches = comparison.getMatches();
		logMatches(matches);
		
		for(int i=0; i<matches.size();i++){
			if(matches.get(i).getLeft() == null){
				if(!(matches.get(i).getRight().eClass().getName().equals("Extension"))){
					investigateNewElement(matches.get(i), comparison);
				}
			}
			else if(matches.get(i).getRight() == null){
				if(!(matches.get(i).getLeft().eClass().getName().equals("Extension"))){
					investigateMissingElement(matches.get(i), comparison);
				}
			}
			else if(matches.get(i).getRight() != null && matches.get(i).getLeft() != null){
				if(!(matches.get(i).getRight().eClass().getName().equals("Extension")) ||
						!(matches.get(i).getLeft().eClass().getName().equals("Extension"))){
					investigateOldElement(matches.get(i), comparison);
				}
			}
		}
	}

	private Comparison DefaultIdentifiers(ResourceSet resourceSet1, ResourceSet resourceSet2) {
		IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
		
		
		IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
		
		IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
	    matchEngineFactory.setRanking(20);
	    
	    IMatchEngine.Factory.Registry matchEngineRegistry = new MatchEngineFactoryRegistryImpl();
	    matchEngineRegistry.add(matchEngineFactory);
		EMFCompare comparator = EMFCompare.builder().setMatchEngineFactoryRegistry(matchEngineRegistry).build();

		// Compare the two models
		//IComparisonScope scope = new FilterComparisonScope(resourceSet1, resourceSet2, resourceSet1);
		IComparisonScope scope = new DefaultComparisonScope(resourceSet1, resourceSet2, resourceSet1);

		return comparator.compare(scope);
	}

	@SuppressWarnings("unused")
	private Comparison CustomIdentifiers(ResourceSet resourceSet1, ResourceSet resourceSet2) {
		Comparison comparison;
		// Configure EMF Compare
				IEObjectMatcher fallBackMatcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.WHEN_AVAILABLE);
				IEObjectMatcher customIDMatcher = new IdentifierEObjectMatcher(fallBackMatcher, idFunction);
				 
				IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
				 
				IMatchEngine.Factory.Registry registry = MatchEngineFactoryRegistryImpl.createStandaloneInstance();
				// for OSGi (IDE, RCP) usage
				// IMatchEngine.Factory.Registry registry = EMFCompareRCPPlugin.getMatchEngineFactoryRegistry();
				final MatchEngineFactoryImpl matchEngineFactory = new MatchEngineFactoryImpl(customIDMatcher, comparisonFactory);
				matchEngineFactory.setRanking(20); // default engine ranking is 10, must be higher to override.
				registry.add(matchEngineFactory);
				IComparisonScope scope = new FilterComparisonScope(resourceSet1, resourceSet2, resourceSet1);
				comparison = EMFCompare.builder().setMatchEngineFactoryRegistry(registry).build().compare(scope);
		return comparison;
	}

	@SuppressWarnings("unused")
	private Comparison IgnoreIdentifiers(ResourceSet resourceSet1, ResourceSet resourceSet2) {
		Comparison comparison;
		IMatchEngine.Factory.Registry registry = MatchEngineFactoryRegistryImpl.createStandaloneInstance();
		// for OSGi (IDE, RCP) usage
		// IMatchEngine.Factory.Registry registry === EMFCompareRCPPlugin.getMatchEngineFactoryRegistry();
		final MatchEngineFactoryImpl matchEngineFactory = new MatchEngineFactoryImpl(UseIdentifiers.NEVER);
		matchEngineFactory.setRanking(20); // default engine ranking is 10, must be higher to override.
		registry.add(matchEngineFactory);
		IComparisonScope scope = new FilterComparisonScope(resourceSet1, resourceSet2, resourceSet1);
		return comparison = EMFCompare.builder().setMatchEngineFactoryRegistry(registry).build().compare(scope);
	}

	private void logMatches(List<Match> matches) {
		String matchMatrix = new String();
		matchMatrix += "\nMatch: OldModel , NewModel";
		for(int i=0; i<matches.size();i++){
			if(matches.get(i).getLeft() == null){
				if(!(matches.get(i).getRight().eClass().getName().equals("Extension"))){
					matchMatrix += "\nnull , " + ((Entity)matches.get(i).getRight()).getTitle();
				}
			}
			else if(matches.get(i).getRight() == null){
				if(!(matches.get(i).getLeft().eClass().getName().equals("Extension"))){
					matchMatrix += "\n" + ((Entity)matches.get(i).getLeft()).getTitle() + " , null";
				}
			}
			else if(matches.get(i).getRight() != null && matches.get(i).getLeft() != null){
				if(!(matches.get(i).getRight().eClass().getName().equals("Extension")) ||
						!(matches.get(i).getLeft().eClass().getName().equals("Extension"))){
					matchMatrix += "\n" + ((Entity)matches.get(i).getLeft()).getTitle()
							+ " , "
							+((Entity)matches.get(i).getRight()).getTitle();
				}
			}
		}
		log.info(matchMatrix);
	}

	private void investigateOldElement(Match match, Comparison comparison) {
		Boolean adapted = false;
		if(match.getRight().eContents() != null){	
			for(int k=0; k<match.getRight().eContents().size(); k++){
				if(comparison.getDifferences(match.getRight().eContents().get(k)).isEmpty() == false){
					adapted= true;
					adaptedElements.add(match.getRight());
					logAdapted(match.getRight());
					break;
				}
			}
		}
		if(adapted == false){
			oldElements.add(match.getLeft());
			logOld(match.getLeft());
		}	
	}

	private void investigateMissingElement(Match match, Comparison comparison) {
		missingElements.add(match.getLeft());
		logMissing(match.getLeft());
		if(match.getLeft().eContents().isEmpty() == false){
			for(int k=0; k<match.getLeft().eContents().size(); k++){
				if(comparison.getDifferences(match.getLeft().eContents().get(k)).isEmpty() == false){
					if(match.getLeft().eContents().get(k).eClass().getName().equals("Link")){
						newElements.add(match.getLeft().eContents().get(k));
						logMissing(match.getLeft().eContents().get(k));
					}
				}
			}
		}	
	}

	private void investigateNewElement(Match match, Comparison comparison) {
		newElements.add(match.getRight());
		logNew(match.getRight());
		if(match.getRight().eContents().isEmpty() == false){
			for(int k=0; k<match.getRight().eContents().size(); k++){
				if(comparison.getDifferences(match.getRight().eContents().get(k)).isEmpty() == false){
					if(match.getRight().eContents().get(k).eClass().getName().equals("Link")){
						newElements.add(match.getRight().eContents().get(k));
						logNew(match.getRight().eContents().get(k));
					}
				}
			}
		}
	}
}
