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
 *   <li>{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getPolicies <em>Policies</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getDeploymentArtifacts <em>Deployment Artifacts</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getMaxInstances <em>Max Instances</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getMinInstances <em>Min Instances</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getName <em>Name</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupTemplate()
 * @model extendedMetaData="name='tGroupTemplate' kind='elementOnly'"
 * @generated
 */
public interface TGroupTemplate extends TEntityTemplate {
	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(RequirementsType1)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupTemplate_Requirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Requirements' namespace='##targetNamespace'"
	 * @generated
	 */
	RequirementsType1 getRequirements();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getRequirements <em>Requirements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' containment reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(RequirementsType1 value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capabilities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference.
	 * @see #setCapabilities(CapabilitiesType1)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupTemplate_Capabilities()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Capabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	CapabilitiesType1 getCapabilities();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getCapabilities <em>Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capabilities</em>' containment reference.
	 * @see #getCapabilities()
	 * @generated
	 */
	void setCapabilities(CapabilitiesType1 value);

	/**
	 * Returns the value of the '<em><b>Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policies</em>' containment reference.
	 * @see #setPolicies(PoliciesType1)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupTemplate_Policies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Policies' namespace='##targetNamespace'"
	 * @generated
	 */
	PoliciesType1 getPolicies();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getPolicies <em>Policies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policies</em>' containment reference.
	 * @see #getPolicies()
	 * @generated
	 */
	void setPolicies(PoliciesType1 value);

	/**
	 * Returns the value of the '<em><b>Deployment Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployment Artifacts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Artifacts</em>' containment reference.
	 * @see #setDeploymentArtifacts(TDeploymentArtifacts)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupTemplate_DeploymentArtifacts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeploymentArtifacts' namespace='##targetNamespace'"
	 * @generated
	 */
	TDeploymentArtifacts getDeploymentArtifacts();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getDeploymentArtifacts <em>Deployment Artifacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Artifacts</em>' containment reference.
	 * @see #getDeploymentArtifacts()
	 * @generated
	 */
	void setDeploymentArtifacts(TDeploymentArtifacts value);

	/**
	 * Returns the value of the '<em><b>Max Instances</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Instances</em>' attribute.
	 * @see #isSetMaxInstances()
	 * @see #unsetMaxInstances()
	 * @see #setMaxInstances(Object)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupTemplate_MaxInstances()
	 * @model default="1" unsettable="true" dataType="de.ugoe.cs.oco.tosca.MaxInstancesType"
	 *        extendedMetaData="kind='attribute' name='maxInstances'"
	 * @generated
	 */
	Object getMaxInstances();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getMaxInstances <em>Max Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Instances</em>' attribute.
	 * @see #isSetMaxInstances()
	 * @see #unsetMaxInstances()
	 * @see #getMaxInstances()
	 * @generated
	 */
	void setMaxInstances(Object value);

	/**
	 * Unsets the value of the '{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getMaxInstances <em>Max Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxInstances()
	 * @see #getMaxInstances()
	 * @see #setMaxInstances(Object)
	 * @generated
	 */
	void unsetMaxInstances();

	/**
	 * Returns whether the value of the '{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getMaxInstances <em>Max Instances</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Instances</em>' attribute is set.
	 * @see #unsetMaxInstances()
	 * @see #getMaxInstances()
	 * @see #setMaxInstances(Object)
	 * @generated
	 */
	boolean isSetMaxInstances();

	/**
	 * Returns the value of the '<em><b>Min Instances</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Instances</em>' attribute.
	 * @see #isSetMinInstances()
	 * @see #unsetMinInstances()
	 * @see #setMinInstances(int)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTGroupTemplate_MinInstances()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='attribute' name='minInstances'"
	 * @generated
	 */
	int getMinInstances();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getMinInstances <em>Min Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Instances</em>' attribute.
	 * @see #isSetMinInstances()
	 * @see #unsetMinInstances()
	 * @see #getMinInstances()
	 * @generated
	 */
	void setMinInstances(int value);

	/**
	 * Unsets the value of the '{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getMinInstances <em>Min Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinInstances()
	 * @see #getMinInstances()
	 * @see #setMinInstances(int)
	 * @generated
	 */
	void unsetMinInstances();

	/**
	 * Returns whether the value of the '{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getMinInstances <em>Min Instances</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Instances</em>' attribute is set.
	 * @see #unsetMinInstances()
	 * @see #getMinInstances()
	 * @see #setMinInstances(int)
	 * @generated
	 */
	boolean isSetMinInstances();

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
	 * @model extendedMetaData="kind='attribute' name='name'"
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
	 * @model
	 * @generated
	 */
	EList<String> getMember();

} // TGroupTemplate
