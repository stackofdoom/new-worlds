package de.awesome.corporate.newworlds.core.planets.city;

import java.util.List;

import javax.persistence.Entity;

import de.awesome.corporate.newworlds.core.types.AbstractNamedEntity;

@Entity
public class City extends AbstractNamedEntity{
	
	
	
	private List<Structure> structures;

}
