/**
 */
package de.ugoe.cs.oco.tosca.tests;

import de.ugoe.cs.oco.tosca.TImport;
import de.ugoe.cs.oco.tosca.ToscaFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TImport</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TImportTest extends TExtensibleElementsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TImportTest.class);
	}

	/**
	 * Constructs a new TImport test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TImportTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TImport test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TImport getFixture() {
		return (TImport)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ToscaFactory.eINSTANCE.createTImport());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TImportTest
