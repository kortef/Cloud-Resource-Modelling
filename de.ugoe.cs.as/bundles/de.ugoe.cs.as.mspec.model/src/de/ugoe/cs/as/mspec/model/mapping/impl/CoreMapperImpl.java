/**
 */
package de.ugoe.cs.as.mspec.model.mapping.impl;



import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.ugoe.cs.as.mspec.model.mapping.CoreMapper;
import de.ugoe.cs.as.mspec.model.mapping.MappingFactory;
import de.ugoe.cs.as.mspec.model.mapping.MappingPackage;
import de.ugoe.cs.as.mspec.model.mapping.Parameter;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core Mapper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.as.mspec.model.mapping.impl.CoreMapperImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoreMapperImpl extends ExpressionImpl implements CoreMapper {
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
	protected CoreMapperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.CORE_MAPPER;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<Parameter>(Parameter.class, this, MappingPackage.CORE_MAPPER__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * @generated NOT
	 */
	public Parameter map(EList<Parameter> parameters){
		Parameter flavorParam = parameters.get(0);
		Parameter output = MappingFactory.eINSTANCE.createSourceParameter();
		output.setName("cores");
		switch (flavorParam.getValue()){
		case "ce8c33af-0cd5-4aac-b6f3-fcde58c4b262":
			output.setValue("4");
			break;
		case "9ed5ac24-d1e7-4665-9c22-318561733f42":
			output.setValue("2");
			break;
		case "a6d239e1-4082-4044-9de9-474bee2152bb":
			output.setValue("1");
			break;
		default:
			output.setValue("4");
		}
		
		return output;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.CORE_MAPPER__PARAMETERS:
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
			case MappingPackage.CORE_MAPPER__PARAMETERS:
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
			case MappingPackage.CORE_MAPPER__PARAMETERS:
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
			case MappingPackage.CORE_MAPPER__PARAMETERS:
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
			case MappingPackage.CORE_MAPPER___MAP__ELIST:
				return map((EList<Parameter>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
	
	
	

} //CoreMapperImpl
