/**
 */
package de.ugoe.cs.oco.tosca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TRelationship Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.TRelationshipTemplate#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TRelationshipTemplate#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TRelationshipTemplate#getRelationshipConstraints <em>Relationship Constraints</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TRelationshipTemplate#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTRelationshipTemplate()
 * @model extendedMetaData="name='tRelationshipTemplate' kind='elementOnly'"
 * @generated
 */
public interface TRelationshipTemplate extends TEntityTemplate {
	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' containment reference.
	 * @see #setSourceElement(SourceElementType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTRelationshipTemplate_SourceElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SourceElement' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TRelationshipTemplate!sourceElement'"
	 * @generated
	 */
	SourceElementType getSourceElement();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TRelationshipTemplate#getSourceElement <em>Source Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element</em>' containment reference.
	 * @see #getSourceElement()
	 * @generated
	 */
	void setSourceElement(SourceElementType value);

	/**
	 * Returns the value of the '<em><b>Target Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Element</em>' containment reference.
	 * @see #setTargetElement(TargetElementType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTRelationshipTemplate_TargetElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TargetElement' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TRelationshipTemplate!targetElement'"
	 * @generated
	 */
	TargetElementType getTargetElement();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TRelationshipTemplate#getTargetElement <em>Target Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element</em>' containment reference.
	 * @see #getTargetElement()
	 * @generated
	 */
	void setTargetElement(TargetElementType value);

	/**
	 * Returns the value of the '<em><b>Relationship Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Constraints</em>' containment reference.
	 * @see #setRelationshipConstraints(RelationshipConstraintsType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTRelationshipTemplate_RelationshipConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RelationshipConstraints' namespace='##targetNamespace'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TRelationshipTemplate!relationshipConstraints'"
	 * @generated
	 */
	RelationshipConstraintsType getRelationshipConstraints();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TRelationshipTemplate#getRelationshipConstraints <em>Relationship Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Constraints</em>' containment reference.
	 * @see #getRelationshipConstraints()
	 * @generated
	 */
	void setRelationshipConstraints(RelationshipConstraintsType value);

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
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTRelationshipTemplate_Name()
	 * @model extendedMetaData="kind='attribute' name='name'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!TRelationshipTemplate!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.TRelationshipTemplate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TRelationshipTemplate
