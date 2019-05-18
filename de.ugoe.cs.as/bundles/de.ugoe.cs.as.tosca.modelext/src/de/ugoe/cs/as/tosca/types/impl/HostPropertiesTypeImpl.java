/**
 */
package de.ugoe.cs.as.tosca.types.impl;

import de.ugoe.cs.as.tosca.impl.PropertiesTypeImpl;
import de.ugoe.cs.as.tosca.types.CloudifyAgentPropertiesType;
import de.ugoe.cs.as.tosca.types.HostPropertiesType;
import de.ugoe.cs.as.tosca.types.OpenStackServerPropertiesType;
import de.ugoe.cs.as.tosca.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.as.tosca.types.impl.HostPropertiesTypeImpl#getOpenstackConfig <em>Openstack Config</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.types.impl.HostPropertiesTypeImpl#getManagementNetworkName <em>Management Network Name</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.types.impl.HostPropertiesTypeImpl#getAgentConfig <em>Agent Config</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.types.impl.HostPropertiesTypeImpl#getCloudifyAgent <em>Cloudify Agent</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.types.impl.HostPropertiesTypeImpl#getServer <em>Server</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HostPropertiesTypeImpl extends PropertiesTypeImpl implements HostPropertiesType {
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
	 * The default value of the '{@link #getManagementNetworkName() <em>Management Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementNetworkName()
	 * @generated
	 * @ordered
	 */
	protected static final String MANAGEMENT_NETWORK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManagementNetworkName() <em>Management Network Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagementNetworkName()
	 * @generated
	 * @ordered
	 */
	protected String managementNetworkName = MANAGEMENT_NETWORK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAgentConfig() <em>Agent Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentConfig()
	 * @generated
	 * @ordered
	 */
	protected static final String AGENT_CONFIG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAgentConfig() <em>Agent Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentConfig()
	 * @generated
	 * @ordered
	 */
	protected String agentConfig = AGENT_CONFIG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCloudifyAgent() <em>Cloudify Agent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudifyAgent()
	 * @generated
	 * @ordered
	 */
	protected CloudifyAgentPropertiesType cloudifyAgent;

	/**
	 * The cached value of the '{@link #getServer() <em>Server</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServer()
	 * @generated
	 * @ordered
	 */
	protected OpenStackServerPropertiesType server;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.HOST_PROPERTIES_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.HOST_PROPERTIES_TYPE__OPENSTACK_CONFIG, oldOpenstackConfig, openstackConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManagementNetworkName() {
		return managementNetworkName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagementNetworkName(String newManagementNetworkName) {
		String oldManagementNetworkName = managementNetworkName;
		managementNetworkName = newManagementNetworkName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.HOST_PROPERTIES_TYPE__MANAGEMENT_NETWORK_NAME, oldManagementNetworkName, managementNetworkName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAgentConfig() {
		return agentConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgentConfig(String newAgentConfig) {
		String oldAgentConfig = agentConfig;
		agentConfig = newAgentConfig;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.HOST_PROPERTIES_TYPE__AGENT_CONFIG, oldAgentConfig, agentConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudifyAgentPropertiesType getCloudifyAgent() {
		return cloudifyAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCloudifyAgent(CloudifyAgentPropertiesType newCloudifyAgent, NotificationChain msgs) {
		CloudifyAgentPropertiesType oldCloudifyAgent = cloudifyAgent;
		cloudifyAgent = newCloudifyAgent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT, oldCloudifyAgent, newCloudifyAgent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudifyAgent(CloudifyAgentPropertiesType newCloudifyAgent) {
		if (newCloudifyAgent != cloudifyAgent) {
			NotificationChain msgs = null;
			if (cloudifyAgent != null)
				msgs = ((InternalEObject)cloudifyAgent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT, null, msgs);
			if (newCloudifyAgent != null)
				msgs = ((InternalEObject)newCloudifyAgent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT, null, msgs);
			msgs = basicSetCloudifyAgent(newCloudifyAgent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT, newCloudifyAgent, newCloudifyAgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenStackServerPropertiesType getServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServer(OpenStackServerPropertiesType newServer, NotificationChain msgs) {
		OpenStackServerPropertiesType oldServer = server;
		server = newServer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.HOST_PROPERTIES_TYPE__SERVER, oldServer, newServer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(OpenStackServerPropertiesType newServer) {
		if (newServer != server) {
			NotificationChain msgs = null;
			if (server != null)
				msgs = ((InternalEObject)server).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HOST_PROPERTIES_TYPE__SERVER, null, msgs);
			if (newServer != null)
				msgs = ((InternalEObject)newServer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.HOST_PROPERTIES_TYPE__SERVER, null, msgs);
			msgs = basicSetServer(newServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.HOST_PROPERTIES_TYPE__SERVER, newServer, newServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT:
				return basicSetCloudifyAgent(null, msgs);
			case TypesPackage.HOST_PROPERTIES_TYPE__SERVER:
				return basicSetServer(null, msgs);
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
			case TypesPackage.HOST_PROPERTIES_TYPE__OPENSTACK_CONFIG:
				return getOpenstackConfig();
			case TypesPackage.HOST_PROPERTIES_TYPE__MANAGEMENT_NETWORK_NAME:
				return getManagementNetworkName();
			case TypesPackage.HOST_PROPERTIES_TYPE__AGENT_CONFIG:
				return getAgentConfig();
			case TypesPackage.HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT:
				return getCloudifyAgent();
			case TypesPackage.HOST_PROPERTIES_TYPE__SERVER:
				return getServer();
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
			case TypesPackage.HOST_PROPERTIES_TYPE__OPENSTACK_CONFIG:
				setOpenstackConfig((String)newValue);
				return;
			case TypesPackage.HOST_PROPERTIES_TYPE__MANAGEMENT_NETWORK_NAME:
				setManagementNetworkName((String)newValue);
				return;
			case TypesPackage.HOST_PROPERTIES_TYPE__AGENT_CONFIG:
				setAgentConfig((String)newValue);
				return;
			case TypesPackage.HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT:
				setCloudifyAgent((CloudifyAgentPropertiesType)newValue);
				return;
			case TypesPackage.HOST_PROPERTIES_TYPE__SERVER:
				setServer((OpenStackServerPropertiesType)newValue);
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
			case TypesPackage.HOST_PROPERTIES_TYPE__OPENSTACK_CONFIG:
				setOpenstackConfig(OPENSTACK_CONFIG_EDEFAULT);
				return;
			case TypesPackage.HOST_PROPERTIES_TYPE__MANAGEMENT_NETWORK_NAME:
				setManagementNetworkName(MANAGEMENT_NETWORK_NAME_EDEFAULT);
				return;
			case TypesPackage.HOST_PROPERTIES_TYPE__AGENT_CONFIG:
				setAgentConfig(AGENT_CONFIG_EDEFAULT);
				return;
			case TypesPackage.HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT:
				setCloudifyAgent((CloudifyAgentPropertiesType)null);
				return;
			case TypesPackage.HOST_PROPERTIES_TYPE__SERVER:
				setServer((OpenStackServerPropertiesType)null);
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
			case TypesPackage.HOST_PROPERTIES_TYPE__OPENSTACK_CONFIG:
				return OPENSTACK_CONFIG_EDEFAULT == null ? openstackConfig != null : !OPENSTACK_CONFIG_EDEFAULT.equals(openstackConfig);
			case TypesPackage.HOST_PROPERTIES_TYPE__MANAGEMENT_NETWORK_NAME:
				return MANAGEMENT_NETWORK_NAME_EDEFAULT == null ? managementNetworkName != null : !MANAGEMENT_NETWORK_NAME_EDEFAULT.equals(managementNetworkName);
			case TypesPackage.HOST_PROPERTIES_TYPE__AGENT_CONFIG:
				return AGENT_CONFIG_EDEFAULT == null ? agentConfig != null : !AGENT_CONFIG_EDEFAULT.equals(agentConfig);
			case TypesPackage.HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT:
				return cloudifyAgent != null;
			case TypesPackage.HOST_PROPERTIES_TYPE__SERVER:
				return server != null;
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
		result.append(", managementNetworkName: ");
		result.append(managementNetworkName);
		result.append(", agentConfig: ");
		result.append(agentConfig);
		result.append(')');
		return result.toString();
	}

} //HostPropertiesTypeImpl
