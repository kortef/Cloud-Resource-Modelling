/**
 */
package de.ugoe.cs.oco.tosca.impl;

import de.ugoe.cs.oco.tosca.CapabilityDefinitionsType;
import de.ugoe.cs.oco.tosca.RequirementDefinitionsType;
import de.ugoe.cs.oco.tosca.TGroupType;
import de.ugoe.cs.oco.tosca.ToscaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TGroup Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TGroupTypeImpl#getRequirementDefinitions <em>Requirement Definitions</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TGroupTypeImpl#getCapabilityDefinitions <em>Capability Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TGroupTypeImpl extends TEntityTypeImpl implements TGroupType {
	/**
	 * The cached value of the '{@link #getRequirementDefinitions() <em>Requirement Definitions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementDefinitions()
	 * @generated
	 * @ordered
	 */
	protected RequirementDefinitionsType requirementDefinitions;
	/**
	 * The cached value of the '{@link #getCapabilityDefinitions() <em>Capability Definitions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilityDefinitions()
	 * @generated
	 * @ordered
	 */
	protected CapabilityDefinitionsType capabilityDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TGROUP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementDefinitionsType getRequirementDefinitions() {
		if (requirementDefinitions != null && requirementDefinitions.eIsProxy()) {
			InternalEObject oldRequirementDefinitions = (InternalEObject)requirementDefinitions;
			requirementDefinitions = (RequirementDefinitionsType)eResolveProxy(oldRequirementDefinitions);
			if (requirementDefinitions != oldRequirementDefinitions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToscaPackage.TGROUP_TYPE__REQUIREMENT_DEFINITIONS, oldRequirementDefinitions, requirementDefinitions));
			}
		}
		return requirementDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementDefinitionsType basicGetRequirementDefinitions() {
		return requirementDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirementDefinitions(RequirementDefinitionsType newRequirementDefinitions) {
		RequirementDefinitionsType oldRequirementDefinitions = requirementDefinitions;
		requirementDefinitions = newRequirementDefinitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TGROUP_TYPE__REQUIREMENT_DEFINITIONS, oldRequirementDefinitions, requirementDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityDefinitionsType getCapabilityDefinitions() {
		if (capabilityDefinitions != null && capabilityDefinitions.eIsProxy()) {
			InternalEObject oldCapabilityDefinitions = (InternalEObject)capabilityDefinitions;
			capabilityDefinitions = (CapabilityDefinitionsType)eResolveProxy(oldCapabilityDefinitions);
			if (capabilityDefinitions != oldCapabilityDefinitions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToscaPackage.TGROUP_TYPE__CAPABILITY_DEFINITIONS, oldCapabilityDefinitions, capabilityDefinitions));
			}
		}
		return capabilityDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityDefinitionsType basicGetCapabilityDefinitions() {
		return capabilityDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapabilityDefinitions(CapabilityDefinitionsType newCapabilityDefinitions) {
		CapabilityDefinitionsType oldCapabilityDefinitions = capabilityDefinitions;
		capabilityDefinitions = newCapabilityDefinitions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TGROUP_TYPE__CAPABILITY_DEFINITIONS, oldCapabilityDefinitions, capabilityDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToscaPackage.TGROUP_TYPE__REQUIREMENT_DEFINITIONS:
				if (resolve) return getRequirementDefinitions();
				return basicGetRequirementDefinitions();
			case ToscaPackage.TGROUP_TYPE__CAPABILITY_DEFINITIONS:
				if (resolve) return getCapabilityDefinitions();
				return basicGetCapabilityDefinitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ToscaPackage.TGROUP_TYPE__REQUIREMENT_DEFINITIONS:
				setRequirementDefinitions((RequirementDefinitionsType)newValue);
				return;
			case ToscaPackage.TGROUP_TYPE__CAPABILITY_DEFINITIONS:
				setCapabilityDefinitions((CapabilityDefinitionsType)newValue);
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
			case ToscaPackage.TGROUP_TYPE__REQUIREMENT_DEFINITIONS:
				setRequirementDefinitions((RequirementDefinitionsType)null);
				return;
			case ToscaPackage.TGROUP_TYPE__CAPABILITY_DEFINITIONS:
				setCapabilityDefinitions((CapabilityDefinitionsType)null);
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
			case ToscaPackage.TGROUP_TYPE__REQUIREMENT_DEFINITIONS:
				return requirementDefinitions != null;
			case ToscaPackage.TGROUP_TYPE__CAPABILITY_DEFINITIONS:
				return capabilityDefinitions != null;
		}
		return super.eIsSet(featureID);
	}

} //TGroupTypeImpl
