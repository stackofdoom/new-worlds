package de.awesome.corporate.newworlds.core.planets.entity;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import de.awesome.corporate.newworlds.core.planets.entity.enums.PlanetClass;

@Embeddable
public class PlanetClassProperties {

	//The part of the planet covered by water
	private double waterarea;
	//the part covered by land
	private double landarea;
	//the part of the land that is covered by mountains
	private double mountains;
	//class of the planet
	private PlanetClass planetClass;
	
}
