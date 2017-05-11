package de.awesome.corporate.newworlds.core.planets.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Id;

@Embeddable
public class PlanetClassProperties {

	@Id
	@Column(name="UID")
	private String uid;
	//The part of the planet covered by water
	private double waterarea;
	//the part covered by land
	private double landarea;
	//the part of the land that is covered by mountains
	private double mountains;
	//class of the planet
	@Embedded
	private PlanetClass planetClass;
	
}
