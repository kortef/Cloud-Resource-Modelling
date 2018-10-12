/**
 */
package de.ugoe.cs.oco.tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Operation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.RelationshipOperationType#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.RelationshipOperationType#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.RelationshipOperationType#getRelationshipRef <em>Relationship Ref</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getRelationshipOperationType()
 * @model extendedMetaData="name='RelationshipOperation_._type' kind='empty'"
 * @generated
 */
public interface RelationshipOperationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Name</em>' attribute.
	 * @see #setInterfaceName(String)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getRelationshipOperationType_InterfaceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='interfaceName'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!RelationshipOperationType!interfaceName'"
	 * @generated
	 */
	String getInterfaceName();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.RelationshipOperationType#getInterfaceName <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Name</em>' attribute.
	 * @see #getInterfaceName()
	 * @generated
	 */
	void setInterfaceName(String value);

	/**
	 * Returns the value of the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Name</em>' attribute.
	 * @see #setOperationName(String)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getRelationshipOperationType_OperationName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='operationName'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!RelationshipOperationType!operationName'"
	 * @generated
	 */
	String getOperationName();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.RelationshipOperationType#getOperationName <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Name</em>' attribute.
	 * @see #getOperationName()
	 * @generated
	 */
	void setOperationName(String value);

	/**
	 * Returns the value of the '<em><b>Relationship Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Ref</em>' reference.
	 * @see #setRelationshipRef(TRelationshipType)
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getRelationshipOperationType_RelationshipRef()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='attribute' name='relationshipRef'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://oco.cs.ugoe.de/tosca!RelationshipOperationType!relationshipRef'"
	 * @generated
	 */
	TRelationshipType getRelationshipRef();

	/**
	 * Sets the value of the '{@link de.ugoe.cs.oco.tosca.RelationshipOperationType#getRelationshipRef <em>Relationship Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Ref</em>' reference.
	 * @see #getRelationshipRef()
	 * @generated
	 */
	void setRelationshipRef(TRelationshipType value);

} // RelationshipOperationType
