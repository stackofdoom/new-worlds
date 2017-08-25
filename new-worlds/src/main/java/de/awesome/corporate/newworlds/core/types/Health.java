package de.awesome.corporate.newworlds.core.types;

import javax.persistence.Embeddable;

@Embeddable
public class Health {
	
	private double maxHealth;
	
	private double currentHealth;
	
	public void setMaxHealth(double maxHealth){
		this.maxHealth = maxHealth;
	}
	
	public void setCurrentHealth(double currentHealth){
		this.currentHealth = currentHealth < 0 ? 0 : currentHealth;
	}
	
	public double getCurrentHealth(){
		return currentHealth;
	}
	
	public double getMaxHealth(){
		return maxHealth;
	}
	
	public boolean isAlive(){
		return currentHealth > 0;
	}
	
	public double getHealthPercentage(){
		return currentHealth/maxHealth;
	}
}
