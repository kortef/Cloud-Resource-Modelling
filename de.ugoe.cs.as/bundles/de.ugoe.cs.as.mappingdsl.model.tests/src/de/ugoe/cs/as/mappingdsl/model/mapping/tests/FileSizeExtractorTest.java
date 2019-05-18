/**
 */
package de.ugoe.cs.as.mappingdsl.model.mapping.tests;


import de.ugoe.cs.as.mappingdsl.model.mapping.FileSizeExtractor;
import de.ugoe.cs.as.mappingdsl.model.mapping.MappingFactory;
import de.ugoe.cs.as.mappingdsl.model.mapping.Parameter;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>File Size Extractor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FileSizeExtractorTest extends ExtractorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FileSizeExtractorTest.class);
	}

	/**
	 * Constructs a new File Size Extractor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSizeExtractorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this File Size Extractor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FileSizeExtractor getFixture() {
		return (FileSizeExtractor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MappingFactory.eINSTANCE.createFileSizeExtractor());
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
	 * Tests the '{@link de.ugoe.swe.simpaas.inputdsl.model.mapping.FileSizeExtractor#extract(java.lang.String, org.eclipse.emf.common.util.URI) <em>Extract</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.swe.simpaas.inputdsl.model.mapping.FileSizeExtractor#extract(java.lang.String, org.eclipse.emf.common.util.URI)
	 * @generated NOT
	 */
	public void testExtract__String_URI() {
		String fileURI = "testdata/testfile.txt";
		Parameter outcome = getFixture().extract(null, fileURI);
		double expectedValue = 6.0/(1024*1024);
		assertEquals(Double.toString(expectedValue), outcome.getValue());
	}

} //FileSizeExtractorTest
