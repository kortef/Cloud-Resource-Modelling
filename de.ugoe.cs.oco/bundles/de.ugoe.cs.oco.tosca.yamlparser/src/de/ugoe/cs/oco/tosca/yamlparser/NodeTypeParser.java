package de.ugoe.cs.oco.tosca.yamlparser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.internal.QName;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDFactory;
import org.eclipse.xsd.XSDPackage;
import org.eclipse.xsd.XSDSchema;

import de.ugoe.cs.oco.tosca.DefinitionsType;
import de.ugoe.cs.oco.tosca.DerivedFromType2;
import de.ugoe.cs.oco.tosca.InterfacesType;
import de.ugoe.cs.oco.tosca.PropertiesDefinitionType;
import de.ugoe.cs.oco.tosca.TInterface;
import de.ugoe.cs.oco.tosca.TNodeType;
import de.ugoe.cs.oco.tosca.TServiceTemplate;
import de.ugoe.cs.oco.tosca.ToscaFactory;
import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.TypesType;

/**
 * @author fglaser
 *
 */
public class NodeTypeParser extends Parser {
	
	@Override
	public Object parse(Map<String, ?> inputMap, Parser containingParser) throws ParseException {
		TOSCAYamlTemplateParser parser = (TOSCAYamlTemplateParser) containingParser;
		List<TNodeType> resultList = new ArrayList<>();
		for (Map.Entry<String, ?> entry: inputMap.entrySet()){
			TNodeType type = ToscaFactory.eINSTANCE.createTNodeType();
			type.setName(entry.getKey());
			LOGGER.info("Parsing NodeType " + type.getName() + ".");
			for (Map.Entry<String, ?> innerentry: ((Map<String, ?>) entry.getValue()).entrySet()){
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
						LOGGER.info("Found Property definition.");	
						XSDSchema schema = parser.getPropertyTypesSchema();
						XSDComplexTypeDefinition propertiesDefinitionXSD =  new PropertyParser().parse((Map<String, ?>) 
								innerentry.getValue(), schema);	
						propertiesDefinitionXSD.setName(type.getName() + "Properties");
						break;
					case "requirements":
						break;
					case "capabilities":
						break;
					case "attributes":
						break;
					case "interfaces":
						List<TInterface> interfaceList = (List<TInterface>) 
						new InterfaceParser().parse((Map<String, ?>) innerentry.getValue(), null);
						InterfacesType interfacesType = ToscaFactory.eINSTANCE.createInterfacesType();
						interfacesType.getInterface().addAll(interfaceList);
						type.setInterfaces(interfacesType);	
						break;
					case "artifacts":
						break;
					case "abstract":
						break;
					case "metadata":
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
