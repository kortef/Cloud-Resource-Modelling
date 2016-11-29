/**
 * 
 */
package de.ugoe.cs.oco.occi.extractor;

import java.net.URI;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.occiware.clouddesigner.occi.Category;
import org.occiware.clouddesigner.occi.OCCIFactory;

import cz.cesnet.cloud.occi.Model;
import cz.cesnet.cloud.occi.api.Client;
import cz.cesnet.cloud.occi.api.exception.CommunicationException;
import cz.cesnet.cloud.occi.core.Action;
import cz.cesnet.cloud.occi.core.Attribute;
import cz.cesnet.cloud.occi.core.Entity;
import cz.cesnet.cloud.occi.core.Kind;
import cz.cesnet.cloud.occi.core.Link;
import cz.cesnet.cloud.occi.core.Mixin;
import cz.cesnet.cloud.occi.core.Resource;
/**
 * @author fglaser, nvertovec
 *
 */
public class OCCIModelExtractor {
	private Client httpClient;
	private OCCIModel occiModel;
	private Set<String> extensionSchemas = new HashSet<String>();

	public OCCIModel extractModel(Client httpClient){
		this.httpClient = httpClient;
		Model model = httpClient.getModel();
		occiModel = this.convertToOCCIModel(model);
		return occiModel;
	}
	
	/**
     * @param model
     * adds kinds, mixins and actions to the OCCI model from the api model
     */
    private OCCIModel convertToOCCIModel(Model model){
    	occiModel = new OCCIModel();
    	occiModel = mixin(model, occiModel);
    	occiModel = kind(model, occiModel);
    	occiModel = action(model, occiModel);
    	occiModel = entity(model, occiModel);
    	return occiModel;
    }

	private org.occiware.clouddesigner.occi.Action convert(Action action){
    	return toAction(action);
    }
    
    private org.occiware.clouddesigner.occi.Mixin convert(Mixin mixin){
    	return toMixin(mixin);
    }
    
    private org.occiware.clouddesigner.occi.Kind convert(Kind kind){
    	return toKind(kind);
    }
    
	/**
	 * @param model
	 * takes the the action set as an iterator and manually adds it to the empty hash set from the occi model
	 * @param occi 
	 * @return 
	 */
	private OCCIModel action(Model model, OCCIModel occi) {
	//	LOGGER.debug("Length of Set Action: "+ model.getActions().size());
		Iterator<cz.cesnet.cloud.occi.core.Action> action_iterator = model.getActions().iterator();
		Action action;
		while(action_iterator.hasNext()){
			action = action_iterator.next();
			toAction(action);
		}
		return occi;
	}

	/**
	 * @param action
	 * takes all the attributes from the api-type action and puts into the occi model type action
	 * @return
	 */
	private org.occiware.clouddesigner.occi.Action toAction(Action action){
		org.occiware.clouddesigner.occi.Action newAction = OCCIFactory.eINSTANCE.createAction();
		occiModel.addAction(newAction);
		newAction.setTitle(action.getTitle());
		newAction.setScheme(action.getScheme().toString());
		newAction.setTerm(action.getTerm());
		
		String[] parts = newAction.getScheme().split("/");
		String term = parts[parts.length - 2];
		System.out.println("Term: " + term);
		org.occiware.clouddesigner.occi.Mixin mixin = occiModel.getMixinBySchemeAndTerm("", term);
		if (mixin != null)
			mixin.getActions().add(newAction);
		
		org.occiware.clouddesigner.occi.Kind kind = occiModel.getKindBySchemeAndTerm("", term);
		if (kind != null)
			kind.getActions().add(newAction);
		
		return newAction;
	}
	
	/**
	 * @param actions
	 * does the same as toAction, but returns a Set instead
	 * @return
	 */
	private Set<org.occiware.clouddesigner.occi.Action> toAction(Set<Action> actions){
		Set<org.occiware.clouddesigner.occi.Action> newAction = new HashSet<org.occiware.clouddesigner.occi.Action>();
		Iterator<cz.cesnet.cloud.occi.core.Action> action_iterator = actions.iterator();
		while(action_iterator.hasNext()){
			newAction.add(toAction(action_iterator.next()));
		}
		return newAction;
	}
	
	/**
	 * @param model
	 * takes the the mixin set as an iterator and manually adds it to the empty hash set from the occi model
	 * @param occi 
	 * @return 
	 */
	private OCCIModel mixin(Model model, OCCIModel occi) {
		//LOGGER.debug("Length of Set Mixin: "+ model.getMixins().size());
		Iterator<cz.cesnet.cloud.occi.core.Mixin> mixin_iterator = model.getMixins().iterator();
		cz.cesnet.cloud.occi.core.Mixin mixin;
		while(mixin_iterator.hasNext()){
			mixin = mixin_iterator.next();
			toMixin(mixin);
		}
		return occi;
	}
	
	/**
	 * @param mixin
	 * takes all the attributes from the api-type mixin and puts into the occi model type mixin
	 * @return
	 */
	private org.occiware.clouddesigner.occi.Mixin toMixin(Mixin mixin){
		org.occiware.clouddesigner.occi.Mixin newMixin = occiModel.getMixin(mixin.getTitle());
		
		if (newMixin == null){
			newMixin = OCCIFactory.eINSTANCE.createMixin();
		}
		
		newMixin.setTitle(mixin.getTitle());
		newMixin.setScheme(mixin.getScheme().toString()); //may not work
		newMixin.setTerm(mixin.getTerm());
		for (Attribute attribute: mixin.getAttributes()){
			System.out.println("Found mixin.");
			newMixin.getAttributes().add(toAttribute(attribute));
		}
		
		occiModel.addMixin(newMixin);
		return newMixin;
	}

	/**
	 * @param model
	 * takes the the kind set as an iterator and manually adds it to the empty hash set from the occi model
	 * @param occi 
	 * @return 
	 */
	private OCCIModel kind(Model model, OCCIModel occi) {
		Iterator<cz.cesnet.cloud.occi.core.Kind> kind_iterator = model.getKinds().iterator();
		cz.cesnet.cloud.occi.core.Kind kind;
		while(kind_iterator.hasNext()){
			kind = kind_iterator.next();
			toKind(kind);
		}
		return occi;
	}
	
	/**
	 * @param kind
	 * takes all the attributes from the api-type kind and puts into the occi model type kind
	 * @return
	 */
	private org.occiware.clouddesigner.occi.Kind toKind(Kind kind){
		System.out.println("Called toKind with " + kind.getTerm());
		org.occiware.clouddesigner.occi.Kind newKind = occiModel.getKind(kind.getTitle());
		
		if (newKind == null){
			newKind = OCCIFactory.eINSTANCE.createKind();
		}
		
		newKind.setTitle(kind.getTitle());
		
		if(kind.getParentKind()!=null){
			System.out.println("Parent kind is: " + kind.getParentKind().getTerm());
			newKind.setParent(toKind(kind.getParentKind()));
		}
		
		newKind.setScheme(kind.getScheme().toString());
		extensionSchemas.add(kind.getScheme().toString());
		newKind.setTerm(kind.getTerm());
		
		if(toAttribute(kind.getAttributes()) != null){
			newKind.getAttributes().addAll(toAttribute(kind.getAttributes()));
		}
		//if(toAction(kind.getActions()) != null){
		//	newKind.getActions().addAll(toAction(kind.getActions()));
		//}
		occiModel.addKind(newKind);
		return newKind;
	}

	/**
	 * @param kind
	 * @param newKind
	 */
	private OCCIModel entity(Model model, OCCIModel occi) {
		List<Link> links = 
				new LinkedList<Link>();
		for (org.occiware.clouddesigner.occi.Kind kind: occi.getKinds()){
			try {
				System.out.println("Looking for kind: " + kind.getTerm());
				List<URI> entityURIs = httpClient.list(kind.getTerm());
				for (URI entityURI: entityURIs){
					List<Entity> entities = httpClient.describe(entityURI);
					for (Entity entity: entities){
						if (entity instanceof Resource)
							toEntity(entity);
						else
							links.add((Link) entity);
					}
				}
			} catch (CommunicationException e) {
			}
		}
		for (Link link: links){
			toEntity(link);
		}
		return occi;
	}
	
	private org.occiware.clouddesigner.occi.Entity toEntity(Entity entity) {
		org.occiware.clouddesigner.occi.Entity newEntity = null;
		
		if (entity instanceof Link){
			newEntity = toLink((Link)entity);
		} else{
			newEntity = toResource((Resource)entity);
		}
		
		newEntity.setTitle(entity.getTitle());
		newEntity.setKind(occiModel.getKindBySchemeAndTerm("", entity.getKind().getTerm()));
		newEntity.setId(entity.getId());
		for (Entry<Attribute, String> entry: entity.getAttributes().entrySet()){
			org.occiware.clouddesigner.occi.AttributeState state = OCCIFactory.eINSTANCE.createAttributeState();
			state.setName(entry.getKey().getName());
			state.setValue(entry.getValue());
			newEntity.getAttributes().add(state);
		}
		for (Mixin mixin: entity.getMixins()){
			newEntity.getMixins().add(toMixin(mixin));
		}
		return newEntity;
	}
	
	private org.occiware.clouddesigner.occi.Link toLink(Link link){
		org.occiware.clouddesigner.occi.Link newLink = OCCIFactory.eINSTANCE.createLink();
		try {
			Entity target = httpClient.describe(URI.create(link.getTarget())).get(0);
			newLink.setTarget((org.occiware.clouddesigner.occi.Resource) 
					occiModel.getResourceById(target.getId()));
			
		} catch (CommunicationException e) {
		}
		try {
			Entity source = httpClient.describe(URI.create(link.getSource())).get(0);
			org.occiware.clouddesigner.occi.Resource occiSource = (org.occiware.clouddesigner.occi.Resource) 
					occiModel.getResourceById(source.getId());
			occiSource.getLinks().add(newLink);
			newLink.setSource(occiSource);
			
		} catch (CommunicationException e) {
			System.out.println("Source not found.");
		}
		
		
		System.out.println("Source is " + link.getSource());;
		
		return newLink;
	}
	
	private org.occiware.clouddesigner.occi.Resource toResource(Resource resource){
		org.occiware.clouddesigner.occi.Resource newResource = OCCIFactory.eINSTANCE.createResource();
		occiModel.addResource(newResource);
		return newResource;
	}

	/**
	 * @param attribute
	 * takes all the attributes from the api-type attribute and puts into the occi model type attribute
	 * @return
	 */
	private org.occiware.clouddesigner.occi.Attribute toAttribute(Attribute attribute){
		org.occiware.clouddesigner.occi.Attribute newAttribute = OCCIFactory.eINSTANCE.createAttribute();
		newAttribute.setName(attribute.getName());
		newAttribute.setRequired(attribute.isRequired());
		newAttribute.setMutable(!attribute.isImmutable());
		//EDataType type = EcoreFactory.eINSTANCE.createEDataType();
		//type.setName(attribute.getType()); //not sure how to add the String type to EDataType
		//newAttribute.setType(type);
		newAttribute.setDefault(attribute.getDefaultValue());
		newAttribute.setDescription(attribute.getDescription());
		return newAttribute;
	}
	
	/**
	 * @param attributes
	 * does the same as toAttribute, but returns a Set instead
	 * @return
	 */
	private Set<org.occiware.clouddesigner.occi.Attribute> toAttribute(Set<Attribute> attributes){
		Set<org.occiware.clouddesigner.occi.Attribute> newAttribute = new HashSet<org.occiware.clouddesigner.occi.Attribute>();
		Iterator<cz.cesnet.cloud.occi.core.Attribute> attribute_iterator = attributes.iterator();
		while(attribute_iterator.hasNext()){
			newAttribute.add(toAttribute(attribute_iterator.next()));
		}
		return newAttribute;
	}

}
