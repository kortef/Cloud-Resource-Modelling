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

import org.apache.log4j.Logger;
import org.eclipse.cmf.occi.core.OCCIFactory;

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
 * Class to that implements functionality for extracting OCCI models from
 * OCCI server.
 * @author fglaser, nvertovec
 * 
 */
public class OCCIModelExtractor {
	private String publicId;
	static Logger log = Logger.getLogger(OCCIModelExtractor.class.getName());
	private Client httpClient;
	private OCCIModel occiModel;
	private Set<String> extensionSchemas = new HashSet<String>();
	
	/**
	 * Extracts OCCIModel from cloud specified with help httpClient object.
	 * @param httpClient
	 * @return OCCIModel
	 */
	public OCCIModel extractModel(Client httpClient){
		log.info("Model Extraction: Start");
		this.httpClient = httpClient;
		Model model = httpClient.getModel();
		occiModel = this.convertToOCCIModel(model);
		log.info("Model Extraction: Finished");
		return occiModel;
	}
	
	/**
	 * Extracts OCCIModel from cloud specified with help httpClient object. And adjusts Resources with id "PUBLIC" to 
	 * the one specified in publicNetworkId.
	 * @param httpClient, publicNetworkId
	 * @return OCCIModel
	 */
	public OCCIModel extractModel(Client httpClient, String publicNetworkId){
		log.info("Model Extraction: Start");
		this.httpClient = httpClient;
		Model model = httpClient.getModel();
		occiModel = this.convertToOCCIModel(model);
		
		if(publicNetworkId != null) {
			for(org.eclipse.cmf.occi.core.Resource res: occiModel.getConfiguration().getResources()) {
				if(res.getId().equals("PUBLIC")) {
					res.setId(publicNetworkId);
				}
			}
		}
		
		log.info("Model Extraction: Finished");
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
    	occiModel.fillConfiguration();
    	occiModel.getConfiguration().setLocation(httpClient.getEndpoint().toString());
    	return occiModel;
    }

	private org.eclipse.cmf.occi.core.Action convert(Action action){
    	return toAction(action);
    }
    
    private org.eclipse.cmf.occi.core.Mixin convert(Mixin mixin){
    	return toMixin(mixin);
    }
    
    private org.eclipse.cmf.occi.core.Kind convert(Kind kind){
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
	private org.eclipse.cmf.occi.core.Action toAction(Action action){
		org.eclipse.cmf.occi.core.Action newAction = OCCIFactory.eINSTANCE.createAction();
		occiModel.addAction(newAction);
		
		
		//newAction.setName(action.getTitle());
		//newAction.setTitle(action.getTerm());
		
		newAction.setName(action.getTerm());
		newAction.setTitle(action.getTitle());
		newAction.setScheme(action.getScheme().toString());
		
		
		String[] parts = newAction.getScheme().split("/");
		String term = parts[parts.length - 2];
		log.debug("Term: " + term);
		org.eclipse.cmf.occi.core.Mixin mixin = occiModel.getMixinBySchemeAndTerm("", term);
		if (mixin != null)
			mixin.getActions().add(newAction);
		
		org.eclipse.cmf.occi.core.Kind kind = occiModel.getKindBySchemeAndTerm("", term);
		if (kind != null)
			kind.getActions().add(newAction);
		
		return newAction;
	}
	
	/**
	 * @param actions
	 * does the same as toAction, but returns a Set instead
	 * @return
	 */
	private Set<org.eclipse.cmf.occi.core.Action> toAction(Set<Action> actions){
		Set<org.eclipse.cmf.occi.core.Action> newAction = new HashSet<org.eclipse.cmf.occi.core.Action>();
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

			log.debug("Mixin: " + mixin.getTerm());
			toMixin(mixin);
		}
		return occi;
	}
	
	/**
	 * @param mixin
	 * takes all the attributes from the api-type mixin and puts into the occi model type mixin
	 * @return
	 */
	private org.eclipse.cmf.occi.core.Mixin toMixin(Mixin mixin){
		org.eclipse.cmf.occi.core.Mixin newMixin = occiModel.getMixin(mixin.getTitle());
		
		if (newMixin == null){
			newMixin = OCCIFactory.eINSTANCE.createMixin();
		}
		
		newMixin.setName(mixin.getTerm());
		newMixin.setTitle(mixin.getTitle());
		newMixin.setScheme(mixin.getScheme().toString()); //may not work
		
		
		//Es werden keine Attribute zurueckgegeben
		for (Attribute attribute: mixin.getAttributes()){
			log.debug("Found mixin.");
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
	private org.eclipse.cmf.occi.core.Kind toKind(Kind kind){
		log.debug("Called toKind with " + kind.getTerm());
		org.eclipse.cmf.occi.core.Kind newKind = occiModel.getKind(kind.getTitle());
		
		if (newKind == null){
			newKind = OCCIFactory.eINSTANCE.createKind();
		}
		
		newKind.setTitle(kind.getTitle());
		
		if(kind.getParentKind()!=null){
			log.debug("Parent kind is: " + kind.getParentKind().getTerm());
			newKind.setParent(toKind(kind.getParentKind()));
		}
		
		
		newKind.setName(kind.getTerm());
		newKind.setScheme(kind.getScheme().toString());
		extensionSchemas.add(kind.getScheme().toString());
		
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
		for (org.eclipse.cmf.occi.core.Kind kind: occi.getKinds()){
			try {
				log.debug("Looking for kind: " + kind.getTerm());
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
	
	private org.eclipse.cmf.occi.core.Entity toEntity(Entity entity) {
		org.eclipse.cmf.occi.core.Entity newEntity = null;
		
		if (entity instanceof Link){
			newEntity = toLink((Link)entity);
		} else{
			newEntity = toResource((Resource)entity);
		}
		
		
		newEntity.setTitle(entity.getTitle());
		newEntity.setKind(occiModel.getKindBySchemeAndTerm("", entity.getKind().getTerm()));
		if(newEntity.getId().equals("PUBLIC")) {
			newEntity.setId(publicId);
		}
		else {
			newEntity.setId(entity.getId());
		}
		for (Entry<Attribute, String> entry: entity.getAttributes().entrySet()){
			org.eclipse.cmf.occi.core.AttributeState state = OCCIFactory.eINSTANCE.createAttributeState();
			state.setName(entry.getKey().getName());
			state.setValue(entry.getValue());
			newEntity.getAttributes().add(state);
		}
		
		//Add Mixins
		for (Mixin mixin: entity.getMixins()){
			//Erstellen von Mixin falls noch nicht vorher vorhanden (Bsp. osnetwork)
			if(occiModel.getMixin(mixin.getTitle()) == null) {
				toMixin(mixin);
			}
			
			//Create MixinBase
			org.eclipse.cmf.occi.core.MixinBase mixinBase = OCCIFactory.eINSTANCE.createMixinBase();
			mixinBase.setMixin(occiModel.getMixin(mixin.getTitle()));
			mixinBase.setEntity(newEntity);
			
			//Filter Attributes of Mixin
			/*
			EList<org.eclipse.cmf.occi.core.AttributeState> toAdd = new BasicEList<org.eclipse.cmf.occi.core.AttributeState>();
			org.eclipse.cmf.occi.core.Mixin actMixin = mixinBase.getMixin();
			for(AttributeState entAttr: newEntity.getAttributes()) {
				for(org.eclipse.cmf.occi.core.Attribute mixAttr: actMixin.getAttributes()) {
					System.out.println("EntAttr: " + entAttr);
					System.out.println("MixAttr: " + mixAttr);
				}
				//toAdd.add(st);
			}
			mixinBase.getAttributes().addAll(toAdd);*/
		}
		return newEntity;
	}
	
	private org.eclipse.cmf.occi.core.Link toLink(Link link){
		org.eclipse.cmf.occi.core.Link newLink = OCCIFactory.eINSTANCE.createLink();
		try {
			Entity target = httpClient.describe(URI.create(link.getTarget())).get(0);
			newLink.setTarget((org.eclipse.cmf.occi.core.Resource) 
					occiModel.getResourceById(target.getId()));
			
		} catch (CommunicationException e) {
		}
		try {
			Entity source = httpClient.describe(URI.create(link.getSource())).get(0);
			org.eclipse.cmf.occi.core.Resource occiSource = (org.eclipse.cmf.occi.core.Resource) 
					occiModel.getResourceById(source.getId());
			occiSource.getLinks().add(newLink);
			newLink.setSource(occiSource);
			
		} catch (CommunicationException e) {
			log.debug("Source not found.");
		}
		
		
		log.debug("Source is " + link.getSource());;
		
		return newLink;
	}
	
	private org.eclipse.cmf.occi.core.Resource toResource(Resource resource){
		org.eclipse.cmf.occi.core.Resource newResource = OCCIFactory.eINSTANCE.createResource();
		occiModel.addResource(newResource);
		return newResource;
	}

	/**
	 * @param attribute
	 * takes all the attributes from the api-type attribute and puts into the occi model type attribute
	 * @return
	 */
	private org.eclipse.cmf.occi.core.Attribute toAttribute(Attribute attribute){
		org.eclipse.cmf.occi.core.Attribute newAttribute = OCCIFactory.eINSTANCE.createAttribute();
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
	private Set<org.eclipse.cmf.occi.core.Attribute> toAttribute(Set<Attribute> attributes){
		Set<org.eclipse.cmf.occi.core.Attribute> newAttribute = new HashSet<org.eclipse.cmf.occi.core.Attribute>();
		Iterator<cz.cesnet.cloud.occi.core.Attribute> attribute_iterator = attributes.iterator();
		while(attribute_iterator.hasNext()){
			newAttribute.add(toAttribute(attribute_iterator.next()));
		}
		return newAttribute;
	}

}
