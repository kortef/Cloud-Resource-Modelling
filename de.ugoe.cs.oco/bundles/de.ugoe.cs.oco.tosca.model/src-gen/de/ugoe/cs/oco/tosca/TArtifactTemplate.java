/**
 */
package de.ugoe.cs.oco.tosca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TArtifact Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.TArtifactTemplate#getArtifactReferences <em>Artifact References</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TArtifactTemplate#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTArtifactTemplate()
 * @model extendedMetaData="name='tArtifactTemplate' kind='elementOnly'"
 * @generated
 */
public interface TArtifactTemplate extends TEntityTemplate {
	/**
	 * Returns the value of the '<em><b>Artifact References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact References</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact References</em>' containment reference.
	 * @see #setArtifactReferences(ArtifactReferencesType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTArtifactTemplate_ArtifactReferences()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ArtifactReferences' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TArtifactTemplate!artifactReferences'"
	 * @generated
	 */
	ArtifactReferencesType getArtifactReferences();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TArtifactTemplate#getArtifactReferences <em>Artifact References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact References</em>' containment reference.
	 * @see #getArtifactReferences()
	 * @generated
	 */
	void setArtifactReferences(ArtifactReferencesType value);

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
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTArtifactTemplate_Name()
	 * @model extendedMetaData="kind='attribute' name='name'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TArtifactTemplate!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TArtifactTemplate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TArtifactTemplate
