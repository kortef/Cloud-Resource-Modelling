/**
 */
package de.ugoe.cs.oco.tosca.impl;

import de.ugoe.cs.oco.tosca.PropertiesDefinitionType;
import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.util.ToscaModelUtil;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.xsd.XSDElementDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties Definition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.PropertiesDefinitionTypeImpl#getElement <em>Element</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.PropertiesDefinitionTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.PropertiesDefinitionTypeImpl#getElementRef <em>Element Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertiesDefinitionTypeImpl extends MinimalEObjectImpl.Container implements PropertiesDefinitionType {
	/**
	 * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected static final QName ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected QName element = ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final QName TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected QName type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementRef() <em>Element Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementRef()
	 * @generated
	 * @ordered
	 */
	protected XSDElementDeclaration elementRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesDefinitionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.PROPERTIES_DEFINITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getElement() {
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElement(QName newElement) {
		QName oldElement = element;
		element = newElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.PROPERTIES_DEFINITION_TYPE__ELEMENT, oldElement, element));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(QName newType) {
		QName oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.PROPERTIES_DEFINITION_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public XSDElementDeclaration getElementRef() {
		if (elementRef == null) {
			if (getElement() != null) {
				elementRef = ToscaModelUtil.resolveElementDeclaration(this, getElement());
			}
		}
		if (elementRef != null && elementRef.eIsProxy()) {
			InternalEObject oldElementRef = (InternalEObject)elementRef;
			elementRef = (XSDElementDeclaration)eResolveProxy(oldElementRef);
			if (elementRef != oldElementRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToscaPackage.PROPERTIES_DEFINITION_TYPE__ELEMENT_REF, oldElementRef, elementRef));
			}
		}
		return elementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSDElementDeclaration basicGetElementRef() {
		return elementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setElementRef(XSDElementDeclaration newElementRef) {
		XSDElementDeclaration oldElementRef = elementRef;
		elementRef = newElementRef;
		QName derivedName = new QName(newElementRef.getTargetNamespace(), newElementRef.getQName());
		setElement(derivedName);
		
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.PROPERTIES_DEFINITION_TYPE__ELEMENT_REF, oldElementRef, elementRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToscaPackage.PROPERTIES_DEFINITION_TYPE__ELEMENT:
				return getElement();
			case ToscaPackage.PROPERTIES_DEFINITION_TYPE__TYPE:
				return getType();
			case ToscaPackage.PROPERTIES_DEFINITION_TYPE__ELEMENT_REF:
				if (resolve) return getElementRef();
				return basicGetElementRef();
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
			case ToscaPackage.PROPERTIES_DEFINITION_TYPE__ELEMENT:
				setElement((QName)newValue);
				return;
			case ToscaPackage.PROPERTIES_DEFINITION_TYPE__TYPE:
				setType((QName)newValue);
				return;
			case ToscaPackage.PROPERTIES_DEFINITION_TYPE__ELEMENT_REF:
				setElementRef((XSDElementDeclaration)newValue);
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
			case ToscaPackage.PROPERTIES_DEFINITION_TYPE__ELEMENT:
				setElement(ELEMENT_EDEFAULT);
				return;
			case ToscaPackage.PROPERTIES_DEFINITION_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ToscaPackage.PROPERTIES_DEFINITION_TYPE__ELEMENT_REF:
				setElementRef((XSDElementDeclaration)null);
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
			case ToscaPackage.PROPERTIES_DEFINITION_TYPE__ELEMENT:
				return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
			case ToscaPackage.PROPERTIES_DEFINITION_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ToscaPackage.PROPERTIES_DEFINITION_TYPE__ELEMENT_REF:
				return elementRef != null;
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
		result.append(" (element: ");
		result.append(element);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //PropertiesDefinitionTypeImpl
