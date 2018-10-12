/**
 */
package de.ugoe.cs.oco.tosca;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TNode Type Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getTags <em>Tags</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getRequiredContainerFeatures <em>Required Container Features</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getImplementationArtifacts <em>Implementation Artifacts</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getDeploymentArtifacts <em>Deployment Artifacts</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getFinal <em>Final</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getName <em>Name</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeTypeImplementation()
 * @model extendedMetaData="name='tNodeTypeImplementation' kind='elementOnly'"
 * @generated
 */
public interface TNodeTypeImplementation extends TExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference.
	 * @see #setTags(TTags)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeTypeImplementation_Tags()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Tags' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TNodeTypeImplementation!tags'"
	 * @generated
	 */
	TTags getTags();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getTags <em>Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tags</em>' containment reference.
	 * @see #getTags()
	 * @generated
	 */
	void setTags(TTags value);

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference.
	 * @see #setDerivedFrom(DerivedFromType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeTypeImplementation_DerivedFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DerivedFrom' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TNodeTypeImplementation!derivedFrom'"
	 * @generated
	 */
	DerivedFromType getDerivedFrom();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getDerivedFrom <em>Derived From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived From</em>' containment reference.
	 * @see #getDerivedFrom()
	 * @generated
	 */
	void setDerivedFrom(DerivedFromType value);

	/**
	 * Returns the value of the '<em><b>Required Container Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Container Features</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Container Features</em>' containment reference.
	 * @see #setRequiredContainerFeatures(TRequiredContainerFeatures)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeTypeImplementation_RequiredContainerFeatures()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RequiredContainerFeatures' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TNodeTypeImplementation!requiredContainerFeatures'"
	 * @generated
	 */
	TRequiredContainerFeatures getRequiredContainerFeatures();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getRequiredContainerFeatures <em>Required Container Features</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Container Features</em>' containment reference.
	 * @see #getRequiredContainerFeatures()
	 * @generated
	 */
	void setRequiredContainerFeatures(TRequiredContainerFeatures value);

	/**
	 * Returns the value of the '<em><b>Implementation Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation Artifacts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Artifacts</em>' containment reference.
	 * @see #setImplementationArtifacts(TImplementationArtifacts)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeTypeImplementation_ImplementationArtifacts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImplementationArtifacts' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TNodeTypeImplementation!implementationArtifacts'"
	 * @generated
	 */
	TImplementationArtifacts getImplementationArtifacts();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getImplementationArtifacts <em>Implementation Artifacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation Artifacts</em>' containment reference.
	 * @see #getImplementationArtifacts()
	 * @generated
	 */
	void setImplementationArtifacts(TImplementationArtifacts value);

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
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeTypeImplementation_DeploymentArtifacts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeploymentArtifacts' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TNodeTypeImplementation!deploymentArtifacts'"
	 * @generated
	 */
	TDeploymentArtifacts getDeploymentArtifacts();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getDeploymentArtifacts <em>Deployment Artifacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Artifacts</em>' containment reference.
	 * @see #getDeploymentArtifacts()
	 * @generated
	 */
	void setDeploymentArtifacts(TDeploymentArtifacts value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link de.ugoe.cs.oco.tosca.TBoolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see de.ugoe.cs.oco.tosca.TBoolean
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #setAbstract(TBoolean)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeTypeImplementation_Abstract()
	 * @model default="no" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='abstract'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TNodeTypeImplementation!abstract'"
	 * @generated
	 */
	TBoolean getAbstract();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see de.ugoe.cs.oco.tosca.TBoolean
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(TBoolean value);

	/**
	 * Unsets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAbstract()
	 * @see #getAbstract()
	 * @see #setAbstract(TBoolean)
	 * @generated
	 */
	void unsetAbstract();

	/**
	 * Returns whether the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getAbstract <em>Abstract</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Abstract</em>' attribute is set.
	 * @see #unsetAbstract()
	 * @see #getAbstract()
	 * @see #setAbstract(TBoolean)
	 * @generated
	 */
	boolean isSetAbstract();

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link de.ugoe.cs.oco.tosca.TBoolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see de.ugoe.cs.oco.tosca.TBoolean
	 * @see #isSetFinal()
	 * @see #unsetFinal()
	 * @see #setFinal(TBoolean)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeTypeImplementation_Final()
	 * @model default="no" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='final'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TNodeTypeImplementation!final'"
	 * @generated
	 */
	TBoolean getFinal();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see de.ugoe.cs.oco.tosca.TBoolean
	 * @see #isSetFinal()
	 * @see #unsetFinal()
	 * @see #getFinal()
	 * @generated
	 */
	void setFinal(TBoolean value);

	/**
	 * Unsets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFinal()
	 * @see #getFinal()
	 * @see #setFinal(TBoolean)
	 * @generated
	 */
	void unsetFinal();

	/**
	 * Returns whether the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getFinal <em>Final</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Final</em>' attribute is set.
	 * @see #unsetFinal()
	 * @see #getFinal()
	 * @see #setFinal(TBoolean)
	 * @generated
	 */
	boolean isSetFinal();

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
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeTypeImplementation_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TNodeTypeImplementation!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Type</em>' attribute.
	 * @see #setNodeType(QName)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeTypeImplementation_NodeType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='nodeType'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TNodeTypeImplementation!nodeType'"
	 * @generated
	 */
	QName getNodeType();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getNodeType <em>Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Type</em>' attribute.
	 * @see #getNodeType()
	 * @generated
	 */
	void setNodeType(QName value);

	/**
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(String)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTNodeTypeImplementation_TargetNamespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TNodeTypeImplementation!targetNamespace'"
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

} // TNodeTypeImplementation
