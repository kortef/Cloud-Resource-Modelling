/**
 */
package de.ugoe.cs.as.mspec.model.mapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.as.mspec.model.mapping.BinaryExpression#getPart1 <em>Part1</em>}</li>
 *   <li>{@link de.ugoe.cs.as.mspec.model.mapping.BinaryExpression#getPart2 <em>Part2</em>}</li>
 *   <li>{@link de.ugoe.cs.as.mspec.model.mapping.BinaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.as.mspec.model.mapping.MappingPackage#getBinaryExpression()
 * @model
 * @generated
 */
public interface BinaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Part1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part1</em>' containment reference.
	 * @see #setPart1(Expression)
	 * @see de.ugoe.cs.as.mspec.model.mapping.MappingPackage#getBinaryExpression_Part1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getPart1();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.as.mspec.model.mapping.BinaryExpression#getPart1 <em>Part1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part1</em>' containment reference.
	 * @see #getPart1()
	 * @generated
	 */
	void setPart1(Expression value);

	/**
	 * Returns the value of the '<em><b>Part2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part2</em>' containment reference.
	 * @see #setPart2(Expression)
	 * @see de.ugoe.cs.as.mspec.model.mapping.MappingPackage#getBinaryExpression_Part2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getPart2();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.as.mspec.model.mapping.BinaryExpression#getPart2 <em>Part2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part2</em>' containment reference.
	 * @see #getPart2()
	 * @generated
	 */
	void setPart2(Expression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.ugoe.cs.as.mspec.model.mapping.BinaryExpressionOperatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see de.ugoe.cs.as.mspec.model.mapping.BinaryExpressionOperatorType
	 * @see #setOperator(BinaryExpressionOperatorType)
	 * @see de.ugoe.cs.as.mspec.model.mapping.MappingPackage#getBinaryExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	BinaryExpressionOperatorType getOperator();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.as.mspec.model.mapping.BinaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see de.ugoe.cs.as.mspec.model.mapping.BinaryExpressionOperatorType
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryExpressionOperatorType value);

} // BinaryExpression
