/**
 */
package de.ugoe.cs.as.mappingdsl.model.mapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.as.mappingdsl.model.mapping.Mapping#getTargetParameter <em>Target Parameter</em>}</li>
 *   <li>{@link de.ugoe.cs.as.mappingdsl.model.mapping.Mapping#getComperator <em>Comperator</em>}</li>
 *   <li>{@link de.ugoe.cs.as.mappingdsl.model.mapping.Mapping#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.as.mappingdsl.model.mapping.MappingPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Parameter</em>' containment reference.
	 * @see #setTargetParameter(Parameter)
	 * @see de.ugoe.cs.as.mappingdsl.model.mapping.MappingPackage#getMapping_TargetParameter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Parameter getTargetParameter();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.as.mappingdsl.model.mapping.Mapping#getTargetParameter <em>Target Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Parameter</em>' containment reference.
	 * @see #getTargetParameter()
	 * @generated
	 */
	void setTargetParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Comperator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.ugoe.cs.as.mappingdsl.model.mapping.ComparisonOperatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comperator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comperator</em>' attribute.
	 * @see de.ugoe.cs.as.mappingdsl.model.mapping.ComparisonOperatorType
	 * @see #setComperator(ComparisonOperatorType)
	 * @see de.ugoe.cs.as.mappingdsl.model.mapping.MappingPackage#getMapping_Comperator()
	 * @model required="true"
	 * @generated
	 */
	ComparisonOperatorType getComperator();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.as.mappingdsl.model.mapping.Mapping#getComperator <em>Comperator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comperator</em>' attribute.
	 * @see de.ugoe.cs.as.mappingdsl.model.mapping.ComparisonOperatorType
	 * @see #getComperator()
	 * @generated
	 */
	void setComperator(ComparisonOperatorType value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see de.ugoe.cs.as.mappingdsl.model.mapping.MappingPackage#getMapping_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.as.mappingdsl.model.mapping.Mapping#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // Mapping
