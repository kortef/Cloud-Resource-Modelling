/**
 */
package de.ugoe.cs.as.mappingdsl.model.mapping.tests;


import de.ugoe.cs.as.mappingdsl.model.mapping.FlavorMapper;
import de.ugoe.cs.as.mappingdsl.model.mapping.MappingFactory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Flavor Mapper</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlavorMapperTest extends MapperTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FlavorMapperTest.class);
	}

	/**
	 * Constructs a new Flavor Mapper test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlavorMapperTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Flavor Mapper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FlavorMapper getFixture() {
		return (FlavorMapper)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MappingFactory.eINSTANCE.createFlavorMapper());
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

} //FlavorMapperTest
