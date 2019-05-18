/**
 */
package de.ugoe.cs.as.mappingdsl.model.mapping.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>mapping</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingTests extends TestSuite {

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
		TestSuite suite = new MappingTests("mapping Tests");
		suite.addTestSuite(FileSizeExtractorTest.class);
		suite.addTestSuite(FileContentExtractorTest.class);
		suite.addTestSuite(FileNumLinesExtractorTest.class);
		suite.addTestSuite(FolderCountExtractorTest.class);
		suite.addTestSuite(FolderSizeExtractorTest.class);
		suite.addTestSuite(FlavorMapperTest.class);
		suite.addTestSuite(CoreMapperTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingTests(String name) {
		super(name);
	}

} //MappingTests
