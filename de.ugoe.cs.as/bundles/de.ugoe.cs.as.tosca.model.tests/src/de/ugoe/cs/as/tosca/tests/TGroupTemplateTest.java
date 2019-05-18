/**
 */
package de.ugoe.cs.as.tosca.tests;

import de.ugoe.cs.as.tosca.TGroupTemplate;
import de.ugoe.cs.as.tosca.ToscaFactory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TGroup Template</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TGroupTemplateTest extends TEntityTemplateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TGroupTemplateTest.class);
	}

	/**
	 * Constructs a new TGroup Template test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TGroupTemplateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TGroup Template test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TGroupTemplate getFixture() {
		return (TGroupTemplate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ToscaFactory.eINSTANCE.createTGroupTemplate());
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

} //TGroupTemplateTest
