/**
 */
package de.ugoe.cs.oco.tosca.provider;


import de.ugoe.cs.oco.tosca.TGroupType;
import de.ugoe.cs.oco.tosca.ToscaFactory;
import de.ugoe.cs.oco.tosca.ToscaPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.ugoe.cs.oco.tosca.TGroupType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TGroupTypeItemProvider extends TEntityTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TGroupTypeItemProvider(AdapterFactory adapterFactory) {
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

			addMemberPropertyDescriptor(object);
			addMemberRefsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGroupType_member_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGroupType_member_feature", "_UI_TGroupType_type"),
				 ToscaPackage.Literals.TGROUP_TYPE__MEMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Member Refs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemberRefsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TGroupType_memberRefs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TGroupType_memberRefs_feature", "_UI_TGroupType_type"),
				 ToscaPackage.Literals.TGROUP_TYPE__MEMBER_REFS,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(ToscaPackage.Literals.TGROUP_TYPE__REQUIREMENT_DEFINITIONS);
			childrenFeatures.add(ToscaPackage.Literals.TGROUP_TYPE__CAPABILITY_DEFINITIONS);
			childrenFeatures.add(ToscaPackage.Literals.TGROUP_TYPE__INSTANCE_STATES);
			childrenFeatures.add(ToscaPackage.Literals.TGROUP_TYPE__INTERFACES);
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
	 * This returns TGroupType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TGroupType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TGroupType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TGroupType_type") :
			getString("_UI_TGroupType_type") + " " + label;
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

		switch (notification.getFeatureID(TGroupType.class)) {
			case ToscaPackage.TGROUP_TYPE__MEMBER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ToscaPackage.TGROUP_TYPE__REQUIREMENT_DEFINITIONS:
			case ToscaPackage.TGROUP_TYPE__CAPABILITY_DEFINITIONS:
			case ToscaPackage.TGROUP_TYPE__INSTANCE_STATES:
			case ToscaPackage.TGROUP_TYPE__INTERFACES:
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
				(ToscaPackage.Literals.TGROUP_TYPE__REQUIREMENT_DEFINITIONS,
				 ToscaFactory.eINSTANCE.createRequirementDefinitionsType()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TGROUP_TYPE__CAPABILITY_DEFINITIONS,
				 ToscaFactory.eINSTANCE.createCapabilityDefinitionsType()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TGROUP_TYPE__INSTANCE_STATES,
				 ToscaFactory.eINSTANCE.createTTopologyElementInstanceStates()));

		newChildDescriptors.add
			(createChildParameter
				(ToscaPackage.Literals.TGROUP_TYPE__INTERFACES,
				 ToscaFactory.eINSTANCE.createInterfacesType1()));
	}

}
