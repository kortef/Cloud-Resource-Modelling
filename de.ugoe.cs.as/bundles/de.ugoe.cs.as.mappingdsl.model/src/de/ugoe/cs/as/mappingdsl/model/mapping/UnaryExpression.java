/**
 */
package de.ugoe.cs.as.mappingdsl.model.mapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.as.mappingdsl.model.mapping.UnaryExpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.ugoe.cs.as.mappingdsl.model.mapping.UnaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.as.mappingdsl.model.mapping.MappingPackage#getUnaryExpression()
 * @model
 * @generated
 */
public interface UnaryExpression extends Expression {
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
	 * @see de.ugoe.cs.as.mappingdsl.model.mapping.MappingPackage#getUnaryExpression_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.as.mappingdsl.model.mapping.UnaryExpression#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.ugoe.cs.as.mappingdsl.model.mapping.UnaryExpressionOperatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see de.ugoe.cs.as.mappingdsl.model.mapping.UnaryExpressionOperatorType
	 * @see #setOperator(UnaryExpressionOperatorType)
	 * @see de.ugoe.cs.as.mappingdsl.model.mapping.MappingPackage#getUnaryExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	UnaryExpressionOperatorType getOperator();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.as.mappingdsl.model.mapping.UnaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see de.ugoe.cs.as.mappingdsl.model.mapping.UnaryExpressionOperatorType
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(UnaryExpressionOperatorType value);

} // UnaryExpression
