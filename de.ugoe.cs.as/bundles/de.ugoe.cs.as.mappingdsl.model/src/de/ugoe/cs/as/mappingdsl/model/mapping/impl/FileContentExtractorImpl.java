/**
 */
package de.ugoe.cs.as.mappingdsl.model.mapping.impl;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ugoe.cs.as.mappingdsl.model.mapping.FileContentExtractor;
import de.ugoe.cs.as.mappingdsl.model.mapping.MappingFactory;
import de.ugoe.cs.as.mappingdsl.model.mapping.MappingPackage;
import de.ugoe.cs.as.mappingdsl.model.mapping.Parameter;
import de.ugoe.cs.as.mappingdsl.model.mapping.ParameterUnitType;
import de.ugoe.cs.as.mappingdsl.model.mapping.ParameterValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Content Extractor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.as.mappingdsl.model.mapping.impl.FileContentExtractorImpl#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link de.ugoe.cs.as.mappingdsl.model.mapping.impl.FileContentExtractorImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileContentExtractorImpl extends ExpressionImpl implements FileContentExtractor {
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
	protected FileContentExtractorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.FILE_CONTENT_EXTRACTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FILE_CONTENT_EXTRACTOR__RECIPE, oldRecipe, recipe));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FILE_CONTENT_EXTRACTOR__SOURCE, oldSource, source));
	}

	/**
	 * Extract content from file given by URI source that matches the regular
	 * expression given by recipe. Only first match is returned.
	 * Adapted from http://stackoverflow.com/questions/11877232/java-regular-expression-in-a-file-content.
	 * @generated NOT
	 */
	@Override
	public Parameter extract(String recipe, String source) {
		Parameter parameter = MappingFactory.eINSTANCE.createSourceParameter();
		parameter.setType(ParameterValueType.STRING);
		parameter.setUnit(ParameterUnitType.NONE);
		try {
			BufferedReader reader = new BufferedReader(new FileReader(source.toString()));
			StringBuilder contents = new StringBuilder();
			while (reader.ready()){
				contents.append(reader.readLine() + "\n");
			}
			reader.close();
			String stringContents = contents.toString();
			//System.out.println(stringContents);
			StringTokenizer tokenizer = new StringTokenizer(recipe, "#");
			String pattern = tokenizer.nextToken();
			int group = 1;
			if (tokenizer.hasMoreTokens()){
				group = Integer.parseInt(tokenizer.nextToken());
			}
			Matcher m = Pattern.compile(pattern).matcher(stringContents);
			if (m.find()){
				parameter.setValue(m.group(group));
			}
			else {
				throw new IOException("NothingFound in " + source + " that matches " + pattern + ".");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e){
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
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
			case MappingPackage.FILE_CONTENT_EXTRACTOR__RECIPE:
				return getRecipe();
			case MappingPackage.FILE_CONTENT_EXTRACTOR__SOURCE:
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
			case MappingPackage.FILE_CONTENT_EXTRACTOR__RECIPE:
				setRecipe((String)newValue);
				return;
			case MappingPackage.FILE_CONTENT_EXTRACTOR__SOURCE:
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
			case MappingPackage.FILE_CONTENT_EXTRACTOR__RECIPE:
				setRecipe(RECIPE_EDEFAULT);
				return;
			case MappingPackage.FILE_CONTENT_EXTRACTOR__SOURCE:
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
			case MappingPackage.FILE_CONTENT_EXTRACTOR__RECIPE:
				return RECIPE_EDEFAULT == null ? recipe != null : !RECIPE_EDEFAULT.equals(recipe);
			case MappingPackage.FILE_CONTENT_EXTRACTOR__SOURCE:
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
			case MappingPackage.FILE_CONTENT_EXTRACTOR___EXTRACT__STRING_STRING:
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

} //FileContentExtractorImpl
