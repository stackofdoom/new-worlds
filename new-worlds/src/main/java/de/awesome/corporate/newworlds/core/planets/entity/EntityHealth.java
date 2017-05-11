package de.awesome.corporate.newworlds.core.planets.entity;

import javax.persistence.Embeddable;

/**
 * current and max health of the entity.
 * Used for infrastructure, deposits and species
 * @author captainish
 *
 */
@Embeddable
public class EntityHealth {


	private long maxHealth;
	private long currentHealth;

	public EntityHealth(){
		
	}
	
	public long getMaxHealth() {
		return maxHealth;
	}
	
	public long getCurrentHealth() {
		return currentHealth;
	}
	
	public void setMaxHealth(long maxHealth) {
		this.maxHealth = maxHealth;
	}
	
	public void setCurrentHealth(long currentHealth) {
		this.currentHealth = currentHealth;
	}
	
	public boolean isAlive(){
		return (currentHealth > 0 ? true : false);
	}
}
