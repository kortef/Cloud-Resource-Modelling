/**
 */
package de.ugoe.cs.as.mspec.model.mapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.ugoe.cs.as.mspec.model.mapping.MappingFactory
 * @model kind="package"
 * @generated
 */
public interface MappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://autoscale.cs.ugoe.de/mSpec";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MappingPackage eINSTANCE = de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.ExpressionImpl
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 4;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.ParameterImpl
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__UNIT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.TargetParameterImpl <em>Target Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.TargetParameterImpl
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getTargetParameter()
	 * @generated
	 */
	int TARGET_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PARAMETER__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PARAMETER__TYPE = PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PARAMETER__VALUE = PARAMETER__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PARAMETER__UNIT = PARAMETER__UNIT;

	/**
	 * The number of structural features of the '<em>Target Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Target Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.SourceParameterImpl <em>Source Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.SourceParameterImpl
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getSourceParameter()
	 * @generated
	 */
	int SOURCE_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PARAMETER__NAME = PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PARAMETER__TYPE = PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PARAMETER__VALUE = PARAMETER__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PARAMETER__UNIT = PARAMETER__UNIT;

	/**
	 * The number of structural features of the '<em>Source Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Source Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.Extractor <em>Extractor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.Extractor
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getExtractor()
	 * @generated
	 */
	int EXTRACTOR = 3;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR__RECIPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR__SOURCE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR___EXTRACT__STRING_STRING = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACTOR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.UnaryExpressionImpl
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.BinaryExpressionImpl
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Part1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__PART1 = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Part2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__PART2 = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingImpl
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 7;

	/**
	 * The feature id for the '<em><b>Target Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__TARGET_PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Comperator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__COMPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.MappingModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingModelImpl
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getMappingModel()
	 * @generated
	 */
	int MAPPING_MODEL = 8;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL__MAPPING = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.FileSizeExtractorImpl <em>File Size Extractor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.FileSizeExtractorImpl
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getFileSizeExtractor()
	 * @generated
	 */
	int FILE_SIZE_EXTRACTOR = 9;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SIZE_EXTRACTOR__RECIPE = EXTRACTOR__RECIPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SIZE_EXTRACTOR__SOURCE = EXTRACTOR__SOURCE;

	/**
	 * The number of structural features of the '<em>File Size Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SIZE_EXTRACTOR_FEATURE_COUNT = EXTRACTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SIZE_EXTRACTOR___EXTRACT__STRING_STRING = EXTRACTOR___EXTRACT__STRING_STRING;

	/**
	 * The number of operations of the '<em>File Size Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SIZE_EXTRACTOR_OPERATION_COUNT = EXTRACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.FileContentExtractorImpl <em>File Content Extractor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.FileContentExtractorImpl
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getFileContentExtractor()
	 * @generated
	 */
	int FILE_CONTENT_EXTRACTOR = 10;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_EXTRACTOR__RECIPE = EXTRACTOR__RECIPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_EXTRACTOR__SOURCE = EXTRACTOR__SOURCE;

	/**
	 * The number of structural features of the '<em>File Content Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_EXTRACTOR_FEATURE_COUNT = EXTRACTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_EXTRACTOR___EXTRACT__STRING_STRING = EXTRACTOR___EXTRACT__STRING_STRING;

	/**
	 * The number of operations of the '<em>File Content Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_CONTENT_EXTRACTOR_OPERATION_COUNT = EXTRACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.FileNumLinesExtractorImpl <em>File Num Lines Extractor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.FileNumLinesExtractorImpl
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getFileNumLinesExtractor()
	 * @generated
	 */
	int FILE_NUM_LINES_EXTRACTOR = 11;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NUM_LINES_EXTRACTOR__RECIPE = EXTRACTOR__RECIPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NUM_LINES_EXTRACTOR__SOURCE = EXTRACTOR__SOURCE;

	/**
	 * The number of structural features of the '<em>File Num Lines Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NUM_LINES_EXTRACTOR_FEATURE_COUNT = EXTRACTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NUM_LINES_EXTRACTOR___EXTRACT__STRING_STRING = EXTRACTOR___EXTRACT__STRING_STRING;

	/**
	 * The number of operations of the '<em>File Num Lines Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NUM_LINES_EXTRACTOR_OPERATION_COUNT = EXTRACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.FolderCountExtractorImpl <em>Folder Count Extractor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.FolderCountExtractorImpl
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getFolderCountExtractor()
	 * @generated
	 */
	int FOLDER_COUNT_EXTRACTOR = 12;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_COUNT_EXTRACTOR__RECIPE = EXTRACTOR__RECIPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_COUNT_EXTRACTOR__SOURCE = EXTRACTOR__SOURCE;

	/**
	 * The number of structural features of the '<em>Folder Count Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_COUNT_EXTRACTOR_FEATURE_COUNT = EXTRACTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_COUNT_EXTRACTOR___EXTRACT__STRING_STRING = EXTRACTOR___EXTRACT__STRING_STRING;

	/**
	 * The number of operations of the '<em>Folder Count Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_COUNT_EXTRACTOR_OPERATION_COUNT = EXTRACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.FolderSizeExtractorImpl <em>Folder Size Extractor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.FolderSizeExtractorImpl
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getFolderSizeExtractor()
	 * @generated
	 */
	int FOLDER_SIZE_EXTRACTOR = 13;

	/**
	 * The feature id for the '<em><b>Recipe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_SIZE_EXTRACTOR__RECIPE = EXTRACTOR__RECIPE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_SIZE_EXTRACTOR__SOURCE = EXTRACTOR__SOURCE;

	/**
	 * The number of structural features of the '<em>Folder Size Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_SIZE_EXTRACTOR_FEATURE_COUNT = EXTRACTOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Extract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_SIZE_EXTRACTOR___EXTRACT__STRING_STRING = EXTRACTOR___EXTRACT__STRING_STRING;

	/**
	 * The number of operations of the '<em>Folder Size Extractor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_SIZE_EXTRACTOR_OPERATION_COUNT = EXTRACTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.Mapper <em>Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.Mapper
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getMapper()
	 * @generated
	 */
	int MAPPER = 14;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPER__PARAMETERS = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPER_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPER___MAP__ELIST = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPER_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.FlavorMapperImpl <em>Flavor Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.FlavorMapperImpl
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getFlavorMapper()
	 * @generated
	 */
	int FLAVOR_MAPPER = 15;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAVOR_MAPPER__PARAMETERS = MAPPER__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Flavor Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAVOR_MAPPER_FEATURE_COUNT = MAPPER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAVOR_MAPPER___MAP__ELIST = MAPPER___MAP__ELIST;

	/**
	 * The number of operations of the '<em>Flavor Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAVOR_MAPPER_OPERATION_COUNT = MAPPER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.CoreMapperImpl <em>Core Mapper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.CoreMapperImpl
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getCoreMapper()
	 * @generated
	 */
	int CORE_MAPPER = 16;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MAPPER__PARAMETERS = MAPPER__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Core Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MAPPER_FEATURE_COUNT = MAPPER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MAPPER___MAP__ELIST = MAPPER___MAP__ELIST;

	/**
	 * The number of operations of the '<em>Core Mapper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_MAPPER_OPERATION_COUNT = MAPPER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.ComparisonOperatorType <em>Comparison Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.ComparisonOperatorType
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getComparisonOperatorType()
	 * @generated
	 */
	int COMPARISON_OPERATOR_TYPE = 17;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.UnaryExpressionOperatorType <em>Unary Expression Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.UnaryExpressionOperatorType
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getUnaryExpressionOperatorType()
	 * @generated
	 */
	int UNARY_EXPRESSION_OPERATOR_TYPE = 18;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.BinaryExpressionOperatorType <em>Binary Expression Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.BinaryExpressionOperatorType
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getBinaryExpressionOperatorType()
	 * @generated
	 */
	int BINARY_EXPRESSION_OPERATOR_TYPE = 19;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.ParameterUnitType <em>Parameter Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.ParameterUnitType
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getParameterUnitType()
	 * @generated
	 */
	int PARAMETER_UNIT_TYPE = 20;

	/**
	 * The meta object id for the '{@link de.ugoe.cs.as.mspec.model.mapping.ParameterValueType <em>Parameter Value Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.ugoe.cs.as.mspec.model.mapping.ParameterValueType
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getParameterValueType()
	 * @generated
	 */
	int PARAMETER_VALUE_TYPE = 21;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.URI
	 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getURI()
	 * @generated
	 */
	int URI = 22;


	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.as.mspec.model.mapping.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.as.mspec.model.mapping.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.as.mspec.model.mapping.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.as.mspec.model.mapping.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.as.mspec.model.mapping.Parameter#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.Parameter#getUnit()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Unit();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.as.mspec.model.mapping.TargetParameter <em>Target Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Parameter</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.TargetParameter
	 * @generated
	 */
	EClass getTargetParameter();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.as.mspec.model.mapping.SourceParameter <em>Source Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Parameter</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.SourceParameter
	 * @generated
	 */
	EClass getSourceParameter();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.as.mspec.model.mapping.Extractor <em>Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extractor</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.Extractor
	 * @generated
	 */
	EClass getExtractor();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.as.mspec.model.mapping.Extractor#getRecipe <em>Recipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recipe</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.Extractor#getRecipe()
	 * @see #getExtractor()
	 * @generated
	 */
	EAttribute getExtractor_Recipe();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.as.mspec.model.mapping.Extractor#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.Extractor#getSource()
	 * @see #getExtractor()
	 * @generated
	 */
	EAttribute getExtractor_Source();

	/**
	 * Returns the meta object for the '{@link de.ugoe.cs.as.mspec.model.mapping.Extractor#extract(java.lang.String, java.lang.String) <em>Extract</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extract</em>' operation.
	 * @see de.ugoe.cs.as.mspec.model.mapping.Extractor#extract(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getExtractor__Extract__String_String();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.as.mspec.model.mapping.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.as.mspec.model.mapping.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.as.mspec.model.mapping.UnaryExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.UnaryExpression#getExpression()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Expression();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.as.mspec.model.mapping.UnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.UnaryExpression#getOperator()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.as.mspec.model.mapping.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.as.mspec.model.mapping.BinaryExpression#getPart1 <em>Part1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Part1</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.BinaryExpression#getPart1()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Part1();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.as.mspec.model.mapping.BinaryExpression#getPart2 <em>Part2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Part2</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.BinaryExpression#getPart2()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Part2();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.as.mspec.model.mapping.BinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.BinaryExpression#getOperator()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EAttribute getBinaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.as.mspec.model.mapping.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.as.mspec.model.mapping.Mapping#getTargetParameter <em>Target Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Parameter</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.Mapping#getTargetParameter()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_TargetParameter();

	/**
	 * Returns the meta object for the attribute '{@link de.ugoe.cs.as.mspec.model.mapping.Mapping#getComperator <em>Comperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comperator</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.Mapping#getComperator()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_Comperator();

	/**
	 * Returns the meta object for the containment reference '{@link de.ugoe.cs.as.mspec.model.mapping.Mapping#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.Mapping#getExpression()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Expression();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.as.mspec.model.mapping.MappingModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.MappingModel
	 * @generated
	 */
	EClass getMappingModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.ugoe.cs.as.mspec.model.mapping.MappingModel#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mapping</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.MappingModel#getMapping()
	 * @see #getMappingModel()
	 * @generated
	 */
	EReference getMappingModel_Mapping();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.as.mspec.model.mapping.FileSizeExtractor <em>File Size Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Size Extractor</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.FileSizeExtractor
	 * @generated
	 */
	EClass getFileSizeExtractor();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.as.mspec.model.mapping.FileContentExtractor <em>File Content Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Content Extractor</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.FileContentExtractor
	 * @generated
	 */
	EClass getFileContentExtractor();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.as.mspec.model.mapping.FileNumLinesExtractor <em>File Num Lines Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Num Lines Extractor</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.FileNumLinesExtractor
	 * @generated
	 */
	EClass getFileNumLinesExtractor();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.as.mspec.model.mapping.FolderCountExtractor <em>Folder Count Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder Count Extractor</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.FolderCountExtractor
	 * @generated
	 */
	EClass getFolderCountExtractor();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.as.mspec.model.mapping.FolderSizeExtractor <em>Folder Size Extractor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder Size Extractor</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.FolderSizeExtractor
	 * @generated
	 */
	EClass getFolderSizeExtractor();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.as.mspec.model.mapping.Mapper <em>Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapper</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.Mapper
	 * @generated
	 */
	EClass getMapper();

	/**
	 * Returns the meta object for the reference list '{@link de.ugoe.cs.as.mspec.model.mapping.Mapper#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.Mapper#getParameters()
	 * @see #getMapper()
	 * @generated
	 */
	EReference getMapper_Parameters();

	/**
	 * Returns the meta object for the '{@link de.ugoe.cs.as.mspec.model.mapping.Mapper#map(org.eclipse.emf.common.util.EList) <em>Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Map</em>' operation.
	 * @see de.ugoe.cs.as.mspec.model.mapping.Mapper#map(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getMapper__Map__EList();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.as.mspec.model.mapping.FlavorMapper <em>Flavor Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flavor Mapper</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.FlavorMapper
	 * @generated
	 */
	EClass getFlavorMapper();

	/**
	 * Returns the meta object for class '{@link de.ugoe.cs.as.mspec.model.mapping.CoreMapper <em>Core Mapper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core Mapper</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.CoreMapper
	 * @generated
	 */
	EClass getCoreMapper();

	/**
	 * Returns the meta object for enum '{@link de.ugoe.cs.as.mspec.model.mapping.ComparisonOperatorType <em>Comparison Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operator Type</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.ComparisonOperatorType
	 * @generated
	 */
	EEnum getComparisonOperatorType();

	/**
	 * Returns the meta object for enum '{@link de.ugoe.cs.as.mspec.model.mapping.UnaryExpressionOperatorType <em>Unary Expression Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Expression Operator Type</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.UnaryExpressionOperatorType
	 * @generated
	 */
	EEnum getUnaryExpressionOperatorType();

	/**
	 * Returns the meta object for enum '{@link de.ugoe.cs.as.mspec.model.mapping.BinaryExpressionOperatorType <em>Binary Expression Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Expression Operator Type</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.BinaryExpressionOperatorType
	 * @generated
	 */
	EEnum getBinaryExpressionOperatorType();

	/**
	 * Returns the meta object for enum '{@link de.ugoe.cs.as.mspec.model.mapping.ParameterUnitType <em>Parameter Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Unit Type</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.ParameterUnitType
	 * @generated
	 */
	EEnum getParameterUnitType();

	/**
	 * Returns the meta object for enum '{@link de.ugoe.cs.as.mspec.model.mapping.ParameterValueType <em>Parameter Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Value Type</em>'.
	 * @see de.ugoe.cs.as.mspec.model.mapping.ParameterValueType
	 * @generated
	 */
	EEnum getParameterValueType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.util.URI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see org.eclipse.emf.common.util.URI
	 * @model instanceClass="org.eclipse.emf.common.util.URI"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MappingFactory getMappingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.ParameterImpl
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__UNIT = eINSTANCE.getParameter_Unit();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.TargetParameterImpl <em>Target Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.TargetParameterImpl
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getTargetParameter()
		 * @generated
		 */
		EClass TARGET_PARAMETER = eINSTANCE.getTargetParameter();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.SourceParameterImpl <em>Source Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.SourceParameterImpl
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getSourceParameter()
		 * @generated
		 */
		EClass SOURCE_PARAMETER = eINSTANCE.getSourceParameter();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.Extractor <em>Extractor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.Extractor
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getExtractor()
		 * @generated
		 */
		EClass EXTRACTOR = eINSTANCE.getExtractor();

		/**
		 * The meta object literal for the '<em><b>Recipe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACTOR__RECIPE = eINSTANCE.getExtractor_Recipe();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACTOR__SOURCE = eINSTANCE.getExtractor_Source();

		/**
		 * The meta object literal for the '<em><b>Extract</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EXTRACTOR___EXTRACT__STRING_STRING = eINSTANCE.getExtractor__Extract__String_String();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.ExpressionImpl
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.UnaryExpressionImpl
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__EXPRESSION = eINSTANCE.getUnaryExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OPERATOR = eINSTANCE.getUnaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.BinaryExpressionImpl
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Part1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__PART1 = eINSTANCE.getBinaryExpression_Part1();

		/**
		 * The meta object literal for the '<em><b>Part2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__PART2 = eINSTANCE.getBinaryExpression_Part2();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBinaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingImpl
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Target Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__TARGET_PARAMETER = eINSTANCE.getMapping_TargetParameter();

		/**
		 * The meta object literal for the '<em><b>Comperator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__COMPERATOR = eINSTANCE.getMapping_Comperator();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__EXPRESSION = eINSTANCE.getMapping_Expression();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.MappingModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingModelImpl
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getMappingModel()
		 * @generated
		 */
		EClass MAPPING_MODEL = eINSTANCE.getMappingModel();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_MODEL__MAPPING = eINSTANCE.getMappingModel_Mapping();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.FileSizeExtractorImpl <em>File Size Extractor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.FileSizeExtractorImpl
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getFileSizeExtractor()
		 * @generated
		 */
		EClass FILE_SIZE_EXTRACTOR = eINSTANCE.getFileSizeExtractor();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.FileContentExtractorImpl <em>File Content Extractor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.FileContentExtractorImpl
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getFileContentExtractor()
		 * @generated
		 */
		EClass FILE_CONTENT_EXTRACTOR = eINSTANCE.getFileContentExtractor();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.FileNumLinesExtractorImpl <em>File Num Lines Extractor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.FileNumLinesExtractorImpl
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getFileNumLinesExtractor()
		 * @generated
		 */
		EClass FILE_NUM_LINES_EXTRACTOR = eINSTANCE.getFileNumLinesExtractor();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.FolderCountExtractorImpl <em>Folder Count Extractor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.FolderCountExtractorImpl
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getFolderCountExtractor()
		 * @generated
		 */
		EClass FOLDER_COUNT_EXTRACTOR = eINSTANCE.getFolderCountExtractor();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.FolderSizeExtractorImpl <em>Folder Size Extractor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.FolderSizeExtractorImpl
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getFolderSizeExtractor()
		 * @generated
		 */
		EClass FOLDER_SIZE_EXTRACTOR = eINSTANCE.getFolderSizeExtractor();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.Mapper <em>Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.Mapper
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getMapper()
		 * @generated
		 */
		EClass MAPPER = eINSTANCE.getMapper();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPER__PARAMETERS = eINSTANCE.getMapper_Parameters();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAPPER___MAP__ELIST = eINSTANCE.getMapper__Map__EList();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.FlavorMapperImpl <em>Flavor Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.FlavorMapperImpl
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getFlavorMapper()
		 * @generated
		 */
		EClass FLAVOR_MAPPER = eINSTANCE.getFlavorMapper();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.impl.CoreMapperImpl <em>Core Mapper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.CoreMapperImpl
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getCoreMapper()
		 * @generated
		 */
		EClass CORE_MAPPER = eINSTANCE.getCoreMapper();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.ComparisonOperatorType <em>Comparison Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.ComparisonOperatorType
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getComparisonOperatorType()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR_TYPE = eINSTANCE.getComparisonOperatorType();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.UnaryExpressionOperatorType <em>Unary Expression Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.UnaryExpressionOperatorType
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getUnaryExpressionOperatorType()
		 * @generated
		 */
		EEnum UNARY_EXPRESSION_OPERATOR_TYPE = eINSTANCE.getUnaryExpressionOperatorType();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.BinaryExpressionOperatorType <em>Binary Expression Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.BinaryExpressionOperatorType
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getBinaryExpressionOperatorType()
		 * @generated
		 */
		EEnum BINARY_EXPRESSION_OPERATOR_TYPE = eINSTANCE.getBinaryExpressionOperatorType();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.ParameterUnitType <em>Parameter Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.ParameterUnitType
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getParameterUnitType()
		 * @generated
		 */
		EEnum PARAMETER_UNIT_TYPE = eINSTANCE.getParameterUnitType();

		/**
		 * The meta object literal for the '{@link de.ugoe.cs.as.mspec.model.mapping.ParameterValueType <em>Parameter Value Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.ugoe.cs.as.mspec.model.mapping.ParameterValueType
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getParameterValueType()
		 * @generated
		 */
		EEnum PARAMETER_VALUE_TYPE = eINSTANCE.getParameterValueType();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.util.URI
		 * @see de.ugoe.cs.as.mspec.model.mapping.impl.MappingPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

	}

} //MappingPackage
