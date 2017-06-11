package de.awesome.corporate.newworlds.core.planets.entity;

import javax.persistence.Embeddable;

@Embeddable
public class PlanetState {

	/*
	 * Amount of radioactivity on this planet.
	 * The higher the more mutations occur on flora and fauna, food may become poisonous or needs to be treated before consumtion
	 * High amounts of radioactivity may result in high medical cost and infrastructure preparations for humans
	 * to be able to live on said planet.
	 * A value of 10000 means the planet is so irradiated, its practically dead.
	 */
	private double radioactivity;
	
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

	public double getRadioactivity(){
		return radioactivity;
	}
	
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
	
	public void setRadioactivity(double radioactivity){
		this.radioactivity = radioactivity;
	}
	
}
