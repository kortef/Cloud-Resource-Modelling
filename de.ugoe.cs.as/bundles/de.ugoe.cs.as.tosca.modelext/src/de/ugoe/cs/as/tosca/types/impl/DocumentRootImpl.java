/**
 */
package de.ugoe.cs.as.tosca.types.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import de.ugoe.cs.as.tosca.types.CloudifyAgentPropertiesType;
import de.ugoe.cs.as.tosca.types.DocumentRoot;
import de.ugoe.cs.as.tosca.types.FloatingIPPropertiesType;
import de.ugoe.cs.as.tosca.types.HostPropertiesType;
import de.ugoe.cs.as.tosca.types.KeyPairPropertiesType;
import de.ugoe.cs.as.tosca.types.OpenStackFloatingIPPropertiesType;
import de.ugoe.cs.as.tosca.types.OpenStackServerPropertiesType;
import de.ugoe.cs.as.tosca.types.OpenStackVolumePropertiesType;
import de.ugoe.cs.as.tosca.types.ScalingGroupPropertiesType;
import de.ugoe.cs.as.tosca.types.TypesPackage;
import de.ugoe.cs.as.tosca.types.VolumeHostPropertiesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.as.tosca.types.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.types.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.types.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.types.impl.DocumentRootImpl#getCloudifyAgentProperties <em>Cloudify Agent Properties</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.types.impl.DocumentRootImpl#getFloatingIPProperties <em>Floating IP Properties</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.types.impl.DocumentRootImpl#getKeyPairProperties <em>Key Pair Properties</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.types.impl.DocumentRootImpl#getMPIHostProperties <em>MPI Host Properties</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.types.impl.DocumentRootImpl#getOpenStackFloatingIPProperties <em>Open Stack Floating IP Properties</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.types.impl.DocumentRootImpl#getOpenStackProperties <em>Open Stack Properties</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.types.impl.DocumentRootImpl#getOpenStackVolumeProperties <em>Open Stack Volume Properties</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.types.impl.DocumentRootImpl#getScalingGroupProperties <em>Scaling Group Properties</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.types.impl.DocumentRootImpl#getVolumeHostPropertiesType <em>Volume Host Properties Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, TypesPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TypesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, TypesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudifyAgentPropertiesType getCloudifyAgentProperties() {
		return (CloudifyAgentPropertiesType)getMixed().get(TypesPackage.Literals.DOCUMENT_ROOT__CLOUDIFY_AGENT_PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCloudifyAgentProperties(CloudifyAgentPropertiesType newCloudifyAgentProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.Literals.DOCUMENT_ROOT__CLOUDIFY_AGENT_PROPERTIES, newCloudifyAgentProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudifyAgentProperties(CloudifyAgentPropertiesType newCloudifyAgentProperties) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.Literals.DOCUMENT_ROOT__CLOUDIFY_AGENT_PROPERTIES, newCloudifyAgentProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatingIPPropertiesType getFloatingIPProperties() {
		return (FloatingIPPropertiesType)getMixed().get(TypesPackage.Literals.DOCUMENT_ROOT__FLOATING_IP_PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloatingIPProperties(FloatingIPPropertiesType newFloatingIPProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.Literals.DOCUMENT_ROOT__FLOATING_IP_PROPERTIES, newFloatingIPProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatingIPProperties(FloatingIPPropertiesType newFloatingIPProperties) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.Literals.DOCUMENT_ROOT__FLOATING_IP_PROPERTIES, newFloatingIPProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyPairPropertiesType getKeyPairProperties() {
		return (KeyPairPropertiesType)getMixed().get(TypesPackage.Literals.DOCUMENT_ROOT__KEY_PAIR_PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyPairProperties(KeyPairPropertiesType newKeyPairProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.Literals.DOCUMENT_ROOT__KEY_PAIR_PROPERTIES, newKeyPairProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyPairProperties(KeyPairPropertiesType newKeyPairProperties) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.Literals.DOCUMENT_ROOT__KEY_PAIR_PROPERTIES, newKeyPairProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostPropertiesType getMPIHostProperties() {
		return (HostPropertiesType)getMixed().get(TypesPackage.Literals.DOCUMENT_ROOT__MPI_HOST_PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMPIHostProperties(HostPropertiesType newMPIHostProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.Literals.DOCUMENT_ROOT__MPI_HOST_PROPERTIES, newMPIHostProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMPIHostProperties(HostPropertiesType newMPIHostProperties) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.Literals.DOCUMENT_ROOT__MPI_HOST_PROPERTIES, newMPIHostProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenStackFloatingIPPropertiesType getOpenStackFloatingIPProperties() {
		return (OpenStackFloatingIPPropertiesType)getMixed().get(TypesPackage.Literals.DOCUMENT_ROOT__OPEN_STACK_FLOATING_IP_PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpenStackFloatingIPProperties(OpenStackFloatingIPPropertiesType newOpenStackFloatingIPProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.Literals.DOCUMENT_ROOT__OPEN_STACK_FLOATING_IP_PROPERTIES, newOpenStackFloatingIPProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenStackFloatingIPProperties(OpenStackFloatingIPPropertiesType newOpenStackFloatingIPProperties) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.Literals.DOCUMENT_ROOT__OPEN_STACK_FLOATING_IP_PROPERTIES, newOpenStackFloatingIPProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenStackServerPropertiesType getOpenStackProperties() {
		return (OpenStackServerPropertiesType)getMixed().get(TypesPackage.Literals.DOCUMENT_ROOT__OPEN_STACK_PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpenStackProperties(OpenStackServerPropertiesType newOpenStackProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.Literals.DOCUMENT_ROOT__OPEN_STACK_PROPERTIES, newOpenStackProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenStackProperties(OpenStackServerPropertiesType newOpenStackProperties) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.Literals.DOCUMENT_ROOT__OPEN_STACK_PROPERTIES, newOpenStackProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenStackVolumePropertiesType getOpenStackVolumeProperties() {
		return (OpenStackVolumePropertiesType)getMixed().get(TypesPackage.Literals.DOCUMENT_ROOT__OPEN_STACK_VOLUME_PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpenStackVolumeProperties(OpenStackVolumePropertiesType newOpenStackVolumeProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.Literals.DOCUMENT_ROOT__OPEN_STACK_VOLUME_PROPERTIES, newOpenStackVolumeProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenStackVolumeProperties(OpenStackVolumePropertiesType newOpenStackVolumeProperties) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.Literals.DOCUMENT_ROOT__OPEN_STACK_VOLUME_PROPERTIES, newOpenStackVolumeProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingGroupPropertiesType getScalingGroupProperties() {
		return (ScalingGroupPropertiesType)getMixed().get(TypesPackage.Literals.DOCUMENT_ROOT__SCALING_GROUP_PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScalingGroupProperties(ScalingGroupPropertiesType newScalingGroupProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.Literals.DOCUMENT_ROOT__SCALING_GROUP_PROPERTIES, newScalingGroupProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalingGroupProperties(ScalingGroupPropertiesType newScalingGroupProperties) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.Literals.DOCUMENT_ROOT__SCALING_GROUP_PROPERTIES, newScalingGroupProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumeHostPropertiesType getVolumeHostPropertiesType() {
		return (VolumeHostPropertiesType)getMixed().get(TypesPackage.Literals.DOCUMENT_ROOT__VOLUME_HOST_PROPERTIES_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolumeHostPropertiesType(VolumeHostPropertiesType newVolumeHostPropertiesType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(TypesPackage.Literals.DOCUMENT_ROOT__VOLUME_HOST_PROPERTIES_TYPE, newVolumeHostPropertiesType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumeHostPropertiesType(VolumeHostPropertiesType newVolumeHostPropertiesType) {
		((FeatureMap.Internal)getMixed()).set(TypesPackage.Literals.DOCUMENT_ROOT__VOLUME_HOST_PROPERTIES_TYPE, newVolumeHostPropertiesType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case TypesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case TypesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case TypesPackage.DOCUMENT_ROOT__CLOUDIFY_AGENT_PROPERTIES:
				return basicSetCloudifyAgentProperties(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__FLOATING_IP_PROPERTIES:
				return basicSetFloatingIPProperties(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__KEY_PAIR_PROPERTIES:
				return basicSetKeyPairProperties(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__MPI_HOST_PROPERTIES:
				return basicSetMPIHostProperties(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__OPEN_STACK_FLOATING_IP_PROPERTIES:
				return basicSetOpenStackFloatingIPProperties(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__OPEN_STACK_PROPERTIES:
				return basicSetOpenStackProperties(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__OPEN_STACK_VOLUME_PROPERTIES:
				return basicSetOpenStackVolumeProperties(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__SCALING_GROUP_PROPERTIES:
				return basicSetScalingGroupProperties(null, msgs);
			case TypesPackage.DOCUMENT_ROOT__VOLUME_HOST_PROPERTIES_TYPE:
				return basicSetVolumeHostPropertiesType(null, msgs);
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
			case TypesPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case TypesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case TypesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case TypesPackage.DOCUMENT_ROOT__CLOUDIFY_AGENT_PROPERTIES:
				return getCloudifyAgentProperties();
			case TypesPackage.DOCUMENT_ROOT__FLOATING_IP_PROPERTIES:
				return getFloatingIPProperties();
			case TypesPackage.DOCUMENT_ROOT__KEY_PAIR_PROPERTIES:
				return getKeyPairProperties();
			case TypesPackage.DOCUMENT_ROOT__MPI_HOST_PROPERTIES:
				return getMPIHostProperties();
			case TypesPackage.DOCUMENT_ROOT__OPEN_STACK_FLOATING_IP_PROPERTIES:
				return getOpenStackFloatingIPProperties();
			case TypesPackage.DOCUMENT_ROOT__OPEN_STACK_PROPERTIES:
				return getOpenStackProperties();
			case TypesPackage.DOCUMENT_ROOT__OPEN_STACK_VOLUME_PROPERTIES:
				return getOpenStackVolumeProperties();
			case TypesPackage.DOCUMENT_ROOT__SCALING_GROUP_PROPERTIES:
				return getScalingGroupProperties();
			case TypesPackage.DOCUMENT_ROOT__VOLUME_HOST_PROPERTIES_TYPE:
				return getVolumeHostPropertiesType();
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
			case TypesPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__CLOUDIFY_AGENT_PROPERTIES:
				setCloudifyAgentProperties((CloudifyAgentPropertiesType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__FLOATING_IP_PROPERTIES:
				setFloatingIPProperties((FloatingIPPropertiesType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__KEY_PAIR_PROPERTIES:
				setKeyPairProperties((KeyPairPropertiesType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__MPI_HOST_PROPERTIES:
				setMPIHostProperties((HostPropertiesType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__OPEN_STACK_FLOATING_IP_PROPERTIES:
				setOpenStackFloatingIPProperties((OpenStackFloatingIPPropertiesType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__OPEN_STACK_PROPERTIES:
				setOpenStackProperties((OpenStackServerPropertiesType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__OPEN_STACK_VOLUME_PROPERTIES:
				setOpenStackVolumeProperties((OpenStackVolumePropertiesType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__SCALING_GROUP_PROPERTIES:
				setScalingGroupProperties((ScalingGroupPropertiesType)newValue);
				return;
			case TypesPackage.DOCUMENT_ROOT__VOLUME_HOST_PROPERTIES_TYPE:
				setVolumeHostPropertiesType((VolumeHostPropertiesType)newValue);
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
			case TypesPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case TypesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case TypesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case TypesPackage.DOCUMENT_ROOT__CLOUDIFY_AGENT_PROPERTIES:
				setCloudifyAgentProperties((CloudifyAgentPropertiesType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__FLOATING_IP_PROPERTIES:
				setFloatingIPProperties((FloatingIPPropertiesType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__KEY_PAIR_PROPERTIES:
				setKeyPairProperties((KeyPairPropertiesType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__MPI_HOST_PROPERTIES:
				setMPIHostProperties((HostPropertiesType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__OPEN_STACK_FLOATING_IP_PROPERTIES:
				setOpenStackFloatingIPProperties((OpenStackFloatingIPPropertiesType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__OPEN_STACK_PROPERTIES:
				setOpenStackProperties((OpenStackServerPropertiesType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__OPEN_STACK_VOLUME_PROPERTIES:
				setOpenStackVolumeProperties((OpenStackVolumePropertiesType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__SCALING_GROUP_PROPERTIES:
				setScalingGroupProperties((ScalingGroupPropertiesType)null);
				return;
			case TypesPackage.DOCUMENT_ROOT__VOLUME_HOST_PROPERTIES_TYPE:
				setVolumeHostPropertiesType((VolumeHostPropertiesType)null);
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
			case TypesPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case TypesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case TypesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case TypesPackage.DOCUMENT_ROOT__CLOUDIFY_AGENT_PROPERTIES:
				return getCloudifyAgentProperties() != null;
			case TypesPackage.DOCUMENT_ROOT__FLOATING_IP_PROPERTIES:
				return getFloatingIPProperties() != null;
			case TypesPackage.DOCUMENT_ROOT__KEY_PAIR_PROPERTIES:
				return getKeyPairProperties() != null;
			case TypesPackage.DOCUMENT_ROOT__MPI_HOST_PROPERTIES:
				return getMPIHostProperties() != null;
			case TypesPackage.DOCUMENT_ROOT__OPEN_STACK_FLOATING_IP_PROPERTIES:
				return getOpenStackFloatingIPProperties() != null;
			case TypesPackage.DOCUMENT_ROOT__OPEN_STACK_PROPERTIES:
				return getOpenStackProperties() != null;
			case TypesPackage.DOCUMENT_ROOT__OPEN_STACK_VOLUME_PROPERTIES:
				return getOpenStackVolumeProperties() != null;
			case TypesPackage.DOCUMENT_ROOT__SCALING_GROUP_PROPERTIES:
				return getScalingGroupProperties() != null;
			case TypesPackage.DOCUMENT_ROOT__VOLUME_HOST_PROPERTIES_TYPE:
				return getVolumeHostPropertiesType() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
