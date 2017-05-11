/**
 * 
 */
package de.awesome.corporate.newworlds.core.infrastructure.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import de.awesome.corporate.newworlds.core.planets.entity.EntityHealth;

/**
 * A generic class for constructed things.
 * All constructed objects need specific resources to be available.
 * 
 * @author captainish
 *
 */
@Entity
public class Construction {
	
	private EntityHealth entityHealth;
	@Id
	private String name;
	private List<ResourceCost> price;
	private List<ResourceCost> maintenance;
	private List<ExploitedResource> prerequisites;

}
