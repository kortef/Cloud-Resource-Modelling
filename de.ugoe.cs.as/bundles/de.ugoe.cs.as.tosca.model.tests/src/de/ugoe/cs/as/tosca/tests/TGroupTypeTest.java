/**
 */
package de.ugoe.cs.as.tosca.tests;

import de.ugoe.cs.as.tosca.TGroupType;
import de.ugoe.cs.as.tosca.ToscaFactory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TGroup Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link de.ugoe.cs.as.tosca.TGroupType#getMemberRefs() <em>Member Refs</em>}</li>
 * </ul>
 * </p>
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

	/**
	 * Tests the '{@link de.ugoe.cs.as.tosca.TGroupType#getMemberRefs() <em>Member Refs</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.tosca.TGroupType#getMemberRefs()
	 * @generated
	 */
	public void testGetMemberRefs() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //TGroupTypeTest
