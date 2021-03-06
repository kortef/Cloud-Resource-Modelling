/**
 */
package de.ugoe.cs.oco.tosca.impl;

import de.ugoe.cs.oco.tosca.PropertyMappingsType;
import de.ugoe.cs.oco.tosca.TPropertyMapping;
import de.ugoe.cs.oco.tosca.ToscaFactory;
import de.ugoe.cs.oco.tosca.ToscaPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Mappings Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.impl.PropertyMappingsTypeImpl#getPropertyMapping <em>Property Mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyMappingsTypeImpl extends MinimalEObjectImpl.Container implements PropertyMappingsType {
	/**
	 * The cached value of the '{@link #getPropertyMapping() <em>Property Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyMapping()
	 * @generated
	 * @ordered
	 */
	protected EList<TPropertyMapping> propertyMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyMappingsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.PROPERTY_MAPPINGS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<TPropertyMapping> getPropertyMapping() {
		if (propertyMapping == null) {
			propertyMapping = new EObjectContainmentEList<TPropertyMapping>(TPropertyMapping.class, this, ToscaPackage.PROPERTY_MAPPINGS_TYPE__PROPERTY_MAPPING);
			propertyMapping.add(ToscaFactory.eINSTANCE.createTPropertyMapping());
		}
		return propertyMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToscaPackage.PROPERTY_MAPPINGS_TYPE__PROPERTY_MAPPING:
				return ((InternalEList<?>)getPropertyMapping()).basicRemove(otherEnd, msgs);
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
			case ToscaPackage.PROPERTY_MAPPINGS_TYPE__PROPERTY_MAPPING:
				return getPropertyMapping();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ToscaPackage.PROPERTY_MAPPINGS_TYPE__PROPERTY_MAPPING:
				getPropertyMapping().clear();
				getPropertyMapping().addAll((Collection<? extends TPropertyMapping>)newValue);
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
			case ToscaPackage.PROPERTY_MAPPINGS_TYPE__PROPERTY_MAPPING:
				getPropertyMapping().clear();
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
			case ToscaPackage.PROPERTY_MAPPINGS_TYPE__PROPERTY_MAPPING:
				return propertyMapping != null && !propertyMapping.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PropertyMappingsTypeImpl
