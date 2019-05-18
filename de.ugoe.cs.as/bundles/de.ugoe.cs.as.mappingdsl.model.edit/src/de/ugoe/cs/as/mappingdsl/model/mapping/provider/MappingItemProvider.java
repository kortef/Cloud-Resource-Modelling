/**
 */
package de.ugoe.cs.as.mappingdsl.model.mapping.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.ugoe.cs.as.mappingdsl.model.mapping.ComparisonOperatorType;
import de.ugoe.cs.as.mappingdsl.model.mapping.Mapping;
import de.ugoe.cs.as.mappingdsl.model.mapping.MappingFactory;
import de.ugoe.cs.as.mappingdsl.model.mapping.MappingPackage;

/**
 * This is the item provider adapter for a {@link de.ugoe.cs.as.mappingdsl.model.mapping.Mapping} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingItemProvider(AdapterFactory adapterFactory) {
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

			addComperatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Comperator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mapping_comperator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Mapping_comperator_feature", "_UI_Mapping_type"),
				 MappingPackage.Literals.MAPPING__COMPERATOR,
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
			childrenFeatures.add(MappingPackage.Literals.MAPPING__TARGET_PARAMETER);
			childrenFeatures.add(MappingPackage.Literals.MAPPING__EXPRESSION);
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
	 * This returns Mapping.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Mapping"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ComparisonOperatorType labelValue = ((Mapping)object).getComperator();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_Mapping_type") :
			getString("_UI_Mapping_type") + " " + label;
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

		switch (notification.getFeatureID(Mapping.class)) {
			case MappingPackage.MAPPING__COMPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MappingPackage.MAPPING__TARGET_PARAMETER:
			case MappingPackage.MAPPING__EXPRESSION:
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
				(MappingPackage.Literals.MAPPING__TARGET_PARAMETER,
				 MappingFactory.eINSTANCE.createTargetParameter()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING__TARGET_PARAMETER,
				 MappingFactory.eINSTANCE.createSourceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING__EXPRESSION,
				 MappingFactory.eINSTANCE.createTargetParameter()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING__EXPRESSION,
				 MappingFactory.eINSTANCE.createSourceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING__EXPRESSION,
				 MappingFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING__EXPRESSION,
				 MappingFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING__EXPRESSION,
				 MappingFactory.eINSTANCE.createFileSizeExtractor()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING__EXPRESSION,
				 MappingFactory.eINSTANCE.createFileContentExtractor()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING__EXPRESSION,
				 MappingFactory.eINSTANCE.createFileNumLinesExtractor()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING__EXPRESSION,
				 MappingFactory.eINSTANCE.createFolderCountExtractor()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING__EXPRESSION,
				 MappingFactory.eINSTANCE.createFolderSizeExtractor()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING__EXPRESSION,
				 MappingFactory.eINSTANCE.createFlavorMapper()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.MAPPING__EXPRESSION,
				 MappingFactory.eINSTANCE.createCoreMapper()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == MappingPackage.Literals.MAPPING__TARGET_PARAMETER ||
			childFeature == MappingPackage.Literals.MAPPING__EXPRESSION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MappingEditPlugin.INSTANCE;
	}

}
