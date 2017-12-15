package de.ugoe.cs.oco.occi.extractor;


import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.cmf.occi.core.*;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;


/**
* Wrapper class to store OCCI Model elements at runtime.
* @author nvertovec, fglaser
*/
public class OCCIModel {
	private Map<String, Extension> extensions = new HashMap<String, Extension>();
	private Configuration configuration = OCCIFactory.eINSTANCE.createConfiguration();
	private Set<Action> actions = new HashSet<Action>();
	private Set<Resource> resources = new HashSet<Resource>();
	private Set<Link> links = new HashSet<Link>();
	
	
	public Collection<Extension> getExtensions(){
		return extensions.values();
	}
	
	/**
	 * @return kinds
	 */
	public Collection<Kind> getKinds(){
		Collection<Kind> result = new HashSet<Kind>();
		for (Extension extension: extensions.values()){
			result.addAll(extension.getKinds());
		}
		return result;
	}
	
	/**
	 * @param Set<Kind>
	 */
	public void setKinds(Set<Kind> kinds){
		
	}
	
	/**
	 * @return mixins
	 */
	public Collection<Mixin> getMixins(){
		Collection<Mixin> result = new HashSet<Mixin>();
		for (Extension extension: extensions.values()){
			result.addAll(extension.getMixins());
		}
		return result;
	}
	
	/**
	 * @param Set<Mixin>
	 */
	public void setMixins(Set<Mixin> mixins){
	}
	
	/**
	 * @return actions
	 */
	public Set<Action> getActions(){
		return actions;
	}
	
	/**
	 * @param Set<Action>
	 */
	public void setActions(Set<Action> actions){
		this.actions=actions;
	}
	
	/**
     * Checks whether model contains a kind
     *
     * @param kind kind looked up in the model
     * @return true if model contains the kind, false otherwise
     * !!!must be the same objects(Same address)
     */
	public boolean containsKind(Kind kind) {
        return this.getKinds().contains(kind);
    }

    /**
     * Adds kind to the model.
     *
     * @param kind kind to be added to the model
     * @return true if the addition was successful, false otherwise
     */
    public boolean addKind(Kind kind) {
    	Extension extension = extensions.get(kind.getScheme().toString());
    	if (extension == null){
    		extension = OCCIFactory.eINSTANCE.createExtension();
    		extension.setScheme(kind.getScheme().toString());
    		extensions.put(extension.getScheme(), extension);
    	}
        return extension.getKinds().add(kind);
    }

    /**
     * Removes kind from model.
     *
     * @param kind kind to be removed from the model
     * @return true if the removal was successful, false otherwise
     */
    public boolean removeKind(Kind kind) {
    	Extension extension = extensions.get(kind.getScheme().toString());
        return extension.getKinds().remove(kind);
    }


    /**
     * Checks whether model contains a mixin
     *
     * @param mixin mixin looked up in the model
     * @return true if model contains the mixin, false otherwise
     * !!!must be the same objects(Same address)
     */
    public boolean containsMixin(Mixin mixin) {
        return this.getMixins().contains(mixin);
    }

    /**
     * Adds mixin to the model.
     *
     * @param mixin mixin to be added to the model
     * @return true if the addition was successful, false otherwise
     */
    public boolean addMixin(Mixin mixin) {
    	System.out.println(mixin.getScheme());
    	String extensionSchema = mixin.getScheme().substring(0, mixin.getScheme().lastIndexOf('/')) + '#';
    	Extension extension = extensions.get(extensionSchema);
    	if (extension == null){
    		extension = OCCIFactory.eINSTANCE.createExtension();
    		extension.setScheme(extensionSchema);
    		extensions.put(extension.getScheme(), extension);
    		extension.setName(extensionSchema.substring(extensionSchema.lastIndexOf("/") + 1, extensionSchema.length()-1));
    	}
        return extension.getMixins().add(mixin);
    }

    /**
     * Removes mixin from model.
     *
     * @param mixin mixin to be removed from the model
     * @return true if the removal was successful, false otherwise
     */
    public boolean removeMixin(Mixin mixin) {
        return this.getMixins().remove(mixin);
    }

    /**
     * Checks whether model contains a action
     *
     * @param action action looked up in the model
     * @return true if model contains the action, false otherwise
     * !!!must be the same objects(Same address)
     */
    public boolean containsAction(Action action) {
        return actions.contains(action);
    }


    /**
     * Adds action to the model.
     *
     * @param action action to be added to the model
     * @return true if the addition was successful, false otherwise
     */
    public boolean addAction(Action action) {
        return actions.add(action);
    }

    /**
     * Removes action from model.
     *
     * @param action action to be removed from the model
     * @return true if the removal was successful, false otherwise
     */
    public boolean removeAction(Action action) {
        return actions.remove(action);
    }

    /**
     * Remove all actions from the model.
     */
    public void clearActions() {
        actions.clear();
    }
    
    public boolean addResource(Resource resource){
    	return resources.add(resource);
    }

	public Set<Resource> getResources() {
		return resources;
	}
	
	 public boolean addLink(Link link){
	    	return  links.add(link);
	    }

		public Set<Link> getLinks() {
			return links;
		}
	
	public Kind getKind(String title){
		for (Kind kind: this.getKinds()){
			if (kind.getTitle().equals(title))
				return kind;
		}
		return null;
	}
	
	public Mixin getMixinBySchemeAndTerm(String scheme, String term){
		for (Mixin mixin: this.getMixins()){
			if (mixin.getTerm().equals(term)){
				return mixin;
			}
		}
		return null;
	}
	
	public Kind getKindBySchemeAndTerm(String scheme, String term){
		for (Kind kind: this.getKinds()){
			if (kind.getTerm().equals(term)){
				System.out.println("Matched kind");
				return kind;
			}
		}
		return null;
	}
	
	public Category getCategoryBySchemeAndTerm(String scheme, String term){
		Kind kind = this.getKindBySchemeAndTerm(scheme, term);
		if (kind != null){
			return kind;
		}
		return this.getMixinBySchemeAndTerm(scheme, term);
	}
	
	public Resource getResourceById(String id){
		for (Resource resource: this.getResources()){
			if (resource.getId().equals(id)){
				return resource;
			}
		}
		return null;
	}
	
	public Mixin getMixin(String title){
		for (Mixin mixin: this.getMixins()){
			if (mixin.getTitle().equals(title))
				return mixin;
		}
		return null;
	}

	public Configuration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

	public void fillConfiguration() {
		this.configuration.setDescription("Extracted Runtime Model");
		
		
		//Setup Use
		for(Resource res: this.getResources()) {
			for(Mixin mix: res.getMixins()) {
				System.out.println(mix.eContainer());
				this.configuration.getUse().add((Extension) mix.eContainer());
			}
			this.configuration.getUse().add((Extension) res.getKind().eContainer());
		}
		
		
		
		this.configuration.getResources().addAll(this.getResources());
		this.getResources().clear();
		
		
		
		/*
		for(Extension ext : this.getExtensions()) {
			for(Mixin mixin: ext.getMixins()) {
				System.out.println(mixin.getEntities());
				if(mixin.getEntities().isEmpty() == false) {
					System.out.println(this.configuration.getUse());
					this.configuration.getUse().add(ext);
					System.out.println(this.configuration.getUse());
				}
			}
			for(Kind kind: ext.getKinds()) {
				if(kind.getEntities().isEmpty() == false) {
					this.configuration.getUse().add(ext);
				}
			}
		}*/
		
		//Fill with Resources
		System.out.println("Model:");
		System.out.println(this.getResources());
		System.out.println(this.configuration.getResources());
		
	}
    
}
