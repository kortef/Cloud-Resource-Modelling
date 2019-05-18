/**
 */
package de.ugoe.cs.as.mappingdsl.model.mapping.impl;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ugoe.cs.as.mappingdsl.model.mapping.FolderCountExtractor;
import de.ugoe.cs.as.mappingdsl.model.mapping.MappingFactory;
import de.ugoe.cs.as.mappingdsl.model.mapping.MappingPackage;
import de.ugoe.cs.as.mappingdsl.model.mapping.Parameter;
import de.ugoe.cs.as.mappingdsl.model.mapping.ParameterUnitType;
import de.ugoe.cs.as.mappingdsl.model.mapping.ParameterValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folder Count Extractor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.as.mappingdsl.model.mapping.impl.FolderCountExtractorImpl#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link de.ugoe.cs.as.mappingdsl.model.mapping.impl.FolderCountExtractorImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FolderCountExtractorImpl extends ExpressionImpl implements FolderCountExtractor {
	/**
	 * The default value of the '{@link #getRecipe() <em>Recipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipe()
	 * @generated
	 * @ordered
	 */
	protected static final String RECIPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getRecipe() <em>Recipe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipe()
	 * @generated
	 * @ordered
	 */
	protected String recipe = RECIPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FolderCountExtractorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.FOLDER_COUNT_EXTRACTOR;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecipe() {
		return recipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipe(String newRecipe) {
		String oldRecipe = recipe;
		recipe = newRecipe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FOLDER_COUNT_EXTRACTOR__RECIPE, oldRecipe, recipe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FOLDER_COUNT_EXTRACTOR__SOURCE, oldSource, source));
	}

	/**
	 * Extracts the number of files in the folder given by URI.
	 * Parameter recipe is not used.
	 * @generated NOT
	 */
	@Override
	public Parameter extract(String recipe, String source) {
		Parameter parameter = MappingFactory.eINSTANCE.createSourceParameter();
		long count = new File(source.toString()).list().length;
		parameter.setType(ParameterValueType.INTEGER);
		parameter.setUnit(ParameterUnitType.NONE);
		parameter.setValue(Long.toString(count));
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingPackage.FOLDER_COUNT_EXTRACTOR__RECIPE:
				return getRecipe();
			case MappingPackage.FOLDER_COUNT_EXTRACTOR__SOURCE:
				return getSource();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MappingPackage.FOLDER_COUNT_EXTRACTOR__RECIPE:
				setRecipe((String)newValue);
				return;
			case MappingPackage.FOLDER_COUNT_EXTRACTOR__SOURCE:
				setSource((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MappingPackage.FOLDER_COUNT_EXTRACTOR__RECIPE:
				setRecipe(RECIPE_EDEFAULT);
				return;
			case MappingPackage.FOLDER_COUNT_EXTRACTOR__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MappingPackage.FOLDER_COUNT_EXTRACTOR__RECIPE:
				return RECIPE_EDEFAULT == null ? recipe != null : !RECIPE_EDEFAULT.equals(recipe);
			case MappingPackage.FOLDER_COUNT_EXTRACTOR__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MappingPackage.FOLDER_COUNT_EXTRACTOR___EXTRACT__STRING_STRING:
				return extract((String)arguments.get(0), (String)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (recipe: ");
		result.append(recipe);
		result.append(", source: ");
		result.append(source);
		result.append(')');
		return result.toString();
	}

} //FolderCountExtractorImpl
