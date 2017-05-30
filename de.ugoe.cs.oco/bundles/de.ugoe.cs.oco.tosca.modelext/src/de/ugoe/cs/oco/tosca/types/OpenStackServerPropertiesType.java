/**
 */
package de.ugoe.cs.oco.tosca.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Stack Server Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.OpenStackServerPropertiesType#getImage <em>Image</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.OpenStackServerPropertiesType#getFlavor <em>Flavor</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.types.OpenStackServerPropertiesType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getOpenStackServerPropertiesType()
 * @model extendedMetaData="name='OpenStackServerPropertiesType' kind='elementOnly'"
 * @generated
 */
public interface OpenStackServerPropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getOpenStackServerPropertiesType_Image()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='image' namespace='##targetNamespace'"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.OpenStackServerPropertiesType#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flavor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flavor</em>' attribute.
	 * @see #setFlavor(String)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getOpenStackServerPropertiesType_Flavor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='flavor' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFlavor();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.OpenStackServerPropertiesType#getFlavor <em>Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flavor</em>' attribute.
	 * @see #getFlavor()
	 * @generated
	 */
	void setFlavor(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.ugoe.cs.oco.tosca.types.TypesPackage#getOpenStackServerPropertiesType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.types.OpenStackServerPropertiesType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // OpenStackServerPropertiesType
