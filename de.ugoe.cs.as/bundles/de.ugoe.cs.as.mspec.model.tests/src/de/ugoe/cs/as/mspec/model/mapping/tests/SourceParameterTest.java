/**
 */
package de.ugoe.cs.as.mspec.model.mapping.tests;

import de.ugoe.cs.as.mspec.model.mapping.MappingFactory;
import de.ugoe.cs.as.mspec.model.mapping.SourceParameter;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Source Parameter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SourceParameterTest extends ParameterTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SourceParameterTest.class);
	}

	/**
	 * Constructs a new Source Parameter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceParameterTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Source Parameter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SourceParameter getFixture() {
		return (SourceParameter)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MappingFactory.eINSTANCE.createSourceParameter());
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

} //SourceParameterTest
