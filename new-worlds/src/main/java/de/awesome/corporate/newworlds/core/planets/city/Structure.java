/**
 * 
 */
package de.awesome.corporate.newworlds.core.planets.city;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import de.awesome.corporate.newworlds.core.projects.StructureProject;
import de.awesome.corporate.newworlds.core.types.AbstractNamedEntity;
import de.awesome.corporate.newworlds.core.types.Health;

/**
 * Represents all Structures on the ground.
 *
 */
@Entity
public class Structure extends AbstractNamedEntity {
	
	@Embedded
	private Health health;
	
	@Embedded
	private StructureModifier modifier;
	
	private StructureProject type;
	
	public void setHealth(Health health){
		this.health = health;
	}
	
	public Health getHealth(){
		return health;
	}
	
	public void setType(StructureProject type){
		this.type = type;
	}
	
	public StructureProject getType(){
		return type;
	}
}
