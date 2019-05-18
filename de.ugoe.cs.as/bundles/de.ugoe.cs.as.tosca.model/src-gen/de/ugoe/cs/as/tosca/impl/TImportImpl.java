/**
 */
package de.ugoe.cs.as.tosca.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;

import de.ugoe.cs.as.tosca.TImport;
import de.ugoe.cs.as.tosca.ToscaPackage;
import de.ugoe.cs.as.tosca.ValidImportTypes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TImport</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.ugoe.cs.as.tosca.impl.TImportImpl#getImportType <em>Import Type</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.impl.TImportImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.impl.TImportImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link de.ugoe.cs.as.tosca.impl.TImportImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TImportImpl extends TExtensibleElementsImpl implements TImport {
	/**
	 * The default value of the '{@link #getImportType() <em>Import Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportType()
	 * @generated
	 * @ordered
	 */
	protected static final ValidImportTypes IMPORT_TYPE_EDEFAULT = ValidImportTypes.TOSCA_TYPE;

	/**
	 * The cached value of the '{@link #getImportType() <em>Import Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportType()
	 * @generated
	 * @ordered
	 */
	protected ValidImportTypes importType = IMPORT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected static final Resource RESOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource = RESOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToscaPackage.Literals.TIMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidImportTypes getImportType() {
		return importType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportType(ValidImportTypes newImportType) {
		ValidImportTypes oldImportType = importType;
		importType = newImportType == null ? IMPORT_TYPE_EDEFAULT : newImportType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TIMPORT__IMPORT_TYPE, oldImportType, importType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TIMPORT__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TIMPORT__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Resource getResource() {
		if (resource == null){
			if (getLocation() != null){
				Resource changeResource = eResource();
				if (changeResource != null){
					ResourceSet resourceSet = changeResource.getResourceSet();
					URI resourceURI = URI.createFileURI(getLocation()).resolve(changeResource.getURI());
					if (resourceSet != null){
						if (resourceSet.getURIConverter().exists(resourceURI, resourceSet.getLoadOptions())){	
							resource = resourceSet.getResource(resourceURI, true);
						}
						else{
							resource = resourceSet.createResource(resourceURI, ContentHandler.UNSPECIFIED_CONTENT_TYPE);
						}
					}
					if (getImportType().equals(ValidImportTypes.XSD_TYPE)){
						XSDEcoreBuilder xsdEcoreBuilder = new XSDEcoreBuilder();
						Collection<EObject> ecorePackages = xsdEcoreBuilder.generate(resourceURI);
						Iterator<EObject> iter = ecorePackages.iterator();
						while(iter.hasNext()) {
							EPackage generatedPackage = (EPackage) iter.next();
							if (resourceSet.getPackageRegistry().getEPackage(generatedPackage.getNsURI()) == null)
								resourceSet.getPackageRegistry().put(generatedPackage.getNsURI(), generatedPackage);
						}
					}
				}
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToscaPackage.TIMPORT__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToscaPackage.TIMPORT__IMPORT_TYPE:
				return getImportType();
			case ToscaPackage.TIMPORT__LOCATION:
				return getLocation();
			case ToscaPackage.TIMPORT__NAMESPACE:
				return getNamespace();
			case ToscaPackage.TIMPORT__RESOURCE:
				return getResource();
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
			case ToscaPackage.TIMPORT__IMPORT_TYPE:
				setImportType((ValidImportTypes)newValue);
				return;
			case ToscaPackage.TIMPORT__LOCATION:
				setLocation((String)newValue);
				return;
			case ToscaPackage.TIMPORT__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case ToscaPackage.TIMPORT__RESOURCE:
				setResource((Resource)newValue);
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
			case ToscaPackage.TIMPORT__IMPORT_TYPE:
				setImportType(IMPORT_TYPE_EDEFAULT);
				return;
			case ToscaPackage.TIMPORT__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case ToscaPackage.TIMPORT__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case ToscaPackage.TIMPORT__RESOURCE:
				setResource(RESOURCE_EDEFAULT);
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
			case ToscaPackage.TIMPORT__IMPORT_TYPE:
				return importType != IMPORT_TYPE_EDEFAULT;
			case ToscaPackage.TIMPORT__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case ToscaPackage.TIMPORT__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case ToscaPackage.TIMPORT__RESOURCE:
				return RESOURCE_EDEFAULT == null ? resource != null : !RESOURCE_EDEFAULT.equals(resource);
		}
		return super.eIsSet(featureID);
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
		result.append(" (importType: ");
		result.append(importType);
		result.append(", location: ");
		result.append(location);
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", resource: ");
		result.append(resource);
		result.append(')');
		return result.toString();
	}

} //TImportImpl
