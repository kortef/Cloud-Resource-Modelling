/**
 */
package de.ugoe.cs.oco.mappingdsl.model.mapping.util;

import de.ugoe.cs.oco.mappingdsl.model.mapping.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.ugoe.cs.oco.mappingdsl.model.mapping.MappingPackage
 * @generated
 */
public class MappingSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MappingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingSwitch() {
		if (modelPackage == null) {
			modelPackage = MappingPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MappingPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseExpression(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.TARGET_PARAMETER: {
				TargetParameter targetParameter = (TargetParameter)theEObject;
				T result = caseTargetParameter(targetParameter);
				if (result == null) result = caseParameter(targetParameter);
				if (result == null) result = caseExpression(targetParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.SOURCE_PARAMETER: {
				SourceParameter sourceParameter = (SourceParameter)theEObject;
				T result = caseSourceParameter(sourceParameter);
				if (result == null) result = caseParameter(sourceParameter);
				if (result == null) result = caseExpression(sourceParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.EXTRACTOR: {
				Extractor extractor = (Extractor)theEObject;
				T result = caseExtractor(extractor);
				if (result == null) result = caseExpression(extractor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.UNARY_EXPRESSION: {
				UnaryExpression unaryExpression = (UnaryExpression)theEObject;
				T result = caseUnaryExpression(unaryExpression);
				if (result == null) result = caseExpression(unaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.BINARY_EXPRESSION: {
				BinaryExpression binaryExpression = (BinaryExpression)theEObject;
				T result = caseBinaryExpression(binaryExpression);
				if (result == null) result = caseExpression(binaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				T result = caseMapping(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.MAPPING_MODEL: {
				MappingModel mappingModel = (MappingModel)theEObject;
				T result = caseMappingModel(mappingModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.FILE_SIZE_EXTRACTOR: {
				FileSizeExtractor fileSizeExtractor = (FileSizeExtractor)theEObject;
				T result = caseFileSizeExtractor(fileSizeExtractor);
				if (result == null) result = caseExtractor(fileSizeExtractor);
				if (result == null) result = caseExpression(fileSizeExtractor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.FILE_CONTENT_EXTRACTOR: {
				FileContentExtractor fileContentExtractor = (FileContentExtractor)theEObject;
				T result = caseFileContentExtractor(fileContentExtractor);
				if (result == null) result = caseExtractor(fileContentExtractor);
				if (result == null) result = caseExpression(fileContentExtractor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.FILE_NUM_LINES_EXTRACTOR: {
				FileNumLinesExtractor fileNumLinesExtractor = (FileNumLinesExtractor)theEObject;
				T result = caseFileNumLinesExtractor(fileNumLinesExtractor);
				if (result == null) result = caseExtractor(fileNumLinesExtractor);
				if (result == null) result = caseExpression(fileNumLinesExtractor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.FOLDER_COUNT_EXTRACTOR: {
				FolderCountExtractor folderCountExtractor = (FolderCountExtractor)theEObject;
				T result = caseFolderCountExtractor(folderCountExtractor);
				if (result == null) result = caseExtractor(folderCountExtractor);
				if (result == null) result = caseExpression(folderCountExtractor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.FOLDER_SIZE_EXTRACTOR: {
				FolderSizeExtractor folderSizeExtractor = (FolderSizeExtractor)theEObject;
				T result = caseFolderSizeExtractor(folderSizeExtractor);
				if (result == null) result = caseExtractor(folderSizeExtractor);
				if (result == null) result = caseExpression(folderSizeExtractor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.MAPPER: {
				Mapper mapper = (Mapper)theEObject;
				T result = caseMapper(mapper);
				if (result == null) result = caseExpression(mapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.FLAVOR_MAPPER: {
				FlavorMapper flavorMapper = (FlavorMapper)theEObject;
				T result = caseFlavorMapper(flavorMapper);
				if (result == null) result = caseMapper(flavorMapper);
				if (result == null) result = caseExpression(flavorMapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MappingPackage.CORE_MAPPER: {
				CoreMapper coreMapper = (CoreMapper)theEObject;
				T result = caseCoreMapper(coreMapper);
				if (result == null) result = caseMapper(coreMapper);
				if (result == null) result = caseExpression(coreMapper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetParameter(TargetParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceParameter(SourceParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extractor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtractor(Extractor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingModel(MappingModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Size Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Size Extractor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSizeExtractor(FileSizeExtractor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Content Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Content Extractor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileContentExtractor(FileContentExtractor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Num Lines Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Num Lines Extractor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileNumLinesExtractor(FileNumLinesExtractor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder Count Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder Count Extractor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolderCountExtractor(FolderCountExtractor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder Size Extractor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder Size Extractor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolderSizeExtractor(FolderSizeExtractor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapper(Mapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flavor Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flavor Mapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlavorMapper(FlavorMapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Core Mapper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Core Mapper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoreMapper(CoreMapper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MappingSwitch
