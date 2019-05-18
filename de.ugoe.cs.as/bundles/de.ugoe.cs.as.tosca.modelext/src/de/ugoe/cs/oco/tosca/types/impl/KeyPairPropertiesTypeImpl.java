/**
 */
package de.ugoe.cs.oco.tosca.types.impl;

import de.ugoe.cs.oco.tosca.types.KeyPairPropertiesType;
import de.ugoe.cs.oco.tosca.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Pair Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.impl.KeyPairPropertiesTypeImpl#getOpenstackConfig <em>Openstack Config</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.impl.KeyPairPropertiesTypeImpl#getUseExternalResource <em>Use External Resource</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.impl.KeyPairPropertiesTypeImpl#getResourceId <em>Resource Id</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.impl.KeyPairPropertiesTypeImpl#getPrivateKeyPath <em>Private Key Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyPairPropertiesTypeImpl extends MinimalEObjectImpl.Container implements KeyPairPropertiesType {
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
	 * The default value of the '{@link #getUseExternalResource() <em>Use External Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseExternalResource()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_EXTERNAL_RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseExternalResource() <em>Use External Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseExternalResource()
	 * @generated
	 * @ordered
	 */
	protected String useExternalResource = USE_EXTERNAL_RESOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceId() <em>Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceId()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceId() <em>Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceId()
	 * @generated
	 * @ordered
	 */
	protected String resourceId = RESOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateKeyPath() <em>Private Key Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateKeyPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_KEY_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateKeyPath() <em>Private Key Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateKeyPath()
	 * @generated
	 * @ordered
	 */
	protected String privateKeyPath = PRIVATE_KEY_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyPairPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.KEY_PAIR_PROPERTIES_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.KEY_PAIR_PROPERTIES_TYPE__OPENSTACK_CONFIG, oldOpenstackConfig, openstackConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseExternalResource() {
		return useExternalResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseExternalResource(String newUseExternalResource) {
		String oldUseExternalResource = useExternalResource;
		useExternalResource = newUseExternalResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.KEY_PAIR_PROPERTIES_TYPE__USE_EXTERNAL_RESOURCE, oldUseExternalResource, useExternalResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceId() {
		return resourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceId(String newResourceId) {
		String oldResourceId = resourceId;
		resourceId = newResourceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.KEY_PAIR_PROPERTIES_TYPE__RESOURCE_ID, oldResourceId, resourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivateKeyPath() {
		return privateKeyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateKeyPath(String newPrivateKeyPath) {
		String oldPrivateKeyPath = privateKeyPath;
		privateKeyPath = newPrivateKeyPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.KEY_PAIR_PROPERTIES_TYPE__PRIVATE_KEY_PATH, oldPrivateKeyPath, privateKeyPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.KEY_PAIR_PROPERTIES_TYPE__OPENSTACK_CONFIG:
				return getOpenstackConfig();
			case TypesPackage.KEY_PAIR_PROPERTIES_TYPE__USE_EXTERNAL_RESOURCE:
				return getUseExternalResource();
			case TypesPackage.KEY_PAIR_PROPERTIES_TYPE__RESOURCE_ID:
				return getResourceId();
			case TypesPackage.KEY_PAIR_PROPERTIES_TYPE__PRIVATE_KEY_PATH:
				return getPrivateKeyPath();
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
			case TypesPackage.KEY_PAIR_PROPERTIES_TYPE__OPENSTACK_CONFIG:
				setOpenstackConfig((String)newValue);
				return;
			case TypesPackage.KEY_PAIR_PROPERTIES_TYPE__USE_EXTERNAL_RESOURCE:
				setUseExternalResource((String)newValue);
				return;
			case TypesPackage.KEY_PAIR_PROPERTIES_TYPE__RESOURCE_ID:
				setResourceId((String)newValue);
				return;
			case TypesPackage.KEY_PAIR_PROPERTIES_TYPE__PRIVATE_KEY_PATH:
				setPrivateKeyPath((String)newValue);
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
			case TypesPackage.KEY_PAIR_PROPERTIES_TYPE__OPENSTACK_CONFIG:
				setOpenstackConfig(OPENSTACK_CONFIG_EDEFAULT);
				return;
			case TypesPackage.KEY_PAIR_PROPERTIES_TYPE__USE_EXTERNAL_RESOURCE:
				setUseExternalResource(USE_EXTERNAL_RESOURCE_EDEFAULT);
				return;
			case TypesPackage.KEY_PAIR_PROPERTIES_TYPE__RESOURCE_ID:
				setResourceId(RESOURCE_ID_EDEFAULT);
				return;
			case TypesPackage.KEY_PAIR_PROPERTIES_TYPE__PRIVATE_KEY_PATH:
				setPrivateKeyPath(PRIVATE_KEY_PATH_EDEFAULT);
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
			case TypesPackage.KEY_PAIR_PROPERTIES_TYPE__OPENSTACK_CONFIG:
				return OPENSTACK_CONFIG_EDEFAULT == null ? openstackConfig != null : !OPENSTACK_CONFIG_EDEFAULT.equals(openstackConfig);
			case TypesPackage.KEY_PAIR_PROPERTIES_TYPE__USE_EXTERNAL_RESOURCE:
				return USE_EXTERNAL_RESOURCE_EDEFAULT == null ? useExternalResource != null : !USE_EXTERNAL_RESOURCE_EDEFAULT.equals(useExternalResource);
			case TypesPackage.KEY_PAIR_PROPERTIES_TYPE__RESOURCE_ID:
				return RESOURCE_ID_EDEFAULT == null ? resourceId != null : !RESOURCE_ID_EDEFAULT.equals(resourceId);
			case TypesPackage.KEY_PAIR_PROPERTIES_TYPE__PRIVATE_KEY_PATH:
				return PRIVATE_KEY_PATH_EDEFAULT == null ? privateKeyPath != null : !PRIVATE_KEY_PATH_EDEFAULT.equals(privateKeyPath);
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
		result.append(", useExternalResource: ");
		result.append(useExternalResource);
		result.append(", resourceId: ");
		result.append(resourceId);
		result.append(", privateKeyPath: ");
		result.append(privateKeyPath);
		result.append(')');
		return result.toString();
	}

} //KeyPairPropertiesTypeImpl
