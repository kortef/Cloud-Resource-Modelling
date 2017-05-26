/**
 */
package de.ugoe.cs.oco.tosca.tests;

import de.ugoe.cs.oco.tosca.TGroupType;
import de.ugoe.cs.oco.tosca.ToscaFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TGroup Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TGroupTypeTest extends TEntityTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TGroupTypeTest.class);
	}

	/**
	 * Constructs a new TGroup Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TGroupTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TGroup Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TGroupType getFixture() {
		return (TGroupType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ToscaFactory.eINSTANCE.createTGroupType());
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

} //TGroupTypeTest
