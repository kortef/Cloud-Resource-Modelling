package de.ugoe.cs.oco.tosca.yamlparser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xml.type.internal.QName;

import de.ugoe.cs.oco.tosca.DerivedFromType2;
import de.ugoe.cs.oco.tosca.InterfacesType;
import de.ugoe.cs.oco.tosca.TInterface;
import de.ugoe.cs.oco.tosca.TNodeType;
import de.ugoe.cs.oco.tosca.ToscaFactory;

/**
 * @author fglaser
 *
 */
public class NodeTypeParser extends Parser {
	
	@Override
	public Object parse(Map<String, ?> inputMap) throws ParseException {
		List<TNodeType> resultList = new ArrayList<>();
		for (Map.Entry<String, ?> entry: inputMap.entrySet()){
			TNodeType type = ToscaFactory.eINSTANCE.createTNodeType();
			type.setName(entry.getKey());
			for (Map.Entry<String, ?> innerentry: ((Map<String, ?>)entry.getValue()).entrySet()){
				String key = innerentry.getKey();
				switch (key){
					case "derived_from":
						DerivedFromType2 parent = ToscaFactory.eINSTANCE.createDerivedFromType2();
						parent.setTypeRef(new QName((String) innerentry.getValue()));
						type.setDerivedFrom(parent);
						break;
					case "version":
						break;
					case "description":
						break;
					case "properties":
						break;
					case "requirements":
						break;
					case "capabilities":
						break;
					case "interfaces":
						List<TInterface> interfaceList = (List<TInterface>) 
						new InterfaceParser().parse((Map<String, ?>) innerentry.getValue());
						InterfacesType interfacesType = ToscaFactory.eINSTANCE.createInterfacesType();
						interfacesType.getInterface().addAll(interfaceList);
						type.setInterfaces(interfacesType);	
						break;
					case "artifacts":
						break;
					default:
						throw new ParseException("Unsupported key " + innerentry.getKey() + " read.");
				}
			}
			resultList.add(type);
		}
		return resultList;
		
	}	

	@Override
	public Object parse(List<?> inputArray) throws ParseException {
		throw new ParseException("Parser" + this.getClass().getName() + " does not support parsing Arrays.");
	}
	
}
