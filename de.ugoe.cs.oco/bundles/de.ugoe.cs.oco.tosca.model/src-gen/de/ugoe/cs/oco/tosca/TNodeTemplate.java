/**
 */
package de.ugoe.cs.oco.tosca;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TNode Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getCapabilities <em>Capabilities</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getPolicies <em>Policies</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getDeploymentArtifacts <em>Deployment Artifacts</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getMaxInstances <em>Max Instances</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getMinInstances <em>Min Instances</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeTemplate()
 * @model extendedMetaData="name='tNodeTemplate' kind='elementOnly'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='typeMustBeNodeType capabilitiesMustBeDefinedInReferencedNodeType requirementsMustBeDefinedInReferencedNodeType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot typeMustBeNodeType='\n\t\t\tself.typeRef.oclIsKindOf(TNodeType)' capabilitiesMustBeDefinedInReferencedNodeType='\n\t\t\tif self.typeRef.oclIsKindOf(TNodeType) and self.capabilities &lt;&gt; null then\n\t\t\t\tif self.capabilities.capability-&gt;forAll(\n\t\t\t\t\tself.typeRef.oclAsType(tosca::TNodeType).capabilityDefinitions &lt;&gt; null and\n\t\t\t\t\tself.typeRef.oclAsType(tosca::TNodeType).capabilityDefinitions.capabilityDefinition\n\t\t\t\t\t\t-&gt;collect(capabilityTypeRef)\n\t\t\t\t\t\t-&gt;includes(typeRef) or\n\t\t\t\t\tself.typeRef.oclAsType(tosca::TNodeType)\n\t\t\t\t\t\t-&gt;closure(\n\t\t\t\t\t\t\tif derivedFrom &lt;&gt; null then \n\t\t\t\t\t\t\t\tderivedFrom.referencedEntityType \n\t\t\t\t\t\t\telse \n\t\t\t\t\t\t\t\tnull \n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t)\n\t\t\t\t\t\t-&gt;select(et | et &lt;&gt; null)\n\t\t\t\t\t    -&gt;collect(oclAsType(tosca::TNodeType))\n\t\t\t\t\t\t-&gt;collect(capabilityDefinitions)\n\t\t\t\t\t\t-&gt;select(cd | cd &lt;&gt; null)\n\t\t\t\t\t\t-&gt;collect(capabilityDefinition.capabilityTypeRef)\n\t\t\t\t\t\t-&gt;includes(typeRef)) then \n\t\t\t\t\ttrue \n\t\t\t\telse \n\t\t\t\t\tnull \n\t\t\t\tendif \n\t\t\telse \n\t\t\t\ttrue \n\t\t\tendif' requirementsMustBeDefinedInReferencedNodeType='\n\t\t\t\tif self.typeRef.oclIsKindOf(TNodeType) and self.requirements &lt;&gt; null then\n\t\t\t\tif self.requirements.requirement-&gt;forAll(\n\t\t\t\t\tself.typeRef.oclAsType(tosca::TNodeType).requirementDefinitions &lt;&gt; null and\n\t\t\t\t\tself.typeRef.oclAsType(tosca::TNodeType).requirementDefinitions.requirementDefinition\n\t\t\t\t\t\t-&gt;collect(requirementTypeRef)\n\t\t\t\t\t\t-&gt;includes(typeRef) or\n\t\t\t\t\tself.typeRef.oclAsType(tosca::TNodeType)\n\t\t\t\t\t\t-&gt;closure(\n\t\t\t\t\t\t\tif derivedFrom &lt;&gt; null then \n\t\t\t\t\t\t\t\tderivedFrom.referencedEntityType \n\t\t\t\t\t\t\telse \n\t\t\t\t\t\t\t\tnull \n\t\t\t\t\t\t\tendif\n\t\t\t\t\t\t)\n\t\t\t\t\t\t-&gt;select(et | et &lt;&gt; null)\n\t\t\t\t\t    -&gt;collect(oclAsType(tosca::TNodeType))\n\t\t\t\t\t\t-&gt;collect(requirementDefinitions)\n\t\t\t\t\t\t-&gt;select(cd | cd &lt;&gt; null)\n\t\t\t\t\t\t-&gt;collect(requirementDefinition.requirementTypeRef)\n\t\t\t\t\t\t-&gt;includes(typeRef)) then \n\t\t\t\t\ttrue \n\t\t\t\telse \n\t\t\t\t\tnull \n\t\t\t\tendif \n\t\t\telse \n\t\t\t\ttrue \n\t\t\tendif'"
 * @generated
 */
public interface TNodeTemplate extends TEntityTemplate {
	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference.
	 * @see #setRequirements(RequirementsType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeTemplate_Requirements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Requirements' namespace='##targetNamespace'"
	 * @generated
	 */
	RequirementsType getRequirements();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getRequirements <em>Requirements</em>}' containment reference.
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
	 * If the meaning of the '<em>Capabilities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capabilities</em>' containment reference.
	 * @see #setCapabilities(CapabilitiesType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeTemplate_Capabilities()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Capabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	CapabilitiesType getCapabilities();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getCapabilities <em>Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capabilities</em>' containment reference.
	 * @see #getCapabilities()
	 * @generated
	 */
	void setCapabilities(CapabilitiesType value);

	/**
	 * Returns the value of the '<em><b>Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policies</em>' containment reference.
	 * @see #setPolicies(PoliciesType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeTemplate_Policies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Policies' namespace='##targetNamespace'"
	 * @generated
	 */
	PoliciesType getPolicies();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getPolicies <em>Policies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policies</em>' containment reference.
	 * @see #getPolicies()
	 * @generated
	 */
	void setPolicies(PoliciesType value);

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
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeTemplate_DeploymentArtifacts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeploymentArtifacts' namespace='##targetNamespace'"
	 * @generated
	 */
	TDeploymentArtifacts getDeploymentArtifacts();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getDeploymentArtifacts <em>Deployment Artifacts</em>}' containment reference.
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
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeTemplate_MaxInstances()
	 * @model default="1" unsettable="true" dataType="de.ugoe.cs.oco.tosca.MaxInstancesType1"
	 *        extendedMetaData="kind='attribute' name='maxInstances'"
	 * @generated
	 */
	Object getMaxInstances();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getMaxInstances <em>Max Instances</em>}' attribute.
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
	 * Unsets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getMaxInstances <em>Max Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxInstances()
	 * @see #getMaxInstances()
	 * @see #setMaxInstances(Object)
	 * @generated
	 */
	void unsetMaxInstances();

	/**
	 * Returns whether the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getMaxInstances <em>Max Instances</em>}' attribute is set.
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
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeTemplate_MinInstances()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='attribute' name='minInstances'"
	 * @generated
	 */
	int getMinInstances();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getMinInstances <em>Min Instances</em>}' attribute.
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
	 * Unsets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getMinInstances <em>Min Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinInstances()
	 * @see #getMinInstances()
	 * @see #setMinInstances(int)
	 * @generated
	 */
	void unsetMinInstances();

	/**
	 * Returns whether the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getMinInstances <em>Min Instances</em>}' attribute is set.
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
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeTemplate_Name()
	 * @model extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TNodeTemplate
