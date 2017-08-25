package de.awesome.corporate.newworlds.core.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.awesome.corporate.newworlds.core.types.repository.StackableResourceRepository;

@Service
public class ResourceTypes {
	
	private Map<String, StackableResource> resourceTypes;
	
	@Autowired
	private StackableResourceRepository stackableResourceRepository;
	
	public Set<String> getResourceTypes(){
		if(resourceTypes == null){
			createResourceBase();
		}
		return resourceTypes.keySet();
	}
	
	private void createResourceBase(){
		HashMap<String, StackableResource> map = new HashMap<String,StackableResource>();
		stackableResourceRepository.findAll().stream().forEach(s-> map.put(s.getName(), s));
		resourceTypes = Collections.unmodifiableMap(map);
	}
	
	public final StackableResource getResourceForName(String name){
		return resourceTypes.get(name);
	}

}
