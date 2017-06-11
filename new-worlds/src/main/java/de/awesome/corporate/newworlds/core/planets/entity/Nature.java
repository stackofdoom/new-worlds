package de.awesome.corporate.newworlds.core.planets.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Nature {
	
	/*
	 * Undiscovered species maybe useful or not,
	 * But will provide some kind of bonus in every case.
	 * 
	 * Discovery of species increases scientific prowess and happiness in non-religious population
	 */
	
	//yet undiscovered species
	private int microbials;
	private int plants;
	private int fungae;
	private int terrestrics;
	private int aereal;
	private int aquatic;
	
	/*
	 * chance for an animal to have further "uses"
	 */
	private double chanceAnimal;
	
	/*
	 * chance for microbes to be useful
	 */
	private double chanceMicrobial;
	
	/*
	 * chance for fungae to be useful
	 */
	private double chanceFungae;
	
	/*
	 * chance for a plant to be useful
	 */
	private double chancePlant;

	public int getMicrobials() {
		return microbials;
	}

	public int getPlants() {
		return plants;
	}

	public int getFungae() {
		return fungae;
	}

	public int getTerrestrics() {
		return terrestrics;
	}

	public int getAereal() {
		return aereal;
	}

	public int getAquatic() {
		return aquatic;
	}

	public double getChanceAnimal() {
		return chanceAnimal;
	}

	public double getChanceMicrobial() {
		return chanceMicrobial;
	}

	public double getChanceFungae() {
		return chanceFungae;
	}

	public double getChancePlant() {
		return chancePlant;
	}

	public void setMicrobials(int microbials) {
		this.microbials = microbials;
	}

	public void setPlants(int plants) {
		this.plants = plants;
	}

	public void setFungae(int fungae) {
		this.fungae = fungae;
	}

	public void setTerrestrics(int terrestrics) {
		this.terrestrics = terrestrics;
	}

	public void setAereal(int aereal) {
		this.aereal = aereal;
	}

	public void setAquatic(int aquatic) {
		this.aquatic = aquatic;
	}

	public void setChanceAnimal(double chanceAnimal) {
		this.chanceAnimal = chanceAnimal;
	}

	public void setChanceMicrobial(double chanceMicrobial) {
		this.chanceMicrobial = chanceMicrobial;
	}

	public void setChanceFungae(double chanceFungae) {
		this.chanceFungae = chanceFungae;
	}

	public void setChancePlant(double chancePlant) {
		this.chancePlant = chancePlant;
	}
	
}
