/**
 */
package de.ugoe.cs.oco.tosca.impl;

import de.ugoe.cs.oco.tosca.DerivedFromType2;
import de.ugoe.cs.oco.tosca.TEntityType;
import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.util.ToscaModelUtil;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived From Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.DerivedFromType2Impl#getTypeRef <em>Type Ref</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.DerivedFromType2Impl#getReferencedEntityType <em>Referenced Entity Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivedFromType2Impl extends MinimalEObjectImpl.Container implements DerivedFromType2 {
	/**
	 * The default value of the '{@link #getTypeRef() <em>Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName TYPE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeRef() <em>Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRef()
	 * @generated
	 * @ordered
	 */
	protected QName typeRef = TYPE_REF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencedEntityType() <em>Referenced Entity Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedEntityType()
	 * @generated
	 * @ordered
	 */
	protected TEntityType referencedEntityType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedFromType2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.DERIVED_FROM_TYPE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getTypeRef() {
		return typeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeRef(QName newTypeRef) {
		QName oldTypeRef = typeRef;
		typeRef = newTypeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.DERIVED_FROM_TYPE2__TYPE_REF, oldTypeRef, typeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TEntityType getReferencedEntityType() {
		if (referencedEntityType == null) {
			if (getTypeRef() != null) {
				referencedEntityType = ToscaModelUtil.resolveType(this, getTypeRef());
			}
		}
		
		
		if (referencedEntityType != null && referencedEntityType.eIsProxy()) {
			InternalEObject oldReferencedEntityType = (InternalEObject)referencedEntityType;
			referencedEntityType = (TEntityType)eResolveProxy(oldReferencedEntityType);
			if (referencedEntityType != oldReferencedEntityType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToscaPackage.DERIVED_FROM_TYPE2__REFERENCED_ENTITY_TYPE, oldReferencedEntityType, referencedEntityType));
			}
		}
		return referencedEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEntityType basicGetReferencedEntityType() {
		return referencedEntityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setReferencedEntityType(TEntityType newReferencedEntityType) {
		setTypeRef(ToscaModelUtil.getQualifiedName(newReferencedEntityType));
		
		TEntityType oldReferencedEntityType = referencedEntityType;
		referencedEntityType = newReferencedEntityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.DERIVED_FROM_TYPE2__REFERENCED_ENTITY_TYPE, oldReferencedEntityType, referencedEntityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToscaPackage.DERIVED_FROM_TYPE2__TYPE_REF:
				return getTypeRef();
			case ToscaPackage.DERIVED_FROM_TYPE2__REFERENCED_ENTITY_TYPE:
				if (resolve) return getReferencedEntityType();
				return basicGetReferencedEntityType();
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
			case ToscaPackage.DERIVED_FROM_TYPE2__TYPE_REF:
				setTypeRef((QName)newValue);
				return;
			case ToscaPackage.DERIVED_FROM_TYPE2__REFERENCED_ENTITY_TYPE:
				setReferencedEntityType((TEntityType)newValue);
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
			case ToscaPackage.DERIVED_FROM_TYPE2__TYPE_REF:
				setTypeRef(TYPE_REF_EDEFAULT);
				return;
			case ToscaPackage.DERIVED_FROM_TYPE2__REFERENCED_ENTITY_TYPE:
				setReferencedEntityType((TEntityType)null);
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
			case ToscaPackage.DERIVED_FROM_TYPE2__TYPE_REF:
				return TYPE_REF_EDEFAULT == null ? typeRef != null : !TYPE_REF_EDEFAULT.equals(typeRef);
			case ToscaPackage.DERIVED_FROM_TYPE2__REFERENCED_ENTITY_TYPE:
				return referencedEntityType != null;
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
		result.append(" (typeRef: ");
		result.append(typeRef);
		result.append(')');
		return result.toString();
	}

} //DerivedFromType2Impl
