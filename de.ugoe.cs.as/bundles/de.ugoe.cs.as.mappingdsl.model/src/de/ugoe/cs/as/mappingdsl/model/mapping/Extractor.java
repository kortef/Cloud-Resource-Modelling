/**
 */
package de.ugoe.cs.as.mappingdsl.model.mapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extractor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.as.mappingdsl.model.mapping.Extractor#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link de.ugoe.cs.as.mappingdsl.model.mapping.Extractor#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.as.mappingdsl.model.mapping.MappingPackage#getExtractor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Extractor extends Expression {
	/**
	 * Returns the value of the '<em><b>Recipe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipe</em>' attribute.
	 * @see #setRecipe(String)
	 * @see de.ugoe.cs.as.mappingdsl.model.mapping.MappingPackage#getExtractor_Recipe()
	 * @model
	 * @generated
	 */
	String getRecipe();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.as.mappingdsl.model.mapping.Extractor#getRecipe <em>Recipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipe</em>' attribute.
	 * @see #getRecipe()
	 * @generated
	 */
	void setRecipe(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see de.ugoe.cs.as.mappingdsl.model.mapping.MappingPackage#getExtractor_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.as.mappingdsl.model.mapping.Extractor#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Parameter extract(String recipe, String source);

} // Extractor
