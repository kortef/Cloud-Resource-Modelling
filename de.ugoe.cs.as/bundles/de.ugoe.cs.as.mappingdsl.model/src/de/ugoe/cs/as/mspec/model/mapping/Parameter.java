/**
 */
package de.ugoe.cs.as.mspec.model.mapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.as.mspec.model.mapping.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link de.ugoe.cs.as.mspec.model.mapping.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link de.ugoe.cs.as.mspec.model.mapping.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link de.ugoe.cs.as.mspec.model.mapping.Parameter#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.as.mspec.model.mapping.MappingPackage#getParameter()
 * @model abstract="true"
 * @generated
 */
public interface Parameter extends Expression {
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
	 * @see de.ugoe.cs.as.mspec.model.mapping.MappingPackage#getParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.as.mspec.model.mapping.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.ugoe.cs.as.mspec.model.mapping.ParameterValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.ugoe.cs.as.mspec.model.mapping.ParameterValueType
	 * @see #setType(ParameterValueType)
	 * @see de.ugoe.cs.as.mspec.model.mapping.MappingPackage#getParameter_Type()
	 * @model
	 * @generated
	 */
	ParameterValueType getType();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.as.mspec.model.mapping.Parameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.ugoe.cs.as.mspec.model.mapping.ParameterValueType
	 * @see #getType()
	 * @generated
	 */
	void setType(ParameterValueType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"\"\""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.ugoe.cs.as.mspec.model.mapping.MappingPackage#getParameter_Value()
	 * @model default="\"\""
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.as.mspec.model.mapping.Parameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link de.ugoe.cs.as.mspec.model.mapping.ParameterUnitType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see de.ugoe.cs.as.mspec.model.mapping.ParameterUnitType
	 * @see #setUnit(ParameterUnitType)
	 * @see de.ugoe.cs.as.mspec.model.mapping.MappingPackage#getParameter_Unit()
	 * @model
	 * @generated
	 */
	ParameterUnitType getUnit();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.as.mspec.model.mapping.Parameter#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see de.ugoe.cs.as.mspec.model.mapping.ParameterUnitType
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(ParameterUnitType value);

} // Parameter
