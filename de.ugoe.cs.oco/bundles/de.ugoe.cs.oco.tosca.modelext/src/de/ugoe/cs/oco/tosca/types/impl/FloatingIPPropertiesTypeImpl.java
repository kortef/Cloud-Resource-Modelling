/**
 */
package de.ugoe.cs.oco.tosca.types.impl;

import de.ugoe.cs.oco.tosca.types.FloatingIPPropertiesType;
import de.ugoe.cs.oco.tosca.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Floating IP Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.impl.FloatingIPPropertiesTypeImpl#getFloatingNetworkName <em>Floating Network Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FloatingIPPropertiesTypeImpl extends MinimalEObjectImpl.Container implements FloatingIPPropertiesType {
	/**
	 * The default value of the '{@link #getFloatingNetworkName() <em>Floating Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatingNetworkName()
	 * @generated
	 * @ordered
	 */
	protected static final String FLOATING_NETWORK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFloatingNetworkName() <em>Floating Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatingNetworkName()
	 * @generated
	 * @ordered
	 */
	protected String floatingNetworkName = FLOATING_NETWORK_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatingIPPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.FLOATING_IP_PROPERTIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFloatingNetworkName() {
		return floatingNetworkName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatingNetworkName(String newFloatingNetworkName) {
		String oldFloatingNetworkName = floatingNetworkName;
		floatingNetworkName = newFloatingNetworkName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.FLOATING_IP_PROPERTIES_TYPE__FLOATING_NETWORK_NAME, oldFloatingNetworkName, floatingNetworkName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.FLOATING_IP_PROPERTIES_TYPE__FLOATING_NETWORK_NAME:
				return getFloatingNetworkName();
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
			case TypesPackage.FLOATING_IP_PROPERTIES_TYPE__FLOATING_NETWORK_NAME:
				setFloatingNetworkName((String)newValue);
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
			case TypesPackage.FLOATING_IP_PROPERTIES_TYPE__FLOATING_NETWORK_NAME:
				setFloatingNetworkName(FLOATING_NETWORK_NAME_EDEFAULT);
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
			case TypesPackage.FLOATING_IP_PROPERTIES_TYPE__FLOATING_NETWORK_NAME:
				return FLOATING_NETWORK_NAME_EDEFAULT == null ? floatingNetworkName != null : !FLOATING_NETWORK_NAME_EDEFAULT.equals(floatingNetworkName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (floatingNetworkName: ");
		result.append(floatingNetworkName);
		result.append(')');
		return result.toString();
	}

} //FloatingIPPropertiesTypeImpl
