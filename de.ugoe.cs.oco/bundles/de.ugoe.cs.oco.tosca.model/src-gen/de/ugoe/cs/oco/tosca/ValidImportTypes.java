/**
 */
package de.ugoe.cs.oco.tosca;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Valid Import Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getValidImportTypes()
 * @model
 * @generated
 */
public enum ValidImportTypes implements Enumerator {
	/**
	 * The '<em><b>TOSCA Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOSCA_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	TOSCA_TYPE(0, "TOSCAType", "http://docs.oasis-open.org/tosca/ns/2011/12"),

	/**
	 * The '<em><b>XSD Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XSD_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	XSD_TYPE(1, "XSDType", "http://www.w3.org/2001/XMLSchema");

	/**
	 * The '<em><b>TOSCA Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOSCA Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOSCA_TYPE
	 * @model name="TOSCAType" literal="http://docs.oasis-open.org/tosca/ns/2011/12"
	 * @generated
	 * @ordered
	 */
	public static final int TOSCA_TYPE_VALUE = 0;

	/**
	 * The '<em><b>XSD Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XSD Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XSD_TYPE
	 * @model name="XSDType" literal="http://www.w3.org/2001/XMLSchema"
	 * @generated
	 * @ordered
	 */
	public static final int XSD_TYPE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Valid Import Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ValidImportTypes[] VALUES_ARRAY =
		new ValidImportTypes[] {
			TOSCA_TYPE,
			XSD_TYPE,
		};

	/**
	 * A public read-only list of all the '<em><b>Valid Import Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ValidImportTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Valid Import Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ValidImportTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ValidImportTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Valid Import Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ValidImportTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ValidImportTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Valid Import Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ValidImportTypes get(int value) {
		switch (value) {
			case TOSCA_TYPE_VALUE: return TOSCA_TYPE;
			case XSD_TYPE_VALUE: return XSD_TYPE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ValidImportTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ValidImportTypes
