/**
 */
package de.ugoe.cs.oco.mappingdsl.model.mapping.impl;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import de.ugoe.cs.oco.mappingdsl.model.mapping.FlavorMapper;
import de.ugoe.cs.oco.mappingdsl.model.mapping.MappingFactory;
import de.ugoe.cs.oco.mappingdsl.model.mapping.MappingPackage;
import de.ugoe.cs.oco.mappingdsl.model.mapping.Parameter;
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
 *   <li>{@link de.ugoe.cs.oco.mappingdsl.model.mapping.impl.FlavorMapperImpl#getParameters <em>Parameters</em>}</li>
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
		Parameter coresParam = parameters.get(0);
		Parameter output = MappingFactory.eINSTANCE.createSourceParameter();
		output.setName("flavor");
		
		int cores = Integer.parseInt(coresParam.getValue());
		
		if (cores < 2){
			output.setValue("2");
		} else if (cores == 2){
			output.setValue("3");
		} else {
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
