/**
 */
package de.ugoe.cs.oco.mappingdsl.model.mapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.mappingdsl.model.mapping.Mapper#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.mappingdsl.model.mapping.MappingPackage#getMapper()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Mapper extends Expression {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link de.ugoe.cs.oco.mappingdsl.model.mapping.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see de.ugoe.cs.oco.mappingdsl.model.mapping.MappingPackage#getMapper_Parameters()
	 * @model required="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" parametersMany="false"
	 * @generated
	 */
	Parameter map(EList<Parameter> parameters);

} // Mapper
