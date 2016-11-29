/**
 */
package de.ugoe.cs.oco.mappingdsl.model.mapping.tests;


import de.ugoe.cs.oco.mappingdsl.model.mapping.FileNumLinesExtractor;
import de.ugoe.cs.oco.mappingdsl.model.mapping.MappingFactory;
import de.ugoe.cs.oco.mappingdsl.model.mapping.Parameter;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>File Num Lines Extractor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FileNumLinesExtractorTest extends ExtractorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FileNumLinesExtractorTest.class);
	}

	/**
	 * Constructs a new File Num Lines Extractor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileNumLinesExtractorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this File Num Lines Extractor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FileNumLinesExtractor getFixture() {
		return (FileNumLinesExtractor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MappingFactory.eINSTANCE.createFileNumLinesExtractor());
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
	 * Tests the '{@link de.ugoe.swe.simpaas.inputdsl.model.mapping.FileNumLinesExtractor#extract(java.lang.String, org.eclipse.emf.common.util.URI) <em>Extract</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.swe.simpaas.inputdsl.model.mapping.FileNumLinesExtractor#extract(java.lang.String, org.eclipse.emf.common.util.URI)
	 * @generated NOT
	 */
	public void testExtract__String_URI() {
		String fileURI = "testdata/testfile.txt";
		Parameter outcome = getFixture().extract(null, fileURI);	
		assertEquals("3", outcome.getValue());
	}

} //FileNumLinesExtractorTest
