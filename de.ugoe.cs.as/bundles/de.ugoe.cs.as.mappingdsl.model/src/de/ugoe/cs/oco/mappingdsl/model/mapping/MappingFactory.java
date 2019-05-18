/**
 */
package de.ugoe.cs.oco.mappingdsl.model.mapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.ugoe.cs.oco.mappingdsl.model.mapping.MappingPackage
 * @generated
 */
public interface MappingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MappingFactory eINSTANCE = de.ugoe.cs.oco.mappingdsl.model.mapping.impl.MappingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Target Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Parameter</em>'.
	 * @generated
	 */
	TargetParameter createTargetParameter();

	/**
	 * Returns a new object of class '<em>Source Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Parameter</em>'.
	 * @generated
	 */
	SourceParameter createSourceParameter();

	/**
	 * Returns a new object of class '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Expression</em>'.
	 * @generated
	 */
	UnaryExpression createUnaryExpression();

	/**
	 * Returns a new object of class '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Expression</em>'.
	 * @generated
	 */
	BinaryExpression createBinaryExpression();

	/**
	 * Returns a new object of class '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping</em>'.
	 * @generated
	 */
	Mapping createMapping();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	MappingModel createMappingModel();

	/**
	 * Returns a new object of class '<em>File Size Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Size Extractor</em>'.
	 * @generated
	 */
	FileSizeExtractor createFileSizeExtractor();

	/**
	 * Returns a new object of class '<em>File Content Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Content Extractor</em>'.
	 * @generated
	 */
	FileContentExtractor createFileContentExtractor();

	/**
	 * Returns a new object of class '<em>File Num Lines Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Num Lines Extractor</em>'.
	 * @generated
	 */
	FileNumLinesExtractor createFileNumLinesExtractor();

	/**
	 * Returns a new object of class '<em>Folder Count Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder Count Extractor</em>'.
	 * @generated
	 */
	FolderCountExtractor createFolderCountExtractor();

	/**
	 * Returns a new object of class '<em>Folder Size Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder Size Extractor</em>'.
	 * @generated
	 */
	FolderSizeExtractor createFolderSizeExtractor();

	/**
	 * Returns a new object of class '<em>Flavor Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flavor Mapper</em>'.
	 * @generated
	 */
	FlavorMapper createFlavorMapper();

	/**
	 * Returns a new object of class '<em>Core Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Core Mapper</em>'.
	 * @generated
	 */
	CoreMapper createCoreMapper();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MappingPackage getMappingPackage();

} //MappingFactory
