/**
 */
package de.ugoe.cs.as.mappingdsl.model.mapping.tests;

import de.ugoe.cs.as.mappingdsl.model.mapping.FileContentExtractor;
import de.ugoe.cs.as.mappingdsl.model.mapping.MappingFactory;
import de.ugoe.cs.as.mappingdsl.model.mapping.Parameter;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>File Content Extractor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FileContentExtractorTest extends ExtractorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FileContentExtractorTest.class);
	}

	/**
	 * Constructs a new File Content Extractor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileContentExtractorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this File Content Extractor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FileContentExtractor getFixture() {
		return (FileContentExtractor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MappingFactory.eINSTANCE.createFileContentExtractor());
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
	 * Tests the '{@link de.ugoe.swe.simpaas.inputdsl.model.mapping.FileContentExtractor#extract(java.lang.String, org.eclipse.emf.common.util.URI) <em>Extract</em>}' operation.
	 * 
	 * @see de.ugoe.swe.simpaas.inputdsl.model.mapping.FileContentExtractor#extract(java.lang.String, org.eclipse.emf.common.util.URI)
	 * @generated NOT
	 */
	public void testExtract__String_URI() {
//		URI fileURI = URI.createFileURI("testdata/testfile.txt");
//		Parameter outcome = getFixture().extract("\\d", fileURI);
//		assertEquals("1", outcome.getValue());
		
		String fileURI = "testdata/testfile2.txt";
		Parameter outcome = getFixture().extract("test = (\\d*)", fileURI);
		assertEquals("15", outcome.getValue());
	}
	
	public void testExtract__String_URI2() {
//		URI fileURI = URI.createFileURI("testdata/testfile.txt");
//		Parameter outcome = getFixture().extract("\\d", fileURI);
//		assertEquals("1", outcome.getValue());
		
		String fileURI = "testdata/system/decomposeParDict";
		Parameter outcome = getFixture().extract("numberOfSubdomains (\\d*)#1", fileURI);
		assertEquals("4", outcome.getValue());
	}
	
	public void testExtract__String_URI3() {
//		URI fileURI = URI.createFileURI("testdata/testfile.txt");
//		Parameter outcome = getFixture().extract("\\d", fileURI);
//		assertEquals("1", outcome.getValue());
		
		String fileURI = "testdata/system/controlDict";
		Parameter outcome = getFixture().extract("endTime((\\s+)(\\d+(.\\d+)?))#3", fileURI);
		assertEquals("1", outcome.getValue());
	}
	
	public void testExtract__String_URI4() {
//		URI fileURI = URI.createFileURI("testdata/testfile.txt");
//		Parameter outcome = getFixture().extract("\\d", fileURI);
//		assertEquals("1", outcome.getValue());
		
		String fileURI = "testdata/system/controlDict";
		Parameter outcome = getFixture().extract("deltaT((\\s+)(\\d+(.\\d+)?))#3", fileURI);
		assertEquals("0.001", outcome.getValue());
	}

} //FileContentExtractorTest
