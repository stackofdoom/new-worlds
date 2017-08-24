/**
 * 
 */
package de.awesome.corporate.newworlds.core.planets.entity;

import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import de.awesome.corporate.newworlds.core.planets.city.City;
import de.awesome.corporate.newworlds.core.types.AbstractNamedEntity;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class AbstractPlanetoid extends AbstractNamedEntity{
	
	/*
	 * the gravity of the planet. 
	 * gravity increases industry costs for constructions and increases fuel cost of lifting off
	 * rockets from the planet.
	 * Soldiers have advantage versus soldiers borne on lower gravity worlds on the ground.
	 * Structures are more resistant to bombardment.
	 * 
	 * lower gravity slightly decreases industry cost for constructions and decreases fuel cost for lifting off
	 * rockets. Structures are less resistant to bombardment.
	 */
	private double gravity;
	
	@Embedded
	private PlanetClassProperties planetClassProperties;
	
	@Embedded
	private PlanetState planetState;
	
	@Embedded
	private EnvironmentInfluence environmentInfluence;
	
	@Embedded
	private Nature nature;
	
	@OneToMany
	private Set<City> cities;

	public PlanetClassProperties getPlanetProperties() {
		return planetClassProperties;
	}

	public PlanetState getPlanetState() {
		return planetState;
	}

	public EnvironmentInfluence getEnvironmentInfluence() {
		return environmentInfluence;
	}

	public Set<City> getCities() {
		return cities;
	}

	public void setPlanetProperties(PlanetClassProperties planetProperties) {
		this.planetClassProperties = planetProperties;
	}

	public void setPlanetState(PlanetState planetState) {
		this.planetState = planetState;
	}

	public void setEnvironmentInfluence(EnvironmentInfluence environmentInfluence) {
		this.environmentInfluence = environmentInfluence;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}

	public double getGravity() {
		return gravity;
	}

	public void setGravity(double gravity) {
		this.gravity = gravity;
	}

}
