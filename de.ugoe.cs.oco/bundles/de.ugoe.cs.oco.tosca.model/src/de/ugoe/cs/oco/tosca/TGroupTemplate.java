/**
 */
package de.ugoe.cs.oco.tosca;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TGroup Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getName <em>Name</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getMember <em>Member</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupTemplate()
 * @model extendedMetaData="kind='elementOnly' name='tGroupTemplate'"
 * @generated
 */
public interface TGroupTemplate extends TEntityTemplate {
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
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupTemplate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' attribute list.
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupTemplate_Member()
	 * @model extendedMetaData="name='Member' namespace='##targetNamespace' kind='element'"
	 * @generated
	 */
	EList<String> getMember();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(RequirementsType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupTemplate_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	RequirementsType getRequirements();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getRequirements <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' containment reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(RequirementsType value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference.
	 * @see #setCapabilities(CapabilitiesType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupTemplate_Capabilities()
	 * @model containment="true"
	 * @generated
	 */
	CapabilitiesType getCapabilities();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getCapabilities <em>Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capabilities</em>' containment reference.
	 * @see #getCapabilities()
	 * @generated
	 */
	void setCapabilities(CapabilitiesType value);

} // TGroupTemplate
