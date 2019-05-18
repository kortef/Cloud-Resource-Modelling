/**
 */
package de.ugoe.cs.as.mappingdsl.model.mapping.impl;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ugoe.cs.as.mappingdsl.model.mapping.FileNumLinesExtractor;
import de.ugoe.cs.as.mappingdsl.model.mapping.MappingFactory;
import de.ugoe.cs.as.mappingdsl.model.mapping.MappingPackage;
import de.ugoe.cs.as.mappingdsl.model.mapping.Parameter;
import de.ugoe.cs.as.mappingdsl.model.mapping.ParameterUnitType;
import de.ugoe.cs.as.mappingdsl.model.mapping.ParameterValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Num Lines Extractor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.as.mappingdsl.model.mapping.impl.FileNumLinesExtractorImpl#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link de.ugoe.cs.as.mappingdsl.model.mapping.impl.FileNumLinesExtractorImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileNumLinesExtractorImpl extends ExpressionImpl implements FileNumLinesExtractor {
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
	protected FileNumLinesExtractorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.FILE_NUM_LINES_EXTRACTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FILE_NUM_LINES_EXTRACTOR__RECIPE, oldRecipe, recipe));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FILE_NUM_LINES_EXTRACTOR__SOURCE, oldSource, source));
	}

	/**
	 * Extracts the number of lines from the file given in the URI.
	 * Parameter recipe is not used yet.
	 * Algorithm to count line adapted from
	 * http://stackoverflow.com/questions/453018/number-of-lines-in-a-file-in-java
	 * @Override
	 * @generated NOT
	 */
	public Parameter extract(String recipe, String source){
		Parameter parameter = MappingFactory.eINSTANCE.createSourceParameter();
		InputStream is = null;
		int count = 0;
		int readChars = 0;
		boolean empty = true;
		try {
			is = new BufferedInputStream(new FileInputStream(source.toString()));
			byte[] c = new byte[1024];
			while ((readChars = is.read(c)) != -1) {
				empty = false;
				for (int i = 0; i < readChars; ++i) {
					if (c[i] == '\n') {
						++count;
					}
				}
			}
		} catch (IOException e){
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (count == 0 && !empty){
			count = 0;
		}
		
		parameter.setType(ParameterValueType.INTEGER);
		parameter.setUnit(ParameterUnitType.NONE);
		parameter.setValue(Integer.toString(count));
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
			case MappingPackage.FILE_NUM_LINES_EXTRACTOR__RECIPE:
				return getRecipe();
			case MappingPackage.FILE_NUM_LINES_EXTRACTOR__SOURCE:
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
			case MappingPackage.FILE_NUM_LINES_EXTRACTOR__RECIPE:
				setRecipe((String)newValue);
				return;
			case MappingPackage.FILE_NUM_LINES_EXTRACTOR__SOURCE:
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
			case MappingPackage.FILE_NUM_LINES_EXTRACTOR__RECIPE:
				setRecipe(RECIPE_EDEFAULT);
				return;
			case MappingPackage.FILE_NUM_LINES_EXTRACTOR__SOURCE:
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
			case MappingPackage.FILE_NUM_LINES_EXTRACTOR__RECIPE:
				return RECIPE_EDEFAULT == null ? recipe != null : !RECIPE_EDEFAULT.equals(recipe);
			case MappingPackage.FILE_NUM_LINES_EXTRACTOR__SOURCE:
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
			case MappingPackage.FILE_NUM_LINES_EXTRACTOR___EXTRACT__STRING_STRING:
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

} //FileNumLinesExtractorImpl
