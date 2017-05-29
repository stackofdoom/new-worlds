package de.awesome.corporate.newworlds.core.planets.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Planet {
	

	@GeneratedValue
	@Id
	private long uid;
	
	/*
	 * The classification of planets
	 * and associated descriptions and properties
	 */
	@Embedded
	private PlanetClassProperties planetClassProperties;
	
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
	
	/*
	 * The amount of vegetation on the planet
	 * Determines the amount of forests and larger vegetative bodies.
	 * A value of 0 represents an emtpy world without trees and possibly devastating winds.
	 * 
	 * reducing forestation increases the peak wind intensity and decreases the ability of the planet to
	 * deal with poor atmosphere, water and soil qualities. 
	 */
	private double forestation;
	
	/*
	 * Toxicity of water
	 * the water quality determines the amount of dangerous chemicals in bodies of water and the atmosphere.
	 * A value of 0 means water is highly toxic up to even acidic. A planet with 0 water quality is essentially dead
	 * and only certain microorganisms and a few other things can survive. Acid rains can damage structures.
	 * 
	 * reducing water quality reduces the amount of food and the health of population. undiscovered species may die off.
	 * 
	 */
	private double waterquality;
	
	/*
	 * Toxicity of soil
	 * the soil quality determines the amount of poisonous chemicals in the ground.
	 * A value of 0 means that plants and animals cannot grow outside of arcologies.
	 * 
	 * Reducing soil quality will reduce the ability of the planets ecosphere to regenerate
	 * At the same time, there will be species dying, and the amount of food and grown consumer products will
	 * decline.
	 */
	private double soilquality;
	
	/*
	 * Toxicity of the atmosphere
	 * An atmosphere value of 0 means that humans cannot breathe the atmosphere and will die without
	 * breathing equipment. 
	 * All non-AB hardened habitats cannot be lived in.
	 */
	private double atmosphere;
	
	/*
	 * Deformation and aberration of the planet.
	 * Represents the destruction of natural habitats and
	 * nice places to visit.
	 * A value of 0 means there are no natural habitats left.
	 * There are no more animals and plants to discover.
	 * 
	 * Reducing naturalness also decreases the number of species left to discover
	 * as well as the chance to find one hat hasn't been discovered already
	 */
	private double naturalness;
	
	/*
	 *Influences of the Weather 
	 */
	private EnvironmentInfluence environment;
	
	/*
	 *Undiscovered species 
	 */
	private Nature nature;

	public double getForestation() {
		return forestation;
	}

	public double getWaterquality() {
		return waterquality;
	}

	public double getSoilquality() {
		return soilquality;
	}

	public double getAtmosphere() {
		return atmosphere;
	}

	public double getNaturalness() {
		return naturalness;
	}

	public EnvironmentInfluence getEnvironment() {
		return environment;
	}

	public Nature getNature() {
		return nature;
	}

	public void setForestation(double forestation) {
		this.forestation = forestation;
	}

	public void setWaterquality(double waterquality) {
		this.waterquality = waterquality;
	}

	public void setSoilquality(double soilquality) {
		this.soilquality = soilquality;
	}

	public void setAtmosphere(double atmosphere) {
		this.atmosphere = atmosphere;
	}

	public void setNaturalness(double naturalness) {
		this.naturalness = naturalness;
	}

	public void setEnvironment(EnvironmentInfluence environment) {
		this.environment = environment;
	}

	public void setNature(Nature nature) {
		this.nature = nature;
	}

	public PlanetClassProperties getPlanetClassProperties() {
		return planetClassProperties;
	}

	public double getGravity() {
		return gravity;
	}

	public void setPlanetClassProperties(PlanetClassProperties planetClassProperties) {
		this.planetClassProperties = planetClassProperties;
	}

	public void setGravity(double gravity) {
		this.gravity = gravity;
	}

}
