/**
 */
package de.ugoe.cs.oco.tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TTopology Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.tosca.TTopologyTemplate#getGroup <em>Group</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TTopologyTemplate#getNodeTemplate <em>Node Template</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TTopologyTemplate#getRelationshipTemplate <em>Relationship Template</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.tosca.TTopologyTemplate#getGroupTemplate <em>Group Template</em>}</li>
 * </ul>
 *
 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTTopologyTemplate()
 * @model extendedMetaData="name='tTopologyTemplate' kind='elementOnly'"
 * @generated
 */
public interface TTopologyTemplate extends TExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTTopologyTemplate_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:3'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Node Template</b></em>' containment reference list.
	 * The list contents are of type {@link de.ugoe.cs.oco.tosca.TNodeTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Template</em>' containment reference list.
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTTopologyTemplate_NodeTemplate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NodeTemplate' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<TNodeTemplate> getNodeTemplate();

	/**
	 * Returns the value of the '<em><b>Relationship Template</b></em>' containment reference list.
	 * The list contents are of type {@link de.ugoe.cs.oco.tosca.TRelationshipTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Template</em>' containment reference list.
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTTopologyTemplate_RelationshipTemplate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RelationshipTemplate' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<TRelationshipTemplate> getRelationshipTemplate();

	/**
	 * Returns the value of the '<em><b>Group Template</b></em>' containment reference list.
	 * The list contents are of type {@link de.ugoe.cs.oco.tosca.TGroupTemplate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Template</em>' containment reference list.
	 * @see de.ugoe.cs.oco.tosca.ToscaPackage#getTTopologyTemplate_GroupTemplate()
	 * @model containment="true"
	 *        extendedMetaData="name='GroupTemplate' namespace='##targetNamespace' kind='element' group='#group:3'"
	 * @generated
	 */
	EList<TGroupTemplate> getGroupTemplate();

} // TTopologyTemplate
