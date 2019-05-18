/**
 */
package de.ugoe.cs.oco.tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TBoundary Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getProperties <em>Properties</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getPropertyConstraints <em>Property Constraints</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getPolicies <em>Policies</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTBoundaryDefinitions()
 * @model extendedMetaData="name='tBoundaryDefinitions' kind='elementOnly'"
 * @generated
 */
public interface TBoundaryDefinitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(PropertiesType1)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTBoundaryDefinitions_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType1 getProperties();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesType1 value);

	/**
	 * Returns the value of the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Constraints</em>' containment reference.
	 * @see #setPropertyConstraints(PropertyConstraintsType1)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTBoundaryDefinitions_PropertyConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PropertyConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyConstraintsType1 getPropertyConstraints();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getPropertyConstraints <em>Property Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Constraints</em>' containment reference.
	 * @see #getPropertyConstraints()
	 * @generated
	 */
	void setPropertyConstraints(PropertyConstraintsType1 value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(RequirementsType2)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTBoundaryDefinitions_Requirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Requirements' namespace='##targetNamespace'"
	 * @generated
	 */
	RequirementsType2 getRequirements();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getRequirements <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' containment reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(RequirementsType2 value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference.
	 * @see #setCapabilities(CapabilitiesType2)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTBoundaryDefinitions_Capabilities()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Capabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	CapabilitiesType2 getCapabilities();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getCapabilities <em>Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capabilities</em>' containment reference.
	 * @see #getCapabilities()
	 * @generated
	 */
	void setCapabilities(CapabilitiesType2 value);

	/**
	 * Returns the value of the '<em><b>Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policies</em>' containment reference.
	 * @see #setPolicies(PoliciesType2)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTBoundaryDefinitions_Policies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Policies' namespace='##targetNamespace'"
	 * @generated
	 */
	PoliciesType2 getPolicies();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getPolicies <em>Policies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policies</em>' containment reference.
	 * @see #getPolicies()
	 * @generated
	 */
	void setPolicies(PoliciesType2 value);

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interfaces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference.
	 * @see #setInterfaces(InterfacesType2)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTBoundaryDefinitions_Interfaces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Interfaces' namespace='##targetNamespace'"
	 * @generated
	 */
	InterfacesType2 getInterfaces();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getInterfaces <em>Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interfaces</em>' containment reference.
	 * @see #getInterfaces()
	 * @generated
	 */
	void setInterfaces(InterfacesType2 value);

} // TBoundaryDefinitions
