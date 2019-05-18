/**
 */
package de.ugoe.cs.oco.tosca.impl;

import de.ugoe.cs.oco.tosca.TEntityTemplate;
import de.ugoe.cs.oco.tosca.TPropertyMapping;
import de.ugoe.cs.oco.tosca.ToscaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TProperty Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TPropertyMappingImpl#getTargetObjectRef <em>Target Object Ref</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TPropertyMappingImpl#getServiceTemplatePropertyRef <em>Service Template Property Ref</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TPropertyMappingImpl#getTargetPropertyRef <em>Target Property Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TPropertyMappingImpl extends MinimalEObjectImpl.Container implements TPropertyMapping {
	/**
	 * The cached value of the '{@link #getTargetObjectRef() <em>Target Object Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetObjectRef()
	 * @generated
	 * @ordered
	 */
	protected TEntityTemplate targetObjectRef;

	/**
	 * The default value of the '{@link #getServiceTemplatePropertyRef() <em>Service Template Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTemplatePropertyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_TEMPLATE_PROPERTY_REF_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getServiceTemplatePropertyRef() <em>Service Template Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceTemplatePropertyRef()
	 * @generated
	 * @ordered
	 */
	protected String serviceTemplatePropertyRef = SERVICE_TEMPLATE_PROPERTY_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetPropertyRef() <em>Target Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPropertyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_PROPERTY_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetPropertyRef() <em>Target Property Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPropertyRef()
	 * @generated
	 * @ordered
	 */
	protected String targetPropertyRef = TARGET_PROPERTY_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TPropertyMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TPROPERTY_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceTemplatePropertyRef() {
		return serviceTemplatePropertyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceTemplatePropertyRef(String newServiceTemplatePropertyRef) {
		String oldServiceTemplatePropertyRef = serviceTemplatePropertyRef;
		serviceTemplatePropertyRef = newServiceTemplatePropertyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TPROPERTY_MAPPING__SERVICE_TEMPLATE_PROPERTY_REF, oldServiceTemplatePropertyRef, serviceTemplatePropertyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEntityTemplate getTargetObjectRef() {
		if (targetObjectRef != null && targetObjectRef.eIsProxy()) {
			InternalEObject oldTargetObjectRef = (InternalEObject)targetObjectRef;
			targetObjectRef = (TEntityTemplate)eResolveProxy(oldTargetObjectRef);
			if (targetObjectRef != oldTargetObjectRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToscaPackage.TPROPERTY_MAPPING__TARGET_OBJECT_REF, oldTargetObjectRef, targetObjectRef));
			}
		}
		return targetObjectRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEntityTemplate basicGetTargetObjectRef() {
		return targetObjectRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetObjectRef(TEntityTemplate newTargetObjectRef) {
		TEntityTemplate oldTargetObjectRef = targetObjectRef;
		targetObjectRef = newTargetObjectRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TPROPERTY_MAPPING__TARGET_OBJECT_REF, oldTargetObjectRef, targetObjectRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetPropertyRef() {
		return targetPropertyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPropertyRef(String newTargetPropertyRef) {
		String oldTargetPropertyRef = targetPropertyRef;
		targetPropertyRef = newTargetPropertyRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TPROPERTY_MAPPING__TARGET_PROPERTY_REF, oldTargetPropertyRef, targetPropertyRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToscaPackage.TPROPERTY_MAPPING__TARGET_OBJECT_REF:
				if (resolve) return getTargetObjectRef();
				return basicGetTargetObjectRef();
			case ToscaPackage.TPROPERTY_MAPPING__SERVICE_TEMPLATE_PROPERTY_REF:
				return getServiceTemplatePropertyRef();
			case ToscaPackage.TPROPERTY_MAPPING__TARGET_PROPERTY_REF:
				return getTargetPropertyRef();
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
			case ToscaPackage.TPROPERTY_MAPPING__TARGET_OBJECT_REF:
				setTargetObjectRef((TEntityTemplate)newValue);
				return;
			case ToscaPackage.TPROPERTY_MAPPING__SERVICE_TEMPLATE_PROPERTY_REF:
				setServiceTemplatePropertyRef((String)newValue);
				return;
			case ToscaPackage.TPROPERTY_MAPPING__TARGET_PROPERTY_REF:
				setTargetPropertyRef((String)newValue);
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
			case ToscaPackage.TPROPERTY_MAPPING__TARGET_OBJECT_REF:
				setTargetObjectRef((TEntityTemplate)null);
				return;
			case ToscaPackage.TPROPERTY_MAPPING__SERVICE_TEMPLATE_PROPERTY_REF:
				setServiceTemplatePropertyRef(SERVICE_TEMPLATE_PROPERTY_REF_EDEFAULT);
				return;
			case ToscaPackage.TPROPERTY_MAPPING__TARGET_PROPERTY_REF:
				setTargetPropertyRef(TARGET_PROPERTY_REF_EDEFAULT);
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
			case ToscaPackage.TPROPERTY_MAPPING__TARGET_OBJECT_REF:
				return targetObjectRef != null;
			case ToscaPackage.TPROPERTY_MAPPING__SERVICE_TEMPLATE_PROPERTY_REF:
				return SERVICE_TEMPLATE_PROPERTY_REF_EDEFAULT == null ? serviceTemplatePropertyRef != null : !SERVICE_TEMPLATE_PROPERTY_REF_EDEFAULT.equals(serviceTemplatePropertyRef);
			case ToscaPackage.TPROPERTY_MAPPING__TARGET_PROPERTY_REF:
				return TARGET_PROPERTY_REF_EDEFAULT == null ? targetPropertyRef != null : !TARGET_PROPERTY_REF_EDEFAULT.equals(targetPropertyRef);
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
		result.append(" (serviceTemplatePropertyRef: ");
		result.append(serviceTemplatePropertyRef);
		result.append(", targetPropertyRef: ");
		result.append(targetPropertyRef);
		result.append(')');
		return result.toString();
	}

} //TPropertyMappingImpl
