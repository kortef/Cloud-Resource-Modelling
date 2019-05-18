/**
 */
package de.ugoe.cs.oco.tosca.impl;

import de.ugoe.cs.oco.tosca.DocumentRoot;
import de.ugoe.cs.oco.tosca.PropertiesDefinitionType;
import de.ugoe.cs.oco.tosca.PropertiesType;
import de.ugoe.cs.oco.tosca.PropertyConstraintsType;
import de.ugoe.cs.oco.tosca.TDefinitions;
import de.ugoe.cs.oco.tosca.TEntityTemplate;
import de.ugoe.cs.oco.tosca.TEntityType;
import de.ugoe.cs.oco.tosca.TImport;
import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.util.ToscaModelUtil;

import java.util.UUID;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TEntity Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TEntityTemplateImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TEntityTemplateImpl#getPropertyConstraints <em>Property Constraints</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TEntityTemplateImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TEntityTemplateImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.TEntityTemplateImpl#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TEntityTemplateImpl extends TExtensibleElementsImpl implements TEntityTemplate {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected PropertiesType properties;

	/**
	 * The cached value of the '{@link #getPropertyConstraints() <em>Property Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyConstraints()
	 * @generated
	 * @ordered
	 */
	protected PropertyConstraintsType propertyConstraints;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "uuid-" + UUID.randomUUID().toString();

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated NOT
	 * @ordered
	 */
	protected String id = "uuid-" + UUID.randomUUID().toString();

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
	 * The cached value of the '{@link #getTypeRef() <em>Type Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRef()
	 * @generated
	 * @ordered
	 */
	protected TEntityType typeRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TEntityTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TENTITY_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesType getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(PropertiesType newProperties, NotificationChain msgs) {
		PropertiesType oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TENTITY_TEMPLATE__PROPERTIES, oldProperties, newProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setProperties(PropertiesType newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TENTITY_TEMPLATE__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TENTITY_TEMPLATE__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		
		if (this.getTypeRef() != null) {
			TDefinitions definitions = ((DocumentRoot) this.eResource().getContents().get(0)).getDefinitions().get(0);
			for (TImport imp: definitions.getImport()) {
				imp.getResource();
			}
			PropertiesDefinitionType definition = this.getTypeRef().getPropertiesDefinition();
			
			QName element = definition.getElement();
			EPackage pack = this.eResource().getResourceSet().getPackageRegistry().getEPackage(element.getNamespaceURI());
			
			if (pack != null) {
				EClass clazz = (EClass) pack.getEClassifier("DocumentRoot");
				EStructuralFeature feature = clazz.getEStructuralFeature(element.getLocalPart().substring(0, 1).toLowerCase() 
						+ element.getLocalPart().substring(1));
				EClass propertiesClazz = (EClass) feature.getEType();
				
				newProperties.getAny().add(feature, pack.getEFactoryInstance().create(propertiesClazz));
			}
		}
		
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TENTITY_TEMPLATE__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyConstraintsType getPropertyConstraints() {
		return propertyConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyConstraints(PropertyConstraintsType newPropertyConstraints, NotificationChain msgs) {
		PropertyConstraintsType oldPropertyConstraints = propertyConstraints;
		propertyConstraints = newPropertyConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ToscaPackage.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS, oldPropertyConstraints, newPropertyConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyConstraints(PropertyConstraintsType newPropertyConstraints) {
		if (newPropertyConstraints != propertyConstraints) {
			NotificationChain msgs = null;
			if (propertyConstraints != null)
				msgs = ((InternalEObject)propertyConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS, null, msgs);
			if (newPropertyConstraints != null)
				msgs = ((InternalEObject)newPropertyConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ToscaPackage.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS, null, msgs);
			msgs = basicSetPropertyConstraints(newPropertyConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS, newPropertyConstraints, newPropertyConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TENTITY_TEMPLATE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TENTITY_TEMPLATE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TEntityType getTypeRef() {
		if (typeRef == null) {
			if (getType() != null) {
				typeRef = ToscaModelUtil.resolveType(this, getType());
			}
		}
		
		if (typeRef != null && typeRef.eIsProxy()) {
			InternalEObject oldTypeRef = (InternalEObject)typeRef;
			typeRef = (TEntityType)eResolveProxy(oldTypeRef);
			if (typeRef != oldTypeRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToscaPackage.TENTITY_TEMPLATE__TYPE_REF, oldTypeRef, typeRef));
			}
		}
		return typeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEntityType basicGetTypeRef() {
		return typeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setTypeRef(TEntityType newTypeRef) {
		setType(ToscaModelUtil.getQualifiedName(newTypeRef));
		
		TEntityType oldTypeRef = typeRef;
		typeRef = newTypeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TENTITY_TEMPLATE__TYPE_REF, oldTypeRef, typeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.TENTITY_TEMPLATE__PROPERTIES:
				return basicSetProperties(null, msgs);
			case ToscaPackage.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS:
				return basicSetPropertyConstraints(null, msgs);
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
			case ToscaPackage.TENTITY_TEMPLATE__PROPERTIES:
				return getProperties();
			case ToscaPackage.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS:
				return getPropertyConstraints();
			case ToscaPackage.TENTITY_TEMPLATE__ID:
				return getId();
			case ToscaPackage.TENTITY_TEMPLATE__TYPE:
				return getType();
			case ToscaPackage.TENTITY_TEMPLATE__TYPE_REF:
				if (resolve) return getTypeRef();
				return basicGetTypeRef();
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
			case ToscaPackage.TENTITY_TEMPLATE__PROPERTIES:
				setProperties((PropertiesType)newValue);
				return;
			case ToscaPackage.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS:
				setPropertyConstraints((PropertyConstraintsType)newValue);
				return;
			case ToscaPackage.TENTITY_TEMPLATE__ID:
				setId((String)newValue);
				return;
			case ToscaPackage.TENTITY_TEMPLATE__TYPE:
				setType((QName)newValue);
				return;
			case ToscaPackage.TENTITY_TEMPLATE__TYPE_REF:
				setTypeRef((TEntityType)newValue);
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
			case ToscaPackage.TENTITY_TEMPLATE__PROPERTIES:
				setProperties((PropertiesType)null);
				return;
			case ToscaPackage.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS:
				setPropertyConstraints((PropertyConstraintsType)null);
				return;
			case ToscaPackage.TENTITY_TEMPLATE__ID:
				setId(ID_EDEFAULT);
				return;
			case ToscaPackage.TENTITY_TEMPLATE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ToscaPackage.TENTITY_TEMPLATE__TYPE_REF:
				setTypeRef((TEntityType)null);
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
			case ToscaPackage.TENTITY_TEMPLATE__PROPERTIES:
				return properties != null;
			case ToscaPackage.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS:
				return propertyConstraints != null;
			case ToscaPackage.TENTITY_TEMPLATE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ToscaPackage.TENTITY_TEMPLATE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ToscaPackage.TENTITY_TEMPLATE__TYPE_REF:
				return typeRef != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TEntityTemplateImpl
