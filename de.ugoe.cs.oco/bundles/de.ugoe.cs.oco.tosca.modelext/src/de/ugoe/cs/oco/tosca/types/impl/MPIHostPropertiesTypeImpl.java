/**
 */
package de.ugoe.cs.oco.tosca.types.impl;

import de.ugoe.cs.oco.tosca.impl.PropertiesTypeImpl;

import de.ugoe.cs.oco.tosca.types.CloudifyAgentPropertiesType;
import de.ugoe.cs.oco.tosca.types.MPIHostPropertiesType;
import de.ugoe.cs.oco.tosca.types.OpenStackServerPropertiesType;
import de.ugoe.cs.oco.tosca.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MPI Host Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.impl.MPIHostPropertiesTypeImpl#getCloudifyAgent <em>Cloudify Agent</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.impl.MPIHostPropertiesTypeImpl#getServer <em>Server</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MPIHostPropertiesTypeImpl extends PropertiesTypeImpl implements MPIHostPropertiesType {
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
	protected MPIHostPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.MPI_HOST_PROPERTIES_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.MPI_HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT, oldCloudifyAgent, newCloudifyAgent);
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
				msgs = ((InternalEObject)cloudifyAgent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MPI_HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT, null, msgs);
			if (newCloudifyAgent != null)
				msgs = ((InternalEObject)newCloudifyAgent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MPI_HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT, null, msgs);
			msgs = basicSetCloudifyAgent(newCloudifyAgent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MPI_HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT, newCloudifyAgent, newCloudifyAgent));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.MPI_HOST_PROPERTIES_TYPE__SERVER, oldServer, newServer);
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
				msgs = ((InternalEObject)server).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MPI_HOST_PROPERTIES_TYPE__SERVER, null, msgs);
			if (newServer != null)
				msgs = ((InternalEObject)newServer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.MPI_HOST_PROPERTIES_TYPE__SERVER, null, msgs);
			msgs = basicSetServer(newServer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.MPI_HOST_PROPERTIES_TYPE__SERVER, newServer, newServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.MPI_HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT:
				return basicSetCloudifyAgent(null, msgs);
			case TypesPackage.MPI_HOST_PROPERTIES_TYPE__SERVER:
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
			case TypesPackage.MPI_HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT:
				return getCloudifyAgent();
			case TypesPackage.MPI_HOST_PROPERTIES_TYPE__SERVER:
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
			case TypesPackage.MPI_HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT:
				setCloudifyAgent((CloudifyAgentPropertiesType)newValue);
				return;
			case TypesPackage.MPI_HOST_PROPERTIES_TYPE__SERVER:
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
			case TypesPackage.MPI_HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT:
				setCloudifyAgent((CloudifyAgentPropertiesType)null);
				return;
			case TypesPackage.MPI_HOST_PROPERTIES_TYPE__SERVER:
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
			case TypesPackage.MPI_HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT:
				return cloudifyAgent != null;
			case TypesPackage.MPI_HOST_PROPERTIES_TYPE__SERVER:
				return server != null;
		}
		return super.eIsSet(featureID);
	}

} //MPIHostPropertiesTypeImpl
