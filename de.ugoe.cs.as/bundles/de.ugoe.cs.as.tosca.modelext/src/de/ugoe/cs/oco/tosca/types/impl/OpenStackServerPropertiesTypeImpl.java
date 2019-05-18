/**
 */
package de.ugoe.cs.oco.tosca.types.impl;

import de.ugoe.cs.oco.tosca.types.OpenStackServerPropertiesType;
import de.ugoe.cs.oco.tosca.types.TypesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Stack Server Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.impl.OpenStackServerPropertiesTypeImpl#getImage <em>Image</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.impl.OpenStackServerPropertiesTypeImpl#getFlavor <em>Flavor</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.impl.OpenStackServerPropertiesTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpenStackServerPropertiesTypeImpl extends MinimalEObjectImpl.Container implements OpenStackServerPropertiesType {
	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlavor() <em>Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavor()
	 * @generated
	 * @ordered
	 */
	protected static final String FLAVOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlavor() <em>Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlavor()
	 * @generated
	 * @ordered
	 */
	protected String flavor = FLAVOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenStackServerPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.OPEN_STACK_SERVER_PROPERTIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.OPEN_STACK_SERVER_PROPERTIES_TYPE__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlavor() {
		return flavor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlavor(String newFlavor) {
		String oldFlavor = flavor;
		flavor = newFlavor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.OPEN_STACK_SERVER_PROPERTIES_TYPE__FLAVOR, oldFlavor, flavor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.OPEN_STACK_SERVER_PROPERTIES_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.OPEN_STACK_SERVER_PROPERTIES_TYPE__IMAGE:
				return getImage();
			case TypesPackage.OPEN_STACK_SERVER_PROPERTIES_TYPE__FLAVOR:
				return getFlavor();
			case TypesPackage.OPEN_STACK_SERVER_PROPERTIES_TYPE__NAME:
				return getName();
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
			case TypesPackage.OPEN_STACK_SERVER_PROPERTIES_TYPE__IMAGE:
				setImage((String)newValue);
				return;
			case TypesPackage.OPEN_STACK_SERVER_PROPERTIES_TYPE__FLAVOR:
				setFlavor((String)newValue);
				return;
			case TypesPackage.OPEN_STACK_SERVER_PROPERTIES_TYPE__NAME:
				setName((String)newValue);
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
			case TypesPackage.OPEN_STACK_SERVER_PROPERTIES_TYPE__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case TypesPackage.OPEN_STACK_SERVER_PROPERTIES_TYPE__FLAVOR:
				setFlavor(FLAVOR_EDEFAULT);
				return;
			case TypesPackage.OPEN_STACK_SERVER_PROPERTIES_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case TypesPackage.OPEN_STACK_SERVER_PROPERTIES_TYPE__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case TypesPackage.OPEN_STACK_SERVER_PROPERTIES_TYPE__FLAVOR:
				return FLAVOR_EDEFAULT == null ? flavor != null : !FLAVOR_EDEFAULT.equals(flavor);
			case TypesPackage.OPEN_STACK_SERVER_PROPERTIES_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (image: ");
		result.append(image);
		result.append(", flavor: ");
		result.append(flavor);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OpenStackServerPropertiesTypeImpl
