package de.ugoe.cs.as.evaluator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.ugoe.cs.as.mspec.model.mapping.BinaryExpression;
import de.ugoe.cs.as.mspec.model.mapping.BinaryExpressionOperatorType;
import de.ugoe.cs.as.mspec.model.mapping.Expression;
import de.ugoe.cs.as.mspec.model.mapping.Extractor;
import de.ugoe.cs.as.mspec.model.mapping.Mapper;
import de.ugoe.cs.as.mspec.model.mapping.Mapping;
import de.ugoe.cs.as.mspec.model.mapping.MappingFactory;
import de.ugoe.cs.as.mspec.model.mapping.MappingModel;
import de.ugoe.cs.as.mspec.model.mapping.MappingPackage;
import de.ugoe.cs.as.mspec.model.mapping.Parameter;
import de.ugoe.cs.as.mspec.model.mapping.ParameterValueType;
import de.ugoe.cs.as.mspec.model.mapping.SourceParameter;
import de.ugoe.cs.as.mspec.model.mapping.TargetParameter;
import de.ugoe.cs.as.mspec.model.mapping.UnaryExpression;


public class Evaluator {
	MappingModel mappingModel = null;
	String domainModelPath = "";
	protected final static Logger LOGGER = Logger.getLogger(Evaluator.class.getName());
	
	public void load(String mappingFile){
		MappingPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("mapping", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createFileURI(mappingFile), true);
		mappingModel = (MappingModel) resource.getContents().get(0);
	}
	
	public List<Parameter> evaluate(String path){
		domainModelPath = path;
		domainModelPath = domainModelPath + "/";
		List<Parameter> parameters = new ArrayList<Parameter>();
		
		// first evaluate source parameters
		for (Mapping mapping: mappingModel.getMapping()){
			if (mapping.getTargetParameter() instanceof SourceParameter){
				String result = evaluate(mapping.getExpression()).getValue();
				mapping.getTargetParameter().setValue(result);
				if (mapping.getTargetParameter().getType() == ParameterValueType.INTEGER){
					double result_float = Double.parseDouble(result);
					int result_int = (int)Math.ceil(result_float);
					mapping.getTargetParameter().setValue(Integer.toString(result_int));
				}
			}
		}
		// then evaluate target parameters
		for (Mapping mapping: mappingModel.getMapping()){
			if (mapping.getTargetParameter() instanceof TargetParameter){
				LOGGER.info("Calculating parameter " + mapping.getTargetParameter().getName());
				String result = evaluate(mapping.getExpression()).getValue();
				mapping.getTargetParameter().setValue(result);
				if (mapping.getTargetParameter().getType() == ParameterValueType.INTEGER){
					double result_float = Double.parseDouble(result);
					int result_int = (int)Math.ceil(result_float);
					mapping.getTargetParameter().setValue(Integer.toString(result_int));
				}
				parameters.add(mapping.getTargetParameter());
			}
		}
		return parameters;
	}
	
	private Parameter evaluate(Expression e){
		
		if (e instanceof Parameter){
			return (Parameter) e;
		}
		
		if (e instanceof Mapper){
			Mapper m = (Mapper) e;
			LOGGER.info("Mapping with Mapper " + m.getClass().getName());
			Parameter parameter = m.map(m.getParameters());
			LOGGER.info("Got parameter: " + parameter.getName() + ": " + parameter.getValue());
			return parameter;
		}
		
		if (e instanceof Extractor){
			Extractor ex = (Extractor) e;
			LOGGER.info("Extracting with Extractor " + ex.getClass().getName());
			Parameter parameter = ex.extract(ex.getRecipe(), domainModelPath +  ex.getSource());
			LOGGER.info("Got parameter: " + parameter.getName() + ": " + parameter.getValue());
			return parameter; 
		}
		if (e instanceof UnaryExpression){
			UnaryExpression unary = (UnaryExpression) e;
			return evaluate(unary.getExpression());
		}
		if (e instanceof BinaryExpression){
			BinaryExpression binary = (BinaryExpression) e;
			BinaryExpressionOperatorType op = binary.getOperator();
			Parameter part1 = evaluate(binary.getPart1());
			Parameter part2 = evaluate(binary.getPart2());
			Parameter returnValue = MappingFactory.eINSTANCE.createSourceParameter();
			
			switch (op){
			case DIVIDE:
				returnValue.setValue(String.valueOf(
						Float.parseFloat(part1.getValue()) / Float.parseFloat(part2.getValue())));
				break;
			case MULTIPLY:
				returnValue.setValue(String.valueOf(
						Float.parseFloat(part1.getValue()) * Float.parseFloat(part2.getValue())));
				break;
			case MINUS:
				returnValue.setValue(String.valueOf(
						Float.parseFloat(part1.getValue()) - Float.parseFloat(part2.getValue())));
				break;
			case PLUS:
				returnValue.setValue(String.valueOf(
						Float.parseFloat(part1.getValue()) + Float.parseFloat(part2.getValue())));
				break;
			}
			return returnValue;
		}
		return null;
	}
				
}
