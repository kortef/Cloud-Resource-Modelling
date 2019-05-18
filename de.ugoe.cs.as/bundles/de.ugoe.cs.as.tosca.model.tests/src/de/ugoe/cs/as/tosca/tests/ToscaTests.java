/**
 */
package de.ugoe.cs.as.tosca.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>tosca</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToscaTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ToscaTests("tosca Tests");
		suite.addTestSuite(DefinitionsTypeTest.class);
		suite.addTestSuite(DerivedFromType2Test.class);
		suite.addTestSuite(DocumentRootTest.class);
		suite.addTestSuite(PropertiesDefinitionTypeTest.class);
		suite.addTestSuite(PropertiesTypeTest.class);
		suite.addTestSuite(PropertiesType1Test.class);
		suite.addTestSuite(TArtifactReferenceTest.class);
		suite.addTestSuite(TArtifactTemplateTest.class);
		suite.addTestSuite(TCapabilityTest.class);
		suite.addTestSuite(TCapabilityDefinitionTest.class);
		suite.addTestSuite(TDefinitionsTest.class);
		suite.addTestSuite(TDocumentationTest.class);
		suite.addTestSuite(TEntityTemplateTest.class);
		suite.addTestSuite(TGroupTemplateTest.class);
		suite.addTestSuite(TGroupTypeTest.class);
		suite.addTestSuite(TImportTest.class);
		suite.addTestSuite(TNodeTemplateTest.class);
		suite.addTestSuite(TPolicyTemplateTest.class);
		suite.addTestSuite(TRelationshipTemplateTest.class);
		suite.addTestSuite(TRequirementTest.class);
		suite.addTestSuite(TRequirementDefinitionTest.class);
		suite.addTestSuite(TRequirementTypeTest.class);
		suite.addTestSuite(TTopologyTemplateTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToscaTests(String name) {
		super(name);
	}

} //ToscaTests
