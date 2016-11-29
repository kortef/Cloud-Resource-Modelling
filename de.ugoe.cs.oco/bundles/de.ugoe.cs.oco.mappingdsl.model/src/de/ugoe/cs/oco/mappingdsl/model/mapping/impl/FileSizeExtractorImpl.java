/**
 */
package de.ugoe.cs.oco.mappingdsl.model.mapping.impl;



import java.io.File;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import de.ugoe.cs.oco.mappingdsl.model.mapping.FileSizeExtractor;
import de.ugoe.cs.oco.mappingdsl.model.mapping.MappingFactory;
import de.ugoe.cs.oco.mappingdsl.model.mapping.MappingPackage;
import de.ugoe.cs.oco.mappingdsl.model.mapping.Parameter;
import de.ugoe.cs.oco.mappingdsl.model.mapping.ParameterUnitType;
import de.ugoe.cs.oco.mappingdsl.model.mapping.ParameterValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Size Extractor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.oco.mappingdsl.model.mapping.impl.FileSizeExtractorImpl#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link de.ugoe.cs.oco.mappingdsl.model.mapping.impl.FileSizeExtractorImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileSizeExtractorImpl extends ExpressionImpl implements FileSizeExtractor {
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
	protected FileSizeExtractorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.FILE_SIZE_EXTRACTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FILE_SIZE_EXTRACTOR__RECIPE, oldRecipe, recipe));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FILE_SIZE_EXTRACTOR__SOURCE, oldSource, source));
	}

	/**
	 * Extracts the file size in MB from the file given in URI.
	 * Parameter recipe is not used.
	 * @Override
	 * @generated NOT
	 */
	public Parameter extract(String recipe, String source) {
		Parameter parameter = MappingFactory.eINSTANCE.createSourceParameter();
		File inputFile = new File(source.toString());
		long size = inputFile.length();
		double sizeInMB = (double)size/(1024*1024); 
		parameter.setUnit(ParameterUnitType.MB);
		parameter.setType(ParameterValueType.FLOAT);
		parameter.setValue(Double.toString(sizeInMB));	
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
			case MappingPackage.FILE_SIZE_EXTRACTOR__RECIPE:
				return getRecipe();
			case MappingPackage.FILE_SIZE_EXTRACTOR__SOURCE:
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
			case MappingPackage.FILE_SIZE_EXTRACTOR__RECIPE:
				setRecipe((String)newValue);
				return;
			case MappingPackage.FILE_SIZE_EXTRACTOR__SOURCE:
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
			case MappingPackage.FILE_SIZE_EXTRACTOR__RECIPE:
				setRecipe(RECIPE_EDEFAULT);
				return;
			case MappingPackage.FILE_SIZE_EXTRACTOR__SOURCE:
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
			case MappingPackage.FILE_SIZE_EXTRACTOR__RECIPE:
				return RECIPE_EDEFAULT == null ? recipe != null : !RECIPE_EDEFAULT.equals(recipe);
			case MappingPackage.FILE_SIZE_EXTRACTOR__SOURCE:
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
			case MappingPackage.FILE_SIZE_EXTRACTOR___EXTRACT__STRING_STRING:
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

} //FileSizeExtractorImpl
