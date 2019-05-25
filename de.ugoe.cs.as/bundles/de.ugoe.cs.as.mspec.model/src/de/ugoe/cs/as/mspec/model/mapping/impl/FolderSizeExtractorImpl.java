/**
 */
package de.ugoe.cs.as.mspec.model.mapping.impl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicLong;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.ugoe.cs.as.mspec.model.mapping.FolderSizeExtractor;
import de.ugoe.cs.as.mspec.model.mapping.MappingFactory;
import de.ugoe.cs.as.mspec.model.mapping.MappingPackage;
import de.ugoe.cs.as.mspec.model.mapping.Parameter;
import de.ugoe.cs.as.mspec.model.mapping.ParameterUnitType;
import de.ugoe.cs.as.mspec.model.mapping.ParameterValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folder Size Extractor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.as.mspec.model.mapping.impl.FolderSizeExtractorImpl#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link de.ugoe.cs.as.mspec.model.mapping.impl.FolderSizeExtractorImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FolderSizeExtractorImpl extends ExpressionImpl implements FolderSizeExtractor {
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
	protected FolderSizeExtractorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingPackage.Literals.FOLDER_SIZE_EXTRACTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FOLDER_SIZE_EXTRACTOR__RECIPE, oldRecipe, recipe));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FOLDER_SIZE_EXTRACTOR__SOURCE, oldSource, source));
	}

	/**
	 * Extracts total size in MB of folder given in URI source.
	 * Parameter recipe is not used.
	 * @generated NOT
	 */
	@Override
	public Parameter extract(String recipe, String source) {
		Parameter parameter = MappingFactory.eINSTANCE.createSourceParameter();
		long size = size(Paths.get(source.toString()));
		double sizeinMB = (double) size/(1024*1024);
		parameter.setType(ParameterValueType.FLOAT);
		parameter.setUnit(ParameterUnitType.MB);
		parameter.setValue(Double.toString(sizeinMB));
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
			case MappingPackage.FOLDER_SIZE_EXTRACTOR__RECIPE:
				return getRecipe();
			case MappingPackage.FOLDER_SIZE_EXTRACTOR__SOURCE:
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
			case MappingPackage.FOLDER_SIZE_EXTRACTOR__RECIPE:
				setRecipe((String)newValue);
				return;
			case MappingPackage.FOLDER_SIZE_EXTRACTOR__SOURCE:
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
			case MappingPackage.FOLDER_SIZE_EXTRACTOR__RECIPE:
				setRecipe(RECIPE_EDEFAULT);
				return;
			case MappingPackage.FOLDER_SIZE_EXTRACTOR__SOURCE:
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
			case MappingPackage.FOLDER_SIZE_EXTRACTOR__RECIPE:
				return RECIPE_EDEFAULT == null ? recipe != null : !RECIPE_EDEFAULT.equals(recipe);
			case MappingPackage.FOLDER_SIZE_EXTRACTOR__SOURCE:
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
			case MappingPackage.FOLDER_SIZE_EXTRACTOR___EXTRACT__STRING_STRING:
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

	/**
	 * Method calculates total size of folder given in path
	 * Adapted from http://stackoverflow.com/questions/2149785/get-size-of-folder-or-file/19877372#19877372.
	 * @param path
	 * @return
	 * @generated NOT
	 */
	private static long size(Path path) {

		final AtomicLong size = new AtomicLong(0);

		try
		{
			Files.walkFileTree (path, new SimpleFileVisitor<Path>() 
			{
				@Override public FileVisitResult 
				visitFile(Path file, BasicFileAttributes attrs) {

					size.addAndGet (attrs.size());
					return FileVisitResult.CONTINUE;
				}

				@Override public FileVisitResult 
				visitFileFailed(Path file, IOException exc) {

					System.out.println("skipped: " + file + " (" + exc + ")");
					// Skip folders that can't be traversed
					return FileVisitResult.CONTINUE;
				}

				@Override public FileVisitResult
				postVisitDirectory (Path dir, IOException exc) {

					if (exc != null)
						System.out.println("had trouble traversing: " + dir + " (" + exc + ")");
					// Ignore errors traversing a folder
					return FileVisitResult.CONTINUE;
				}
			});
		}
		catch (IOException e)
		{
			throw new AssertionError ("walkFileTree will not throw IOException if the FileVisitor does not");
		}

		return size.get();
	}
	
	

} //FolderSizeExtractorImpl
