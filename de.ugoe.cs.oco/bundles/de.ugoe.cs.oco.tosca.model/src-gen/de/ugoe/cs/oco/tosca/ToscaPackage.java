/**
 */
package de.ugoe.cs.oco.tosca;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * <div xmlns="http://www.w3.org/1999/xhtml">
 * <h1>About the XML namespace</h1>
 * 
 * <div class="bodytext">
 * <p>
 * This schema document describes the XML namespace, in a form
 * suitable for import by other schema documents.
 * </p>
 * <p>
 * See <a href="http://www.w3.org/XML/1998/namespace.html">
 * http://www.w3.org/XML/1998/namespace.html</a> and
 * <a href="http://www.w3.org/TR/REC-xml">
 * http://www.w3.org/TR/REC-xml</a> for information
 * about this namespace.
 * </p>
 * <p>
 * Note that local names in this namespace are intended to be
 * defined only by the World Wide Web Consortium or its subgroups.
 * The names currently defined in this namespace are listed below.
 * They should not be used with conflicting semantics by any Working
 * Group, specification, or document instance.
 * </p>
 * <p>
 * See further below in this document for more information about <a href="#usage">how to refer to this schema document from your own
 * XSD schema documents</a> and about <a href="#nsversioning">the
 * namespace-versioning policy governing this schema document</a>.
 * </p>
 * </div>
 * </div>
 * 
 * 
 * <div xmlns="http://www.w3.org/1999/xhtml">
 * 
 * <h3>Father (in any context at all)</h3>
 * 
 * <div class="bodytext">
 * <p>
 * denotes Jon Bosak, the chair of
 * the original XML Working Group.  This name is reserved by
 * the following decision of the W3C XML Plenary and
 * XML Coordination groups:
 * </p>
 * <blockquote>
 * <p>
 * In appreciation for his vision, leadership and
 * dedication the W3C XML Plenary on this 10th day of
 * February, 2000, reserves for Jon Bosak in perpetuity
 * the XML name "xml:Father".
 * </p>
 * </blockquote>
 * </div>
 * </div>
 * 
 * 
 * <div id="usage" xml:id="usage" xmlns="http://www.w3.org/1999/xhtml">
 * <h2>
 * <a name="usage">About this schema document</a>
 * </h2>
 * 
 * <div class="bodytext">
 * <p>
 * This schema defines attributes and an attribute group suitable
 * for use by schemas wishing to allow <code>xml:base</code>,
 * <code>xml:lang</code>, <code>xml:space</code> or
 * <code>xml:id</code> attributes on elements they define.
 * </p>
 * <p>
 * To enable this, such a schema must import this schema for
 * the XML namespace, e.g. as follows:
 * </p>
 * <pre>
 * &lt;schema . . .&gt;
 * . . .
 * &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 * schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 * </pre>
 * <p>
 * or
 * </p>
 * <pre>
 * &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 * schemaLocation="http://www.w3.org/2009/01/xml.xsd"/&gt;
 * </pre>
 * <p>
 * Subsequently, qualified reference to any of the attributes or the
 * group defined below will have the desired effect, e.g.
 * </p>
 * <pre>
 * &lt;type . . .&gt;
 * . . .
 * &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 * </pre>
 * <p>
 * will define a type which will schema-validate an instance element
 * with any of those attributes.
 * </p>
 * </div>
 * </div>
 * 
 * 
 * <div id="nsversioning" xml:id="nsversioning" xmlns="http://www.w3.org/1999/xhtml">
 * <h2>
 * <a name="nsversioning">Versioning policy for this schema document</a>
 * </h2>
 * <div class="bodytext">
 * <p>
 * In keeping with the XML Schema WG's standard versioning
 * policy, this schema document will persist at
 * <a href="http://www.w3.org/2009/01/xml.xsd">
 * http://www.w3.org/2009/01/xml.xsd</a>.
 * </p>
 * <p>
 * At the date of issue it can also be found at
 * <a href="http://www.w3.org/2001/xml.xsd">
 * http://www.w3.org/2001/xml.xsd</a>.
 * </p>
 * <p>
 * The schema document at that URI may however change in the future,
 * in order to remain compatible with the latest version of XML
 * Schema itself, or with the XML namespace itself.  In other words,
 * if the XML Schema or XML namespaces change, the version of this
 * document at <a href="http://www.w3.org/2001/xml.xsd">
 * http://www.w3.org/2001/xml.xsd
 * </a>
 * will change accordingly; the version at
 * <a href="http://www.w3.org/2009/01/xml.xsd">
 * http://www.w3.org/2009/01/xml.xsd
 * </a>
 * will not change.
 * </p>
 * <p>
 * Previous dated (and unchanging) versions of this schema
 * document are at:
 * </p>
 * <ul>
 * <li>
 * <a href="http://www.w3.org/2009/01/xml.xsd">
 * http://www.w3.org/2009/01/xml.xsd</a>
 * </li>
 * <li>
 * <a href="http://www.w3.org/2007/08/xml.xsd">
 * http://www.w3.org/2007/08/xml.xsd</a>
 * </li>
 * <li>
 * <a href="http://www.w3.org/2004/10/xml.xsd">
 * http://www.w3.org/2004/10/xml.xsd</a>
 * </li>
 * <li>
 * <a href="http://www.w3.org/2001/03/xml.xsd">
 * http://www.w3.org/2001/03/xml.xsd</a>
 * </li>
 * </ul>
 * </div>
 * </div>
 * 
 * <!-- end-model-doc -->
 * @see de.ugoe.cs.oco.tosca.ToscaFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore' ecore.xml.type='http://www.eclipse.org/emf/2003/XMLType' xml='../../org.eclipse.emf.ecore/model/XMLNamespace.ecore#/' xsd='../../org.eclipse.xsd/model/XSD.ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ToscaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tosca";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://oco.cs.ugoe.de/tosca";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tosca";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ToscaPackage eINSTANCE = de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.ArtifactReferencesTypeImpl <em>Artifact References Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.ArtifactReferencesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getArtifactReferencesType()
	 * @generated
	 */
	int ARTIFACT_REFERENCES_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Artifact Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCES_TYPE__ARTIFACT_REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Artifact References Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Artifact References Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_REFERENCES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.CapabilitiesTypeImpl <em>Capabilities Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.CapabilitiesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getCapabilitiesType()
	 * @generated
	 */
	int CAPABILITIES_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE__CAPABILITY = 0;

	/**
	 * The number of structural features of the '<em>Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.CapabilitiesType1Impl <em>Capabilities Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.CapabilitiesType1Impl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getCapabilitiesType1()
	 * @generated
	 */
	int CAPABILITIES_TYPE1 = 2;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE1__CAPABILITY = 0;

	/**
	 * The number of structural features of the '<em>Capabilities Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Capabilities Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.CapabilitiesType2Impl <em>Capabilities Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.CapabilitiesType2Impl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getCapabilitiesType2()
	 * @generated
	 */
	int CAPABILITIES_TYPE2 = 3;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE2__CAPABILITY = 0;

	/**
	 * The number of structural features of the '<em>Capabilities Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Capabilities Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.CapabilityDefinitionsTypeImpl <em>Capability Definitions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.CapabilityDefinitionsTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getCapabilityDefinitionsType()
	 * @generated
	 */
	int CAPABILITY_DEFINITIONS_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Capability Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEFINITIONS_TYPE__CAPABILITY_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Capability Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEFINITIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Capability Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEFINITIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.CapabilityDefinitionsType1Impl <em>Capability Definitions Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.CapabilityDefinitionsType1Impl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getCapabilityDefinitionsType1()
	 * @generated
	 */
	int CAPABILITY_DEFINITIONS_TYPE1 = 5;

	/**
	 * The feature id for the '<em><b>Capability Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEFINITIONS_TYPE1__CAPABILITY_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Capability Definitions Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEFINITIONS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Capability Definitions Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_DEFINITIONS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.ConstraintsTypeImpl <em>Constraints Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.ConstraintsTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getConstraintsType()
	 * @generated
	 */
	int CONSTRAINTS_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE__CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.ConstraintsType1Impl <em>Constraints Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.ConstraintsType1Impl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getConstraintsType1()
	 * @generated
	 */
	int CONSTRAINTS_TYPE1 = 7;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE1__CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Constraints Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constraints Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINTS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TExtensibleElementsImpl <em>TExtensible Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TExtensibleElementsImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTExtensibleElements()
	 * @generated
	 */
	int TEXTENSIBLE_ELEMENTS = 70;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIBLE_ELEMENTS__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIBLE_ELEMENTS__ANY = 1;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE = 2;

	/**
	 * The number of structural features of the '<em>TExtensible Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIBLE_ELEMENTS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TExtensible Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIBLE_ELEMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TDefinitionsImpl <em>TDefinitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TDefinitionsImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTDefinitions()
	 * @generated
	 */
	int TDEFINITIONS = 62;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__EXTENSIONS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__IMPORT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__TYPES = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__GROUP = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Service Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__SERVICE_TEMPLATE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__NODE_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Node Type Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__NODE_TYPE_IMPLEMENTATION = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Relationship Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__RELATIONSHIP_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Relationship Type Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Requirement Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__REQUIREMENT_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__CAPABILITY_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Artifact Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ARTIFACT_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Artifact Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ARTIFACT_TEMPLATE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__POLICY_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Policy Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__POLICY_TEMPLATE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Group Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__GROUP_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ID = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__TARGET_NAMESPACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>TDefinitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>TDefinitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.DefinitionsTypeImpl <em>Definitions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.DefinitionsTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getDefinitionsType()
	 * @generated
	 */
	int DEFINITIONS_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__DOCUMENTATION = TDEFINITIONS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__ANY = TDEFINITIONS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__ANY_ATTRIBUTE = TDEFINITIONS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__EXTENSIONS = TDEFINITIONS__EXTENSIONS;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__IMPORT = TDEFINITIONS__IMPORT;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__TYPES = TDEFINITIONS__TYPES;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__GROUP = TDEFINITIONS__GROUP;

	/**
	 * The feature id for the '<em><b>Service Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__SERVICE_TEMPLATE = TDEFINITIONS__SERVICE_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__NODE_TYPE = TDEFINITIONS__NODE_TYPE;

	/**
	 * The feature id for the '<em><b>Node Type Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__NODE_TYPE_IMPLEMENTATION = TDEFINITIONS__NODE_TYPE_IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Relationship Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__RELATIONSHIP_TYPE = TDEFINITIONS__RELATIONSHIP_TYPE;

	/**
	 * The feature id for the '<em><b>Relationship Type Implementation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__RELATIONSHIP_TYPE_IMPLEMENTATION = TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Requirement Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__REQUIREMENT_TYPE = TDEFINITIONS__REQUIREMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__CAPABILITY_TYPE = TDEFINITIONS__CAPABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Artifact Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__ARTIFACT_TYPE = TDEFINITIONS__ARTIFACT_TYPE;

	/**
	 * The feature id for the '<em><b>Artifact Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__ARTIFACT_TEMPLATE = TDEFINITIONS__ARTIFACT_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__POLICY_TYPE = TDEFINITIONS__POLICY_TYPE;

	/**
	 * The feature id for the '<em><b>Policy Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__POLICY_TEMPLATE = TDEFINITIONS__POLICY_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Group Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__GROUP_TYPE = TDEFINITIONS__GROUP_TYPE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__ID = TDEFINITIONS__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__NAME = TDEFINITIONS__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE__TARGET_NAMESPACE = TDEFINITIONS__TARGET_NAMESPACE;

	/**
	 * The number of structural features of the '<em>Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE_FEATURE_COUNT = TDEFINITIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_TYPE_OPERATION_COUNT = TDEFINITIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.DerivedFromTypeImpl <em>Derived From Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.DerivedFromTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getDerivedFromType()
	 * @generated
	 */
	int DERIVED_FROM_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Node Type Implementation Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE__NODE_TYPE_IMPLEMENTATION_REF = 0;

	/**
	 * The number of structural features of the '<em>Derived From Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Derived From Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.DerivedFromType1Impl <em>Derived From Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.DerivedFromType1Impl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getDerivedFromType1()
	 * @generated
	 */
	int DERIVED_FROM_TYPE1 = 10;

	/**
	 * The feature id for the '<em><b>Relationship Type Implementation Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE1__RELATIONSHIP_TYPE_IMPLEMENTATION_REF = 0;

	/**
	 * The number of structural features of the '<em>Derived From Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Derived From Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.DerivedFromType2Impl <em>Derived From Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.DerivedFromType2Impl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getDerivedFromType2()
	 * @generated
	 */
	int DERIVED_FROM_TYPE2 = 11;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE2__TYPE_REF = 0;

	/**
	 * The feature id for the '<em><b>Referenced Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE2__REFERENCED_ENTITY_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Derived From Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE2_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Derived From Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FROM_TYPE2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.DocumentRootImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 12;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEFINITIONS = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENTATION = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.ExcludeTypeImpl <em>Exclude Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.ExcludeTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getExcludeType()
	 * @generated
	 */
	int EXCLUDE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_TYPE__PATTERN = 0;

	/**
	 * The number of structural features of the '<em>Exclude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exclude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.ExtensionsTypeImpl <em>Extensions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.ExtensionsTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getExtensionsType()
	 * @generated
	 */
	int EXTENSIONS_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_TYPE__EXTENSION = 0;

	/**
	 * The number of structural features of the '<em>Extensions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Extensions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TImplementationArtifactImpl <em>TImplementation Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TImplementationArtifactImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTImplementationArtifact()
	 * @generated
	 */
	int TIMPLEMENTATION_ARTIFACT = 75;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Artifact Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT__ARTIFACT_REF = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT__ARTIFACT_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT__INTERFACE_NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT__OPERATION_NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TImplementation Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TImplementation Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACT_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.ImplementationArtifactTypeImpl <em>Implementation Artifact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.ImplementationArtifactTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getImplementationArtifactType()
	 * @generated
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE__DOCUMENTATION = TIMPLEMENTATION_ARTIFACT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE__ANY = TIMPLEMENTATION_ARTIFACT__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE__ANY_ATTRIBUTE = TIMPLEMENTATION_ARTIFACT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Artifact Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE__ARTIFACT_REF = TIMPLEMENTATION_ARTIFACT__ARTIFACT_REF;

	/**
	 * The feature id for the '<em><b>Artifact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE__ARTIFACT_TYPE = TIMPLEMENTATION_ARTIFACT__ARTIFACT_TYPE;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE__INTERFACE_NAME = TIMPLEMENTATION_ARTIFACT__INTERFACE_NAME;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE__OPERATION_NAME = TIMPLEMENTATION_ARTIFACT__OPERATION_NAME;

	/**
	 * The number of structural features of the '<em>Implementation Artifact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE_FEATURE_COUNT = TIMPLEMENTATION_ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Implementation Artifact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_ARTIFACT_TYPE_OPERATION_COUNT = TIMPLEMENTATION_ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.IncludeTypeImpl <em>Include Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.IncludeTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getIncludeType()
	 * @generated
	 */
	int INCLUDE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__PATTERN = 0;

	/**
	 * The number of structural features of the '<em>Include Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Include Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.InputParametersTypeImpl <em>Input Parameters Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.InputParametersTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getInputParametersType()
	 * @generated
	 */
	int INPUT_PARAMETERS_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Input Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETERS_TYPE__INPUT_PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Input Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.InputParametersType1Impl <em>Input Parameters Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.InputParametersType1Impl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getInputParametersType1()
	 * @generated
	 */
	int INPUT_PARAMETERS_TYPE1 = 18;

	/**
	 * The feature id for the '<em><b>Input Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETERS_TYPE1__INPUT_PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Input Parameters Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETERS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input Parameters Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PARAMETERS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.InstanceStateTypeImpl <em>Instance State Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.InstanceStateTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getInstanceStateType()
	 * @generated
	 */
	int INSTANCE_STATE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_STATE_TYPE__STATE = 0;

	/**
	 * The number of structural features of the '<em>Instance State Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_STATE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Instance State Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_STATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.InterfacesTypeImpl <em>Interfaces Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.InterfacesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getInterfacesType()
	 * @generated
	 */
	int INTERFACES_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_TYPE__INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Interfaces Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interfaces Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.InterfacesType1Impl <em>Interfaces Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.InterfacesType1Impl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getInterfacesType1()
	 * @generated
	 */
	int INTERFACES_TYPE1 = 21;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_TYPE1__INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Interfaces Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interfaces Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.InterfacesType2Impl <em>Interfaces Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.InterfacesType2Impl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getInterfacesType2()
	 * @generated
	 */
	int INTERFACES_TYPE2 = 22;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_TYPE2__INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Interfaces Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Interfaces Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACES_TYPE2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.NodeOperationTypeImpl <em>Node Operation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.NodeOperationTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getNodeOperationType()
	 * @generated
	 */
	int NODE_OPERATION_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_TYPE__INTERFACE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Node Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_TYPE__NODE_REF = 1;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_TYPE__OPERATION_NAME = 2;

	/**
	 * The number of structural features of the '<em>Node Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Node Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.NodeTypeReferenceTypeImpl <em>Node Type Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.NodeTypeReferenceTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getNodeTypeReferenceType()
	 * @generated
	 */
	int NODE_TYPE_REFERENCE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_REFERENCE_TYPE__TYPE_REF = 0;

	/**
	 * The number of structural features of the '<em>Node Type Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_REFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node Type Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_TYPE_REFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.OutputParametersTypeImpl <em>Output Parameters Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.OutputParametersTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getOutputParametersType()
	 * @generated
	 */
	int OUTPUT_PARAMETERS_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Output Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETERS_TYPE__OUTPUT_PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Output Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETERS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Output Parameters Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.OutputParametersType1Impl <em>Output Parameters Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.OutputParametersType1Impl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getOutputParametersType1()
	 * @generated
	 */
	int OUTPUT_PARAMETERS_TYPE1 = 26;

	/**
	 * The feature id for the '<em><b>Output Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETERS_TYPE1__OUTPUT_PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Output Parameters Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETERS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Output Parameters Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PARAMETERS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.PlanModelReferenceTypeImpl <em>Plan Model Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.PlanModelReferenceTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPlanModelReferenceType()
	 * @generated
	 */
	int PLAN_MODEL_REFERENCE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_MODEL_REFERENCE_TYPE__REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Plan Model Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_MODEL_REFERENCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Plan Model Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_MODEL_REFERENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.PlanModelTypeImpl <em>Plan Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.PlanModelTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPlanModelType()
	 * @generated
	 */
	int PLAN_MODEL_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_MODEL_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Plan Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_MODEL_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Plan Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_MODEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.PlanTypeImpl <em>Plan Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.PlanTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPlanType()
	 * @generated
	 */
	int PLAN_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Plan Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_TYPE__PLAN_REF = 0;

	/**
	 * The number of structural features of the '<em>Plan Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Plan Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.PoliciesTypeImpl <em>Policies Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.PoliciesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPoliciesType()
	 * @generated
	 */
	int POLICIES_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_TYPE__POLICY = 0;

	/**
	 * The number of structural features of the '<em>Policies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Policies Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.PoliciesType1Impl <em>Policies Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.PoliciesType1Impl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPoliciesType1()
	 * @generated
	 */
	int POLICIES_TYPE1 = 31;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_TYPE1__POLICY = 0;

	/**
	 * The number of structural features of the '<em>Policies Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Policies Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.PoliciesType2Impl <em>Policies Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.PoliciesType2Impl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPoliciesType2()
	 * @generated
	 */
	int POLICIES_TYPE2 = 32;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_TYPE2__POLICY = 0;

	/**
	 * The number of structural features of the '<em>Policies Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Policies Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLICIES_TYPE2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.PropertiesDefinitionTypeImpl <em>Properties Definition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.PropertiesDefinitionTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPropertiesDefinitionType()
	 * @generated
	 */
	int PROPERTIES_DEFINITION_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_DEFINITION_TYPE__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_DEFINITION_TYPE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Element Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_DEFINITION_TYPE__ELEMENT_REF = 2;

	/**
	 * The number of structural features of the '<em>Properties Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_DEFINITION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Properties Definition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_DEFINITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.PropertiesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPropertiesType()
	 * @generated
	 */
	int PROPERTIES_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Properties Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__PROPERTIES_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.PropertiesType1Impl <em>Properties Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.PropertiesType1Impl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPropertiesType1()
	 * @generated
	 */
	int PROPERTIES_TYPE1 = 35;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE1__ANY = 0;

	/**
	 * The feature id for the '<em><b>Property Mappings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE1__PROPERTY_MAPPINGS = 1;

	/**
	 * The feature id for the '<em><b>Properties Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE1__PROPERTIES_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Properties Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE1_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Properties Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.PropertyConstraintsTypeImpl <em>Property Constraints Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.PropertyConstraintsTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPropertyConstraintsType()
	 * @generated
	 */
	int PROPERTY_CONSTRAINTS_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Property Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_TYPE__PROPERTY_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Property Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Property Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.PropertyConstraintsType1Impl <em>Property Constraints Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.PropertyConstraintsType1Impl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPropertyConstraintsType1()
	 * @generated
	 */
	int PROPERTY_CONSTRAINTS_TYPE1 = 37;

	/**
	 * The feature id for the '<em><b>Property Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_TYPE1__PROPERTY_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Property Constraints Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Property Constraints Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CONSTRAINTS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.PropertyMappingsTypeImpl <em>Property Mappings Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.PropertyMappingsTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPropertyMappingsType()
	 * @generated
	 */
	int PROPERTY_MAPPINGS_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Property Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAPPINGS_TYPE__PROPERTY_MAPPING = 0;

	/**
	 * The number of structural features of the '<em>Property Mappings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAPPINGS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Property Mappings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_MAPPINGS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.RelationshipConstraintsTypeImpl <em>Relationship Constraints Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.RelationshipConstraintsTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getRelationshipConstraintsType()
	 * @generated
	 */
	int RELATIONSHIP_CONSTRAINTS_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Relationship Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINTS_TYPE__RELATIONSHIP_CONSTRAINT = 0;

	/**
	 * The number of structural features of the '<em>Relationship Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relationship Constraints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.RelationshipConstraintTypeImpl <em>Relationship Constraint Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.RelationshipConstraintTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getRelationshipConstraintType()
	 * @generated
	 */
	int RELATIONSHIP_CONSTRAINT_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINT_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINT_TYPE__CONSTRAINT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Relationship Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relationship Constraint Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_CONSTRAINT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.RelationshipOperationTypeImpl <em>Relationship Operation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.RelationshipOperationTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getRelationshipOperationType()
	 * @generated
	 */
	int RELATIONSHIP_OPERATION_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_TYPE__INTERFACE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_TYPE__OPERATION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Relationship Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_TYPE__RELATIONSHIP_REF = 2;

	/**
	 * The number of structural features of the '<em>Relationship Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relationship Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.RequirementDefinitionsTypeImpl <em>Requirement Definitions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.RequirementDefinitionsTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getRequirementDefinitionsType()
	 * @generated
	 */
	int REQUIREMENT_DEFINITIONS_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Requirement Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DEFINITIONS_TYPE__REQUIREMENT_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Requirement Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DEFINITIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirement Definitions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DEFINITIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.RequirementDefinitionsType1Impl <em>Requirement Definitions Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.RequirementDefinitionsType1Impl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getRequirementDefinitionsType1()
	 * @generated
	 */
	int REQUIREMENT_DEFINITIONS_TYPE1 = 43;

	/**
	 * The feature id for the '<em><b>Requirement Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DEFINITIONS_TYPE1__REQUIREMENT_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Requirement Definitions Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DEFINITIONS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirement Definitions Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DEFINITIONS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.RequirementsTypeImpl <em>Requirements Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.RequirementsTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getRequirementsType()
	 * @generated
	 */
	int REQUIREMENTS_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE__REQUIREMENT = 0;

	/**
	 * The number of structural features of the '<em>Requirements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.RequirementsType1Impl <em>Requirements Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.RequirementsType1Impl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getRequirementsType1()
	 * @generated
	 */
	int REQUIREMENTS_TYPE1 = 45;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE1__REQUIREMENT = 0;

	/**
	 * The number of structural features of the '<em>Requirements Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirements Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.RequirementsType2Impl <em>Requirements Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.RequirementsType2Impl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getRequirementsType2()
	 * @generated
	 */
	int REQUIREMENTS_TYPE2 = 46;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE2__REQUIREMENT = 0;

	/**
	 * The number of structural features of the '<em>Requirements Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirements Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_TYPE2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.SourceElementTypeImpl <em>Source Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.SourceElementTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getSourceElementType()
	 * @generated
	 */
	int SOURCE_ELEMENT_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_TYPE__REF = 0;

	/**
	 * The number of structural features of the '<em>Source Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Source Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.SourceInterfacesTypeImpl <em>Source Interfaces Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.SourceInterfacesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getSourceInterfacesType()
	 * @generated
	 */
	int SOURCE_INTERFACES_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_INTERFACES_TYPE__INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Source Interfaces Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_INTERFACES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Source Interfaces Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_INTERFACES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TAppliesToImpl <em>TApplies To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TAppliesToImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTAppliesTo()
	 * @generated
	 */
	int TAPPLIES_TO = 49;

	/**
	 * The feature id for the '<em><b>Node Type Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLIES_TO__NODE_TYPE_REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>TApplies To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLIES_TO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TApplies To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLIES_TO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TargetElementTypeImpl <em>Target Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TargetElementTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTargetElementType()
	 * @generated
	 */
	int TARGET_ELEMENT_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_TYPE__REF = 0;

	/**
	 * The number of structural features of the '<em>Target Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Target Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TargetInterfacesTypeImpl <em>Target Interfaces Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TargetInterfacesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTargetInterfacesType()
	 * @generated
	 */
	int TARGET_INTERFACES_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_INTERFACES_TYPE__INTERFACE = 0;

	/**
	 * The number of structural features of the '<em>Target Interfaces Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_INTERFACES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Target Interfaces Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_INTERFACES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TArtifactReferenceImpl <em>TArtifact Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TArtifactReferenceImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTArtifactReference()
	 * @generated
	 */
	int TARTIFACT_REFERENCE = 52;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_REFERENCE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_REFERENCE__INCLUDE = 1;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_REFERENCE__EXCLUDE = 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_REFERENCE__REFERENCE = 3;

	/**
	 * The number of structural features of the '<em>TArtifact Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_REFERENCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TArtifact Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TEntityTemplateImpl <em>TEntity Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TEntityTemplateImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTEntityTemplate()
	 * @generated
	 */
	int TENTITY_TEMPLATE = 66;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__PROPERTIES = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__ID = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE__TYPE_REF = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TEntity Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TEntity Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TEMPLATE_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TArtifactTemplateImpl <em>TArtifact Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TArtifactTemplateImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTArtifactTemplate()
	 * @generated
	 */
	int TARTIFACT_TEMPLATE = 53;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__DOCUMENTATION = TENTITY_TEMPLATE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__ANY = TENTITY_TEMPLATE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__ANY_ATTRIBUTE = TENTITY_TEMPLATE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__PROPERTIES = TENTITY_TEMPLATE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__PROPERTY_CONSTRAINTS = TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__ID = TENTITY_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__TYPE = TENTITY_TEMPLATE__TYPE;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__TYPE_REF = TENTITY_TEMPLATE__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Artifact References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__ARTIFACT_REFERENCES = TENTITY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE__NAME = TENTITY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TArtifact Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE_FEATURE_COUNT = TENTITY_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TArtifact Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TEMPLATE_OPERATION_COUNT = TENTITY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TEntityTypeImpl <em>TEntity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TEntityTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTEntityType()
	 * @generated
	 */
	int TENTITY_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__TAGS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__DERIVED_FROM = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__PROPERTIES_DEFINITION = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__ABSTRACT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__FINAL = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__TARGET_NAMESPACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>TEntity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>TEntity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TArtifactTypeImpl <em>TArtifact Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TArtifactTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTArtifactType()
	 * @generated
	 */
	int TARTIFACT_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__DOCUMENTATION = TENTITY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__ANY = TENTITY_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__ANY_ATTRIBUTE = TENTITY_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__TAGS = TENTITY_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__DERIVED_FROM = TENTITY_TYPE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__PROPERTIES_DEFINITION = TENTITY_TYPE__PROPERTIES_DEFINITION;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__ABSTRACT = TENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__FINAL = TENTITY_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__NAME = TENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE__TARGET_NAMESPACE = TENTITY_TYPE__TARGET_NAMESPACE;

	/**
	 * The number of structural features of the '<em>TArtifact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE_FEATURE_COUNT = TENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TArtifact Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_TYPE_OPERATION_COUNT = TENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TBoundaryDefinitionsImpl <em>TBoundary Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TBoundaryDefinitionsImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTBoundaryDefinitions()
	 * @generated
	 */
	int TBOUNDARY_DEFINITIONS = 55;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS__PROPERTY_CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS__REQUIREMENTS = 2;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS__CAPABILITIES = 3;

	/**
	 * The feature id for the '<em><b>Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS__POLICIES = 4;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS__INTERFACES = 5;

	/**
	 * The number of structural features of the '<em>TBoundary Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>TBoundary Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TCapabilityImpl <em>TCapability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TCapabilityImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTCapability()
	 * @generated
	 */
	int TCAPABILITY = 56;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__DOCUMENTATION = TENTITY_TEMPLATE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__ANY = TENTITY_TEMPLATE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__ANY_ATTRIBUTE = TENTITY_TEMPLATE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__PROPERTIES = TENTITY_TEMPLATE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__PROPERTY_CONSTRAINTS = TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__ID = TENTITY_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__TYPE = TENTITY_TEMPLATE__TYPE;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__TYPE_REF = TENTITY_TEMPLATE__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY__NAME = TENTITY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TCapability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_FEATURE_COUNT = TENTITY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TCapability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_OPERATION_COUNT = TENTITY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TCapabilityDefinitionImpl <em>TCapability Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TCapabilityDefinitionImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTCapabilityDefinition()
	 * @generated
	 */
	int TCAPABILITY_DEFINITION = 57;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__CONSTRAINTS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__CAPABILITY_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__LOWER_BOUND = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__UPPER_BOUND = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Capability Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION__CAPABILITY_TYPE_REF = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TCapability Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>TCapability Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_DEFINITION_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TCapabilityRefImpl <em>TCapability Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TCapabilityRefImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTCapabilityRef()
	 * @generated
	 */
	int TCAPABILITY_REF = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_REF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_REF__REF = 1;

	/**
	 * The number of structural features of the '<em>TCapability Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_REF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TCapability Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TCapabilityTypeImpl <em>TCapability Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TCapabilityTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTCapabilityType()
	 * @generated
	 */
	int TCAPABILITY_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__DOCUMENTATION = TENTITY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__ANY = TENTITY_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__ANY_ATTRIBUTE = TENTITY_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__TAGS = TENTITY_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__DERIVED_FROM = TENTITY_TYPE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__PROPERTIES_DEFINITION = TENTITY_TYPE__PROPERTIES_DEFINITION;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__ABSTRACT = TENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__FINAL = TENTITY_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__NAME = TENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE__TARGET_NAMESPACE = TENTITY_TYPE__TARGET_NAMESPACE;

	/**
	 * The number of structural features of the '<em>TCapability Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE_FEATURE_COUNT = TENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TCapability Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAPABILITY_TYPE_OPERATION_COUNT = TENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TConditionImpl <em>TCondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TConditionImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTCondition()
	 * @generated
	 */
	int TCONDITION = 60;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITION__ANY = 0;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITION__EXPRESSION_LANGUAGE = 1;

	/**
	 * The number of structural features of the '<em>TCondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TCondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TConstraintImpl <em>TConstraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TConstraintImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTConstraint()
	 * @generated
	 */
	int TCONSTRAINT = 61;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRAINT__ANY = 0;

	/**
	 * The feature id for the '<em><b>Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRAINT__CONSTRAINT_TYPE = 1;

	/**
	 * The number of structural features of the '<em>TConstraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TConstraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TDeploymentArtifactImpl <em>TDeployment Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TDeploymentArtifactImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTDeploymentArtifact()
	 * @generated
	 */
	int TDEPLOYMENT_ARTIFACT = 63;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Artifact Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT__ARTIFACT_REF = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Artifact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT__ARTIFACT_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TDeployment Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TDeployment Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACT_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TDeploymentArtifactsImpl <em>TDeployment Artifacts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TDeploymentArtifactsImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTDeploymentArtifacts()
	 * @generated
	 */
	int TDEPLOYMENT_ARTIFACTS = 64;

	/**
	 * The feature id for the '<em><b>Deployment Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACTS__DEPLOYMENT_ARTIFACT = 0;

	/**
	 * The number of structural features of the '<em>TDeployment Artifacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TDeployment Artifacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEPLOYMENT_ARTIFACTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TDocumentationImpl <em>TDocumentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TDocumentationImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTDocumentation()
	 * @generated
	 */
	int TDOCUMENTATION = 65;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION__ANY = 1;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION__LANG = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION__SOURCE = 3;

	/**
	 * The number of structural features of the '<em>TDocumentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TDocumentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TExportedInterfaceImpl <em>TExported Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TExportedInterfaceImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTExportedInterface()
	 * @generated
	 */
	int TEXPORTED_INTERFACE = 68;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_INTERFACE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_INTERFACE__NAME = 1;

	/**
	 * The number of structural features of the '<em>TExported Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TExported Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TExportedOperationImpl <em>TExported Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TExportedOperationImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTExportedOperation()
	 * @generated
	 */
	int TEXPORTED_OPERATION = 69;

	/**
	 * The feature id for the '<em><b>Node Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_OPERATION__NODE_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Relationship Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_OPERATION__RELATIONSHIP_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_OPERATION__PLAN = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_OPERATION__NAME = 3;

	/**
	 * The number of structural features of the '<em>TExported Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_OPERATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TExported Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPORTED_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TExtensionImpl <em>TExtension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TExtensionImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTExtension()
	 * @generated
	 */
	int TEXTENSION = 71;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Must Understand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION__MUST_UNDERSTAND = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION__NAMESPACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TExtension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TExtension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TExtensionsImpl <em>TExtensions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TExtensionsImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTExtensions()
	 * @generated
	 */
	int TEXTENSIONS = 72;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIONS__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIONS__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIONS__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIONS__EXTENSION = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TExtensions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIONS_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TExtensions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSIONS_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TGroupTemplateImpl <em>TGroup Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TGroupTemplateImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTGroupTemplate()
	 * @generated
	 */
	int TGROUP_TEMPLATE = 73;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TEMPLATE__DOCUMENTATION = TENTITY_TEMPLATE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TEMPLATE__ANY = TENTITY_TEMPLATE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TEMPLATE__ANY_ATTRIBUTE = TENTITY_TEMPLATE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TEMPLATE__PROPERTIES = TENTITY_TEMPLATE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TEMPLATE__PROPERTY_CONSTRAINTS = TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TEMPLATE__ID = TENTITY_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TEMPLATE__TYPE = TENTITY_TEMPLATE__TYPE;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TEMPLATE__TYPE_REF = TENTITY_TEMPLATE__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TEMPLATE__REQUIREMENTS = TENTITY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TEMPLATE__CAPABILITIES = TENTITY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TEMPLATE__POLICIES = TENTITY_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deployment Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TEMPLATE__DEPLOYMENT_ARTIFACTS = TENTITY_TEMPLATE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TEMPLATE__MAX_INSTANCES = TENTITY_TEMPLATE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TEMPLATE__MIN_INSTANCES = TENTITY_TEMPLATE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TEMPLATE__NAME = TENTITY_TEMPLATE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TEMPLATE__MEMBER = TENTITY_TEMPLATE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>TGroup Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TEMPLATE_FEATURE_COUNT = TENTITY_TEMPLATE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>TGroup Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TEMPLATE_OPERATION_COUNT = TENTITY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TGroupTypeImpl <em>TGroup Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TGroupTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTGroupType()
	 * @generated
	 */
	int TGROUP_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__DOCUMENTATION = TENTITY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__ANY = TENTITY_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__ANY_ATTRIBUTE = TENTITY_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__TAGS = TENTITY_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__DERIVED_FROM = TENTITY_TYPE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__PROPERTIES_DEFINITION = TENTITY_TYPE__PROPERTIES_DEFINITION;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__ABSTRACT = TENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__FINAL = TENTITY_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__NAME = TENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__TARGET_NAMESPACE = TENTITY_TYPE__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Requirement Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__REQUIREMENT_DEFINITIONS = TENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capability Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__CAPABILITY_DEFINITIONS = TENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__INSTANCE_STATES = TENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__INTERFACES = TENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Member</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__MEMBER = TENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Member Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__MEMBER_REFS = TENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TGroup Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE_FEATURE_COUNT = TENTITY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>TGroup Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE_OPERATION_COUNT = TENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TImplementationArtifactsImpl <em>TImplementation Artifacts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TImplementationArtifactsImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTImplementationArtifacts()
	 * @generated
	 */
	int TIMPLEMENTATION_ARTIFACTS = 76;

	/**
	 * The feature id for the '<em><b>Implementation Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACTS__IMPLEMENTATION_ARTIFACT = 0;

	/**
	 * The number of structural features of the '<em>TImplementation Artifacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TImplementation Artifacts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLEMENTATION_ARTIFACTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TImportImpl <em>TImport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TImportImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTImport()
	 * @generated
	 */
	int TIMPORT = 77;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Import Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__IMPORT_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__LOCATION = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__NAMESPACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__RESOURCE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TImport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TImport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TInterfaceImpl <em>TInterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TInterfaceImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTInterface()
	 * @generated
	 */
	int TINTERFACE = 78;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__NAME = 1;

	/**
	 * The number of structural features of the '<em>TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TNodeTemplateImpl <em>TNode Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TNodeTemplateImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTNodeTemplate()
	 * @generated
	 */
	int TNODE_TEMPLATE = 79;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__DOCUMENTATION = TENTITY_TEMPLATE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__ANY = TENTITY_TEMPLATE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__ANY_ATTRIBUTE = TENTITY_TEMPLATE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__PROPERTIES = TENTITY_TEMPLATE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__PROPERTY_CONSTRAINTS = TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__ID = TENTITY_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__TYPE = TENTITY_TEMPLATE__TYPE;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__TYPE_REF = TENTITY_TEMPLATE__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__REQUIREMENTS = TENTITY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__CAPABILITIES = TENTITY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Policies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__POLICIES = TENTITY_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deployment Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS = TENTITY_TEMPLATE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__MAX_INSTANCES = TENTITY_TEMPLATE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__MIN_INSTANCES = TENTITY_TEMPLATE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE__NAME = TENTITY_TEMPLATE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>TNode Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE_FEATURE_COUNT = TENTITY_TEMPLATE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>TNode Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TEMPLATE_OPERATION_COUNT = TENTITY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TNodeTypeImpl <em>TNode Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TNodeTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTNodeType()
	 * @generated
	 */
	int TNODE_TYPE = 80;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__DOCUMENTATION = TENTITY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__ANY = TENTITY_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__ANY_ATTRIBUTE = TENTITY_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__TAGS = TENTITY_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__DERIVED_FROM = TENTITY_TYPE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__PROPERTIES_DEFINITION = TENTITY_TYPE__PROPERTIES_DEFINITION;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__ABSTRACT = TENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__FINAL = TENTITY_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__NAME = TENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__TARGET_NAMESPACE = TENTITY_TYPE__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Requirement Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__REQUIREMENT_DEFINITIONS = TENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capability Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__CAPABILITY_DEFINITIONS = TENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__INSTANCE_STATES = TENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE__INTERFACES = TENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TNode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_FEATURE_COUNT = TENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TNode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_OPERATION_COUNT = TENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TNodeTypeImplementationImpl <em>TNode Type Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TNodeTypeImplementationImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTNodeTypeImplementation()
	 * @generated
	 */
	int TNODE_TYPE_IMPLEMENTATION = 81;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__TAGS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__DERIVED_FROM = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Container Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implementation Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Deployment Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__DEPLOYMENT_ARTIFACTS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__ABSTRACT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__FINAL = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__NODE_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION__TARGET_NAMESPACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>TNode Type Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>TNode Type Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNODE_TYPE_IMPLEMENTATION_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TOperationImpl <em>TOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TOperationImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTOperation()
	 * @generated
	 */
	int TOPERATION = 82;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__INPUT_PARAMETERS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__OUTPUT_PARAMETERS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TParameterImpl <em>TParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TParameterImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTParameter()
	 * @generated
	 */
	int TPARAMETER = 83;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__REQUIRED = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__TYPE = 2;

	/**
	 * The number of structural features of the '<em>TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TPlanImpl <em>TPlan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TPlanImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTPlan()
	 * @generated
	 */
	int TPLAN = 84;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__PRECONDITION = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__INPUT_PARAMETERS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__OUTPUT_PARAMETERS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Plan Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__PLAN_MODEL = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Plan Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__PLAN_MODEL_REFERENCE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__ID = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Plan Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__PLAN_LANGUAGE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Plan Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN__PLAN_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>TPlan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>TPlan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TPlansImpl <em>TPlans</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TPlansImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTPlans()
	 * @generated
	 */
	int TPLANS = 85;

	/**
	 * The feature id for the '<em><b>Plan</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANS__PLAN = 0;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANS__TARGET_NAMESPACE = 1;

	/**
	 * The number of structural features of the '<em>TPlans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TPlans</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TPolicyImpl <em>TPolicy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TPolicyImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTPolicy()
	 * @generated
	 */
	int TPOLICY = 86;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Policy Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY__POLICY_REF = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY__POLICY_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TPolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TPolicy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TPolicyTemplateImpl <em>TPolicy Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TPolicyTemplateImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTPolicyTemplate()
	 * @generated
	 */
	int TPOLICY_TEMPLATE = 87;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__DOCUMENTATION = TENTITY_TEMPLATE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__ANY = TENTITY_TEMPLATE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__ANY_ATTRIBUTE = TENTITY_TEMPLATE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__PROPERTIES = TENTITY_TEMPLATE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__PROPERTY_CONSTRAINTS = TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__ID = TENTITY_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__TYPE = TENTITY_TEMPLATE__TYPE;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__TYPE_REF = TENTITY_TEMPLATE__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE__NAME = TENTITY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TPolicy Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE_FEATURE_COUNT = TENTITY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TPolicy Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TEMPLATE_OPERATION_COUNT = TENTITY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TPolicyTypeImpl <em>TPolicy Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TPolicyTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTPolicyType()
	 * @generated
	 */
	int TPOLICY_TYPE = 88;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__DOCUMENTATION = TENTITY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__ANY = TENTITY_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__ANY_ATTRIBUTE = TENTITY_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__TAGS = TENTITY_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__DERIVED_FROM = TENTITY_TYPE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__PROPERTIES_DEFINITION = TENTITY_TYPE__PROPERTIES_DEFINITION;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__ABSTRACT = TENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__FINAL = TENTITY_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__NAME = TENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__TARGET_NAMESPACE = TENTITY_TYPE__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__APPLIES_TO = TENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Policy Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE__POLICY_LANGUAGE = TENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TPolicy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE_FEATURE_COUNT = TENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TPolicy Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOLICY_TYPE_OPERATION_COUNT = TENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TPropertyConstraintImpl <em>TProperty Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TPropertyConstraintImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTPropertyConstraint()
	 * @generated
	 */
	int TPROPERTY_CONSTRAINT = 89;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_CONSTRAINT__ANY = TCONSTRAINT__ANY;

	/**
	 * The feature id for the '<em><b>Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_CONSTRAINT__CONSTRAINT_TYPE = TCONSTRAINT__CONSTRAINT_TYPE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_CONSTRAINT__PROPERTY = TCONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TProperty Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_CONSTRAINT_FEATURE_COUNT = TCONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TProperty Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_CONSTRAINT_OPERATION_COUNT = TCONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TPropertyMappingImpl <em>TProperty Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TPropertyMappingImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTPropertyMapping()
	 * @generated
	 */
	int TPROPERTY_MAPPING = 90;

	/**
	 * The feature id for the '<em><b>Target Object Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_MAPPING__TARGET_OBJECT_REF = 0;

	/**
	 * The feature id for the '<em><b>Service Template Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_MAPPING__SERVICE_TEMPLATE_PROPERTY_REF = 1;

	/**
	 * The feature id for the '<em><b>Target Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_MAPPING__TARGET_PROPERTY_REF = 2;

	/**
	 * The number of structural features of the '<em>TProperty Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TProperty Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TRelationshipTemplateImpl <em>TRelationship Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TRelationshipTemplateImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTRelationshipTemplate()
	 * @generated
	 */
	int TRELATIONSHIP_TEMPLATE = 91;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__DOCUMENTATION = TENTITY_TEMPLATE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__ANY = TENTITY_TEMPLATE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__ANY_ATTRIBUTE = TENTITY_TEMPLATE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__PROPERTIES = TENTITY_TEMPLATE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__PROPERTY_CONSTRAINTS = TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__ID = TENTITY_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__TYPE = TENTITY_TEMPLATE__TYPE;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__TYPE_REF = TENTITY_TEMPLATE__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__SOURCE_ELEMENT = TENTITY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__TARGET_ELEMENT = TENTITY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relationship Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__RELATIONSHIP_CONSTRAINTS = TENTITY_TEMPLATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE__NAME = TENTITY_TEMPLATE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TRelationship Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE_FEATURE_COUNT = TENTITY_TEMPLATE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TRelationship Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TEMPLATE_OPERATION_COUNT = TENTITY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TRelationshipTypeImpl <em>TRelationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TRelationshipTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTRelationshipType()
	 * @generated
	 */
	int TRELATIONSHIP_TYPE = 92;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__DOCUMENTATION = TENTITY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__ANY = TENTITY_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__ANY_ATTRIBUTE = TENTITY_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__TAGS = TENTITY_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__DERIVED_FROM = TENTITY_TYPE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__PROPERTIES_DEFINITION = TENTITY_TYPE__PROPERTIES_DEFINITION;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__ABSTRACT = TENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__FINAL = TENTITY_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__NAME = TENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__TARGET_NAMESPACE = TENTITY_TYPE__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Instance States</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__INSTANCE_STATES = TENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__SOURCE_INTERFACES = TENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__TARGET_INTERFACES = TENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Valid Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__VALID_SOURCE = TENTITY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Valid Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE__VALID_TARGET = TENTITY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TRelationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_FEATURE_COUNT = TENTITY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TRelationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_OPERATION_COUNT = TENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TRelationshipTypeImplementationImpl <em>TRelationship Type Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TRelationshipTypeImplementationImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTRelationshipTypeImplementation()
	 * @generated
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION = 93;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__TAGS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__DERIVED_FROM = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Container Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implementation Artifacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__ABSTRACT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__FINAL = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__RELATIONSHIP_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION__TARGET_NAMESPACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>TRelationship Type Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>TRelationship Type Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_TYPE_IMPLEMENTATION_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TRequiredContainerFeatureImpl <em>TRequired Container Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TRequiredContainerFeatureImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTRequiredContainerFeature()
	 * @generated
	 */
	int TREQUIRED_CONTAINER_FEATURE = 94;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_CONTAINER_FEATURE__FEATURE = 0;

	/**
	 * The number of structural features of the '<em>TRequired Container Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_CONTAINER_FEATURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TRequired Container Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_CONTAINER_FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TRequiredContainerFeaturesImpl <em>TRequired Container Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TRequiredContainerFeaturesImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTRequiredContainerFeatures()
	 * @generated
	 */
	int TREQUIRED_CONTAINER_FEATURES = 95;

	/**
	 * The feature id for the '<em><b>Required Container Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_CONTAINER_FEATURES__REQUIRED_CONTAINER_FEATURE = 0;

	/**
	 * The number of structural features of the '<em>TRequired Container Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_CONTAINER_FEATURES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TRequired Container Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_CONTAINER_FEATURES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TRequirementImpl <em>TRequirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TRequirementImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTRequirement()
	 * @generated
	 */
	int TREQUIREMENT = 96;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__DOCUMENTATION = TENTITY_TEMPLATE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__ANY = TENTITY_TEMPLATE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__ANY_ATTRIBUTE = TENTITY_TEMPLATE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__PROPERTIES = TENTITY_TEMPLATE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Property Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__PROPERTY_CONSTRAINTS = TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__ID = TENTITY_TEMPLATE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__TYPE = TENTITY_TEMPLATE__TYPE;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__TYPE_REF = TENTITY_TEMPLATE__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT__NAME = TENTITY_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TRequirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_FEATURE_COUNT = TENTITY_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TRequirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_OPERATION_COUNT = TENTITY_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TRequirementDefinitionImpl <em>TRequirement Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TRequirementDefinitionImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTRequirementDefinition()
	 * @generated
	 */
	int TREQUIREMENT_DEFINITION = 97;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__CONSTRAINTS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__LOWER_BOUND = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Requirement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__REQUIREMENT_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__UPPER_BOUND = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Requirement Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION__REQUIREMENT_TYPE_REF = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TRequirement Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>TRequirement Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_DEFINITION_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TRequirementRefImpl <em>TRequirement Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TRequirementRefImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTRequirementRef()
	 * @generated
	 */
	int TREQUIREMENT_REF = 98;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_REF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_REF__REF = 1;

	/**
	 * The number of structural features of the '<em>TRequirement Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_REF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TRequirement Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TRequirementTypeImpl <em>TRequirement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TRequirementTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTRequirementType()
	 * @generated
	 */
	int TREQUIREMENT_TYPE = 99;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__DOCUMENTATION = TENTITY_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__ANY = TENTITY_TYPE__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__ANY_ATTRIBUTE = TENTITY_TYPE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__TAGS = TENTITY_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__DERIVED_FROM = TENTITY_TYPE__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__PROPERTIES_DEFINITION = TENTITY_TYPE__PROPERTIES_DEFINITION;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__ABSTRACT = TENTITY_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__FINAL = TENTITY_TYPE__FINAL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__NAME = TENTITY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__TARGET_NAMESPACE = TENTITY_TYPE__TARGET_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Required Capability Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE = TENTITY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Capability Type Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE_REF = TENTITY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TRequirement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE_FEATURE_COUNT = TENTITY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TRequirement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIREMENT_TYPE_OPERATION_COUNT = TENTITY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TServiceTemplateImpl <em>TService Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TServiceTemplateImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTServiceTemplate()
	 * @generated
	 */
	int TSERVICE_TEMPLATE = 100;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__TAGS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boundary Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__BOUNDARY_DEFINITIONS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Topology Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__TOPOLOGY_TEMPLATE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Plans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__PLANS = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__ID = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__NAME = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Substitutable Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__SUBSTITUTABLE_NODE_TYPE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE__TARGET_NAMESPACE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>TService Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>TService Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TEMPLATE_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TTagImpl <em>TTag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TTagImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTTag()
	 * @generated
	 */
	int TTAG = 101;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAG__VALUE = 1;

	/**
	 * The number of structural features of the '<em>TTag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TTag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TTagsImpl <em>TTags</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TTagsImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTTags()
	 * @generated
	 */
	int TTAGS = 102;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAGS__TAG = 0;

	/**
	 * The number of structural features of the '<em>TTags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAGS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TTags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTAGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TTopologyElementInstanceStatesImpl <em>TTopology Element Instance States</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TTopologyElementInstanceStatesImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTTopologyElementInstanceStates()
	 * @generated
	 */
	int TTOPOLOGY_ELEMENT_INSTANCE_STATES = 103;

	/**
	 * The feature id for the '<em><b>Instance State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_ELEMENT_INSTANCE_STATES__INSTANCE_STATE = 0;

	/**
	 * The number of structural features of the '<em>TTopology Element Instance States</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_ELEMENT_INSTANCE_STATES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TTopology Element Instance States</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_ELEMENT_INSTANCE_STATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TTopologyTemplateImpl <em>TTopology Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TTopologyTemplateImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTTopologyTemplate()
	 * @generated
	 */
	int TTOPOLOGY_TEMPLATE = 104;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE__DOCUMENTATION = TEXTENSIBLE_ELEMENTS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE__ANY = TEXTENSIBLE_ELEMENTS__ANY;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE__ANY_ATTRIBUTE = TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE__GROUP = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE__NODE_TEMPLATE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relationship Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE__RELATIONSHIP_TEMPLATE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE__GROUP_TEMPLATE = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TTopology Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE_FEATURE_COUNT = TEXTENSIBLE_ELEMENTS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TTopology Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTOPOLOGY_TEMPLATE_OPERATION_COUNT = TEXTENSIBLE_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.TypesTypeImpl <em>Types Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.TypesTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTypesType()
	 * @generated
	 */
	int TYPES_TYPE = 105;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Types Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Types Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.ValidSourceTypeImpl <em>Valid Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.ValidSourceTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getValidSourceType()
	 * @generated
	 */
	int VALID_SOURCE_TYPE = 106;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_SOURCE_TYPE__TYPE_REF = 0;

	/**
	 * The number of structural features of the '<em>Valid Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_SOURCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Valid Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_SOURCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.impl.ValidTargetTypeImpl <em>Valid Target Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.impl.ValidTargetTypeImpl
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getValidTargetType()
	 * @generated
	 */
	int VALID_TARGET_TYPE = 107;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_TARGET_TYPE__TYPE_REF = 0;

	/**
	 * The number of structural features of the '<em>Valid Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_TARGET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Valid Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALID_TARGET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.MaxInstancesTypeMember1 <em>Max Instances Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.MaxInstancesTypeMember1
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getMaxInstancesTypeMember1()
	 * @generated
	 */
	int MAX_INSTANCES_TYPE_MEMBER1 = 108;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.MaxInstancesTypeMember11 <em>Max Instances Type Member11</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.MaxInstancesTypeMember11
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getMaxInstancesTypeMember11()
	 * @generated
	 */
	int MAX_INSTANCES_TYPE_MEMBER11 = 109;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.TBoolean <em>TBoolean</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.TBoolean
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTBoolean()
	 * @generated
	 */
	int TBOOLEAN = 110;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.UpperBoundTypeMember1 <em>Upper Bound Type Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.UpperBoundTypeMember1
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember1()
	 * @generated
	 */
	int UPPER_BOUND_TYPE_MEMBER1 = 111;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.UpperBoundTypeMember11 <em>Upper Bound Type Member11</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.UpperBoundTypeMember11
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember11()
	 * @generated
	 */
	int UPPER_BOUND_TYPE_MEMBER11 = 112;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.oco.tosca.ValidImportTypes <em>Valid Import Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.ValidImportTypes
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getValidImportTypes()
	 * @generated
	 */
	int VALID_IMPORT_TYPES = 113;

	/**
	 * The meta object id for the '<em>Imported URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getImportedURI()
	 * @generated
	 */
	int IMPORTED_URI = 114;

	/**
	 * The meta object id for the '<em>Max Instances Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getMaxInstancesType()
	 * @generated
	 */
	int MAX_INSTANCES_TYPE = 115;

	/**
	 * The meta object id for the '<em>Max Instances Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getMaxInstancesType1()
	 * @generated
	 */
	int MAX_INSTANCES_TYPE1 = 116;

	/**
	 * The meta object id for the '<em>Max Instances Type Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getMaxInstancesTypeMember0()
	 * @generated
	 */
	int MAX_INSTANCES_TYPE_MEMBER0 = 117;

	/**
	 * The meta object id for the '<em>Max Instances Type Member01</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getMaxInstancesTypeMember01()
	 * @generated
	 */
	int MAX_INSTANCES_TYPE_MEMBER01 = 118;

	/**
	 * The meta object id for the '<em>Max Instances Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.MaxInstancesTypeMember1
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getMaxInstancesTypeMember1Object()
	 * @generated
	 */
	int MAX_INSTANCES_TYPE_MEMBER1_OBJECT = 119;

	/**
	 * The meta object id for the '<em>Max Instances Type Member1 Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.MaxInstancesTypeMember11
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getMaxInstancesTypeMember1Object1()
	 * @generated
	 */
	int MAX_INSTANCES_TYPE_MEMBER1_OBJECT1 = 120;

	/**
	 * The meta object id for the '<em>TBoolean Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.TBoolean
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTBooleanObject()
	 * @generated
	 */
	int TBOOLEAN_OBJECT = 121;

	/**
	 * The meta object id for the '<em>Upper Bound Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getUpperBoundType()
	 * @generated
	 */
	int UPPER_BOUND_TYPE = 122;

	/**
	 * The meta object id for the '<em>Upper Bound Type1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getUpperBoundType1()
	 * @generated
	 */
	int UPPER_BOUND_TYPE1 = 123;

	/**
	 * The meta object id for the '<em>Upper Bound Type Member0</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember0()
	 * @generated
	 */
	int UPPER_BOUND_TYPE_MEMBER0 = 124;

	/**
	 * The meta object id for the '<em>Upper Bound Type Member01</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember01()
	 * @generated
	 */
	int UPPER_BOUND_TYPE_MEMBER01 = 125;

	/**
	 * The meta object id for the '<em>Upper Bound Type Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.UpperBoundTypeMember1
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember1Object()
	 * @generated
	 */
	int UPPER_BOUND_TYPE_MEMBER1_OBJECT = 126;

	/**
	 * The meta object id for the '<em>Upper Bound Type Member1 Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.oco.tosca.UpperBoundTypeMember11
	 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember1Object1()
	 * @generated
	 */
	int UPPER_BOUND_TYPE_MEMBER1_OBJECT1 = 127;


	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.ArtifactReferencesType <em>Artifact References Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact References Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.ArtifactReferencesType
	 * @generated
	 */
	EClass getArtifactReferencesType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.ArtifactReferencesType#getArtifactReference <em>Artifact Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Reference</em>'.
	 * @see de.ugoe.cs.oco.tosca.ArtifactReferencesType#getArtifactReference()
	 * @see #getArtifactReferencesType()
	 * @generated
	 */
	EReference getArtifactReferencesType_ArtifactReference();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.CapabilitiesType <em>Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capabilities Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.CapabilitiesType
	 * @generated
	 */
	EClass getCapabilitiesType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.CapabilitiesType#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability</em>'.
	 * @see de.ugoe.cs.oco.tosca.CapabilitiesType#getCapability()
	 * @see #getCapabilitiesType()
	 * @generated
	 */
	EReference getCapabilitiesType_Capability();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.CapabilitiesType1 <em>Capabilities Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capabilities Type1</em>'.
	 * @see de.ugoe.cs.oco.tosca.CapabilitiesType1
	 * @generated
	 */
	EClass getCapabilitiesType1();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.CapabilitiesType1#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability</em>'.
	 * @see de.ugoe.cs.oco.tosca.CapabilitiesType1#getCapability()
	 * @see #getCapabilitiesType1()
	 * @generated
	 */
	EReference getCapabilitiesType1_Capability();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.CapabilitiesType2 <em>Capabilities Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capabilities Type2</em>'.
	 * @see de.ugoe.cs.oco.tosca.CapabilitiesType2
	 * @generated
	 */
	EClass getCapabilitiesType2();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.CapabilitiesType2#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability</em>'.
	 * @see de.ugoe.cs.oco.tosca.CapabilitiesType2#getCapability()
	 * @see #getCapabilitiesType2()
	 * @generated
	 */
	EReference getCapabilitiesType2_Capability();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.CapabilityDefinitionsType <em>Capability Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Definitions Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.CapabilityDefinitionsType
	 * @generated
	 */
	EClass getCapabilityDefinitionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.CapabilityDefinitionsType#getCapabilityDefinition <em>Capability Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability Definition</em>'.
	 * @see de.ugoe.cs.oco.tosca.CapabilityDefinitionsType#getCapabilityDefinition()
	 * @see #getCapabilityDefinitionsType()
	 * @generated
	 */
	EReference getCapabilityDefinitionsType_CapabilityDefinition();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.CapabilityDefinitionsType1 <em>Capability Definitions Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability Definitions Type1</em>'.
	 * @see de.ugoe.cs.oco.tosca.CapabilityDefinitionsType1
	 * @generated
	 */
	EClass getCapabilityDefinitionsType1();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.CapabilityDefinitionsType1#getCapabilityDefinition <em>Capability Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability Definition</em>'.
	 * @see de.ugoe.cs.oco.tosca.CapabilityDefinitionsType1#getCapabilityDefinition()
	 * @see #getCapabilityDefinitionsType1()
	 * @generated
	 */
	EReference getCapabilityDefinitionsType1_CapabilityDefinition();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.ConstraintsType <em>Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.ConstraintsType
	 * @generated
	 */
	EClass getConstraintsType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.ConstraintsType#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see de.ugoe.cs.oco.tosca.ConstraintsType#getConstraint()
	 * @see #getConstraintsType()
	 * @generated
	 */
	EReference getConstraintsType_Constraint();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.ConstraintsType1 <em>Constraints Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraints Type1</em>'.
	 * @see de.ugoe.cs.oco.tosca.ConstraintsType1
	 * @generated
	 */
	EClass getConstraintsType1();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.ConstraintsType1#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see de.ugoe.cs.oco.tosca.ConstraintsType1#getConstraint()
	 * @see #getConstraintsType1()
	 * @generated
	 */
	EReference getConstraintsType1_Constraint();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.DefinitionsType <em>Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definitions Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.DefinitionsType
	 * @generated
	 */
	EClass getDefinitionsType();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.DerivedFromType <em>Derived From Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived From Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.DerivedFromType
	 * @generated
	 */
	EClass getDerivedFromType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.DerivedFromType#getNodeTypeImplementationRef <em>Node Type Implementation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type Implementation Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.DerivedFromType#getNodeTypeImplementationRef()
	 * @see #getDerivedFromType()
	 * @generated
	 */
	EAttribute getDerivedFromType_NodeTypeImplementationRef();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.DerivedFromType1 <em>Derived From Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived From Type1</em>'.
	 * @see de.ugoe.cs.oco.tosca.DerivedFromType1
	 * @generated
	 */
	EClass getDerivedFromType1();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.DerivedFromType1#getRelationshipTypeImplementationRef <em>Relationship Type Implementation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Type Implementation Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.DerivedFromType1#getRelationshipTypeImplementationRef()
	 * @see #getDerivedFromType1()
	 * @generated
	 */
	EAttribute getDerivedFromType1_RelationshipTypeImplementationRef();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.DerivedFromType2 <em>Derived From Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived From Type2</em>'.
	 * @see de.ugoe.cs.oco.tosca.DerivedFromType2
	 * @generated
	 */
	EClass getDerivedFromType2();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.DerivedFromType2#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.DerivedFromType2#getTypeRef()
	 * @see #getDerivedFromType2()
	 * @generated
	 */
	EAttribute getDerivedFromType2_TypeRef();

	/**
	 * Returns the meta object for the reference '{@link de.ugoe.cs.oco.tosca.DerivedFromType2#getReferencedEntityType <em>Referenced Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Entity Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.DerivedFromType2#getReferencedEntityType()
	 * @see #getDerivedFromType2()
	 * @generated
	 */
	EReference getDerivedFromType2_ReferencedEntityType();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.ugoe.cs.oco.tosca.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.ugoe.cs.oco.tosca.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.ugoe.cs.oco.tosca.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.ugoe.cs.oco.tosca.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.ugoe.cs.oco.tosca.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.ugoe.cs.oco.tosca.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.ugoe.cs.oco.tosca.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.DocumentRoot#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see de.ugoe.cs.oco.tosca.DocumentRoot#getDefinitions()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Definitions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.DocumentRoot#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see de.ugoe.cs.oco.tosca.DocumentRoot#getDocumentation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Documentation();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.ExcludeType <em>Exclude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclude Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.ExcludeType
	 * @generated
	 */
	EClass getExcludeType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.ExcludeType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see de.ugoe.cs.oco.tosca.ExcludeType#getPattern()
	 * @see #getExcludeType()
	 * @generated
	 */
	EAttribute getExcludeType_Pattern();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.ExtensionsType <em>Extensions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extensions Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.ExtensionsType
	 * @generated
	 */
	EClass getExtensionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.ExtensionsType#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see de.ugoe.cs.oco.tosca.ExtensionsType#getExtension()
	 * @see #getExtensionsType()
	 * @generated
	 */
	EReference getExtensionsType_Extension();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.ImplementationArtifactType <em>Implementation Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Artifact Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.ImplementationArtifactType
	 * @generated
	 */
	EClass getImplementationArtifactType();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.IncludeType <em>Include Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.IncludeType
	 * @generated
	 */
	EClass getIncludeType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.IncludeType#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see de.ugoe.cs.oco.tosca.IncludeType#getPattern()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_Pattern();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.InputParametersType <em>Input Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Parameters Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.InputParametersType
	 * @generated
	 */
	EClass getInputParametersType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.InputParametersType#getInputParameter <em>Input Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Parameter</em>'.
	 * @see de.ugoe.cs.oco.tosca.InputParametersType#getInputParameter()
	 * @see #getInputParametersType()
	 * @generated
	 */
	EReference getInputParametersType_InputParameter();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.InputParametersType1 <em>Input Parameters Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Parameters Type1</em>'.
	 * @see de.ugoe.cs.oco.tosca.InputParametersType1
	 * @generated
	 */
	EClass getInputParametersType1();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.InputParametersType1#getInputParameter <em>Input Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Parameter</em>'.
	 * @see de.ugoe.cs.oco.tosca.InputParametersType1#getInputParameter()
	 * @see #getInputParametersType1()
	 * @generated
	 */
	EReference getInputParametersType1_InputParameter();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.InstanceStateType <em>Instance State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance State Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.InstanceStateType
	 * @generated
	 */
	EClass getInstanceStateType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.InstanceStateType#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see de.ugoe.cs.oco.tosca.InstanceStateType#getState()
	 * @see #getInstanceStateType()
	 * @generated
	 */
	EAttribute getInstanceStateType_State();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.InterfacesType <em>Interfaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interfaces Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.InterfacesType
	 * @generated
	 */
	EClass getInterfacesType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.InterfacesType#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see de.ugoe.cs.oco.tosca.InterfacesType#getInterface()
	 * @see #getInterfacesType()
	 * @generated
	 */
	EReference getInterfacesType_Interface();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.InterfacesType1 <em>Interfaces Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interfaces Type1</em>'.
	 * @see de.ugoe.cs.oco.tosca.InterfacesType1
	 * @generated
	 */
	EClass getInterfacesType1();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.InterfacesType1#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see de.ugoe.cs.oco.tosca.InterfacesType1#getInterface()
	 * @see #getInterfacesType1()
	 * @generated
	 */
	EReference getInterfacesType1_Interface();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.InterfacesType2 <em>Interfaces Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interfaces Type2</em>'.
	 * @see de.ugoe.cs.oco.tosca.InterfacesType2
	 * @generated
	 */
	EClass getInterfacesType2();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.InterfacesType2#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see de.ugoe.cs.oco.tosca.InterfacesType2#getInterface()
	 * @see #getInterfacesType2()
	 * @generated
	 */
	EReference getInterfacesType2_Interface();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.NodeOperationType <em>Node Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Operation Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.NodeOperationType
	 * @generated
	 */
	EClass getNodeOperationType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.NodeOperationType#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.NodeOperationType#getInterfaceName()
	 * @see #getNodeOperationType()
	 * @generated
	 */
	EAttribute getNodeOperationType_InterfaceName();

	/**
	 * Returns the meta object for the reference '{@link de.ugoe.cs.oco.tosca.NodeOperationType#getNodeRef <em>Node Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.NodeOperationType#getNodeRef()
	 * @see #getNodeOperationType()
	 * @generated
	 */
	EReference getNodeOperationType_NodeRef();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.NodeOperationType#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.NodeOperationType#getOperationName()
	 * @see #getNodeOperationType()
	 * @generated
	 */
	EAttribute getNodeOperationType_OperationName();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.NodeTypeReferenceType <em>Node Type Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Type Reference Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.NodeTypeReferenceType
	 * @generated
	 */
	EClass getNodeTypeReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.NodeTypeReferenceType#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.NodeTypeReferenceType#getTypeRef()
	 * @see #getNodeTypeReferenceType()
	 * @generated
	 */
	EAttribute getNodeTypeReferenceType_TypeRef();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.OutputParametersType <em>Output Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Parameters Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.OutputParametersType
	 * @generated
	 */
	EClass getOutputParametersType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.OutputParametersType#getOutputParameter <em>Output Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Parameter</em>'.
	 * @see de.ugoe.cs.oco.tosca.OutputParametersType#getOutputParameter()
	 * @see #getOutputParametersType()
	 * @generated
	 */
	EReference getOutputParametersType_OutputParameter();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.OutputParametersType1 <em>Output Parameters Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Parameters Type1</em>'.
	 * @see de.ugoe.cs.oco.tosca.OutputParametersType1
	 * @generated
	 */
	EClass getOutputParametersType1();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.OutputParametersType1#getOutputParameter <em>Output Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Parameter</em>'.
	 * @see de.ugoe.cs.oco.tosca.OutputParametersType1#getOutputParameter()
	 * @see #getOutputParametersType1()
	 * @generated
	 */
	EReference getOutputParametersType1_OutputParameter();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.PlanModelReferenceType <em>Plan Model Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Model Reference Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.PlanModelReferenceType
	 * @generated
	 */
	EClass getPlanModelReferenceType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.PlanModelReferenceType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see de.ugoe.cs.oco.tosca.PlanModelReferenceType#getReference()
	 * @see #getPlanModelReferenceType()
	 * @generated
	 */
	EAttribute getPlanModelReferenceType_Reference();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.PlanModelType <em>Plan Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Model Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.PlanModelType
	 * @generated
	 */
	EClass getPlanModelType();

	/**
	 * Returns the meta object for the attribute list '{@link de.ugoe.cs.oco.tosca.PlanModelType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.ugoe.cs.oco.tosca.PlanModelType#getAny()
	 * @see #getPlanModelType()
	 * @generated
	 */
	EAttribute getPlanModelType_Any();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.PlanType <em>Plan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.PlanType
	 * @generated
	 */
	EClass getPlanType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.PlanType#getPlanRef <em>Plan Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plan Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.PlanType#getPlanRef()
	 * @see #getPlanType()
	 * @generated
	 */
	EAttribute getPlanType_PlanRef();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.PoliciesType <em>Policies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policies Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.PoliciesType
	 * @generated
	 */
	EClass getPoliciesType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.PoliciesType#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy</em>'.
	 * @see de.ugoe.cs.oco.tosca.PoliciesType#getPolicy()
	 * @see #getPoliciesType()
	 * @generated
	 */
	EReference getPoliciesType_Policy();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.PoliciesType1 <em>Policies Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policies Type1</em>'.
	 * @see de.ugoe.cs.oco.tosca.PoliciesType1
	 * @generated
	 */
	EClass getPoliciesType1();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.PoliciesType1#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy</em>'.
	 * @see de.ugoe.cs.oco.tosca.PoliciesType1#getPolicy()
	 * @see #getPoliciesType1()
	 * @generated
	 */
	EReference getPoliciesType1_Policy();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.PoliciesType2 <em>Policies Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Policies Type2</em>'.
	 * @see de.ugoe.cs.oco.tosca.PoliciesType2
	 * @generated
	 */
	EClass getPoliciesType2();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.PoliciesType2#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy</em>'.
	 * @see de.ugoe.cs.oco.tosca.PoliciesType2#getPolicy()
	 * @see #getPoliciesType2()
	 * @generated
	 */
	EReference getPoliciesType2_Policy();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.PropertiesDefinitionType <em>Properties Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Definition Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.PropertiesDefinitionType
	 * @generated
	 */
	EClass getPropertiesDefinitionType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.PropertiesDefinitionType#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see de.ugoe.cs.oco.tosca.PropertiesDefinitionType#getElement()
	 * @see #getPropertiesDefinitionType()
	 * @generated
	 */
	EAttribute getPropertiesDefinitionType_Element();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.PropertiesDefinitionType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.PropertiesDefinitionType#getType()
	 * @see #getPropertiesDefinitionType()
	 * @generated
	 */
	EAttribute getPropertiesDefinitionType_Type();

	/**
	 * Returns the meta object for the reference '{@link de.ugoe.cs.oco.tosca.PropertiesDefinitionType#getElementRef <em>Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.PropertiesDefinitionType#getElementRef()
	 * @see #getPropertiesDefinitionType()
	 * @generated
	 */
	EReference getPropertiesDefinitionType_ElementRef();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.PropertiesType <em>Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.PropertiesType
	 * @generated
	 */
	EClass getPropertiesType();

	/**
	 * Returns the meta object for the attribute list '{@link de.ugoe.cs.oco.tosca.PropertiesType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.ugoe.cs.oco.tosca.PropertiesType#getAny()
	 * @see #getPropertiesType()
	 * @generated
	 */
	EAttribute getPropertiesType_Any();

	/**
	 * Returns the meta object for the reference '{@link de.ugoe.cs.oco.tosca.PropertiesType#getPropertiesElement <em>Properties Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Properties Element</em>'.
	 * @see de.ugoe.cs.oco.tosca.PropertiesType#getPropertiesElement()
	 * @see #getPropertiesType()
	 * @generated
	 */
	EReference getPropertiesType_PropertiesElement();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.PropertiesType1 <em>Properties Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Type1</em>'.
	 * @see de.ugoe.cs.oco.tosca.PropertiesType1
	 * @generated
	 */
	EClass getPropertiesType1();

	/**
	 * Returns the meta object for the attribute list '{@link de.ugoe.cs.oco.tosca.PropertiesType1#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.ugoe.cs.oco.tosca.PropertiesType1#getAny()
	 * @see #getPropertiesType1()
	 * @generated
	 */
	EAttribute getPropertiesType1_Any();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.PropertiesType1#getPropertyMappings <em>Property Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Mappings</em>'.
	 * @see de.ugoe.cs.oco.tosca.PropertiesType1#getPropertyMappings()
	 * @see #getPropertiesType1()
	 * @generated
	 */
	EReference getPropertiesType1_PropertyMappings();

	/**
	 * Returns the meta object for the reference '{@link de.ugoe.cs.oco.tosca.PropertiesType1#getPropertiesElement <em>Properties Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Properties Element</em>'.
	 * @see de.ugoe.cs.oco.tosca.PropertiesType1#getPropertiesElement()
	 * @see #getPropertiesType1()
	 * @generated
	 */
	EReference getPropertiesType1_PropertiesElement();


	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.PropertyConstraintsType <em>Property Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Constraints Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.PropertyConstraintsType
	 * @generated
	 */
	EClass getPropertyConstraintsType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.PropertyConstraintsType#getPropertyConstraint <em>Property Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Constraint</em>'.
	 * @see de.ugoe.cs.oco.tosca.PropertyConstraintsType#getPropertyConstraint()
	 * @see #getPropertyConstraintsType()
	 * @generated
	 */
	EReference getPropertyConstraintsType_PropertyConstraint();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.PropertyConstraintsType1 <em>Property Constraints Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Constraints Type1</em>'.
	 * @see de.ugoe.cs.oco.tosca.PropertyConstraintsType1
	 * @generated
	 */
	EClass getPropertyConstraintsType1();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.PropertyConstraintsType1#getPropertyConstraint <em>Property Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Constraint</em>'.
	 * @see de.ugoe.cs.oco.tosca.PropertyConstraintsType1#getPropertyConstraint()
	 * @see #getPropertyConstraintsType1()
	 * @generated
	 */
	EReference getPropertyConstraintsType1_PropertyConstraint();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.PropertyMappingsType <em>Property Mappings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Mappings Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.PropertyMappingsType
	 * @generated
	 */
	EClass getPropertyMappingsType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.PropertyMappingsType#getPropertyMapping <em>Property Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Mapping</em>'.
	 * @see de.ugoe.cs.oco.tosca.PropertyMappingsType#getPropertyMapping()
	 * @see #getPropertyMappingsType()
	 * @generated
	 */
	EReference getPropertyMappingsType_PropertyMapping();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.RelationshipConstraintsType <em>Relationship Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Constraints Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.RelationshipConstraintsType
	 * @generated
	 */
	EClass getRelationshipConstraintsType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.RelationshipConstraintsType#getRelationshipConstraint <em>Relationship Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship Constraint</em>'.
	 * @see de.ugoe.cs.oco.tosca.RelationshipConstraintsType#getRelationshipConstraint()
	 * @see #getRelationshipConstraintsType()
	 * @generated
	 */
	EReference getRelationshipConstraintsType_RelationshipConstraint();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.RelationshipConstraintType <em>Relationship Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Constraint Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.RelationshipConstraintType
	 * @generated
	 */
	EClass getRelationshipConstraintType();

	/**
	 * Returns the meta object for the attribute list '{@link de.ugoe.cs.oco.tosca.RelationshipConstraintType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.ugoe.cs.oco.tosca.RelationshipConstraintType#getAny()
	 * @see #getRelationshipConstraintType()
	 * @generated
	 */
	EAttribute getRelationshipConstraintType_Any();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.RelationshipConstraintType#getConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.RelationshipConstraintType#getConstraintType()
	 * @see #getRelationshipConstraintType()
	 * @generated
	 */
	EAttribute getRelationshipConstraintType_ConstraintType();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.RelationshipOperationType <em>Relationship Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Operation Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.RelationshipOperationType
	 * @generated
	 */
	EClass getRelationshipOperationType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.RelationshipOperationType#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.RelationshipOperationType#getInterfaceName()
	 * @see #getRelationshipOperationType()
	 * @generated
	 */
	EAttribute getRelationshipOperationType_InterfaceName();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.RelationshipOperationType#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.RelationshipOperationType#getOperationName()
	 * @see #getRelationshipOperationType()
	 * @generated
	 */
	EAttribute getRelationshipOperationType_OperationName();

	/**
	 * Returns the meta object for the reference '{@link de.ugoe.cs.oco.tosca.RelationshipOperationType#getRelationshipRef <em>Relationship Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relationship Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.RelationshipOperationType#getRelationshipRef()
	 * @see #getRelationshipOperationType()
	 * @generated
	 */
	EReference getRelationshipOperationType_RelationshipRef();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.RequirementDefinitionsType <em>Requirement Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Definitions Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.RequirementDefinitionsType
	 * @generated
	 */
	EClass getRequirementDefinitionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.RequirementDefinitionsType#getRequirementDefinition <em>Requirement Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Definition</em>'.
	 * @see de.ugoe.cs.oco.tosca.RequirementDefinitionsType#getRequirementDefinition()
	 * @see #getRequirementDefinitionsType()
	 * @generated
	 */
	EReference getRequirementDefinitionsType_RequirementDefinition();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.RequirementDefinitionsType1 <em>Requirement Definitions Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Definitions Type1</em>'.
	 * @see de.ugoe.cs.oco.tosca.RequirementDefinitionsType1
	 * @generated
	 */
	EClass getRequirementDefinitionsType1();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.RequirementDefinitionsType1#getRequirementDefinition <em>Requirement Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Definition</em>'.
	 * @see de.ugoe.cs.oco.tosca.RequirementDefinitionsType1#getRequirementDefinition()
	 * @see #getRequirementDefinitionsType1()
	 * @generated
	 */
	EReference getRequirementDefinitionsType1_RequirementDefinition();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.RequirementsType <em>Requirements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.RequirementsType
	 * @generated
	 */
	EClass getRequirementsType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.RequirementsType#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement</em>'.
	 * @see de.ugoe.cs.oco.tosca.RequirementsType#getRequirement()
	 * @see #getRequirementsType()
	 * @generated
	 */
	EReference getRequirementsType_Requirement();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.RequirementsType1 <em>Requirements Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Type1</em>'.
	 * @see de.ugoe.cs.oco.tosca.RequirementsType1
	 * @generated
	 */
	EClass getRequirementsType1();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.RequirementsType1#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement</em>'.
	 * @see de.ugoe.cs.oco.tosca.RequirementsType1#getRequirement()
	 * @see #getRequirementsType1()
	 * @generated
	 */
	EReference getRequirementsType1_Requirement();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.RequirementsType2 <em>Requirements Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Type2</em>'.
	 * @see de.ugoe.cs.oco.tosca.RequirementsType2
	 * @generated
	 */
	EClass getRequirementsType2();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.RequirementsType2#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement</em>'.
	 * @see de.ugoe.cs.oco.tosca.RequirementsType2#getRequirement()
	 * @see #getRequirementsType2()
	 * @generated
	 */
	EReference getRequirementsType2_Requirement();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.SourceElementType <em>Source Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Element Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.SourceElementType
	 * @generated
	 */
	EClass getSourceElementType();

	/**
	 * Returns the meta object for the reference '{@link de.ugoe.cs.oco.tosca.SourceElementType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.SourceElementType#getRef()
	 * @see #getSourceElementType()
	 * @generated
	 */
	EReference getSourceElementType_Ref();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.SourceInterfacesType <em>Source Interfaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Interfaces Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.SourceInterfacesType
	 * @generated
	 */
	EClass getSourceInterfacesType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.SourceInterfacesType#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see de.ugoe.cs.oco.tosca.SourceInterfacesType#getInterface()
	 * @see #getSourceInterfacesType()
	 * @generated
	 */
	EReference getSourceInterfacesType_Interface();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TAppliesTo <em>TApplies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TApplies To</em>'.
	 * @see de.ugoe.cs.oco.tosca.TAppliesTo
	 * @generated
	 */
	EClass getTAppliesTo();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TAppliesTo#getNodeTypeReference <em>Node Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Type Reference</em>'.
	 * @see de.ugoe.cs.oco.tosca.TAppliesTo#getNodeTypeReference()
	 * @see #getTAppliesTo()
	 * @generated
	 */
	EReference getTAppliesTo_NodeTypeReference();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TargetElementType <em>Target Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Element Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TargetElementType
	 * @generated
	 */
	EClass getTargetElementType();

	/**
	 * Returns the meta object for the reference '{@link de.ugoe.cs.oco.tosca.TargetElementType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.TargetElementType#getRef()
	 * @see #getTargetElementType()
	 * @generated
	 */
	EReference getTargetElementType_Ref();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TargetInterfacesType <em>Target Interfaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Interfaces Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TargetInterfacesType
	 * @generated
	 */
	EClass getTargetInterfacesType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TargetInterfacesType#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see de.ugoe.cs.oco.tosca.TargetInterfacesType#getInterface()
	 * @see #getTargetInterfacesType()
	 * @generated
	 */
	EReference getTargetInterfacesType_Interface();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TArtifactReference <em>TArtifact Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TArtifact Reference</em>'.
	 * @see de.ugoe.cs.oco.tosca.TArtifactReference
	 * @generated
	 */
	EClass getTArtifactReference();

	/**
	 * Returns the meta object for the attribute list '{@link de.ugoe.cs.oco.tosca.TArtifactReference#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see de.ugoe.cs.oco.tosca.TArtifactReference#getGroup()
	 * @see #getTArtifactReference()
	 * @generated
	 */
	EAttribute getTArtifactReference_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TArtifactReference#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see de.ugoe.cs.oco.tosca.TArtifactReference#getInclude()
	 * @see #getTArtifactReference()
	 * @generated
	 */
	EReference getTArtifactReference_Include();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TArtifactReference#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exclude</em>'.
	 * @see de.ugoe.cs.oco.tosca.TArtifactReference#getExclude()
	 * @see #getTArtifactReference()
	 * @generated
	 */
	EReference getTArtifactReference_Exclude();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TArtifactReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see de.ugoe.cs.oco.tosca.TArtifactReference#getReference()
	 * @see #getTArtifactReference()
	 * @generated
	 */
	EAttribute getTArtifactReference_Reference();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TArtifactTemplate <em>TArtifact Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TArtifact Template</em>'.
	 * @see de.ugoe.cs.oco.tosca.TArtifactTemplate
	 * @generated
	 */
	EClass getTArtifactTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TArtifactTemplate#getArtifactReferences <em>Artifact References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifact References</em>'.
	 * @see de.ugoe.cs.oco.tosca.TArtifactTemplate#getArtifactReferences()
	 * @see #getTArtifactTemplate()
	 * @generated
	 */
	EReference getTArtifactTemplate_ArtifactReferences();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TArtifactTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TArtifactTemplate#getName()
	 * @see #getTArtifactTemplate()
	 * @generated
	 */
	EAttribute getTArtifactTemplate_Name();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TArtifactType <em>TArtifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TArtifact Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TArtifactType
	 * @generated
	 */
	EClass getTArtifactType();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TBoundaryDefinitions <em>TBoundary Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBoundary Definitions</em>'.
	 * @see de.ugoe.cs.oco.tosca.TBoundaryDefinitions
	 * @generated
	 */
	EClass getTBoundaryDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getProperties()
	 * @see #getTBoundaryDefinitions()
	 * @generated
	 */
	EReference getTBoundaryDefinitions_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getPropertyConstraints <em>Property Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Constraints</em>'.
	 * @see de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getPropertyConstraints()
	 * @see #getTBoundaryDefinitions()
	 * @generated
	 */
	EReference getTBoundaryDefinitions_PropertyConstraints();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirements</em>'.
	 * @see de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getRequirements()
	 * @see #getTBoundaryDefinitions()
	 * @generated
	 */
	EReference getTBoundaryDefinitions_Requirements();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capabilities</em>'.
	 * @see de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getCapabilities()
	 * @see #getTBoundaryDefinitions()
	 * @generated
	 */
	EReference getTBoundaryDefinitions_Capabilities();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getPolicies <em>Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policies</em>'.
	 * @see de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getPolicies()
	 * @see #getTBoundaryDefinitions()
	 * @generated
	 */
	EReference getTBoundaryDefinitions_Policies();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interfaces</em>'.
	 * @see de.ugoe.cs.oco.tosca.TBoundaryDefinitions#getInterfaces()
	 * @see #getTBoundaryDefinitions()
	 * @generated
	 */
	EReference getTBoundaryDefinitions_Interfaces();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TCapability <em>TCapability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCapability</em>'.
	 * @see de.ugoe.cs.oco.tosca.TCapability
	 * @generated
	 */
	EClass getTCapability();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TCapability#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TCapability#getName()
	 * @see #getTCapability()
	 * @generated
	 */
	EAttribute getTCapability_Name();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TCapabilityDefinition <em>TCapability Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCapability Definition</em>'.
	 * @see de.ugoe.cs.oco.tosca.TCapabilityDefinition
	 * @generated
	 */
	EClass getTCapabilityDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TCapabilityDefinition#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see de.ugoe.cs.oco.tosca.TCapabilityDefinition#getConstraints()
	 * @see #getTCapabilityDefinition()
	 * @generated
	 */
	EReference getTCapabilityDefinition_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TCapabilityDefinition#getCapabilityType <em>Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capability Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TCapabilityDefinition#getCapabilityType()
	 * @see #getTCapabilityDefinition()
	 * @generated
	 */
	EAttribute getTCapabilityDefinition_CapabilityType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TCapabilityDefinition#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see de.ugoe.cs.oco.tosca.TCapabilityDefinition#getLowerBound()
	 * @see #getTCapabilityDefinition()
	 * @generated
	 */
	EAttribute getTCapabilityDefinition_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TCapabilityDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TCapabilityDefinition#getName()
	 * @see #getTCapabilityDefinition()
	 * @generated
	 */
	EAttribute getTCapabilityDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TCapabilityDefinition#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see de.ugoe.cs.oco.tosca.TCapabilityDefinition#getUpperBound()
	 * @see #getTCapabilityDefinition()
	 * @generated
	 */
	EAttribute getTCapabilityDefinition_UpperBound();

	/**
	 * Returns the meta object for the reference '{@link de.ugoe.cs.oco.tosca.TCapabilityDefinition#getCapabilityTypeRef <em>Capability Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability Type Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.TCapabilityDefinition#getCapabilityTypeRef()
	 * @see #getTCapabilityDefinition()
	 * @generated
	 */
	EReference getTCapabilityDefinition_CapabilityTypeRef();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TCapabilityRef <em>TCapability Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCapability Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.TCapabilityRef
	 * @generated
	 */
	EClass getTCapabilityRef();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TCapabilityRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TCapabilityRef#getName()
	 * @see #getTCapabilityRef()
	 * @generated
	 */
	EAttribute getTCapabilityRef_Name();

	/**
	 * Returns the meta object for the reference '{@link de.ugoe.cs.oco.tosca.TCapabilityRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.TCapabilityRef#getRef()
	 * @see #getTCapabilityRef()
	 * @generated
	 */
	EReference getTCapabilityRef_Ref();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TCapabilityType <em>TCapability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCapability Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TCapabilityType
	 * @generated
	 */
	EClass getTCapabilityType();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TCondition <em>TCondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCondition</em>'.
	 * @see de.ugoe.cs.oco.tosca.TCondition
	 * @generated
	 */
	EClass getTCondition();

	/**
	 * Returns the meta object for the attribute list '{@link de.ugoe.cs.oco.tosca.TCondition#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.ugoe.cs.oco.tosca.TCondition#getAny()
	 * @see #getTCondition()
	 * @generated
	 */
	EAttribute getTCondition_Any();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TCondition#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see de.ugoe.cs.oco.tosca.TCondition#getExpressionLanguage()
	 * @see #getTCondition()
	 * @generated
	 */
	EAttribute getTCondition_ExpressionLanguage();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TConstraint <em>TConstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TConstraint</em>'.
	 * @see de.ugoe.cs.oco.tosca.TConstraint
	 * @generated
	 */
	EClass getTConstraint();

	/**
	 * Returns the meta object for the attribute list '{@link de.ugoe.cs.oco.tosca.TConstraint#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.ugoe.cs.oco.tosca.TConstraint#getAny()
	 * @see #getTConstraint()
	 * @generated
	 */
	EAttribute getTConstraint_Any();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TConstraint#getConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TConstraint#getConstraintType()
	 * @see #getTConstraint()
	 * @generated
	 */
	EAttribute getTConstraint_ConstraintType();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TDefinitions <em>TDefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDefinitions</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDefinitions
	 * @generated
	 */
	EClass getTDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TDefinitions#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDefinitions#getExtensions()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Extensions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TDefinitions#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDefinitions#getImport()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Import();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TDefinitions#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Types</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDefinitions#getTypes()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Types();

	/**
	 * Returns the meta object for the attribute list '{@link de.ugoe.cs.oco.tosca.TDefinitions#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDefinitions#getGroup()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TDefinitions#getServiceTemplate <em>Service Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service Template</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDefinitions#getServiceTemplate()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_ServiceTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TDefinitions#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDefinitions#getNodeType()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_NodeType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TDefinitions#getNodeTypeImplementation <em>Node Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Type Implementation</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDefinitions#getNodeTypeImplementation()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_NodeTypeImplementation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TDefinitions#getRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDefinitions#getRelationshipType()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_RelationshipType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TDefinitions#getRelationshipTypeImplementation <em>Relationship Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship Type Implementation</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDefinitions#getRelationshipTypeImplementation()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_RelationshipTypeImplementation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TDefinitions#getRequirementType <em>Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDefinitions#getRequirementType()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_RequirementType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TDefinitions#getCapabilityType <em>Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDefinitions#getCapabilityType()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_CapabilityType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TDefinitions#getArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDefinitions#getArtifactType()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_ArtifactType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TDefinitions#getArtifactTemplate <em>Artifact Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Template</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDefinitions#getArtifactTemplate()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_ArtifactTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TDefinitions#getPolicyType <em>Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDefinitions#getPolicyType()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_PolicyType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TDefinitions#getPolicyTemplate <em>Policy Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Policy Template</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDefinitions#getPolicyTemplate()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_PolicyTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TDefinitions#getGroupType <em>Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDefinitions#getGroupType()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_GroupType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TDefinitions#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDefinitions#getId()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TDefinitions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDefinitions#getName()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TDefinitions#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDefinitions#getTargetNamespace()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_TargetNamespace();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TDeploymentArtifact <em>TDeployment Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDeployment Artifact</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDeploymentArtifact
	 * @generated
	 */
	EClass getTDeploymentArtifact();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TDeploymentArtifact#getArtifactRef <em>Artifact Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDeploymentArtifact#getArtifactRef()
	 * @see #getTDeploymentArtifact()
	 * @generated
	 */
	EAttribute getTDeploymentArtifact_ArtifactRef();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TDeploymentArtifact#getArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDeploymentArtifact#getArtifactType()
	 * @see #getTDeploymentArtifact()
	 * @generated
	 */
	EAttribute getTDeploymentArtifact_ArtifactType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TDeploymentArtifact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDeploymentArtifact#getName()
	 * @see #getTDeploymentArtifact()
	 * @generated
	 */
	EAttribute getTDeploymentArtifact_Name();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TDeploymentArtifacts <em>TDeployment Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDeployment Artifacts</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDeploymentArtifacts
	 * @generated
	 */
	EClass getTDeploymentArtifacts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TDeploymentArtifacts#getDeploymentArtifact <em>Deployment Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployment Artifact</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDeploymentArtifacts#getDeploymentArtifact()
	 * @see #getTDeploymentArtifacts()
	 * @generated
	 */
	EReference getTDeploymentArtifacts_DeploymentArtifact();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TDocumentation <em>TDocumentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDocumentation</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDocumentation
	 * @generated
	 */
	EClass getTDocumentation();

	/**
	 * Returns the meta object for the attribute list '{@link de.ugoe.cs.oco.tosca.TDocumentation#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDocumentation#getMixed()
	 * @see #getTDocumentation()
	 * @generated
	 */
	EAttribute getTDocumentation_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link de.ugoe.cs.oco.tosca.TDocumentation#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDocumentation#getAny()
	 * @see #getTDocumentation()
	 * @generated
	 */
	EAttribute getTDocumentation_Any();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TDocumentation#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDocumentation#getLang()
	 * @see #getTDocumentation()
	 * @generated
	 */
	EAttribute getTDocumentation_Lang();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TDocumentation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see de.ugoe.cs.oco.tosca.TDocumentation#getSource()
	 * @see #getTDocumentation()
	 * @generated
	 */
	EAttribute getTDocumentation_Source();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TEntityTemplate <em>TEntity Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEntity Template</em>'.
	 * @see de.ugoe.cs.oco.tosca.TEntityTemplate
	 * @generated
	 */
	EClass getTEntityTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TEntityTemplate#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see de.ugoe.cs.oco.tosca.TEntityTemplate#getProperties()
	 * @see #getTEntityTemplate()
	 * @generated
	 */
	EReference getTEntityTemplate_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TEntityTemplate#getPropertyConstraints <em>Property Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Constraints</em>'.
	 * @see de.ugoe.cs.oco.tosca.TEntityTemplate#getPropertyConstraints()
	 * @see #getTEntityTemplate()
	 * @generated
	 */
	EReference getTEntityTemplate_PropertyConstraints();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TEntityTemplate#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.ugoe.cs.oco.tosca.TEntityTemplate#getId()
	 * @see #getTEntityTemplate()
	 * @generated
	 */
	EAttribute getTEntityTemplate_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TEntityTemplate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TEntityTemplate#getType()
	 * @see #getTEntityTemplate()
	 * @generated
	 */
	EAttribute getTEntityTemplate_Type();

	/**
	 * Returns the meta object for the reference '{@link de.ugoe.cs.oco.tosca.TEntityTemplate#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.TEntityTemplate#getTypeRef()
	 * @see #getTEntityTemplate()
	 * @generated
	 */
	EReference getTEntityTemplate_TypeRef();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TEntityType <em>TEntity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEntity Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TEntityType
	 * @generated
	 */
	EClass getTEntityType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TEntityType#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tags</em>'.
	 * @see de.ugoe.cs.oco.tosca.TEntityType#getTags()
	 * @see #getTEntityType()
	 * @generated
	 */
	EReference getTEntityType_Tags();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TEntityType#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derived From</em>'.
	 * @see de.ugoe.cs.oco.tosca.TEntityType#getDerivedFrom()
	 * @see #getTEntityType()
	 * @generated
	 */
	EReference getTEntityType_DerivedFrom();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TEntityType#getPropertiesDefinition <em>Properties Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties Definition</em>'.
	 * @see de.ugoe.cs.oco.tosca.TEntityType#getPropertiesDefinition()
	 * @see #getTEntityType()
	 * @generated
	 */
	EReference getTEntityType_PropertiesDefinition();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TEntityType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see de.ugoe.cs.oco.tosca.TEntityType#getAbstract()
	 * @see #getTEntityType()
	 * @generated
	 */
	EAttribute getTEntityType_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TEntityType#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see de.ugoe.cs.oco.tosca.TEntityType#getFinal()
	 * @see #getTEntityType()
	 * @generated
	 */
	EAttribute getTEntityType_Final();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TEntityType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TEntityType#getName()
	 * @see #getTEntityType()
	 * @generated
	 */
	EAttribute getTEntityType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TEntityType#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see de.ugoe.cs.oco.tosca.TEntityType#getTargetNamespace()
	 * @see #getTEntityType()
	 * @generated
	 */
	EAttribute getTEntityType_TargetNamespace();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TExportedInterface <em>TExported Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExported Interface</em>'.
	 * @see de.ugoe.cs.oco.tosca.TExportedInterface
	 * @generated
	 */
	EClass getTExportedInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TExportedInterface#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see de.ugoe.cs.oco.tosca.TExportedInterface#getOperation()
	 * @see #getTExportedInterface()
	 * @generated
	 */
	EReference getTExportedInterface_Operation();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TExportedInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TExportedInterface#getName()
	 * @see #getTExportedInterface()
	 * @generated
	 */
	EAttribute getTExportedInterface_Name();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TExportedOperation <em>TExported Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExported Operation</em>'.
	 * @see de.ugoe.cs.oco.tosca.TExportedOperation
	 * @generated
	 */
	EClass getTExportedOperation();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TExportedOperation#getNodeOperation <em>Node Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node Operation</em>'.
	 * @see de.ugoe.cs.oco.tosca.TExportedOperation#getNodeOperation()
	 * @see #getTExportedOperation()
	 * @generated
	 */
	EReference getTExportedOperation_NodeOperation();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TExportedOperation#getRelationshipOperation <em>Relationship Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship Operation</em>'.
	 * @see de.ugoe.cs.oco.tosca.TExportedOperation#getRelationshipOperation()
	 * @see #getTExportedOperation()
	 * @generated
	 */
	EReference getTExportedOperation_RelationshipOperation();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TExportedOperation#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan</em>'.
	 * @see de.ugoe.cs.oco.tosca.TExportedOperation#getPlan()
	 * @see #getTExportedOperation()
	 * @generated
	 */
	EReference getTExportedOperation_Plan();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TExportedOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TExportedOperation#getName()
	 * @see #getTExportedOperation()
	 * @generated
	 */
	EAttribute getTExportedOperation_Name();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TExtensibleElements <em>TExtensible Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExtensible Elements</em>'.
	 * @see de.ugoe.cs.oco.tosca.TExtensibleElements
	 * @generated
	 */
	EClass getTExtensibleElements();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TExtensibleElements#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see de.ugoe.cs.oco.tosca.TExtensibleElements#getDocumentation()
	 * @see #getTExtensibleElements()
	 * @generated
	 */
	EReference getTExtensibleElements_Documentation();

	/**
	 * Returns the meta object for the attribute list '{@link de.ugoe.cs.oco.tosca.TExtensibleElements#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.ugoe.cs.oco.tosca.TExtensibleElements#getAny()
	 * @see #getTExtensibleElements()
	 * @generated
	 */
	EAttribute getTExtensibleElements_Any();

	/**
	 * Returns the meta object for the attribute list '{@link de.ugoe.cs.oco.tosca.TExtensibleElements#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see de.ugoe.cs.oco.tosca.TExtensibleElements#getAnyAttribute()
	 * @see #getTExtensibleElements()
	 * @generated
	 */
	EAttribute getTExtensibleElements_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TExtension <em>TExtension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExtension</em>'.
	 * @see de.ugoe.cs.oco.tosca.TExtension
	 * @generated
	 */
	EClass getTExtension();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TExtension#getMustUnderstand <em>Must Understand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Understand</em>'.
	 * @see de.ugoe.cs.oco.tosca.TExtension#getMustUnderstand()
	 * @see #getTExtension()
	 * @generated
	 */
	EAttribute getTExtension_MustUnderstand();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TExtension#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see de.ugoe.cs.oco.tosca.TExtension#getNamespace()
	 * @see #getTExtension()
	 * @generated
	 */
	EAttribute getTExtension_Namespace();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TExtensions <em>TExtensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExtensions</em>'.
	 * @see de.ugoe.cs.oco.tosca.TExtensions
	 * @generated
	 */
	EClass getTExtensions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TExtensions#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see de.ugoe.cs.oco.tosca.TExtensions#getExtension()
	 * @see #getTExtensions()
	 * @generated
	 */
	EReference getTExtensions_Extension();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TGroupTemplate <em>TGroup Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGroup Template</em>'.
	 * @see de.ugoe.cs.oco.tosca.TGroupTemplate
	 * @generated
	 */
	EClass getTGroupTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirements</em>'.
	 * @see de.ugoe.cs.oco.tosca.TGroupTemplate#getRequirements()
	 * @see #getTGroupTemplate()
	 * @generated
	 */
	EReference getTGroupTemplate_Requirements();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capabilities</em>'.
	 * @see de.ugoe.cs.oco.tosca.TGroupTemplate#getCapabilities()
	 * @see #getTGroupTemplate()
	 * @generated
	 */
	EReference getTGroupTemplate_Capabilities();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getPolicies <em>Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policies</em>'.
	 * @see de.ugoe.cs.oco.tosca.TGroupTemplate#getPolicies()
	 * @see #getTGroupTemplate()
	 * @generated
	 */
	EReference getTGroupTemplate_Policies();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getDeploymentArtifacts <em>Deployment Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deployment Artifacts</em>'.
	 * @see de.ugoe.cs.oco.tosca.TGroupTemplate#getDeploymentArtifacts()
	 * @see #getTGroupTemplate()
	 * @generated
	 */
	EReference getTGroupTemplate_DeploymentArtifacts();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getMaxInstances <em>Max Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Instances</em>'.
	 * @see de.ugoe.cs.oco.tosca.TGroupTemplate#getMaxInstances()
	 * @see #getTGroupTemplate()
	 * @generated
	 */
	EAttribute getTGroupTemplate_MaxInstances();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getMinInstances <em>Min Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Instances</em>'.
	 * @see de.ugoe.cs.oco.tosca.TGroupTemplate#getMinInstances()
	 * @see #getTGroupTemplate()
	 * @generated
	 */
	EAttribute getTGroupTemplate_MinInstances();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TGroupTemplate#getName()
	 * @see #getTGroupTemplate()
	 * @generated
	 */
	EAttribute getTGroupTemplate_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.ugoe.cs.oco.tosca.TGroupTemplate#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see de.ugoe.cs.oco.tosca.TGroupTemplate#getMember()
	 * @see #getTGroupTemplate()
	 * @generated
	 */
	EReference getTGroupTemplate_Member();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TGroupType <em>TGroup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGroup Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TGroupType
	 * @generated
	 */
	EClass getTGroupType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TGroupType#getRequirementDefinitions <em>Requirement Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirement Definitions</em>'.
	 * @see de.ugoe.cs.oco.tosca.TGroupType#getRequirementDefinitions()
	 * @see #getTGroupType()
	 * @generated
	 */
	EReference getTGroupType_RequirementDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TGroupType#getCapabilityDefinitions <em>Capability Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capability Definitions</em>'.
	 * @see de.ugoe.cs.oco.tosca.TGroupType#getCapabilityDefinitions()
	 * @see #getTGroupType()
	 * @generated
	 */
	EReference getTGroupType_CapabilityDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TGroupType#getInstanceStates <em>Instance States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instance States</em>'.
	 * @see de.ugoe.cs.oco.tosca.TGroupType#getInstanceStates()
	 * @see #getTGroupType()
	 * @generated
	 */
	EReference getTGroupType_InstanceStates();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TGroupType#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interfaces</em>'.
	 * @see de.ugoe.cs.oco.tosca.TGroupType#getInterfaces()
	 * @see #getTGroupType()
	 * @generated
	 */
	EReference getTGroupType_Interfaces();

	/**
	 * Returns the meta object for the attribute list '{@link de.ugoe.cs.oco.tosca.TGroupType#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Member</em>'.
	 * @see de.ugoe.cs.oco.tosca.TGroupType#getMember()
	 * @see #getTGroupType()
	 * @generated
	 */
	EAttribute getTGroupType_Member();

	/**
	 * Returns the meta object for the reference list '{@link de.ugoe.cs.oco.tosca.TGroupType#getMemberRefs <em>Member Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member Refs</em>'.
	 * @see de.ugoe.cs.oco.tosca.TGroupType#getMemberRefs()
	 * @see #getTGroupType()
	 * @generated
	 */
	EReference getTGroupType_MemberRefs();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TImplementationArtifact <em>TImplementation Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TImplementation Artifact</em>'.
	 * @see de.ugoe.cs.oco.tosca.TImplementationArtifact
	 * @generated
	 */
	EClass getTImplementationArtifact();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TImplementationArtifact#getArtifactRef <em>Artifact Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.TImplementationArtifact#getArtifactRef()
	 * @see #getTImplementationArtifact()
	 * @generated
	 */
	EAttribute getTImplementationArtifact_ArtifactRef();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TImplementationArtifact#getArtifactType <em>Artifact Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifact Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TImplementationArtifact#getArtifactType()
	 * @see #getTImplementationArtifact()
	 * @generated
	 */
	EAttribute getTImplementationArtifact_ArtifactType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TImplementationArtifact#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TImplementationArtifact#getInterfaceName()
	 * @see #getTImplementationArtifact()
	 * @generated
	 */
	EAttribute getTImplementationArtifact_InterfaceName();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TImplementationArtifact#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TImplementationArtifact#getOperationName()
	 * @see #getTImplementationArtifact()
	 * @generated
	 */
	EAttribute getTImplementationArtifact_OperationName();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TImplementationArtifacts <em>TImplementation Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TImplementation Artifacts</em>'.
	 * @see de.ugoe.cs.oco.tosca.TImplementationArtifacts
	 * @generated
	 */
	EClass getTImplementationArtifacts();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TImplementationArtifacts#getImplementationArtifact <em>Implementation Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implementation Artifact</em>'.
	 * @see de.ugoe.cs.oco.tosca.TImplementationArtifacts#getImplementationArtifact()
	 * @see #getTImplementationArtifacts()
	 * @generated
	 */
	EReference getTImplementationArtifacts_ImplementationArtifact();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TImport <em>TImport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TImport</em>'.
	 * @see de.ugoe.cs.oco.tosca.TImport
	 * @generated
	 */
	EClass getTImport();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TImport#getImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TImport#getImportType()
	 * @see #getTImport()
	 * @generated
	 */
	EAttribute getTImport_ImportType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TImport#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see de.ugoe.cs.oco.tosca.TImport#getLocation()
	 * @see #getTImport()
	 * @generated
	 */
	EAttribute getTImport_Location();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TImport#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see de.ugoe.cs.oco.tosca.TImport#getNamespace()
	 * @see #getTImport()
	 * @generated
	 */
	EAttribute getTImport_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TImport#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource</em>'.
	 * @see de.ugoe.cs.oco.tosca.TImport#getResource()
	 * @see #getTImport()
	 * @generated
	 */
	EAttribute getTImport_Resource();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TInterface <em>TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInterface</em>'.
	 * @see de.ugoe.cs.oco.tosca.TInterface
	 * @generated
	 */
	EClass getTInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TInterface#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see de.ugoe.cs.oco.tosca.TInterface#getOperation()
	 * @see #getTInterface()
	 * @generated
	 */
	EReference getTInterface_Operation();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TInterface#getName()
	 * @see #getTInterface()
	 * @generated
	 */
	EAttribute getTInterface_Name();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TNodeTemplate <em>TNode Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TNode Template</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeTemplate
	 * @generated
	 */
	EClass getTNodeTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirements</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeTemplate#getRequirements()
	 * @see #getTNodeTemplate()
	 * @generated
	 */
	EReference getTNodeTemplate_Requirements();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capabilities</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeTemplate#getCapabilities()
	 * @see #getTNodeTemplate()
	 * @generated
	 */
	EReference getTNodeTemplate_Capabilities();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getPolicies <em>Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Policies</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeTemplate#getPolicies()
	 * @see #getTNodeTemplate()
	 * @generated
	 */
	EReference getTNodeTemplate_Policies();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getDeploymentArtifacts <em>Deployment Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deployment Artifacts</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeTemplate#getDeploymentArtifacts()
	 * @see #getTNodeTemplate()
	 * @generated
	 */
	EReference getTNodeTemplate_DeploymentArtifacts();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getMaxInstances <em>Max Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Instances</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeTemplate#getMaxInstances()
	 * @see #getTNodeTemplate()
	 * @generated
	 */
	EAttribute getTNodeTemplate_MaxInstances();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getMinInstances <em>Min Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Instances</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeTemplate#getMinInstances()
	 * @see #getTNodeTemplate()
	 * @generated
	 */
	EAttribute getTNodeTemplate_MinInstances();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TNodeTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeTemplate#getName()
	 * @see #getTNodeTemplate()
	 * @generated
	 */
	EAttribute getTNodeTemplate_Name();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TNodeType <em>TNode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TNode Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeType
	 * @generated
	 */
	EClass getTNodeType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TNodeType#getRequirementDefinitions <em>Requirement Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirement Definitions</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeType#getRequirementDefinitions()
	 * @see #getTNodeType()
	 * @generated
	 */
	EReference getTNodeType_RequirementDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TNodeType#getCapabilityDefinitions <em>Capability Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capability Definitions</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeType#getCapabilityDefinitions()
	 * @see #getTNodeType()
	 * @generated
	 */
	EReference getTNodeType_CapabilityDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TNodeType#getInstanceStates <em>Instance States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instance States</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeType#getInstanceStates()
	 * @see #getTNodeType()
	 * @generated
	 */
	EReference getTNodeType_InstanceStates();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TNodeType#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interfaces</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeType#getInterfaces()
	 * @see #getTNodeType()
	 * @generated
	 */
	EReference getTNodeType_Interfaces();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation <em>TNode Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TNode Type Implementation</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeTypeImplementation
	 * @generated
	 */
	EClass getTNodeTypeImplementation();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tags</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getTags()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EReference getTNodeTypeImplementation_Tags();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derived From</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getDerivedFrom()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EReference getTNodeTypeImplementation_DerivedFrom();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getRequiredContainerFeatures <em>Required Container Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Container Features</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getRequiredContainerFeatures()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EReference getTNodeTypeImplementation_RequiredContainerFeatures();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getImplementationArtifacts <em>Implementation Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation Artifacts</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getImplementationArtifacts()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EReference getTNodeTypeImplementation_ImplementationArtifacts();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getDeploymentArtifacts <em>Deployment Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deployment Artifacts</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getDeploymentArtifacts()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EReference getTNodeTypeImplementation_DeploymentArtifacts();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getAbstract()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EAttribute getTNodeTypeImplementation_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getFinal()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EAttribute getTNodeTypeImplementation_Final();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getName()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EAttribute getTNodeTypeImplementation_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getNodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getNodeType()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EAttribute getTNodeTypeImplementation_NodeType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see de.ugoe.cs.oco.tosca.TNodeTypeImplementation#getTargetNamespace()
	 * @see #getTNodeTypeImplementation()
	 * @generated
	 */
	EAttribute getTNodeTypeImplementation_TargetNamespace();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TOperation <em>TOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOperation</em>'.
	 * @see de.ugoe.cs.oco.tosca.TOperation
	 * @generated
	 */
	EClass getTOperation();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TOperation#getInputParameters <em>Input Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Parameters</em>'.
	 * @see de.ugoe.cs.oco.tosca.TOperation#getInputParameters()
	 * @see #getTOperation()
	 * @generated
	 */
	EReference getTOperation_InputParameters();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TOperation#getOutputParameters <em>Output Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Parameters</em>'.
	 * @see de.ugoe.cs.oco.tosca.TOperation#getOutputParameters()
	 * @see #getTOperation()
	 * @generated
	 */
	EReference getTOperation_OutputParameters();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TOperation#getName()
	 * @see #getTOperation()
	 * @generated
	 */
	EAttribute getTOperation_Name();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TParameter <em>TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TParameter</em>'.
	 * @see de.ugoe.cs.oco.tosca.TParameter
	 * @generated
	 */
	EClass getTParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TParameter#getName()
	 * @see #getTParameter()
	 * @generated
	 */
	EAttribute getTParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TParameter#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see de.ugoe.cs.oco.tosca.TParameter#getRequired()
	 * @see #getTParameter()
	 * @generated
	 */
	EAttribute getTParameter_Required();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TParameter#getType()
	 * @see #getTParameter()
	 * @generated
	 */
	EAttribute getTParameter_Type();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TPlan <em>TPlan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPlan</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPlan
	 * @generated
	 */
	EClass getTPlan();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TPlan#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPlan#getPrecondition()
	 * @see #getTPlan()
	 * @generated
	 */
	EReference getTPlan_Precondition();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TPlan#getInputParameters <em>Input Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Parameters</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPlan#getInputParameters()
	 * @see #getTPlan()
	 * @generated
	 */
	EReference getTPlan_InputParameters();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TPlan#getOutputParameters <em>Output Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Parameters</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPlan#getOutputParameters()
	 * @see #getTPlan()
	 * @generated
	 */
	EReference getTPlan_OutputParameters();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TPlan#getPlanModel <em>Plan Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan Model</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPlan#getPlanModel()
	 * @see #getTPlan()
	 * @generated
	 */
	EReference getTPlan_PlanModel();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TPlan#getPlanModelReference <em>Plan Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan Model Reference</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPlan#getPlanModelReference()
	 * @see #getTPlan()
	 * @generated
	 */
	EReference getTPlan_PlanModelReference();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TPlan#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPlan#getId()
	 * @see #getTPlan()
	 * @generated
	 */
	EAttribute getTPlan_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TPlan#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPlan#getName()
	 * @see #getTPlan()
	 * @generated
	 */
	EAttribute getTPlan_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TPlan#getPlanLanguage <em>Plan Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plan Language</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPlan#getPlanLanguage()
	 * @see #getTPlan()
	 * @generated
	 */
	EAttribute getTPlan_PlanLanguage();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TPlan#getPlanType <em>Plan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Plan Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPlan#getPlanType()
	 * @see #getTPlan()
	 * @generated
	 */
	EAttribute getTPlan_PlanType();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TPlans <em>TPlans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPlans</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPlans
	 * @generated
	 */
	EClass getTPlans();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TPlans#getPlan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plan</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPlans#getPlan()
	 * @see #getTPlans()
	 * @generated
	 */
	EReference getTPlans_Plan();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TPlans#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPlans#getTargetNamespace()
	 * @see #getTPlans()
	 * @generated
	 */
	EAttribute getTPlans_TargetNamespace();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TPolicy <em>TPolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPolicy</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPolicy
	 * @generated
	 */
	EClass getTPolicy();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TPolicy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPolicy#getName()
	 * @see #getTPolicy()
	 * @generated
	 */
	EAttribute getTPolicy_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TPolicy#getPolicyRef <em>Policy Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPolicy#getPolicyRef()
	 * @see #getTPolicy()
	 * @generated
	 */
	EAttribute getTPolicy_PolicyRef();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TPolicy#getPolicyType <em>Policy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPolicy#getPolicyType()
	 * @see #getTPolicy()
	 * @generated
	 */
	EAttribute getTPolicy_PolicyType();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TPolicyTemplate <em>TPolicy Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPolicy Template</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPolicyTemplate
	 * @generated
	 */
	EClass getTPolicyTemplate();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TPolicyTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPolicyTemplate#getName()
	 * @see #getTPolicyTemplate()
	 * @generated
	 */
	EAttribute getTPolicyTemplate_Name();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TPolicyType <em>TPolicy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPolicy Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPolicyType
	 * @generated
	 */
	EClass getTPolicyType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TPolicyType#getAppliesTo <em>Applies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applies To</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPolicyType#getAppliesTo()
	 * @see #getTPolicyType()
	 * @generated
	 */
	EReference getTPolicyType_AppliesTo();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TPolicyType#getPolicyLanguage <em>Policy Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Language</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPolicyType#getPolicyLanguage()
	 * @see #getTPolicyType()
	 * @generated
	 */
	EAttribute getTPolicyType_PolicyLanguage();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TPropertyConstraint <em>TProperty Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TProperty Constraint</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPropertyConstraint
	 * @generated
	 */
	EClass getTPropertyConstraint();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TPropertyConstraint#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPropertyConstraint#getProperty()
	 * @see #getTPropertyConstraint()
	 * @generated
	 */
	EAttribute getTPropertyConstraint_Property();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TPropertyMapping <em>TProperty Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TProperty Mapping</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPropertyMapping
	 * @generated
	 */
	EClass getTPropertyMapping();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TPropertyMapping#getServiceTemplatePropertyRef <em>Service Template Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Template Property Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPropertyMapping#getServiceTemplatePropertyRef()
	 * @see #getTPropertyMapping()
	 * @generated
	 */
	EAttribute getTPropertyMapping_ServiceTemplatePropertyRef();

	/**
	 * Returns the meta object for the reference '{@link de.ugoe.cs.oco.tosca.TPropertyMapping#getTargetObjectRef <em>Target Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Object Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPropertyMapping#getTargetObjectRef()
	 * @see #getTPropertyMapping()
	 * @generated
	 */
	EReference getTPropertyMapping_TargetObjectRef();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TPropertyMapping#getTargetPropertyRef <em>Target Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Property Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.TPropertyMapping#getTargetPropertyRef()
	 * @see #getTPropertyMapping()
	 * @generated
	 */
	EAttribute getTPropertyMapping_TargetPropertyRef();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TRelationshipTemplate <em>TRelationship Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRelationship Template</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRelationshipTemplate
	 * @generated
	 */
	EClass getTRelationshipTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TRelationshipTemplate#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Element</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRelationshipTemplate#getSourceElement()
	 * @see #getTRelationshipTemplate()
	 * @generated
	 */
	EReference getTRelationshipTemplate_SourceElement();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TRelationshipTemplate#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Element</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRelationshipTemplate#getTargetElement()
	 * @see #getTRelationshipTemplate()
	 * @generated
	 */
	EReference getTRelationshipTemplate_TargetElement();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TRelationshipTemplate#getRelationshipConstraints <em>Relationship Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship Constraints</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRelationshipTemplate#getRelationshipConstraints()
	 * @see #getTRelationshipTemplate()
	 * @generated
	 */
	EReference getTRelationshipTemplate_RelationshipConstraints();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TRelationshipTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRelationshipTemplate#getName()
	 * @see #getTRelationshipTemplate()
	 * @generated
	 */
	EAttribute getTRelationshipTemplate_Name();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TRelationshipType <em>TRelationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRelationship Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRelationshipType
	 * @generated
	 */
	EClass getTRelationshipType();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TRelationshipType#getInstanceStates <em>Instance States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instance States</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRelationshipType#getInstanceStates()
	 * @see #getTRelationshipType()
	 * @generated
	 */
	EReference getTRelationshipType_InstanceStates();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TRelationshipType#getSourceInterfaces <em>Source Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Interfaces</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRelationshipType#getSourceInterfaces()
	 * @see #getTRelationshipType()
	 * @generated
	 */
	EReference getTRelationshipType_SourceInterfaces();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TRelationshipType#getTargetInterfaces <em>Target Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Interfaces</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRelationshipType#getTargetInterfaces()
	 * @see #getTRelationshipType()
	 * @generated
	 */
	EReference getTRelationshipType_TargetInterfaces();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TRelationshipType#getValidSource <em>Valid Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valid Source</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRelationshipType#getValidSource()
	 * @see #getTRelationshipType()
	 * @generated
	 */
	EReference getTRelationshipType_ValidSource();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TRelationshipType#getValidTarget <em>Valid Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valid Target</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRelationshipType#getValidTarget()
	 * @see #getTRelationshipType()
	 * @generated
	 */
	EReference getTRelationshipType_ValidTarget();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TRelationshipTypeImplementation <em>TRelationship Type Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRelationship Type Implementation</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRelationshipTypeImplementation
	 * @generated
	 */
	EClass getTRelationshipTypeImplementation();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TRelationshipTypeImplementation#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tags</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRelationshipTypeImplementation#getTags()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EReference getTRelationshipTypeImplementation_Tags();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TRelationshipTypeImplementation#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derived From</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRelationshipTypeImplementation#getDerivedFrom()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EReference getTRelationshipTypeImplementation_DerivedFrom();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TRelationshipTypeImplementation#getRequiredContainerFeatures <em>Required Container Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Container Features</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRelationshipTypeImplementation#getRequiredContainerFeatures()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EReference getTRelationshipTypeImplementation_RequiredContainerFeatures();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TRelationshipTypeImplementation#getImplementationArtifacts <em>Implementation Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation Artifacts</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRelationshipTypeImplementation#getImplementationArtifacts()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EReference getTRelationshipTypeImplementation_ImplementationArtifacts();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TRelationshipTypeImplementation#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRelationshipTypeImplementation#getAbstract()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EAttribute getTRelationshipTypeImplementation_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TRelationshipTypeImplementation#getFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRelationshipTypeImplementation#getFinal()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EAttribute getTRelationshipTypeImplementation_Final();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TRelationshipTypeImplementation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRelationshipTypeImplementation#getName()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EAttribute getTRelationshipTypeImplementation_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TRelationshipTypeImplementation#getRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRelationshipTypeImplementation#getRelationshipType()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EAttribute getTRelationshipTypeImplementation_RelationshipType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TRelationshipTypeImplementation#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRelationshipTypeImplementation#getTargetNamespace()
	 * @see #getTRelationshipTypeImplementation()
	 * @generated
	 */
	EAttribute getTRelationshipTypeImplementation_TargetNamespace();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TRequiredContainerFeature <em>TRequired Container Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRequired Container Feature</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRequiredContainerFeature
	 * @generated
	 */
	EClass getTRequiredContainerFeature();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TRequiredContainerFeature#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRequiredContainerFeature#getFeature()
	 * @see #getTRequiredContainerFeature()
	 * @generated
	 */
	EAttribute getTRequiredContainerFeature_Feature();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TRequiredContainerFeatures <em>TRequired Container Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRequired Container Features</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRequiredContainerFeatures
	 * @generated
	 */
	EClass getTRequiredContainerFeatures();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TRequiredContainerFeatures#getRequiredContainerFeature <em>Required Container Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Container Feature</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRequiredContainerFeatures#getRequiredContainerFeature()
	 * @see #getTRequiredContainerFeatures()
	 * @generated
	 */
	EReference getTRequiredContainerFeatures_RequiredContainerFeature();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TRequirement <em>TRequirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRequirement</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRequirement
	 * @generated
	 */
	EClass getTRequirement();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TRequirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRequirement#getName()
	 * @see #getTRequirement()
	 * @generated
	 */
	EAttribute getTRequirement_Name();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TRequirementDefinition <em>TRequirement Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRequirement Definition</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRequirementDefinition
	 * @generated
	 */
	EClass getTRequirementDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TRequirementDefinition#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRequirementDefinition#getConstraints()
	 * @see #getTRequirementDefinition()
	 * @generated
	 */
	EReference getTRequirementDefinition_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TRequirementDefinition#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRequirementDefinition#getLowerBound()
	 * @see #getTRequirementDefinition()
	 * @generated
	 */
	EAttribute getTRequirementDefinition_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TRequirementDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRequirementDefinition#getName()
	 * @see #getTRequirementDefinition()
	 * @generated
	 */
	EAttribute getTRequirementDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TRequirementDefinition#getRequirementType <em>Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirement Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRequirementDefinition#getRequirementType()
	 * @see #getTRequirementDefinition()
	 * @generated
	 */
	EAttribute getTRequirementDefinition_RequirementType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TRequirementDefinition#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRequirementDefinition#getUpperBound()
	 * @see #getTRequirementDefinition()
	 * @generated
	 */
	EAttribute getTRequirementDefinition_UpperBound();

	/**
	 * Returns the meta object for the reference '{@link de.ugoe.cs.oco.tosca.TRequirementDefinition#getRequirementTypeRef <em>Requirement Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement Type Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRequirementDefinition#getRequirementTypeRef()
	 * @see #getTRequirementDefinition()
	 * @generated
	 */
	EReference getTRequirementDefinition_RequirementTypeRef();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TRequirementRef <em>TRequirement Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRequirement Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRequirementRef
	 * @generated
	 */
	EClass getTRequirementRef();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TRequirementRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRequirementRef#getName()
	 * @see #getTRequirementRef()
	 * @generated
	 */
	EAttribute getTRequirementRef_Name();

	/**
	 * Returns the meta object for the reference '{@link de.ugoe.cs.oco.tosca.TRequirementRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRequirementRef#getRef()
	 * @see #getTRequirementRef()
	 * @generated
	 */
	EReference getTRequirementRef_Ref();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TRequirementType <em>TRequirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRequirement Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRequirementType
	 * @generated
	 */
	EClass getTRequirementType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TRequirementType#getRequiredCapabilityType <em>Required Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Capability Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRequirementType#getRequiredCapabilityType()
	 * @see #getTRequirementType()
	 * @generated
	 */
	EAttribute getTRequirementType_RequiredCapabilityType();

	/**
	 * Returns the meta object for the reference '{@link de.ugoe.cs.oco.tosca.TRequirementType#getRequiredCapabilityTypeRef <em>Required Capability Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Capability Type Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.TRequirementType#getRequiredCapabilityTypeRef()
	 * @see #getTRequirementType()
	 * @generated
	 */
	EReference getTRequirementType_RequiredCapabilityTypeRef();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TServiceTemplate <em>TService Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TService Template</em>'.
	 * @see de.ugoe.cs.oco.tosca.TServiceTemplate
	 * @generated
	 */
	EClass getTServiceTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TServiceTemplate#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tags</em>'.
	 * @see de.ugoe.cs.oco.tosca.TServiceTemplate#getTags()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EReference getTServiceTemplate_Tags();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TServiceTemplate#getBoundaryDefinitions <em>Boundary Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boundary Definitions</em>'.
	 * @see de.ugoe.cs.oco.tosca.TServiceTemplate#getBoundaryDefinitions()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EReference getTServiceTemplate_BoundaryDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TServiceTemplate#getTopologyTemplate <em>Topology Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Topology Template</em>'.
	 * @see de.ugoe.cs.oco.tosca.TServiceTemplate#getTopologyTemplate()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EReference getTServiceTemplate_TopologyTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.oco.tosca.TServiceTemplate#getPlans <em>Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plans</em>'.
	 * @see de.ugoe.cs.oco.tosca.TServiceTemplate#getPlans()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EReference getTServiceTemplate_Plans();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TServiceTemplate#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.ugoe.cs.oco.tosca.TServiceTemplate#getId()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EAttribute getTServiceTemplate_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TServiceTemplate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TServiceTemplate#getName()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EAttribute getTServiceTemplate_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TServiceTemplate#getSubstitutableNodeType <em>Substitutable Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Substitutable Node Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TServiceTemplate#getSubstitutableNodeType()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EAttribute getTServiceTemplate_SubstitutableNodeType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TServiceTemplate#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see de.ugoe.cs.oco.tosca.TServiceTemplate#getTargetNamespace()
	 * @see #getTServiceTemplate()
	 * @generated
	 */
	EAttribute getTServiceTemplate_TargetNamespace();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TTag <em>TTag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTag</em>'.
	 * @see de.ugoe.cs.oco.tosca.TTag
	 * @generated
	 */
	EClass getTTag();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TTag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.oco.tosca.TTag#getName()
	 * @see #getTTag()
	 * @generated
	 */
	EAttribute getTTag_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.TTag#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.ugoe.cs.oco.tosca.TTag#getValue()
	 * @see #getTTag()
	 * @generated
	 */
	EAttribute getTTag_Value();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TTags <em>TTags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTags</em>'.
	 * @see de.ugoe.cs.oco.tosca.TTags
	 * @generated
	 */
	EClass getTTags();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TTags#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tag</em>'.
	 * @see de.ugoe.cs.oco.tosca.TTags#getTag()
	 * @see #getTTags()
	 * @generated
	 */
	EReference getTTags_Tag();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TTopologyElementInstanceStates <em>TTopology Element Instance States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTopology Element Instance States</em>'.
	 * @see de.ugoe.cs.oco.tosca.TTopologyElementInstanceStates
	 * @generated
	 */
	EClass getTTopologyElementInstanceStates();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TTopologyElementInstanceStates#getInstanceState <em>Instance State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance State</em>'.
	 * @see de.ugoe.cs.oco.tosca.TTopologyElementInstanceStates#getInstanceState()
	 * @see #getTTopologyElementInstanceStates()
	 * @generated
	 */
	EReference getTTopologyElementInstanceStates_InstanceState();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TTopologyTemplate <em>TTopology Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTopology Template</em>'.
	 * @see de.ugoe.cs.oco.tosca.TTopologyTemplate
	 * @generated
	 */
	EClass getTTopologyTemplate();

	/**
	 * Returns the meta object for the attribute list '{@link de.ugoe.cs.oco.tosca.TTopologyTemplate#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see de.ugoe.cs.oco.tosca.TTopologyTemplate#getGroup()
	 * @see #getTTopologyTemplate()
	 * @generated
	 */
	EAttribute getTTopologyTemplate_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TTopologyTemplate#getNodeTemplate <em>Node Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Template</em>'.
	 * @see de.ugoe.cs.oco.tosca.TTopologyTemplate#getNodeTemplate()
	 * @see #getTTopologyTemplate()
	 * @generated
	 */
	EReference getTTopologyTemplate_NodeTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TTopologyTemplate#getRelationshipTemplate <em>Relationship Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship Template</em>'.
	 * @see de.ugoe.cs.oco.tosca.TTopologyTemplate#getRelationshipTemplate()
	 * @see #getTTopologyTemplate()
	 * @generated
	 */
	EReference getTTopologyTemplate_RelationshipTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.oco.tosca.TTopologyTemplate#getGroupTemplate <em>Group Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group Template</em>'.
	 * @see de.ugoe.cs.oco.tosca.TTopologyTemplate#getGroupTemplate()
	 * @see #getTTopologyTemplate()
	 * @generated
	 */
	EReference getTTopologyTemplate_GroupTemplate();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.TypesType <em>Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Types Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.TypesType
	 * @generated
	 */
	EClass getTypesType();

	/**
	 * Returns the meta object for the attribute list '{@link de.ugoe.cs.oco.tosca.TypesType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.ugoe.cs.oco.tosca.TypesType#getAny()
	 * @see #getTypesType()
	 * @generated
	 */
	EAttribute getTypesType_Any();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.ValidSourceType <em>Valid Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Source Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.ValidSourceType
	 * @generated
	 */
	EClass getValidSourceType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.ValidSourceType#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.ValidSourceType#getTypeRef()
	 * @see #getValidSourceType()
	 * @generated
	 */
	EAttribute getValidSourceType_TypeRef();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.oco.tosca.ValidTargetType <em>Valid Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valid Target Type</em>'.
	 * @see de.ugoe.cs.oco.tosca.ValidTargetType
	 * @generated
	 */
	EClass getValidTargetType();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.oco.tosca.ValidTargetType#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Ref</em>'.
	 * @see de.ugoe.cs.oco.tosca.ValidTargetType#getTypeRef()
	 * @see #getValidTargetType()
	 * @generated
	 */
	EAttribute getValidTargetType_TypeRef();

	/**
	 * Returns the meta object for enum '{@link de.ugoe.cs.oco.tosca.MaxInstancesTypeMember1 <em>Max Instances Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Max Instances Type Member1</em>'.
	 * @see de.ugoe.cs.oco.tosca.MaxInstancesTypeMember1
	 * @generated
	 */
	EEnum getMaxInstancesTypeMember1();

	/**
	 * Returns the meta object for enum '{@link de.ugoe.cs.oco.tosca.MaxInstancesTypeMember11 <em>Max Instances Type Member11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Max Instances Type Member11</em>'.
	 * @see de.ugoe.cs.oco.tosca.MaxInstancesTypeMember11
	 * @generated
	 */
	EEnum getMaxInstancesTypeMember11();

	/**
	 * Returns the meta object for enum '{@link de.ugoe.cs.oco.tosca.TBoolean <em>TBoolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TBoolean</em>'.
	 * @see de.ugoe.cs.oco.tosca.TBoolean
	 * @generated
	 */
	EEnum getTBoolean();

	/**
	 * Returns the meta object for enum '{@link de.ugoe.cs.oco.tosca.UpperBoundTypeMember1 <em>Upper Bound Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Upper Bound Type Member1</em>'.
	 * @see de.ugoe.cs.oco.tosca.UpperBoundTypeMember1
	 * @generated
	 */
	EEnum getUpperBoundTypeMember1();

	/**
	 * Returns the meta object for enum '{@link de.ugoe.cs.oco.tosca.UpperBoundTypeMember11 <em>Upper Bound Type Member11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Upper Bound Type Member11</em>'.
	 * @see de.ugoe.cs.oco.tosca.UpperBoundTypeMember11
	 * @generated
	 */
	EEnum getUpperBoundTypeMember11();

	/**
	 * Returns the meta object for enum '{@link de.ugoe.cs.oco.tosca.ValidImportTypes <em>Valid Import Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Valid Import Types</em>'.
	 * @see de.ugoe.cs.oco.tosca.ValidImportTypes
	 * @generated
	 */
	EEnum getValidImportTypes();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Imported URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Imported URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='importedURI' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getImportedURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Max Instances Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Max Instances Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='maxInstances_._type' memberTypes='maxInstances_._type_._member_._0 maxInstances_._type_._member_._1'"
	 * @generated
	 */
	EDataType getMaxInstancesType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Max Instances Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Max Instances Type1</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='maxInstances_._1_._type' memberTypes='maxInstances_._1_._type_._member_._0 maxInstances_._1_._type_._member_._1'"
	 * @generated
	 */
	EDataType getMaxInstancesType1();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Max Instances Type Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Max Instances Type Member0</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='maxInstances_._type_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger' pattern='([1-9]+[0-9]*)'"
	 * @generated
	 */
	EDataType getMaxInstancesTypeMember0();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Max Instances Type Member01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Max Instances Type Member01</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='maxInstances_._1_._type_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger' pattern='([1-9]+[0-9]*)'"
	 * @generated
	 */
	EDataType getMaxInstancesTypeMember01();

	/**
	 * Returns the meta object for data type '{@link de.ugoe.cs.oco.tosca.MaxInstancesTypeMember1 <em>Max Instances Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Max Instances Type Member1 Object</em>'.
	 * @see de.ugoe.cs.oco.tosca.MaxInstancesTypeMember1
	 * @model instanceClass="de.ugoe.cs.oco.tosca.MaxInstancesTypeMember1"
	 *        extendedMetaData="name='maxInstances_._type_._member_._1:Object' baseType='maxInstances_._type_._member_._1'"
	 * @generated
	 */
	EDataType getMaxInstancesTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link de.ugoe.cs.oco.tosca.MaxInstancesTypeMember11 <em>Max Instances Type Member1 Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Max Instances Type Member1 Object1</em>'.
	 * @see de.ugoe.cs.oco.tosca.MaxInstancesTypeMember11
	 * @model instanceClass="de.ugoe.cs.oco.tosca.MaxInstancesTypeMember11"
	 *        extendedMetaData="name='maxInstances_._1_._type_._member_._1:Object' baseType='maxInstances_._1_._type_._member_._1'"
	 * @generated
	 */
	EDataType getMaxInstancesTypeMember1Object1();

	/**
	 * Returns the meta object for data type '{@link de.ugoe.cs.oco.tosca.TBoolean <em>TBoolean Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TBoolean Object</em>'.
	 * @see de.ugoe.cs.oco.tosca.TBoolean
	 * @model instanceClass="de.ugoe.cs.oco.tosca.TBoolean"
	 *        extendedMetaData="name='tBoolean:Object' baseType='tBoolean'"
	 * @generated
	 */
	EDataType getTBooleanObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Upper Bound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Upper Bound Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='upperBound_._type' memberTypes='upperBound_._type_._member_._0 upperBound_._type_._member_._1'"
	 * @generated
	 */
	EDataType getUpperBoundType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Upper Bound Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Upper Bound Type1</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='upperBound_._1_._type' memberTypes='upperBound_._1_._type_._member_._0 upperBound_._1_._type_._member_._1'"
	 * @generated
	 */
	EDataType getUpperBoundType1();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Upper Bound Type Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Upper Bound Type Member0</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='upperBound_._type_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger' pattern='([1-9]+[0-9]*)'"
	 * @generated
	 */
	EDataType getUpperBoundTypeMember0();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Upper Bound Type Member01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Upper Bound Type Member01</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='upperBound_._1_._type_._member_._0' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger' pattern='([1-9]+[0-9]*)'"
	 * @generated
	 */
	EDataType getUpperBoundTypeMember01();

	/**
	 * Returns the meta object for data type '{@link de.ugoe.cs.oco.tosca.UpperBoundTypeMember1 <em>Upper Bound Type Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Upper Bound Type Member1 Object</em>'.
	 * @see de.ugoe.cs.oco.tosca.UpperBoundTypeMember1
	 * @model instanceClass="de.ugoe.cs.oco.tosca.UpperBoundTypeMember1"
	 *        extendedMetaData="name='upperBound_._type_._member_._1:Object' baseType='upperBound_._type_._member_._1'"
	 * @generated
	 */
	EDataType getUpperBoundTypeMember1Object();

	/**
	 * Returns the meta object for data type '{@link de.ugoe.cs.oco.tosca.UpperBoundTypeMember11 <em>Upper Bound Type Member1 Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Upper Bound Type Member1 Object1</em>'.
	 * @see de.ugoe.cs.oco.tosca.UpperBoundTypeMember11
	 * @model instanceClass="de.ugoe.cs.oco.tosca.UpperBoundTypeMember11"
	 *        extendedMetaData="name='upperBound_._1_._type_._member_._1:Object' baseType='upperBound_._1_._type_._member_._1'"
	 * @generated
	 */
	EDataType getUpperBoundTypeMember1Object1();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ToscaFactory getToscaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.ArtifactReferencesTypeImpl <em>Artifact References Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.ArtifactReferencesTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getArtifactReferencesType()
		 * @generated
		 */
		EClass ARTIFACT_REFERENCES_TYPE = eINSTANCE.getArtifactReferencesType();

		/**
		 * The meta object literal for the '<em><b>Artifact Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_REFERENCES_TYPE__ARTIFACT_REFERENCE = eINSTANCE.getArtifactReferencesType_ArtifactReference();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.CapabilitiesTypeImpl <em>Capabilities Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.CapabilitiesTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getCapabilitiesType()
		 * @generated
		 */
		EClass CAPABILITIES_TYPE = eINSTANCE.getCapabilitiesType();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_TYPE__CAPABILITY = eINSTANCE.getCapabilitiesType_Capability();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.CapabilitiesType1Impl <em>Capabilities Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.CapabilitiesType1Impl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getCapabilitiesType1()
		 * @generated
		 */
		EClass CAPABILITIES_TYPE1 = eINSTANCE.getCapabilitiesType1();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_TYPE1__CAPABILITY = eINSTANCE.getCapabilitiesType1_Capability();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.CapabilitiesType2Impl <em>Capabilities Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.CapabilitiesType2Impl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getCapabilitiesType2()
		 * @generated
		 */
		EClass CAPABILITIES_TYPE2 = eINSTANCE.getCapabilitiesType2();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_TYPE2__CAPABILITY = eINSTANCE.getCapabilitiesType2_Capability();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.CapabilityDefinitionsTypeImpl <em>Capability Definitions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.CapabilityDefinitionsTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getCapabilityDefinitionsType()
		 * @generated
		 */
		EClass CAPABILITY_DEFINITIONS_TYPE = eINSTANCE.getCapabilityDefinitionsType();

		/**
		 * The meta object literal for the '<em><b>Capability Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_DEFINITIONS_TYPE__CAPABILITY_DEFINITION = eINSTANCE.getCapabilityDefinitionsType_CapabilityDefinition();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.CapabilityDefinitionsType1Impl <em>Capability Definitions Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.CapabilityDefinitionsType1Impl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getCapabilityDefinitionsType1()
		 * @generated
		 */
		EClass CAPABILITY_DEFINITIONS_TYPE1 = eINSTANCE.getCapabilityDefinitionsType1();

		/**
		 * The meta object literal for the '<em><b>Capability Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITY_DEFINITIONS_TYPE1__CAPABILITY_DEFINITION = eINSTANCE.getCapabilityDefinitionsType1_CapabilityDefinition();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.ConstraintsTypeImpl <em>Constraints Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.ConstraintsTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getConstraintsType()
		 * @generated
		 */
		EClass CONSTRAINTS_TYPE = eINSTANCE.getConstraintsType();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINTS_TYPE__CONSTRAINT = eINSTANCE.getConstraintsType_Constraint();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.ConstraintsType1Impl <em>Constraints Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.ConstraintsType1Impl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getConstraintsType1()
		 * @generated
		 */
		EClass CONSTRAINTS_TYPE1 = eINSTANCE.getConstraintsType1();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINTS_TYPE1__CONSTRAINT = eINSTANCE.getConstraintsType1_Constraint();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.DefinitionsTypeImpl <em>Definitions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.DefinitionsTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getDefinitionsType()
		 * @generated
		 */
		EClass DEFINITIONS_TYPE = eINSTANCE.getDefinitionsType();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.DerivedFromTypeImpl <em>Derived From Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.DerivedFromTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getDerivedFromType()
		 * @generated
		 */
		EClass DERIVED_FROM_TYPE = eINSTANCE.getDerivedFromType();

		/**
		 * The meta object literal for the '<em><b>Node Type Implementation Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVED_FROM_TYPE__NODE_TYPE_IMPLEMENTATION_REF = eINSTANCE.getDerivedFromType_NodeTypeImplementationRef();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.DerivedFromType1Impl <em>Derived From Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.DerivedFromType1Impl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getDerivedFromType1()
		 * @generated
		 */
		EClass DERIVED_FROM_TYPE1 = eINSTANCE.getDerivedFromType1();

		/**
		 * The meta object literal for the '<em><b>Relationship Type Implementation Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVED_FROM_TYPE1__RELATIONSHIP_TYPE_IMPLEMENTATION_REF = eINSTANCE.getDerivedFromType1_RelationshipTypeImplementationRef();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.DerivedFromType2Impl <em>Derived From Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.DerivedFromType2Impl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getDerivedFromType2()
		 * @generated
		 */
		EClass DERIVED_FROM_TYPE2 = eINSTANCE.getDerivedFromType2();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVED_FROM_TYPE2__TYPE_REF = eINSTANCE.getDerivedFromType2_TypeRef();

		/**
		 * The meta object literal for the '<em><b>Referenced Entity Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_FROM_TYPE2__REFERENCED_ENTITY_TYPE = eINSTANCE.getDerivedFromType2_ReferencedEntityType();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.DocumentRootImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DEFINITIONS = eINSTANCE.getDocumentRoot_Definitions();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOCUMENTATION = eINSTANCE.getDocumentRoot_Documentation();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.ExcludeTypeImpl <em>Exclude Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.ExcludeTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getExcludeType()
		 * @generated
		 */
		EClass EXCLUDE_TYPE = eINSTANCE.getExcludeType();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCLUDE_TYPE__PATTERN = eINSTANCE.getExcludeType_Pattern();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.ExtensionsTypeImpl <em>Extensions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.ExtensionsTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getExtensionsType()
		 * @generated
		 */
		EClass EXTENSIONS_TYPE = eINSTANCE.getExtensionsType();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSIONS_TYPE__EXTENSION = eINSTANCE.getExtensionsType_Extension();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.ImplementationArtifactTypeImpl <em>Implementation Artifact Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.ImplementationArtifactTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getImplementationArtifactType()
		 * @generated
		 */
		EClass IMPLEMENTATION_ARTIFACT_TYPE = eINSTANCE.getImplementationArtifactType();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.IncludeTypeImpl <em>Include Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.IncludeTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getIncludeType()
		 * @generated
		 */
		EClass INCLUDE_TYPE = eINSTANCE.getIncludeType();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__PATTERN = eINSTANCE.getIncludeType_Pattern();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.InputParametersTypeImpl <em>Input Parameters Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.InputParametersTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getInputParametersType()
		 * @generated
		 */
		EClass INPUT_PARAMETERS_TYPE = eINSTANCE.getInputParametersType();

		/**
		 * The meta object literal for the '<em><b>Input Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PARAMETERS_TYPE__INPUT_PARAMETER = eINSTANCE.getInputParametersType_InputParameter();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.InputParametersType1Impl <em>Input Parameters Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.InputParametersType1Impl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getInputParametersType1()
		 * @generated
		 */
		EClass INPUT_PARAMETERS_TYPE1 = eINSTANCE.getInputParametersType1();

		/**
		 * The meta object literal for the '<em><b>Input Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PARAMETERS_TYPE1__INPUT_PARAMETER = eINSTANCE.getInputParametersType1_InputParameter();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.InstanceStateTypeImpl <em>Instance State Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.InstanceStateTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getInstanceStateType()
		 * @generated
		 */
		EClass INSTANCE_STATE_TYPE = eINSTANCE.getInstanceStateType();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_STATE_TYPE__STATE = eINSTANCE.getInstanceStateType_State();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.InterfacesTypeImpl <em>Interfaces Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.InterfacesTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getInterfacesType()
		 * @generated
		 */
		EClass INTERFACES_TYPE = eINSTANCE.getInterfacesType();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES_TYPE__INTERFACE = eINSTANCE.getInterfacesType_Interface();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.InterfacesType1Impl <em>Interfaces Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.InterfacesType1Impl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getInterfacesType1()
		 * @generated
		 */
		EClass INTERFACES_TYPE1 = eINSTANCE.getInterfacesType1();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES_TYPE1__INTERFACE = eINSTANCE.getInterfacesType1_Interface();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.InterfacesType2Impl <em>Interfaces Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.InterfacesType2Impl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getInterfacesType2()
		 * @generated
		 */
		EClass INTERFACES_TYPE2 = eINSTANCE.getInterfacesType2();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACES_TYPE2__INTERFACE = eINSTANCE.getInterfacesType2_Interface();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.NodeOperationTypeImpl <em>Node Operation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.NodeOperationTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getNodeOperationType()
		 * @generated
		 */
		EClass NODE_OPERATION_TYPE = eINSTANCE.getNodeOperationType();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_OPERATION_TYPE__INTERFACE_NAME = eINSTANCE.getNodeOperationType_InterfaceName();

		/**
		 * The meta object literal for the '<em><b>Node Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_OPERATION_TYPE__NODE_REF = eINSTANCE.getNodeOperationType_NodeRef();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_OPERATION_TYPE__OPERATION_NAME = eINSTANCE.getNodeOperationType_OperationName();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.NodeTypeReferenceTypeImpl <em>Node Type Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.NodeTypeReferenceTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getNodeTypeReferenceType()
		 * @generated
		 */
		EClass NODE_TYPE_REFERENCE_TYPE = eINSTANCE.getNodeTypeReferenceType();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_TYPE_REFERENCE_TYPE__TYPE_REF = eINSTANCE.getNodeTypeReferenceType_TypeRef();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.OutputParametersTypeImpl <em>Output Parameters Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.OutputParametersTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getOutputParametersType()
		 * @generated
		 */
		EClass OUTPUT_PARAMETERS_TYPE = eINSTANCE.getOutputParametersType();

		/**
		 * The meta object literal for the '<em><b>Output Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PARAMETERS_TYPE__OUTPUT_PARAMETER = eINSTANCE.getOutputParametersType_OutputParameter();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.OutputParametersType1Impl <em>Output Parameters Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.OutputParametersType1Impl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getOutputParametersType1()
		 * @generated
		 */
		EClass OUTPUT_PARAMETERS_TYPE1 = eINSTANCE.getOutputParametersType1();

		/**
		 * The meta object literal for the '<em><b>Output Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PARAMETERS_TYPE1__OUTPUT_PARAMETER = eINSTANCE.getOutputParametersType1_OutputParameter();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.PlanModelReferenceTypeImpl <em>Plan Model Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.PlanModelReferenceTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPlanModelReferenceType()
		 * @generated
		 */
		EClass PLAN_MODEL_REFERENCE_TYPE = eINSTANCE.getPlanModelReferenceType();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_MODEL_REFERENCE_TYPE__REFERENCE = eINSTANCE.getPlanModelReferenceType_Reference();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.PlanModelTypeImpl <em>Plan Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.PlanModelTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPlanModelType()
		 * @generated
		 */
		EClass PLAN_MODEL_TYPE = eINSTANCE.getPlanModelType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_MODEL_TYPE__ANY = eINSTANCE.getPlanModelType_Any();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.PlanTypeImpl <em>Plan Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.PlanTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPlanType()
		 * @generated
		 */
		EClass PLAN_TYPE = eINSTANCE.getPlanType();

		/**
		 * The meta object literal for the '<em><b>Plan Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN_TYPE__PLAN_REF = eINSTANCE.getPlanType_PlanRef();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.PoliciesTypeImpl <em>Policies Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.PoliciesTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPoliciesType()
		 * @generated
		 */
		EClass POLICIES_TYPE = eINSTANCE.getPoliciesType();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICIES_TYPE__POLICY = eINSTANCE.getPoliciesType_Policy();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.PoliciesType1Impl <em>Policies Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.PoliciesType1Impl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPoliciesType1()
		 * @generated
		 */
		EClass POLICIES_TYPE1 = eINSTANCE.getPoliciesType1();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICIES_TYPE1__POLICY = eINSTANCE.getPoliciesType1_Policy();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.PoliciesType2Impl <em>Policies Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.PoliciesType2Impl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPoliciesType2()
		 * @generated
		 */
		EClass POLICIES_TYPE2 = eINSTANCE.getPoliciesType2();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLICIES_TYPE2__POLICY = eINSTANCE.getPoliciesType2_Policy();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.PropertiesDefinitionTypeImpl <em>Properties Definition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.PropertiesDefinitionTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPropertiesDefinitionType()
		 * @generated
		 */
		EClass PROPERTIES_DEFINITION_TYPE = eINSTANCE.getPropertiesDefinitionType();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_DEFINITION_TYPE__ELEMENT = eINSTANCE.getPropertiesDefinitionType_Element();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_DEFINITION_TYPE__TYPE = eINSTANCE.getPropertiesDefinitionType_Type();

		/**
		 * The meta object literal for the '<em><b>Element Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_DEFINITION_TYPE__ELEMENT_REF = eINSTANCE.getPropertiesDefinitionType_ElementRef();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.PropertiesTypeImpl <em>Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.PropertiesTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPropertiesType()
		 * @generated
		 */
		EClass PROPERTIES_TYPE = eINSTANCE.getPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_TYPE__ANY = eINSTANCE.getPropertiesType_Any();

		/**
		 * The meta object literal for the '<em><b>Properties Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_TYPE__PROPERTIES_ELEMENT = eINSTANCE.getPropertiesType_PropertiesElement();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.PropertiesType1Impl <em>Properties Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.PropertiesType1Impl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPropertiesType1()
		 * @generated
		 */
		EClass PROPERTIES_TYPE1 = eINSTANCE.getPropertiesType1();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_TYPE1__ANY = eINSTANCE.getPropertiesType1_Any();

		/**
		 * The meta object literal for the '<em><b>Property Mappings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_TYPE1__PROPERTY_MAPPINGS = eINSTANCE.getPropertiesType1_PropertyMappings();

		/**
		 * The meta object literal for the '<em><b>Properties Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_TYPE1__PROPERTIES_ELEMENT = eINSTANCE.getPropertiesType1_PropertiesElement();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.PropertyConstraintsTypeImpl <em>Property Constraints Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.PropertyConstraintsTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPropertyConstraintsType()
		 * @generated
		 */
		EClass PROPERTY_CONSTRAINTS_TYPE = eINSTANCE.getPropertyConstraintsType();

		/**
		 * The meta object literal for the '<em><b>Property Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CONSTRAINTS_TYPE__PROPERTY_CONSTRAINT = eINSTANCE.getPropertyConstraintsType_PropertyConstraint();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.PropertyConstraintsType1Impl <em>Property Constraints Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.PropertyConstraintsType1Impl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPropertyConstraintsType1()
		 * @generated
		 */
		EClass PROPERTY_CONSTRAINTS_TYPE1 = eINSTANCE.getPropertyConstraintsType1();

		/**
		 * The meta object literal for the '<em><b>Property Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CONSTRAINTS_TYPE1__PROPERTY_CONSTRAINT = eINSTANCE.getPropertyConstraintsType1_PropertyConstraint();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.PropertyMappingsTypeImpl <em>Property Mappings Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.PropertyMappingsTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getPropertyMappingsType()
		 * @generated
		 */
		EClass PROPERTY_MAPPINGS_TYPE = eINSTANCE.getPropertyMappingsType();

		/**
		 * The meta object literal for the '<em><b>Property Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_MAPPINGS_TYPE__PROPERTY_MAPPING = eINSTANCE.getPropertyMappingsType_PropertyMapping();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.RelationshipConstraintsTypeImpl <em>Relationship Constraints Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.RelationshipConstraintsTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getRelationshipConstraintsType()
		 * @generated
		 */
		EClass RELATIONSHIP_CONSTRAINTS_TYPE = eINSTANCE.getRelationshipConstraintsType();

		/**
		 * The meta object literal for the '<em><b>Relationship Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_CONSTRAINTS_TYPE__RELATIONSHIP_CONSTRAINT = eINSTANCE.getRelationshipConstraintsType_RelationshipConstraint();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.RelationshipConstraintTypeImpl <em>Relationship Constraint Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.RelationshipConstraintTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getRelationshipConstraintType()
		 * @generated
		 */
		EClass RELATIONSHIP_CONSTRAINT_TYPE = eINSTANCE.getRelationshipConstraintType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_CONSTRAINT_TYPE__ANY = eINSTANCE.getRelationshipConstraintType_Any();

		/**
		 * The meta object literal for the '<em><b>Constraint Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_CONSTRAINT_TYPE__CONSTRAINT_TYPE = eINSTANCE.getRelationshipConstraintType_ConstraintType();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.RelationshipOperationTypeImpl <em>Relationship Operation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.RelationshipOperationTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getRelationshipOperationType()
		 * @generated
		 */
		EClass RELATIONSHIP_OPERATION_TYPE = eINSTANCE.getRelationshipOperationType();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_OPERATION_TYPE__INTERFACE_NAME = eINSTANCE.getRelationshipOperationType_InterfaceName();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_OPERATION_TYPE__OPERATION_NAME = eINSTANCE.getRelationshipOperationType_OperationName();

		/**
		 * The meta object literal for the '<em><b>Relationship Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_OPERATION_TYPE__RELATIONSHIP_REF = eINSTANCE.getRelationshipOperationType_RelationshipRef();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.RequirementDefinitionsTypeImpl <em>Requirement Definitions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.RequirementDefinitionsTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getRequirementDefinitionsType()
		 * @generated
		 */
		EClass REQUIREMENT_DEFINITIONS_TYPE = eINSTANCE.getRequirementDefinitionsType();

		/**
		 * The meta object literal for the '<em><b>Requirement Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_DEFINITIONS_TYPE__REQUIREMENT_DEFINITION = eINSTANCE.getRequirementDefinitionsType_RequirementDefinition();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.RequirementDefinitionsType1Impl <em>Requirement Definitions Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.RequirementDefinitionsType1Impl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getRequirementDefinitionsType1()
		 * @generated
		 */
		EClass REQUIREMENT_DEFINITIONS_TYPE1 = eINSTANCE.getRequirementDefinitionsType1();

		/**
		 * The meta object literal for the '<em><b>Requirement Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_DEFINITIONS_TYPE1__REQUIREMENT_DEFINITION = eINSTANCE.getRequirementDefinitionsType1_RequirementDefinition();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.RequirementsTypeImpl <em>Requirements Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.RequirementsTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getRequirementsType()
		 * @generated
		 */
		EClass REQUIREMENTS_TYPE = eINSTANCE.getRequirementsType();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_TYPE__REQUIREMENT = eINSTANCE.getRequirementsType_Requirement();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.RequirementsType1Impl <em>Requirements Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.RequirementsType1Impl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getRequirementsType1()
		 * @generated
		 */
		EClass REQUIREMENTS_TYPE1 = eINSTANCE.getRequirementsType1();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_TYPE1__REQUIREMENT = eINSTANCE.getRequirementsType1_Requirement();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.RequirementsType2Impl <em>Requirements Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.RequirementsType2Impl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getRequirementsType2()
		 * @generated
		 */
		EClass REQUIREMENTS_TYPE2 = eINSTANCE.getRequirementsType2();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_TYPE2__REQUIREMENT = eINSTANCE.getRequirementsType2_Requirement();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.SourceElementTypeImpl <em>Source Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.SourceElementTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getSourceElementType()
		 * @generated
		 */
		EClass SOURCE_ELEMENT_TYPE = eINSTANCE.getSourceElementType();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_ELEMENT_TYPE__REF = eINSTANCE.getSourceElementType_Ref();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.SourceInterfacesTypeImpl <em>Source Interfaces Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.SourceInterfacesTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getSourceInterfacesType()
		 * @generated
		 */
		EClass SOURCE_INTERFACES_TYPE = eINSTANCE.getSourceInterfacesType();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_INTERFACES_TYPE__INTERFACE = eINSTANCE.getSourceInterfacesType_Interface();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TAppliesToImpl <em>TApplies To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TAppliesToImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTAppliesTo()
		 * @generated
		 */
		EClass TAPPLIES_TO = eINSTANCE.getTAppliesTo();

		/**
		 * The meta object literal for the '<em><b>Node Type Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAPPLIES_TO__NODE_TYPE_REFERENCE = eINSTANCE.getTAppliesTo_NodeTypeReference();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TargetElementTypeImpl <em>Target Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TargetElementTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTargetElementType()
		 * @generated
		 */
		EClass TARGET_ELEMENT_TYPE = eINSTANCE.getTargetElementType();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_ELEMENT_TYPE__REF = eINSTANCE.getTargetElementType_Ref();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TargetInterfacesTypeImpl <em>Target Interfaces Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TargetInterfacesTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTargetInterfacesType()
		 * @generated
		 */
		EClass TARGET_INTERFACES_TYPE = eINSTANCE.getTargetInterfacesType();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_INTERFACES_TYPE__INTERFACE = eINSTANCE.getTargetInterfacesType_Interface();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TArtifactReferenceImpl <em>TArtifact Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TArtifactReferenceImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTArtifactReference()
		 * @generated
		 */
		EClass TARTIFACT_REFERENCE = eINSTANCE.getTArtifactReference();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARTIFACT_REFERENCE__GROUP = eINSTANCE.getTArtifactReference_Group();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARTIFACT_REFERENCE__INCLUDE = eINSTANCE.getTArtifactReference_Include();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARTIFACT_REFERENCE__EXCLUDE = eINSTANCE.getTArtifactReference_Exclude();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARTIFACT_REFERENCE__REFERENCE = eINSTANCE.getTArtifactReference_Reference();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TArtifactTemplateImpl <em>TArtifact Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TArtifactTemplateImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTArtifactTemplate()
		 * @generated
		 */
		EClass TARTIFACT_TEMPLATE = eINSTANCE.getTArtifactTemplate();

		/**
		 * The meta object literal for the '<em><b>Artifact References</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARTIFACT_TEMPLATE__ARTIFACT_REFERENCES = eINSTANCE.getTArtifactTemplate_ArtifactReferences();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARTIFACT_TEMPLATE__NAME = eINSTANCE.getTArtifactTemplate_Name();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TArtifactTypeImpl <em>TArtifact Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TArtifactTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTArtifactType()
		 * @generated
		 */
		EClass TARTIFACT_TYPE = eINSTANCE.getTArtifactType();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TBoundaryDefinitionsImpl <em>TBoundary Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TBoundaryDefinitionsImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTBoundaryDefinitions()
		 * @generated
		 */
		EClass TBOUNDARY_DEFINITIONS = eINSTANCE.getTBoundaryDefinitions();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBOUNDARY_DEFINITIONS__PROPERTIES = eINSTANCE.getTBoundaryDefinitions_Properties();

		/**
		 * The meta object literal for the '<em><b>Property Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBOUNDARY_DEFINITIONS__PROPERTY_CONSTRAINTS = eINSTANCE.getTBoundaryDefinitions_PropertyConstraints();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBOUNDARY_DEFINITIONS__REQUIREMENTS = eINSTANCE.getTBoundaryDefinitions_Requirements();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBOUNDARY_DEFINITIONS__CAPABILITIES = eINSTANCE.getTBoundaryDefinitions_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Policies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBOUNDARY_DEFINITIONS__POLICIES = eINSTANCE.getTBoundaryDefinitions_Policies();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBOUNDARY_DEFINITIONS__INTERFACES = eINSTANCE.getTBoundaryDefinitions_Interfaces();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TCapabilityImpl <em>TCapability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TCapabilityImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTCapability()
		 * @generated
		 */
		EClass TCAPABILITY = eINSTANCE.getTCapability();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCAPABILITY__NAME = eINSTANCE.getTCapability_Name();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TCapabilityDefinitionImpl <em>TCapability Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TCapabilityDefinitionImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTCapabilityDefinition()
		 * @generated
		 */
		EClass TCAPABILITY_DEFINITION = eINSTANCE.getTCapabilityDefinition();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCAPABILITY_DEFINITION__CONSTRAINTS = eINSTANCE.getTCapabilityDefinition_Constraints();

		/**
		 * The meta object literal for the '<em><b>Capability Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCAPABILITY_DEFINITION__CAPABILITY_TYPE = eINSTANCE.getTCapabilityDefinition_CapabilityType();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCAPABILITY_DEFINITION__LOWER_BOUND = eINSTANCE.getTCapabilityDefinition_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCAPABILITY_DEFINITION__NAME = eINSTANCE.getTCapabilityDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCAPABILITY_DEFINITION__UPPER_BOUND = eINSTANCE.getTCapabilityDefinition_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Capability Type Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCAPABILITY_DEFINITION__CAPABILITY_TYPE_REF = eINSTANCE.getTCapabilityDefinition_CapabilityTypeRef();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TCapabilityRefImpl <em>TCapability Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TCapabilityRefImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTCapabilityRef()
		 * @generated
		 */
		EClass TCAPABILITY_REF = eINSTANCE.getTCapabilityRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCAPABILITY_REF__NAME = eINSTANCE.getTCapabilityRef_Name();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCAPABILITY_REF__REF = eINSTANCE.getTCapabilityRef_Ref();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TCapabilityTypeImpl <em>TCapability Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TCapabilityTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTCapabilityType()
		 * @generated
		 */
		EClass TCAPABILITY_TYPE = eINSTANCE.getTCapabilityType();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TConditionImpl <em>TCondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TConditionImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTCondition()
		 * @generated
		 */
		EClass TCONDITION = eINSTANCE.getTCondition();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCONDITION__ANY = eINSTANCE.getTCondition_Any();

		/**
		 * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCONDITION__EXPRESSION_LANGUAGE = eINSTANCE.getTCondition_ExpressionLanguage();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TConstraintImpl <em>TConstraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TConstraintImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTConstraint()
		 * @generated
		 */
		EClass TCONSTRAINT = eINSTANCE.getTConstraint();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCONSTRAINT__ANY = eINSTANCE.getTConstraint_Any();

		/**
		 * The meta object literal for the '<em><b>Constraint Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCONSTRAINT__CONSTRAINT_TYPE = eINSTANCE.getTConstraint_ConstraintType();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TDefinitionsImpl <em>TDefinitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TDefinitionsImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTDefinitions()
		 * @generated
		 */
		EClass TDEFINITIONS = eINSTANCE.getTDefinitions();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__EXTENSIONS = eINSTANCE.getTDefinitions_Extensions();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__IMPORT = eINSTANCE.getTDefinitions_Import();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__TYPES = eINSTANCE.getTDefinitions_Types();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__GROUP = eINSTANCE.getTDefinitions_Group();

		/**
		 * The meta object literal for the '<em><b>Service Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__SERVICE_TEMPLATE = eINSTANCE.getTDefinitions_ServiceTemplate();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__NODE_TYPE = eINSTANCE.getTDefinitions_NodeType();

		/**
		 * The meta object literal for the '<em><b>Node Type Implementation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__NODE_TYPE_IMPLEMENTATION = eINSTANCE.getTDefinitions_NodeTypeImplementation();

		/**
		 * The meta object literal for the '<em><b>Relationship Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__RELATIONSHIP_TYPE = eINSTANCE.getTDefinitions_RelationshipType();

		/**
		 * The meta object literal for the '<em><b>Relationship Type Implementation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION = eINSTANCE.getTDefinitions_RelationshipTypeImplementation();

		/**
		 * The meta object literal for the '<em><b>Requirement Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__REQUIREMENT_TYPE = eINSTANCE.getTDefinitions_RequirementType();

		/**
		 * The meta object literal for the '<em><b>Capability Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__CAPABILITY_TYPE = eINSTANCE.getTDefinitions_CapabilityType();

		/**
		 * The meta object literal for the '<em><b>Artifact Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__ARTIFACT_TYPE = eINSTANCE.getTDefinitions_ArtifactType();

		/**
		 * The meta object literal for the '<em><b>Artifact Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__ARTIFACT_TEMPLATE = eINSTANCE.getTDefinitions_ArtifactTemplate();

		/**
		 * The meta object literal for the '<em><b>Policy Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__POLICY_TYPE = eINSTANCE.getTDefinitions_PolicyType();

		/**
		 * The meta object literal for the '<em><b>Policy Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__POLICY_TEMPLATE = eINSTANCE.getTDefinitions_PolicyTemplate();

		/**
		 * The meta object literal for the '<em><b>Group Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__GROUP_TYPE = eINSTANCE.getTDefinitions_GroupType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__ID = eINSTANCE.getTDefinitions_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__NAME = eINSTANCE.getTDefinitions_Name();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__TARGET_NAMESPACE = eINSTANCE.getTDefinitions_TargetNamespace();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TDeploymentArtifactImpl <em>TDeployment Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TDeploymentArtifactImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTDeploymentArtifact()
		 * @generated
		 */
		EClass TDEPLOYMENT_ARTIFACT = eINSTANCE.getTDeploymentArtifact();

		/**
		 * The meta object literal for the '<em><b>Artifact Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEPLOYMENT_ARTIFACT__ARTIFACT_REF = eINSTANCE.getTDeploymentArtifact_ArtifactRef();

		/**
		 * The meta object literal for the '<em><b>Artifact Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEPLOYMENT_ARTIFACT__ARTIFACT_TYPE = eINSTANCE.getTDeploymentArtifact_ArtifactType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEPLOYMENT_ARTIFACT__NAME = eINSTANCE.getTDeploymentArtifact_Name();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TDeploymentArtifactsImpl <em>TDeployment Artifacts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TDeploymentArtifactsImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTDeploymentArtifacts()
		 * @generated
		 */
		EClass TDEPLOYMENT_ARTIFACTS = eINSTANCE.getTDeploymentArtifacts();

		/**
		 * The meta object literal for the '<em><b>Deployment Artifact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEPLOYMENT_ARTIFACTS__DEPLOYMENT_ARTIFACT = eINSTANCE.getTDeploymentArtifacts_DeploymentArtifact();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TDocumentationImpl <em>TDocumentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TDocumentationImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTDocumentation()
		 * @generated
		 */
		EClass TDOCUMENTATION = eINSTANCE.getTDocumentation();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDOCUMENTATION__MIXED = eINSTANCE.getTDocumentation_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDOCUMENTATION__ANY = eINSTANCE.getTDocumentation_Any();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDOCUMENTATION__LANG = eINSTANCE.getTDocumentation_Lang();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDOCUMENTATION__SOURCE = eINSTANCE.getTDocumentation_Source();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TEntityTemplateImpl <em>TEntity Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TEntityTemplateImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTEntityTemplate()
		 * @generated
		 */
		EClass TENTITY_TEMPLATE = eINSTANCE.getTEntityTemplate();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENTITY_TEMPLATE__PROPERTIES = eINSTANCE.getTEntityTemplate_Properties();

		/**
		 * The meta object literal for the '<em><b>Property Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS = eINSTANCE.getTEntityTemplate_PropertyConstraints();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENTITY_TEMPLATE__ID = eINSTANCE.getTEntityTemplate_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENTITY_TEMPLATE__TYPE = eINSTANCE.getTEntityTemplate_Type();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENTITY_TEMPLATE__TYPE_REF = eINSTANCE.getTEntityTemplate_TypeRef();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TEntityTypeImpl <em>TEntity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TEntityTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTEntityType()
		 * @generated
		 */
		EClass TENTITY_TYPE = eINSTANCE.getTEntityType();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENTITY_TYPE__TAGS = eINSTANCE.getTEntityType_Tags();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENTITY_TYPE__DERIVED_FROM = eINSTANCE.getTEntityType_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Properties Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TENTITY_TYPE__PROPERTIES_DEFINITION = eINSTANCE.getTEntityType_PropertiesDefinition();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENTITY_TYPE__ABSTRACT = eINSTANCE.getTEntityType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENTITY_TYPE__FINAL = eINSTANCE.getTEntityType_Final();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENTITY_TYPE__NAME = eINSTANCE.getTEntityType_Name();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TENTITY_TYPE__TARGET_NAMESPACE = eINSTANCE.getTEntityType_TargetNamespace();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TExportedInterfaceImpl <em>TExported Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TExportedInterfaceImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTExportedInterface()
		 * @generated
		 */
		EClass TEXPORTED_INTERFACE = eINSTANCE.getTExportedInterface();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXPORTED_INTERFACE__OPERATION = eINSTANCE.getTExportedInterface_Operation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXPORTED_INTERFACE__NAME = eINSTANCE.getTExportedInterface_Name();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TExportedOperationImpl <em>TExported Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TExportedOperationImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTExportedOperation()
		 * @generated
		 */
		EClass TEXPORTED_OPERATION = eINSTANCE.getTExportedOperation();

		/**
		 * The meta object literal for the '<em><b>Node Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXPORTED_OPERATION__NODE_OPERATION = eINSTANCE.getTExportedOperation_NodeOperation();

		/**
		 * The meta object literal for the '<em><b>Relationship Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXPORTED_OPERATION__RELATIONSHIP_OPERATION = eINSTANCE.getTExportedOperation_RelationshipOperation();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXPORTED_OPERATION__PLAN = eINSTANCE.getTExportedOperation_Plan();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXPORTED_OPERATION__NAME = eINSTANCE.getTExportedOperation_Name();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TExtensibleElementsImpl <em>TExtensible Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TExtensibleElementsImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTExtensibleElements()
		 * @generated
		 */
		EClass TEXTENSIBLE_ELEMENTS = eINSTANCE.getTExtensibleElements();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTENSIBLE_ELEMENTS__DOCUMENTATION = eINSTANCE.getTExtensibleElements_Documentation();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTENSIBLE_ELEMENTS__ANY = eINSTANCE.getTExtensibleElements_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTENSIBLE_ELEMENTS__ANY_ATTRIBUTE = eINSTANCE.getTExtensibleElements_AnyAttribute();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TExtensionImpl <em>TExtension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TExtensionImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTExtension()
		 * @generated
		 */
		EClass TEXTENSION = eINSTANCE.getTExtension();

		/**
		 * The meta object literal for the '<em><b>Must Understand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTENSION__MUST_UNDERSTAND = eINSTANCE.getTExtension_MustUnderstand();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTENSION__NAMESPACE = eINSTANCE.getTExtension_Namespace();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TExtensionsImpl <em>TExtensions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TExtensionsImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTExtensions()
		 * @generated
		 */
		EClass TEXTENSIONS = eINSTANCE.getTExtensions();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTENSIONS__EXTENSION = eINSTANCE.getTExtensions_Extension();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TGroupTemplateImpl <em>TGroup Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TGroupTemplateImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTGroupTemplate()
		 * @generated
		 */
		EClass TGROUP_TEMPLATE = eINSTANCE.getTGroupTemplate();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGROUP_TEMPLATE__REQUIREMENTS = eINSTANCE.getTGroupTemplate_Requirements();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGROUP_TEMPLATE__CAPABILITIES = eINSTANCE.getTGroupTemplate_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Policies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGROUP_TEMPLATE__POLICIES = eINSTANCE.getTGroupTemplate_Policies();

		/**
		 * The meta object literal for the '<em><b>Deployment Artifacts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGROUP_TEMPLATE__DEPLOYMENT_ARTIFACTS = eINSTANCE.getTGroupTemplate_DeploymentArtifacts();

		/**
		 * The meta object literal for the '<em><b>Max Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TGROUP_TEMPLATE__MAX_INSTANCES = eINSTANCE.getTGroupTemplate_MaxInstances();

		/**
		 * The meta object literal for the '<em><b>Min Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TGROUP_TEMPLATE__MIN_INSTANCES = eINSTANCE.getTGroupTemplate_MinInstances();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TGROUP_TEMPLATE__NAME = eINSTANCE.getTGroupTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGROUP_TEMPLATE__MEMBER = eINSTANCE.getTGroupTemplate_Member();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TGroupTypeImpl <em>TGroup Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TGroupTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTGroupType()
		 * @generated
		 */
		EClass TGROUP_TYPE = eINSTANCE.getTGroupType();

		/**
		 * The meta object literal for the '<em><b>Requirement Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGROUP_TYPE__REQUIREMENT_DEFINITIONS = eINSTANCE.getTGroupType_RequirementDefinitions();

		/**
		 * The meta object literal for the '<em><b>Capability Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGROUP_TYPE__CAPABILITY_DEFINITIONS = eINSTANCE.getTGroupType_CapabilityDefinitions();

		/**
		 * The meta object literal for the '<em><b>Instance States</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGROUP_TYPE__INSTANCE_STATES = eINSTANCE.getTGroupType_InstanceStates();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGROUP_TYPE__INTERFACES = eINSTANCE.getTGroupType_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TGROUP_TYPE__MEMBER = eINSTANCE.getTGroupType_Member();

		/**
		 * The meta object literal for the '<em><b>Member Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGROUP_TYPE__MEMBER_REFS = eINSTANCE.getTGroupType_MemberRefs();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TImplementationArtifactImpl <em>TImplementation Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TImplementationArtifactImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTImplementationArtifact()
		 * @generated
		 */
		EClass TIMPLEMENTATION_ARTIFACT = eINSTANCE.getTImplementationArtifact();

		/**
		 * The meta object literal for the '<em><b>Artifact Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPLEMENTATION_ARTIFACT__ARTIFACT_REF = eINSTANCE.getTImplementationArtifact_ArtifactRef();

		/**
		 * The meta object literal for the '<em><b>Artifact Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPLEMENTATION_ARTIFACT__ARTIFACT_TYPE = eINSTANCE.getTImplementationArtifact_ArtifactType();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPLEMENTATION_ARTIFACT__INTERFACE_NAME = eINSTANCE.getTImplementationArtifact_InterfaceName();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPLEMENTATION_ARTIFACT__OPERATION_NAME = eINSTANCE.getTImplementationArtifact_OperationName();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TImplementationArtifactsImpl <em>TImplementation Artifacts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TImplementationArtifactsImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTImplementationArtifacts()
		 * @generated
		 */
		EClass TIMPLEMENTATION_ARTIFACTS = eINSTANCE.getTImplementationArtifacts();

		/**
		 * The meta object literal for the '<em><b>Implementation Artifact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMPLEMENTATION_ARTIFACTS__IMPLEMENTATION_ARTIFACT = eINSTANCE.getTImplementationArtifacts_ImplementationArtifact();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TImportImpl <em>TImport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TImportImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTImport()
		 * @generated
		 */
		EClass TIMPORT = eINSTANCE.getTImport();

		/**
		 * The meta object literal for the '<em><b>Import Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPORT__IMPORT_TYPE = eINSTANCE.getTImport_ImportType();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPORT__LOCATION = eINSTANCE.getTImport_Location();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPORT__NAMESPACE = eINSTANCE.getTImport_Namespace();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPORT__RESOURCE = eINSTANCE.getTImport_Resource();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TInterfaceImpl <em>TInterface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TInterfaceImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTInterface()
		 * @generated
		 */
		EClass TINTERFACE = eINSTANCE.getTInterface();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINTERFACE__OPERATION = eINSTANCE.getTInterface_Operation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINTERFACE__NAME = eINSTANCE.getTInterface_Name();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TNodeTemplateImpl <em>TNode Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TNodeTemplateImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTNodeTemplate()
		 * @generated
		 */
		EClass TNODE_TEMPLATE = eINSTANCE.getTNodeTemplate();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TEMPLATE__REQUIREMENTS = eINSTANCE.getTNodeTemplate_Requirements();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TEMPLATE__CAPABILITIES = eINSTANCE.getTNodeTemplate_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Policies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TEMPLATE__POLICIES = eINSTANCE.getTNodeTemplate_Policies();

		/**
		 * The meta object literal for the '<em><b>Deployment Artifacts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TEMPLATE__DEPLOYMENT_ARTIFACTS = eINSTANCE.getTNodeTemplate_DeploymentArtifacts();

		/**
		 * The meta object literal for the '<em><b>Max Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TEMPLATE__MAX_INSTANCES = eINSTANCE.getTNodeTemplate_MaxInstances();

		/**
		 * The meta object literal for the '<em><b>Min Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TEMPLATE__MIN_INSTANCES = eINSTANCE.getTNodeTemplate_MinInstances();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TEMPLATE__NAME = eINSTANCE.getTNodeTemplate_Name();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TNodeTypeImpl <em>TNode Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TNodeTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTNodeType()
		 * @generated
		 */
		EClass TNODE_TYPE = eINSTANCE.getTNodeType();

		/**
		 * The meta object literal for the '<em><b>Requirement Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE__REQUIREMENT_DEFINITIONS = eINSTANCE.getTNodeType_RequirementDefinitions();

		/**
		 * The meta object literal for the '<em><b>Capability Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE__CAPABILITY_DEFINITIONS = eINSTANCE.getTNodeType_CapabilityDefinitions();

		/**
		 * The meta object literal for the '<em><b>Instance States</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE__INSTANCE_STATES = eINSTANCE.getTNodeType_InstanceStates();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE__INTERFACES = eINSTANCE.getTNodeType_Interfaces();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TNodeTypeImplementationImpl <em>TNode Type Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TNodeTypeImplementationImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTNodeTypeImplementation()
		 * @generated
		 */
		EClass TNODE_TYPE_IMPLEMENTATION = eINSTANCE.getTNodeTypeImplementation();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE_IMPLEMENTATION__TAGS = eINSTANCE.getTNodeTypeImplementation_Tags();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE_IMPLEMENTATION__DERIVED_FROM = eINSTANCE.getTNodeTypeImplementation_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Required Container Features</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES = eINSTANCE.getTNodeTypeImplementation_RequiredContainerFeatures();

		/**
		 * The meta object literal for the '<em><b>Implementation Artifacts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS = eINSTANCE.getTNodeTypeImplementation_ImplementationArtifacts();

		/**
		 * The meta object literal for the '<em><b>Deployment Artifacts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TNODE_TYPE_IMPLEMENTATION__DEPLOYMENT_ARTIFACTS = eINSTANCE.getTNodeTypeImplementation_DeploymentArtifacts();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TYPE_IMPLEMENTATION__ABSTRACT = eINSTANCE.getTNodeTypeImplementation_Abstract();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TYPE_IMPLEMENTATION__FINAL = eINSTANCE.getTNodeTypeImplementation_Final();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TYPE_IMPLEMENTATION__NAME = eINSTANCE.getTNodeTypeImplementation_Name();

		/**
		 * The meta object literal for the '<em><b>Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TYPE_IMPLEMENTATION__NODE_TYPE = eINSTANCE.getTNodeTypeImplementation_NodeType();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNODE_TYPE_IMPLEMENTATION__TARGET_NAMESPACE = eINSTANCE.getTNodeTypeImplementation_TargetNamespace();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TOperationImpl <em>TOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TOperationImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTOperation()
		 * @generated
		 */
		EClass TOPERATION = eINSTANCE.getTOperation();

		/**
		 * The meta object literal for the '<em><b>Input Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPERATION__INPUT_PARAMETERS = eINSTANCE.getTOperation_InputParameters();

		/**
		 * The meta object literal for the '<em><b>Output Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPERATION__OUTPUT_PARAMETERS = eINSTANCE.getTOperation_OutputParameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPERATION__NAME = eINSTANCE.getTOperation_Name();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TParameterImpl <em>TParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TParameterImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTParameter()
		 * @generated
		 */
		EClass TPARAMETER = eINSTANCE.getTParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPARAMETER__NAME = eINSTANCE.getTParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPARAMETER__REQUIRED = eINSTANCE.getTParameter_Required();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPARAMETER__TYPE = eINSTANCE.getTParameter_Type();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TPlanImpl <em>TPlan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TPlanImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTPlan()
		 * @generated
		 */
		EClass TPLAN = eINSTANCE.getTPlan();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN__PRECONDITION = eINSTANCE.getTPlan_Precondition();

		/**
		 * The meta object literal for the '<em><b>Input Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN__INPUT_PARAMETERS = eINSTANCE.getTPlan_InputParameters();

		/**
		 * The meta object literal for the '<em><b>Output Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN__OUTPUT_PARAMETERS = eINSTANCE.getTPlan_OutputParameters();

		/**
		 * The meta object literal for the '<em><b>Plan Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN__PLAN_MODEL = eINSTANCE.getTPlan_PlanModel();

		/**
		 * The meta object literal for the '<em><b>Plan Model Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN__PLAN_MODEL_REFERENCE = eINSTANCE.getTPlan_PlanModelReference();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLAN__ID = eINSTANCE.getTPlan_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLAN__NAME = eINSTANCE.getTPlan_Name();

		/**
		 * The meta object literal for the '<em><b>Plan Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLAN__PLAN_LANGUAGE = eINSTANCE.getTPlan_PlanLanguage();

		/**
		 * The meta object literal for the '<em><b>Plan Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLAN__PLAN_TYPE = eINSTANCE.getTPlan_PlanType();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TPlansImpl <em>TPlans</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TPlansImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTPlans()
		 * @generated
		 */
		EClass TPLANS = eINSTANCE.getTPlans();

		/**
		 * The meta object literal for the '<em><b>Plan</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLANS__PLAN = eINSTANCE.getTPlans_Plan();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLANS__TARGET_NAMESPACE = eINSTANCE.getTPlans_TargetNamespace();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TPolicyImpl <em>TPolicy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TPolicyImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTPolicy()
		 * @generated
		 */
		EClass TPOLICY = eINSTANCE.getTPolicy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPOLICY__NAME = eINSTANCE.getTPolicy_Name();

		/**
		 * The meta object literal for the '<em><b>Policy Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPOLICY__POLICY_REF = eINSTANCE.getTPolicy_PolicyRef();

		/**
		 * The meta object literal for the '<em><b>Policy Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPOLICY__POLICY_TYPE = eINSTANCE.getTPolicy_PolicyType();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TPolicyTemplateImpl <em>TPolicy Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TPolicyTemplateImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTPolicyTemplate()
		 * @generated
		 */
		EClass TPOLICY_TEMPLATE = eINSTANCE.getTPolicyTemplate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPOLICY_TEMPLATE__NAME = eINSTANCE.getTPolicyTemplate_Name();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TPolicyTypeImpl <em>TPolicy Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TPolicyTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTPolicyType()
		 * @generated
		 */
		EClass TPOLICY_TYPE = eINSTANCE.getTPolicyType();

		/**
		 * The meta object literal for the '<em><b>Applies To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPOLICY_TYPE__APPLIES_TO = eINSTANCE.getTPolicyType_AppliesTo();

		/**
		 * The meta object literal for the '<em><b>Policy Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPOLICY_TYPE__POLICY_LANGUAGE = eINSTANCE.getTPolicyType_PolicyLanguage();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TPropertyConstraintImpl <em>TProperty Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TPropertyConstraintImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTPropertyConstraint()
		 * @generated
		 */
		EClass TPROPERTY_CONSTRAINT = eINSTANCE.getTPropertyConstraint();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPROPERTY_CONSTRAINT__PROPERTY = eINSTANCE.getTPropertyConstraint_Property();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TPropertyMappingImpl <em>TProperty Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TPropertyMappingImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTPropertyMapping()
		 * @generated
		 */
		EClass TPROPERTY_MAPPING = eINSTANCE.getTPropertyMapping();

		/**
		 * The meta object literal for the '<em><b>Service Template Property Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPROPERTY_MAPPING__SERVICE_TEMPLATE_PROPERTY_REF = eINSTANCE.getTPropertyMapping_ServiceTemplatePropertyRef();

		/**
		 * The meta object literal for the '<em><b>Target Object Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPROPERTY_MAPPING__TARGET_OBJECT_REF = eINSTANCE.getTPropertyMapping_TargetObjectRef();

		/**
		 * The meta object literal for the '<em><b>Target Property Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPROPERTY_MAPPING__TARGET_PROPERTY_REF = eINSTANCE.getTPropertyMapping_TargetPropertyRef();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TRelationshipTemplateImpl <em>TRelationship Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TRelationshipTemplateImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTRelationshipTemplate()
		 * @generated
		 */
		EClass TRELATIONSHIP_TEMPLATE = eINSTANCE.getTRelationshipTemplate();

		/**
		 * The meta object literal for the '<em><b>Source Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TEMPLATE__SOURCE_ELEMENT = eINSTANCE.getTRelationshipTemplate_SourceElement();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TEMPLATE__TARGET_ELEMENT = eINSTANCE.getTRelationshipTemplate_TargetElement();

		/**
		 * The meta object literal for the '<em><b>Relationship Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TEMPLATE__RELATIONSHIP_CONSTRAINTS = eINSTANCE.getTRelationshipTemplate_RelationshipConstraints();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP_TEMPLATE__NAME = eINSTANCE.getTRelationshipTemplate_Name();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TRelationshipTypeImpl <em>TRelationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TRelationshipTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTRelationshipType()
		 * @generated
		 */
		EClass TRELATIONSHIP_TYPE = eINSTANCE.getTRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Instance States</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE__INSTANCE_STATES = eINSTANCE.getTRelationshipType_InstanceStates();

		/**
		 * The meta object literal for the '<em><b>Source Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE__SOURCE_INTERFACES = eINSTANCE.getTRelationshipType_SourceInterfaces();

		/**
		 * The meta object literal for the '<em><b>Target Interfaces</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE__TARGET_INTERFACES = eINSTANCE.getTRelationshipType_TargetInterfaces();

		/**
		 * The meta object literal for the '<em><b>Valid Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE__VALID_SOURCE = eINSTANCE.getTRelationshipType_ValidSource();

		/**
		 * The meta object literal for the '<em><b>Valid Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE__VALID_TARGET = eINSTANCE.getTRelationshipType_ValidTarget();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TRelationshipTypeImplementationImpl <em>TRelationship Type Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TRelationshipTypeImplementationImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTRelationshipTypeImplementation()
		 * @generated
		 */
		EClass TRELATIONSHIP_TYPE_IMPLEMENTATION = eINSTANCE.getTRelationshipTypeImplementation();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE_IMPLEMENTATION__TAGS = eINSTANCE.getTRelationshipTypeImplementation_Tags();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE_IMPLEMENTATION__DERIVED_FROM = eINSTANCE.getTRelationshipTypeImplementation_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Required Container Features</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE_IMPLEMENTATION__REQUIRED_CONTAINER_FEATURES = eINSTANCE.getTRelationshipTypeImplementation_RequiredContainerFeatures();

		/**
		 * The meta object literal for the '<em><b>Implementation Artifacts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATIONSHIP_TYPE_IMPLEMENTATION__IMPLEMENTATION_ARTIFACTS = eINSTANCE.getTRelationshipTypeImplementation_ImplementationArtifacts();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP_TYPE_IMPLEMENTATION__ABSTRACT = eINSTANCE.getTRelationshipTypeImplementation_Abstract();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP_TYPE_IMPLEMENTATION__FINAL = eINSTANCE.getTRelationshipTypeImplementation_Final();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP_TYPE_IMPLEMENTATION__NAME = eINSTANCE.getTRelationshipTypeImplementation_Name();

		/**
		 * The meta object literal for the '<em><b>Relationship Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP_TYPE_IMPLEMENTATION__RELATIONSHIP_TYPE = eINSTANCE.getTRelationshipTypeImplementation_RelationshipType();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP_TYPE_IMPLEMENTATION__TARGET_NAMESPACE = eINSTANCE.getTRelationshipTypeImplementation_TargetNamespace();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TRequiredContainerFeatureImpl <em>TRequired Container Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TRequiredContainerFeatureImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTRequiredContainerFeature()
		 * @generated
		 */
		EClass TREQUIRED_CONTAINER_FEATURE = eINSTANCE.getTRequiredContainerFeature();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIRED_CONTAINER_FEATURE__FEATURE = eINSTANCE.getTRequiredContainerFeature_Feature();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TRequiredContainerFeaturesImpl <em>TRequired Container Features</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TRequiredContainerFeaturesImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTRequiredContainerFeatures()
		 * @generated
		 */
		EClass TREQUIRED_CONTAINER_FEATURES = eINSTANCE.getTRequiredContainerFeatures();

		/**
		 * The meta object literal for the '<em><b>Required Container Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREQUIRED_CONTAINER_FEATURES__REQUIRED_CONTAINER_FEATURE = eINSTANCE.getTRequiredContainerFeatures_RequiredContainerFeature();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TRequirementImpl <em>TRequirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TRequirementImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTRequirement()
		 * @generated
		 */
		EClass TREQUIREMENT = eINSTANCE.getTRequirement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT__NAME = eINSTANCE.getTRequirement_Name();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TRequirementDefinitionImpl <em>TRequirement Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TRequirementDefinitionImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTRequirementDefinition()
		 * @generated
		 */
		EClass TREQUIREMENT_DEFINITION = eINSTANCE.getTRequirementDefinition();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREQUIREMENT_DEFINITION__CONSTRAINTS = eINSTANCE.getTRequirementDefinition_Constraints();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT_DEFINITION__LOWER_BOUND = eINSTANCE.getTRequirementDefinition_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT_DEFINITION__NAME = eINSTANCE.getTRequirementDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Requirement Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT_DEFINITION__REQUIREMENT_TYPE = eINSTANCE.getTRequirementDefinition_RequirementType();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT_DEFINITION__UPPER_BOUND = eINSTANCE.getTRequirementDefinition_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Requirement Type Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREQUIREMENT_DEFINITION__REQUIREMENT_TYPE_REF = eINSTANCE.getTRequirementDefinition_RequirementTypeRef();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TRequirementRefImpl <em>TRequirement Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TRequirementRefImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTRequirementRef()
		 * @generated
		 */
		EClass TREQUIREMENT_REF = eINSTANCE.getTRequirementRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT_REF__NAME = eINSTANCE.getTRequirementRef_Name();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREQUIREMENT_REF__REF = eINSTANCE.getTRequirementRef_Ref();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TRequirementTypeImpl <em>TRequirement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TRequirementTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTRequirementType()
		 * @generated
		 */
		EClass TREQUIREMENT_TYPE = eINSTANCE.getTRequirementType();

		/**
		 * The meta object literal for the '<em><b>Required Capability Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE = eINSTANCE.getTRequirementType_RequiredCapabilityType();

		/**
		 * The meta object literal for the '<em><b>Required Capability Type Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREQUIREMENT_TYPE__REQUIRED_CAPABILITY_TYPE_REF = eINSTANCE.getTRequirementType_RequiredCapabilityTypeRef();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TServiceTemplateImpl <em>TService Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TServiceTemplateImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTServiceTemplate()
		 * @generated
		 */
		EClass TSERVICE_TEMPLATE = eINSTANCE.getTServiceTemplate();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSERVICE_TEMPLATE__TAGS = eINSTANCE.getTServiceTemplate_Tags();

		/**
		 * The meta object literal for the '<em><b>Boundary Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSERVICE_TEMPLATE__BOUNDARY_DEFINITIONS = eINSTANCE.getTServiceTemplate_BoundaryDefinitions();

		/**
		 * The meta object literal for the '<em><b>Topology Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSERVICE_TEMPLATE__TOPOLOGY_TEMPLATE = eINSTANCE.getTServiceTemplate_TopologyTemplate();

		/**
		 * The meta object literal for the '<em><b>Plans</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSERVICE_TEMPLATE__PLANS = eINSTANCE.getTServiceTemplate_Plans();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSERVICE_TEMPLATE__ID = eINSTANCE.getTServiceTemplate_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSERVICE_TEMPLATE__NAME = eINSTANCE.getTServiceTemplate_Name();

		/**
		 * The meta object literal for the '<em><b>Substitutable Node Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSERVICE_TEMPLATE__SUBSTITUTABLE_NODE_TYPE = eINSTANCE.getTServiceTemplate_SubstitutableNodeType();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSERVICE_TEMPLATE__TARGET_NAMESPACE = eINSTANCE.getTServiceTemplate_TargetNamespace();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TTagImpl <em>TTag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TTagImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTTag()
		 * @generated
		 */
		EClass TTAG = eINSTANCE.getTTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTAG__NAME = eINSTANCE.getTTag_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTAG__VALUE = eINSTANCE.getTTag_Value();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TTagsImpl <em>TTags</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TTagsImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTTags()
		 * @generated
		 */
		EClass TTAGS = eINSTANCE.getTTags();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTAGS__TAG = eINSTANCE.getTTags_Tag();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TTopologyElementInstanceStatesImpl <em>TTopology Element Instance States</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TTopologyElementInstanceStatesImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTTopologyElementInstanceStates()
		 * @generated
		 */
		EClass TTOPOLOGY_ELEMENT_INSTANCE_STATES = eINSTANCE.getTTopologyElementInstanceStates();

		/**
		 * The meta object literal for the '<em><b>Instance State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTOPOLOGY_ELEMENT_INSTANCE_STATES__INSTANCE_STATE = eINSTANCE.getTTopologyElementInstanceStates_InstanceState();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TTopologyTemplateImpl <em>TTopology Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TTopologyTemplateImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTTopologyTemplate()
		 * @generated
		 */
		EClass TTOPOLOGY_TEMPLATE = eINSTANCE.getTTopologyTemplate();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTOPOLOGY_TEMPLATE__GROUP = eINSTANCE.getTTopologyTemplate_Group();

		/**
		 * The meta object literal for the '<em><b>Node Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTOPOLOGY_TEMPLATE__NODE_TEMPLATE = eINSTANCE.getTTopologyTemplate_NodeTemplate();

		/**
		 * The meta object literal for the '<em><b>Relationship Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTOPOLOGY_TEMPLATE__RELATIONSHIP_TEMPLATE = eINSTANCE.getTTopologyTemplate_RelationshipTemplate();

		/**
		 * The meta object literal for the '<em><b>Group Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTOPOLOGY_TEMPLATE__GROUP_TEMPLATE = eINSTANCE.getTTopologyTemplate_GroupTemplate();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.TypesTypeImpl <em>Types Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.TypesTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTypesType()
		 * @generated
		 */
		EClass TYPES_TYPE = eINSTANCE.getTypesType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPES_TYPE__ANY = eINSTANCE.getTypesType_Any();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.ValidSourceTypeImpl <em>Valid Source Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.ValidSourceTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getValidSourceType()
		 * @generated
		 */
		EClass VALID_SOURCE_TYPE = eINSTANCE.getValidSourceType();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALID_SOURCE_TYPE__TYPE_REF = eINSTANCE.getValidSourceType_TypeRef();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.impl.ValidTargetTypeImpl <em>Valid Target Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.impl.ValidTargetTypeImpl
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getValidTargetType()
		 * @generated
		 */
		EClass VALID_TARGET_TYPE = eINSTANCE.getValidTargetType();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALID_TARGET_TYPE__TYPE_REF = eINSTANCE.getValidTargetType_TypeRef();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.MaxInstancesTypeMember1 <em>Max Instances Type Member1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.MaxInstancesTypeMember1
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getMaxInstancesTypeMember1()
		 * @generated
		 */
		EEnum MAX_INSTANCES_TYPE_MEMBER1 = eINSTANCE.getMaxInstancesTypeMember1();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.MaxInstancesTypeMember11 <em>Max Instances Type Member11</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.MaxInstancesTypeMember11
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getMaxInstancesTypeMember11()
		 * @generated
		 */
		EEnum MAX_INSTANCES_TYPE_MEMBER11 = eINSTANCE.getMaxInstancesTypeMember11();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.TBoolean <em>TBoolean</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.TBoolean
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTBoolean()
		 * @generated
		 */
		EEnum TBOOLEAN = eINSTANCE.getTBoolean();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.UpperBoundTypeMember1 <em>Upper Bound Type Member1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.UpperBoundTypeMember1
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember1()
		 * @generated
		 */
		EEnum UPPER_BOUND_TYPE_MEMBER1 = eINSTANCE.getUpperBoundTypeMember1();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.UpperBoundTypeMember11 <em>Upper Bound Type Member11</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.UpperBoundTypeMember11
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember11()
		 * @generated
		 */
		EEnum UPPER_BOUND_TYPE_MEMBER11 = eINSTANCE.getUpperBoundTypeMember11();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.oco.tosca.ValidImportTypes <em>Valid Import Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.ValidImportTypes
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getValidImportTypes()
		 * @generated
		 */
		EEnum VALID_IMPORT_TYPES = eINSTANCE.getValidImportTypes();

		/**
		 * The meta object literal for the '<em>Imported URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getImportedURI()
		 * @generated
		 */
		EDataType IMPORTED_URI = eINSTANCE.getImportedURI();

		/**
		 * The meta object literal for the '<em>Max Instances Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getMaxInstancesType()
		 * @generated
		 */
		EDataType MAX_INSTANCES_TYPE = eINSTANCE.getMaxInstancesType();

		/**
		 * The meta object literal for the '<em>Max Instances Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getMaxInstancesType1()
		 * @generated
		 */
		EDataType MAX_INSTANCES_TYPE1 = eINSTANCE.getMaxInstancesType1();

		/**
		 * The meta object literal for the '<em>Max Instances Type Member0</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getMaxInstancesTypeMember0()
		 * @generated
		 */
		EDataType MAX_INSTANCES_TYPE_MEMBER0 = eINSTANCE.getMaxInstancesTypeMember0();

		/**
		 * The meta object literal for the '<em>Max Instances Type Member01</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getMaxInstancesTypeMember01()
		 * @generated
		 */
		EDataType MAX_INSTANCES_TYPE_MEMBER01 = eINSTANCE.getMaxInstancesTypeMember01();

		/**
		 * The meta object literal for the '<em>Max Instances Type Member1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.MaxInstancesTypeMember1
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getMaxInstancesTypeMember1Object()
		 * @generated
		 */
		EDataType MAX_INSTANCES_TYPE_MEMBER1_OBJECT = eINSTANCE.getMaxInstancesTypeMember1Object();

		/**
		 * The meta object literal for the '<em>Max Instances Type Member1 Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.MaxInstancesTypeMember11
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getMaxInstancesTypeMember1Object1()
		 * @generated
		 */
		EDataType MAX_INSTANCES_TYPE_MEMBER1_OBJECT1 = eINSTANCE.getMaxInstancesTypeMember1Object1();

		/**
		 * The meta object literal for the '<em>TBoolean Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.TBoolean
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getTBooleanObject()
		 * @generated
		 */
		EDataType TBOOLEAN_OBJECT = eINSTANCE.getTBooleanObject();

		/**
		 * The meta object literal for the '<em>Upper Bound Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getUpperBoundType()
		 * @generated
		 */
		EDataType UPPER_BOUND_TYPE = eINSTANCE.getUpperBoundType();

		/**
		 * The meta object literal for the '<em>Upper Bound Type1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getUpperBoundType1()
		 * @generated
		 */
		EDataType UPPER_BOUND_TYPE1 = eINSTANCE.getUpperBoundType1();

		/**
		 * The meta object literal for the '<em>Upper Bound Type Member0</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember0()
		 * @generated
		 */
		EDataType UPPER_BOUND_TYPE_MEMBER0 = eINSTANCE.getUpperBoundTypeMember0();

		/**
		 * The meta object literal for the '<em>Upper Bound Type Member01</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember01()
		 * @generated
		 */
		EDataType UPPER_BOUND_TYPE_MEMBER01 = eINSTANCE.getUpperBoundTypeMember01();

		/**
		 * The meta object literal for the '<em>Upper Bound Type Member1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.UpperBoundTypeMember1
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember1Object()
		 * @generated
		 */
		EDataType UPPER_BOUND_TYPE_MEMBER1_OBJECT = eINSTANCE.getUpperBoundTypeMember1Object();

		/**
		 * The meta object literal for the '<em>Upper Bound Type Member1 Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.oco.tosca.UpperBoundTypeMember11
		 * @see de.ugoe.cs.oco.tosca.impl.ToscaPackageImpl#getUpperBoundTypeMember1Object1()
		 * @generated
		 */
		EDataType UPPER_BOUND_TYPE_MEMBER1_OBJECT1 = eINSTANCE.getUpperBoundTypeMember1Object1();

	}

} //ToscaPackage
