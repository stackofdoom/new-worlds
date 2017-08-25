/**
 * 
 */
package de.awesome.corporate.newworlds.core.planets.city;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import de.awesome.corporate.newworlds.core.types.AbstractNamedEntity;
import de.awesome.corporate.newworlds.core.types.Health;

/**
 * Represents all Structures on the ground.
 *
 */
@Entity(name="Structure")
public class Structure extends AbstractNamedEntity {
	
	@Embedded
	private Health health;
	
	@Embedded
	private StructureModifier modifier;
	
	private String type;
	
	public void setHealth(Health health){
		this.health = health;
	}
	
	public Health getHealth(){
		return health;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return type;
	}
}
