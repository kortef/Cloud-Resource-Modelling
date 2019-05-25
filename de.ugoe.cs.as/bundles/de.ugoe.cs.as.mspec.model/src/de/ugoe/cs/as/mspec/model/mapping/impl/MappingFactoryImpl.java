/**
 */
package de.ugoe.cs.as.mspec.model.mapping.impl;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.ugoe.cs.as.mspec.model.mapping.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingFactoryImpl extends EFactoryImpl implements MappingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MappingFactory init() {
		try {
			MappingFactory theMappingFactory = (MappingFactory)EPackage.Registry.INSTANCE.getEFactory(MappingPackage.eNS_URI);
			if (theMappingFactory != null) {
				return theMappingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MappingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MappingPackage.TARGET_PARAMETER: return createTargetParameter();
			case MappingPackage.SOURCE_PARAMETER: return createSourceParameter();
			case MappingPackage.UNARY_EXPRESSION: return createUnaryExpression();
			case MappingPackage.BINARY_EXPRESSION: return createBinaryExpression();
			case MappingPackage.MAPPING: return createMapping();
			case MappingPackage.MAPPING_MODEL: return createMappingModel();
			case MappingPackage.FILE_SIZE_EXTRACTOR: return createFileSizeExtractor();
			case MappingPackage.FILE_CONTENT_EXTRACTOR: return createFileContentExtractor();
			case MappingPackage.FILE_NUM_LINES_EXTRACTOR: return createFileNumLinesExtractor();
			case MappingPackage.FOLDER_COUNT_EXTRACTOR: return createFolderCountExtractor();
			case MappingPackage.FOLDER_SIZE_EXTRACTOR: return createFolderSizeExtractor();
			case MappingPackage.FLAVOR_MAPPER: return createFlavorMapper();
			case MappingPackage.CORE_MAPPER: return createCoreMapper();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MappingPackage.COMPARISON_OPERATOR_TYPE:
				return createComparisonOperatorTypeFromString(eDataType, initialValue);
			case MappingPackage.UNARY_EXPRESSION_OPERATOR_TYPE:
				return createUnaryExpressionOperatorTypeFromString(eDataType, initialValue);
			case MappingPackage.BINARY_EXPRESSION_OPERATOR_TYPE:
				return createBinaryExpressionOperatorTypeFromString(eDataType, initialValue);
			case MappingPackage.PARAMETER_UNIT_TYPE:
				return createParameterUnitTypeFromString(eDataType, initialValue);
			case MappingPackage.PARAMETER_VALUE_TYPE:
				return createParameterValueTypeFromString(eDataType, initialValue);
			case MappingPackage.URI:
				return createURIFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MappingPackage.COMPARISON_OPERATOR_TYPE:
				return convertComparisonOperatorTypeToString(eDataType, instanceValue);
			case MappingPackage.UNARY_EXPRESSION_OPERATOR_TYPE:
				return convertUnaryExpressionOperatorTypeToString(eDataType, instanceValue);
			case MappingPackage.BINARY_EXPRESSION_OPERATOR_TYPE:
				return convertBinaryExpressionOperatorTypeToString(eDataType, instanceValue);
			case MappingPackage.PARAMETER_UNIT_TYPE:
				return convertParameterUnitTypeToString(eDataType, instanceValue);
			case MappingPackage.PARAMETER_VALUE_TYPE:
				return convertParameterValueTypeToString(eDataType, instanceValue);
			case MappingPackage.URI:
				return convertURIToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetParameter createTargetParameter() {
		TargetParameterImpl targetParameter = new TargetParameterImpl();
		return targetParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceParameter createSourceParameter() {
		SourceParameterImpl sourceParameter = new SourceParameterImpl();
		return sourceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpression createUnaryExpression() {
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpression createBinaryExpression() {
		BinaryExpressionImpl binaryExpression = new BinaryExpressionImpl();
		return binaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingModel createMappingModel() {
		MappingModelImpl mappingModel = new MappingModelImpl();
		return mappingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSizeExtractor createFileSizeExtractor() {
		FileSizeExtractorImpl fileSizeExtractor = new FileSizeExtractorImpl();
		return fileSizeExtractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileContentExtractor createFileContentExtractor() {
		FileContentExtractorImpl fileContentExtractor = new FileContentExtractorImpl();
		return fileContentExtractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileNumLinesExtractor createFileNumLinesExtractor() {
		FileNumLinesExtractorImpl fileNumLinesExtractor = new FileNumLinesExtractorImpl();
		return fileNumLinesExtractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FolderCountExtractor createFolderCountExtractor() {
		FolderCountExtractorImpl folderCountExtractor = new FolderCountExtractorImpl();
		return folderCountExtractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FolderSizeExtractor createFolderSizeExtractor() {
		FolderSizeExtractorImpl folderSizeExtractor = new FolderSizeExtractorImpl();
		return folderSizeExtractor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlavorMapper createFlavorMapper() {
		FlavorMapperImpl flavorMapper = new FlavorMapperImpl();
		return flavorMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreMapper createCoreMapper() {
		CoreMapperImpl coreMapper = new CoreMapperImpl();
		return coreMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperatorType createComparisonOperatorTypeFromString(EDataType eDataType, String initialValue) {
		ComparisonOperatorType result = ComparisonOperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpressionOperatorType createUnaryExpressionOperatorTypeFromString(EDataType eDataType, String initialValue) {
		UnaryExpressionOperatorType result = UnaryExpressionOperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryExpressionOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpressionOperatorType createBinaryExpressionOperatorTypeFromString(EDataType eDataType, String initialValue) {
		BinaryExpressionOperatorType result = BinaryExpressionOperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryExpressionOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterUnitType createParameterUnitTypeFromString(EDataType eDataType, String initialValue) {
		ParameterUnitType result = ParameterUnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValueType createParameterValueTypeFromString(EDataType eDataType, String initialValue) {
		ParameterValueType result = ParameterValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI createURIFromString(EDataType eDataType, String initialValue) {
		return (URI)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingPackage getMappingPackage() {
		return (MappingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MappingPackage getPackage() {
		return MappingPackage.eINSTANCE;
	}

} //MappingFactoryImpl
