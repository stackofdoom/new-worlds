package de.awesome.corporate.newworlds.core.infrastructure.entity;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import de.awesome.corporate.newworlds.core.planets.entity.EntityHealth;
import de.awesome.corporate.newworlds.core.projects.types.Progress;

/**
 * A generic class for constructed things. All constructed objects need specific
 * resources to be available.
 * 
 * @author captainish
 *
 */
@Entity
public class Construction {
	@Embedded
	private EntityHealth entityHealth;

	@Embedded
	private Progress progress;
	
	@Id
	private String name;

	@OneToMany
	private List<ResourceCost> price;
	
	@OneToMany
	private List<ResourceCost> maintenance;
	
	@OneToMany
	private List<ExploitableResource> prerequisites;

}
