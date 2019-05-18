/**
 */
package de.ugoe.cs.oco.mappingdsl.model.mapping.tests;

import de.ugoe.cs.oco.mappingdsl.model.mapping.FolderSizeExtractor;
import de.ugoe.cs.oco.mappingdsl.model.mapping.MappingFactory;
import de.ugoe.cs.oco.mappingdsl.model.mapping.Parameter;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Folder Size Extractor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FolderSizeExtractorTest extends ExtractorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FolderSizeExtractorTest.class);
	}

	/**
	 * Constructs a new Folder Size Extractor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FolderSizeExtractorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Folder Size Extractor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FolderSizeExtractor getFixture() {
		return (FolderSizeExtractor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MappingFactory.eINSTANCE.createFolderSizeExtractor());
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
	 * Tests the '{@link de.ugoe.swe.simpaas.inputdsl.model.mapping.FolderSizeExtractor#extract(java.lang.String, org.eclipse.emf.common.util.URI) <em>Extract</em>}' operation.
	 * 
	 * @see de.ugoe.swe.simpaas.inputdsl.model.mapping.FolderSizeExtractor#extract(java.lang.String, org.eclipse.emf.common.util.URI)
	 * @generated NOT
	 */
	public void testExtract__String_URI() {
		String fileURI = "testdata";
		Parameter outcome = getFixture().extract(null, fileURI);
		double expectedValue = (double) 40.0/(1024*1024);
		assertEquals(Double.toString(expectedValue), outcome.getValue());
	}

} //FolderSizeExtractorTest
