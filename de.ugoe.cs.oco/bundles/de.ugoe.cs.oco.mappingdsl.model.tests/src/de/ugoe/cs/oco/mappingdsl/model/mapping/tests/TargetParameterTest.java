/**
 */
package de.ugoe.cs.oco.mappingdsl.model.mapping.tests;

import de.ugoe.cs.oco.mappingdsl.model.mapping.MappingFactory;
import de.ugoe.cs.oco.mappingdsl.model.mapping.TargetParameter;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Target Parameter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetParameterTest extends ParameterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TargetParameterTest.class);
	}

	/**
	 * Constructs a new Target Parameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetParameterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Target Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TargetParameter getFixture() {
		return (TargetParameter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MappingFactory.eINSTANCE.createTargetParameter());
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

} //TargetParameterTest
