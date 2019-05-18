/**
 */
package de.ugoe.cs.as.mappingdsl.model.mapping.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.ugoe.cs.as.mappingdsl.model.mapping.BinaryExpression;
import de.ugoe.cs.as.mappingdsl.model.mapping.BinaryExpressionOperatorType;
import de.ugoe.cs.as.mappingdsl.model.mapping.MappingFactory;
import de.ugoe.cs.as.mappingdsl.model.mapping.MappingPackage;

/**
 * This is the item provider adapter for a {@link de.ugoe.cs.as.mappingdsl.model.mapping.BinaryExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryExpressionItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpressionItemProvider(AdapterFactory adapterFactory) {
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

			addPart1PropertyDescriptor(object);
			addPart2PropertyDescriptor(object);
			addOperatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Part1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPart1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BinaryExpression_part1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BinaryExpression_part1_feature", "_UI_BinaryExpression_type"),
				 MappingPackage.Literals.BINARY_EXPRESSION__PART1,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Part2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPart2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BinaryExpression_part2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BinaryExpression_part2_feature", "_UI_BinaryExpression_type"),
				 MappingPackage.Literals.BINARY_EXPRESSION__PART2,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BinaryExpression_operator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BinaryExpression_operator_feature", "_UI_BinaryExpression_type"),
				 MappingPackage.Literals.BINARY_EXPRESSION__OPERATOR,
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
			childrenFeatures.add(MappingPackage.Literals.BINARY_EXPRESSION__PART1);
			childrenFeatures.add(MappingPackage.Literals.BINARY_EXPRESSION__PART2);
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
	 * This returns BinaryExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BinaryExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		BinaryExpressionOperatorType labelValue = ((BinaryExpression)object).getOperator();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_BinaryExpression_type") :
			getString("_UI_BinaryExpression_type") + " " + label;
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

		switch (notification.getFeatureID(BinaryExpression.class)) {
			case MappingPackage.BINARY_EXPRESSION__OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MappingPackage.BINARY_EXPRESSION__PART1:
			case MappingPackage.BINARY_EXPRESSION__PART2:
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
				(MappingPackage.Literals.BINARY_EXPRESSION__PART1,
				 MappingFactory.eINSTANCE.createTargetParameter()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.BINARY_EXPRESSION__PART1,
				 MappingFactory.eINSTANCE.createSourceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.BINARY_EXPRESSION__PART1,
				 MappingFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.BINARY_EXPRESSION__PART1,
				 MappingFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.BINARY_EXPRESSION__PART1,
				 MappingFactory.eINSTANCE.createFileSizeExtractor()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.BINARY_EXPRESSION__PART1,
				 MappingFactory.eINSTANCE.createFileContentExtractor()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.BINARY_EXPRESSION__PART1,
				 MappingFactory.eINSTANCE.createFileNumLinesExtractor()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.BINARY_EXPRESSION__PART1,
				 MappingFactory.eINSTANCE.createFolderCountExtractor()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.BINARY_EXPRESSION__PART1,
				 MappingFactory.eINSTANCE.createFolderSizeExtractor()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.BINARY_EXPRESSION__PART1,
				 MappingFactory.eINSTANCE.createFlavorMapper()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.BINARY_EXPRESSION__PART1,
				 MappingFactory.eINSTANCE.createCoreMapper()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.BINARY_EXPRESSION__PART2,
				 MappingFactory.eINSTANCE.createTargetParameter()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.BINARY_EXPRESSION__PART2,
				 MappingFactory.eINSTANCE.createSourceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.BINARY_EXPRESSION__PART2,
				 MappingFactory.eINSTANCE.createUnaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.BINARY_EXPRESSION__PART2,
				 MappingFactory.eINSTANCE.createBinaryExpression()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.BINARY_EXPRESSION__PART2,
				 MappingFactory.eINSTANCE.createFileSizeExtractor()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.BINARY_EXPRESSION__PART2,
				 MappingFactory.eINSTANCE.createFileContentExtractor()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.BINARY_EXPRESSION__PART2,
				 MappingFactory.eINSTANCE.createFileNumLinesExtractor()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.BINARY_EXPRESSION__PART2,
				 MappingFactory.eINSTANCE.createFolderCountExtractor()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.BINARY_EXPRESSION__PART2,
				 MappingFactory.eINSTANCE.createFolderSizeExtractor()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.BINARY_EXPRESSION__PART2,
				 MappingFactory.eINSTANCE.createFlavorMapper()));

		newChildDescriptors.add
			(createChildParameter
				(MappingPackage.Literals.BINARY_EXPRESSION__PART2,
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
			childFeature == MappingPackage.Literals.BINARY_EXPRESSION__PART1 ||
			childFeature == MappingPackage.Literals.BINARY_EXPRESSION__PART2;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
