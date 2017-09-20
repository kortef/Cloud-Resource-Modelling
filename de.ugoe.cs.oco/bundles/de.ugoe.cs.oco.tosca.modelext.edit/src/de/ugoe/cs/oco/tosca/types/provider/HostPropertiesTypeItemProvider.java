/**
 */
package de.ugoe.cs.oco.tosca.types.provider;


import de.ugoe.cs.oco.tosca.ToscaPackage;
import de.ugoe.cs.oco.tosca.provider.PropertiesTypeItemProvider;
import de.ugoe.cs.oco.tosca.types.HostPropertiesType;
import de.ugoe.cs.oco.tosca.types.TypesFactory;
import de.ugoe.cs.oco.tosca.types.TypesPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.ugoe.cs.oco.tosca.types.HostPropertiesType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HostPropertiesTypeItemProvider 
	extends PropertiesTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostPropertiesTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOpenstackConfigPropertyDescriptor(object);
			addManagementNetworkNamePropertyDescriptor(object);
			addAgentConfigPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Openstack Config feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpenstackConfigPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HostPropertiesType_openstackConfig_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HostPropertiesType_openstackConfig_feature", "_UI_HostPropertiesType_type"),
				 TypesPackage.Literals.HOST_PROPERTIES_TYPE__OPENSTACK_CONFIG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Management Network Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addManagementNetworkNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HostPropertiesType_managementNetworkName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HostPropertiesType_managementNetworkName_feature", "_UI_HostPropertiesType_type"),
				 TypesPackage.Literals.HOST_PROPERTIES_TYPE__MANAGEMENT_NETWORK_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Agent Config feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAgentConfigPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HostPropertiesType_agentConfig_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HostPropertiesType_agentConfig_feature", "_UI_HostPropertiesType_type"),
				 TypesPackage.Literals.HOST_PROPERTIES_TYPE__AGENT_CONFIG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TypesPackage.Literals.HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT);
			childrenFeatures.add(TypesPackage.Literals.HOST_PROPERTIES_TYPE__SERVER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns HostPropertiesType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HostPropertiesType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HostPropertiesType)object).getManagementNetworkName();
		return label == null || label.length() == 0 ?
			getString("_UI_HostPropertiesType_type") :
			getString("_UI_HostPropertiesType_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(HostPropertiesType.class)) {
			case TypesPackage.HOST_PROPERTIES_TYPE__OPENSTACK_CONFIG:
			case TypesPackage.HOST_PROPERTIES_TYPE__MANAGEMENT_NETWORK_NAME:
			case TypesPackage.HOST_PROPERTIES_TYPE__AGENT_CONFIG:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TypesPackage.HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT:
			case TypesPackage.HOST_PROPERTIES_TYPE__SERVER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.PROPERTIES_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(TypesPackage.Literals.DOCUMENT_ROOT__CLOUDIFY_AGENT_PROPERTIES,
					 TypesFactory.eINSTANCE.createCloudifyAgentPropertiesType())));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.PROPERTIES_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(TypesPackage.Literals.DOCUMENT_ROOT__FLOATING_IP_PROPERTIES,
					 TypesFactory.eINSTANCE.createFloatingIPPropertiesType())));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.PROPERTIES_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(TypesPackage.Literals.DOCUMENT_ROOT__KEY_PAIR_PROPERTIES,
					 TypesFactory.eINSTANCE.createKeyPairPropertiesType())));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.PROPERTIES_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(TypesPackage.Literals.DOCUMENT_ROOT__MPI_HOST_PROPERTIES,
					 TypesFactory.eINSTANCE.createHostPropertiesType())));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.PROPERTIES_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(TypesPackage.Literals.DOCUMENT_ROOT__OPEN_STACK_FLOATING_IP_PROPERTIES,
					 TypesFactory.eINSTANCE.createOpenStackFloatingIPPropertiesType())));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.PROPERTIES_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(TypesPackage.Literals.DOCUMENT_ROOT__OPEN_STACK_PROPERTIES,
					 TypesFactory.eINSTANCE.createOpenStackServerPropertiesType())));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.PROPERTIES_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(TypesPackage.Literals.DOCUMENT_ROOT__OPEN_STACK_VOLUME_PROPERTIES,
					 TypesFactory.eINSTANCE.createOpenStackVolumePropertiesType())));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.PROPERTIES_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(TypesPackage.Literals.DOCUMENT_ROOT__SCALING_GROUP_PROPERTIES,
					 TypesFactory.eINSTANCE.createScalingGroupPropertiesType())));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.PROPERTIES_TYPE__ANY,
				 FeatureMapUtil.createEntry
					(TypesPackage.Literals.DOCUMENT_ROOT__VOLUME_HOST_PROPERTIES_TYPE,
					 TypesFactory.eINSTANCE.createVolumeHostPropertiesType())));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.HOST_PROPERTIES_TYPE__CLOUDIFY_AGENT,
				 TypesFactory.eINSTANCE.createCloudifyAgentPropertiesType()));

		newChildDescriptors.add
			(createChildParameter
				(TypesPackage.Literals.HOST_PROPERTIES_TYPE__SERVER,
				 TypesFactory.eINSTANCE.createOpenStackServerPropertiesType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PropertyTypesEditPlugin.INSTANCE;
	}

}
