package de.awesome.corporate.newworlds.core.projects.types;

import java.util.HashMap;

import de.awesome.corporate.newworlds.core.types.AbstractNamedEntity;
import de.awesome.corporate.newworlds.core.types.StackableResource;

public abstract class AbstractProject extends AbstractNamedEntity{
	
	protected Progress progress;
	
	protected HashMap<AssignableResource, Double> usedResources;
	
	protected HashMap<AssignableResource, Double> producedResources;
	
	protected HashMap<StackableResource, Double> usedStacks;
	
	protected HashMap<StackableResource, Double> producedStacks;

	public HashMap<AssignableResource, Double> getUsedResources() {
		return usedResources;
	}

	public HashMap<AssignableResource, Double> getProducedResources() {
		return producedResources;
	}

	public HashMap<StackableResource, Double> getUsedStacks() {
		return usedStacks;
	}

	public HashMap<StackableResource, Double> getProducedStacks() {
		return producedStacks;
	}
	
	public Progress getProgress(){
		return progress;
	}

	public void setUsedResources(
	        HashMap<AssignableResource, Double> usedResources) {
		this.usedResources = usedResources;
	}

	public void setProducedResources(
	        HashMap<AssignableResource, Double> producedResources) {
		this.producedResources = producedResources;
	}

	public void setUsedStacks(HashMap<StackableResource, Double> usedStacks) {
		this.usedStacks = usedStacks;
	}

	public void setProducedStacks(
	        HashMap<StackableResource, Double> producedStacks) {
		this.producedStacks = producedStacks;
	}
	
	public void setProgress(Progress progress){
		this.progress = progress;
	}
	
}
