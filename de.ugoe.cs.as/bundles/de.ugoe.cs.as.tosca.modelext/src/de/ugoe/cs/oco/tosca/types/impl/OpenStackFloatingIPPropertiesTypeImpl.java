/**
 */
package de.ugoe.cs.oco.tosca.types.impl;

import de.ugoe.cs.oco.tosca.types.FloatingIPPropertiesType;
import de.ugoe.cs.oco.tosca.types.OpenStackFloatingIPPropertiesType;
import de.ugoe.cs.oco.tosca.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Stack Floating IP Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.impl.OpenStackFloatingIPPropertiesTypeImpl#getOpenstackConfig <em>Openstack Config</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.impl.OpenStackFloatingIPPropertiesTypeImpl#getFloatingip <em>Floatingip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpenStackFloatingIPPropertiesTypeImpl extends MinimalEObjectImpl.Container implements OpenStackFloatingIPPropertiesType {
	/**
	 * The default value of the '{@link #getOpenstackConfig() <em>Openstack Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenstackConfig()
	 * @generated
	 * @ordered
	 */
	protected static final String OPENSTACK_CONFIG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpenstackConfig() <em>Openstack Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenstackConfig()
	 * @generated
	 * @ordered
	 */
	protected String openstackConfig = OPENSTACK_CONFIG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFloatingip() <em>Floatingip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatingip()
	 * @generated
	 * @ordered
	 */
	protected FloatingIPPropertiesType floatingip;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenStackFloatingIPPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpenstackConfig() {
		return openstackConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenstackConfig(String newOpenstackConfig) {
		String oldOpenstackConfig = openstackConfig;
		openstackConfig = newOpenstackConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE__OPENSTACK_CONFIG, oldOpenstackConfig, openstackConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatingIPPropertiesType getFloatingip() {
		return floatingip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloatingip(FloatingIPPropertiesType newFloatingip, NotificationChain msgs) {
		FloatingIPPropertiesType oldFloatingip = floatingip;
		floatingip = newFloatingip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE__FLOATINGIP, oldFloatingip, newFloatingip);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatingip(FloatingIPPropertiesType newFloatingip) {
		if (newFloatingip != floatingip) {
			NotificationChain msgs = null;
			if (floatingip != null)
				msgs = ((InternalEObject)floatingip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE__FLOATINGIP, null, msgs);
			if (newFloatingip != null)
				msgs = ((InternalEObject)newFloatingip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE__FLOATINGIP, null, msgs);
			msgs = basicSetFloatingip(newFloatingip, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE__FLOATINGIP, newFloatingip, newFloatingip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE__FLOATINGIP:
				return basicSetFloatingip(null, msgs);
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
			case TypesPackage.OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE__OPENSTACK_CONFIG:
				return getOpenstackConfig();
			case TypesPackage.OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE__FLOATINGIP:
				return getFloatingip();
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
			case TypesPackage.OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE__OPENSTACK_CONFIG:
				setOpenstackConfig((String)newValue);
				return;
			case TypesPackage.OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE__FLOATINGIP:
				setFloatingip((FloatingIPPropertiesType)newValue);
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
			case TypesPackage.OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE__OPENSTACK_CONFIG:
				setOpenstackConfig(OPENSTACK_CONFIG_EDEFAULT);
				return;
			case TypesPackage.OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE__FLOATINGIP:
				setFloatingip((FloatingIPPropertiesType)null);
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
			case TypesPackage.OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE__OPENSTACK_CONFIG:
				return OPENSTACK_CONFIG_EDEFAULT == null ? openstackConfig != null : !OPENSTACK_CONFIG_EDEFAULT.equals(openstackConfig);
			case TypesPackage.OPEN_STACK_FLOATING_IP_PROPERTIES_TYPE__FLOATINGIP:
				return floatingip != null;
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
		result.append(" (openstackConfig: ");
		result.append(openstackConfig);
		result.append(')');
		return result.toString();
	}

} //OpenStackFloatingIPPropertiesTypeImpl
