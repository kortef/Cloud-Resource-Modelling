/**
 */
package de.ugoe.cs.as.mappingdsl.model.mapping.tests;

import de.ugoe.cs.as.mappingdsl.model.mapping.FolderCountExtractor;
import de.ugoe.cs.as.mappingdsl.model.mapping.MappingFactory;
import de.ugoe.cs.as.mappingdsl.model.mapping.Parameter;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Folder Count Extractor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FolderCountExtractorTest extends ExtractorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FolderCountExtractorTest.class);
	}

	/**
	 * Constructs a new Folder Count Extractor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FolderCountExtractorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Folder Count Extractor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FolderCountExtractor getFixture() {
		return (FolderCountExtractor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MappingFactory.eINSTANCE.createFolderCountExtractor());
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
	 * Tests the '{@link de.ugoe.swe.simpaas.inputdsl.model.mapping.FolderCountExtractor#extract(java.lang.String, org.eclipse.emf.common.util.URI) <em>Extract</em>}' operation.
	 * 
	 * @see de.ugoe.swe.simpaas.inputdsl.model.mapping.FolderCountExtractor#extract(java.lang.String, org.eclipse.emf.common.util.URI)
	 * @generated NOT
	 */
	public void testExtract__String_URI() {
		String fileURI = "testdata";
		Parameter outcome = getFixture().extract(null, fileURI);
		assertEquals("4", outcome.getValue());
	}

} //FolderCountExtractorTest
