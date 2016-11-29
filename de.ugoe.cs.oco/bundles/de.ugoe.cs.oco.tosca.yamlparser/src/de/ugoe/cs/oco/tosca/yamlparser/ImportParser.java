/**
 * 
 */
package de.ugoe.cs.oco.tosca.yamlparser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;

import de.ugoe.cs.oco.tosca.TImport;
import de.ugoe.cs.oco.tosca.ToscaFactory;

/**
 * @author fglaser
 *
 */
public class ImportParser extends Parser{

	/* (non-Javadoc)
	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.Map, org.eclipse.emf.ecore.EObject)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object parse(Map<String, ?> input) throws ParseException {
		//ServiceTemplate template = (ServiceTemplate) model;
		Map<String, ?> map = (Map<String, ?>) input;
		List<TImport> imports = new ArrayList<TImport>();
		ToscaFactory factory = ToscaFactory.eINSTANCE;
		for (Entry<String, ?> entry: map.entrySet()){
			TImport imp = factory.createTImport();
			
			imp.setNamespace(entry.getKey());
			
			// parse single-line grammar
			if (entry.getValue() instanceof String){
				imp.setLocation(entry.getValue().toString());
			}
			// parse multi-line grammar
			else if (entry.getValue() instanceof Map<?,?>){
				Map<String, ?> innermap = (Map<String, ?>) entry.getValue();
				String content;
				if ((content = (String) innermap.get("file")) != null){
					imp.setLocation(content);
				}
				if ((content = (String) innermap.get("repository")) != null){
					//imp.setRepository(TemplateUtil.getRepositoryByName(content, template));
				}
				if ((content = (String) innermap.get("namespace_uri")) != null){
					
				}
				if ((content = (String) innermap.get("namespace_prefix")) != null){
					
				}
			}
			imports.add(imp);
		}
		return imports;
	}

	/* (non-Javadoc)
	 * @see de.ugoe.swe.simpaas.tosca.parser.Parser#parse(java.util.List, org.eclipse.emf.ecore.EObject)
	 */
	
	@Override
	public List<TImport> parse(List<?> input) throws ParseException {
		List<TImport> imports = new ArrayList<TImport>();
		for (Object object: input){
			imports.addAll((List<TImport>)this.parse((Map<String, ?>) object));
		}
		return imports;
	}

}
