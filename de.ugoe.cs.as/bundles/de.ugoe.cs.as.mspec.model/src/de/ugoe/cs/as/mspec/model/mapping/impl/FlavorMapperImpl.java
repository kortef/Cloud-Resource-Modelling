/**
 */
package de.ugoe.cs.as.mspec.model.mapping.impl;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.ugoe.cs.as.mspec.model.mapping.FlavorMapper;
import de.ugoe.cs.as.mspec.model.mapping.MappingFactory;
import de.ugoe.cs.as.mspec.model.mapping.MappingPackage;
import de.ugoe.cs.as.mspec.model.mapping.Parameter;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flavor Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.as.mspec.model.mapping.impl.FlavorMapperImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlavorMapperImpl extends ExpressionImpl implements FlavorMapper {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlavorMapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.FLAVOR_MAPPER;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<Parameter>(Parameter.class, this, MappingPackage.FLAVOR_MAPPER__PARAMETERS);
		}
		return parameters;
	}

	@Override
	/**
	 * @generated NOT
	 */
	public Parameter map(EList<Parameter> parameters){
		Parameter param = parameters.get(0);
		Parameter output = MappingFactory.eINSTANCE.createSourceParameter();
		
		output.setName("flavor");
		int cores = Integer.parseInt(param.getValue());
		
		if (cores < 2){
			output.setValue("a6d239e1-4082-4044-9de9-474bee2152bb");
		} else if (cores == 2){
			output.setValue("9ed5ac24-d1e7-4665-9c22-318561733f42");	
		} else if (cores <= 4){
			output.setValue("ce8c33af-0cd5-4aac-b6f3-fcde58c4b262");
		} else {
			output.setValue("ce8c33af-0cd5-4aac-b6f3-fcde58c4b262");
		}
		return output;
	
		
//		// used for taking memory as input parameter
//		int memory = Integer.parseInt(param.getValue());
//		if (memory <= 1024){
//			output.setValue("41598b12-2d7d-4ffe-b3c1-0f52e68fa1ea");
//		} else if (memory <= 2048){
//			output.setValue("2a665c12-e4c5-41fe-b16e-2aec31c799eb");
//		} else if (memory <= 4096){
//			output.setValue("32ef77d0-5d26-46f5-9ea3-f805a7a05af6");
//		} else if (memory <= 6144){
//			output.setValue("d1f5a7a6-0fbe-4146-87fe-1e9441462833");
//		} else if (memory <= 8192){
//			output.setValue("cc5d21d7-fc0e-451d-884b-aba0efac9c33");
//		} else if (memory <= 10240){
//			output.setValue("9961ccdf-2ee2-42d1-ac6d-b45318212cad");
//		}
//		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.FLAVOR_MAPPER__PARAMETERS:
				return getParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MappingPackage.FLAVOR_MAPPER__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MappingPackage.FLAVOR_MAPPER__PARAMETERS:
				getParameters().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MappingPackage.FLAVOR_MAPPER__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MappingPackage.FLAVOR_MAPPER___MAP__ELIST:
				return map((EList<Parameter>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //FlavorMapperImpl
