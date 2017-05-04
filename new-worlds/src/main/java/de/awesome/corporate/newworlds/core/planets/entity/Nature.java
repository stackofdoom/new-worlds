package de.awesome.corporate.newworlds.core.planets.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Nature {
	
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
	
}
