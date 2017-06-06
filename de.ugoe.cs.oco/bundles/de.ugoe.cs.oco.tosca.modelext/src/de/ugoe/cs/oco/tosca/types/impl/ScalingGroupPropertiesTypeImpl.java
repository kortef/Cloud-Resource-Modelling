/**
 */
package de.ugoe.cs.oco.tosca.types.impl;

import de.ugoe.cs.oco.tosca.types.ScalingGroupPropertiesType;
import de.ugoe.cs.oco.tosca.types.ScalingPropertiesType;
import de.ugoe.cs.oco.tosca.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scaling Group Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.impl.ScalingGroupPropertiesTypeImpl#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScalingGroupPropertiesTypeImpl extends MinimalEObjectImpl.Container implements ScalingGroupPropertiesType {
	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected ScalingPropertiesType scale;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalingGroupPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.SCALING_GROUP_PROPERTIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingPropertiesType getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScale(ScalingPropertiesType newScale, NotificationChain msgs) {
		ScalingPropertiesType oldScale = scale;
		scale = newScale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.SCALING_GROUP_PROPERTIES_TYPE__SCALE, oldScale, newScale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(ScalingPropertiesType newScale) {
		if (newScale != scale) {
			NotificationChain msgs = null;
			if (scale != null)
				msgs = ((InternalEObject)scale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SCALING_GROUP_PROPERTIES_TYPE__SCALE, null, msgs);
			if (newScale != null)
				msgs = ((InternalEObject)newScale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.SCALING_GROUP_PROPERTIES_TYPE__SCALE, null, msgs);
			msgs = basicSetScale(newScale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SCALING_GROUP_PROPERTIES_TYPE__SCALE, newScale, newScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.SCALING_GROUP_PROPERTIES_TYPE__SCALE:
				return basicSetScale(null, msgs);
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
			case TypesPackage.SCALING_GROUP_PROPERTIES_TYPE__SCALE:
				return getScale();
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
			case TypesPackage.SCALING_GROUP_PROPERTIES_TYPE__SCALE:
				setScale((ScalingPropertiesType)newValue);
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
			case TypesPackage.SCALING_GROUP_PROPERTIES_TYPE__SCALE:
				setScale((ScalingPropertiesType)null);
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
			case TypesPackage.SCALING_GROUP_PROPERTIES_TYPE__SCALE:
				return scale != null;
		}
		return super.eIsSet(featureID);
	}

} //ScalingGroupPropertiesTypeImpl
