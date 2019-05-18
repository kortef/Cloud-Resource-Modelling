/**
 */
package de.ugoe.cs.as.tosca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ugoe.cs.as.tosca.CapabilityDefinitionsType1;
import de.ugoe.cs.as.tosca.TCapabilityDefinition;
import de.ugoe.cs.as.tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Definitions Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.as.tosca.impl.CapabilityDefinitionsType1Impl#getCapabilityDefinition <em>Capability Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityDefinitionsType1Impl extends MinimalEObjectImpl.Container implements CapabilityDefinitionsType1 {
	/**
	 * The cached value of the '{@link #getCapabilityDefinition() <em>Capability Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<TCapabilityDefinition> capabilityDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityDefinitionsType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.CAPABILITY_DEFINITIONS_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCapabilityDefinition> getCapabilityDefinition() {
		if (capabilityDefinition == null) {
			capabilityDefinition = new EObjectContainmentEList<TCapabilityDefinition>(TCapabilityDefinition.class, this, ToscaPackage.CAPABILITY_DEFINITIONS_TYPE1__CAPABILITY_DEFINITION);
		}
		return capabilityDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.CAPABILITY_DEFINITIONS_TYPE1__CAPABILITY_DEFINITION:
				return ((InternalEList<?>)getCapabilityDefinition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToscaPackage.CAPABILITY_DEFINITIONS_TYPE1__CAPABILITY_DEFINITION:
				return getCapabilityDefinition();
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
			case ToscaPackage.CAPABILITY_DEFINITIONS_TYPE1__CAPABILITY_DEFINITION:
				getCapabilityDefinition().clear();
				getCapabilityDefinition().addAll((Collection<? extends TCapabilityDefinition>)newValue);
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
			case ToscaPackage.CAPABILITY_DEFINITIONS_TYPE1__CAPABILITY_DEFINITION:
				getCapabilityDefinition().clear();
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
			case ToscaPackage.CAPABILITY_DEFINITIONS_TYPE1__CAPABILITY_DEFINITION:
				return capabilityDefinition != null && !capabilityDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityDefinitionsType1Impl
