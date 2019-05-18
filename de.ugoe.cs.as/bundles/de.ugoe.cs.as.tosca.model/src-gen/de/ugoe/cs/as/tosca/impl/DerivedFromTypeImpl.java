/**
 */
package de.ugoe.cs.as.tosca.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.ugoe.cs.as.tosca.DerivedFromType;
import de.ugoe.cs.as.tosca.ToscaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived From Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.as.tosca.impl.DerivedFromTypeImpl#getNodeTypeImplementationRef <em>Node Type Implementation Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivedFromTypeImpl extends MinimalEObjectImpl.Container implements DerivedFromType {
	/**
	 * The default value of the '{@link #getNodeTypeImplementationRef() <em>Node Type Implementation Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeTypeImplementationRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName NODE_TYPE_IMPLEMENTATION_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeTypeImplementationRef() <em>Node Type Implementation Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeTypeImplementationRef()
	 * @generated
	 * @ordered
	 */
	protected QName nodeTypeImplementationRef = NODE_TYPE_IMPLEMENTATION_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedFromTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.DERIVED_FROM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getNodeTypeImplementationRef() {
		return nodeTypeImplementationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeTypeImplementationRef(QName newNodeTypeImplementationRef) {
		QName oldNodeTypeImplementationRef = nodeTypeImplementationRef;
		nodeTypeImplementationRef = newNodeTypeImplementationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.DERIVED_FROM_TYPE__NODE_TYPE_IMPLEMENTATION_REF, oldNodeTypeImplementationRef, nodeTypeImplementationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToscaPackage.DERIVED_FROM_TYPE__NODE_TYPE_IMPLEMENTATION_REF:
				return getNodeTypeImplementationRef();
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
			case ToscaPackage.DERIVED_FROM_TYPE__NODE_TYPE_IMPLEMENTATION_REF:
				setNodeTypeImplementationRef((QName)newValue);
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
			case ToscaPackage.DERIVED_FROM_TYPE__NODE_TYPE_IMPLEMENTATION_REF:
				setNodeTypeImplementationRef(NODE_TYPE_IMPLEMENTATION_REF_EDEFAULT);
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
			case ToscaPackage.DERIVED_FROM_TYPE__NODE_TYPE_IMPLEMENTATION_REF:
				return NODE_TYPE_IMPLEMENTATION_REF_EDEFAULT == null ? nodeTypeImplementationRef != null : !NODE_TYPE_IMPLEMENTATION_REF_EDEFAULT.equals(nodeTypeImplementationRef);
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
		result.append(" (nodeTypeImplementationRef: ");
		result.append(nodeTypeImplementationRef);
		result.append(')');
		return result.toString();
	}

} //DerivedFromTypeImpl
