package de.awesome.corporate.newworlds.core.planets.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Moon {
	
	@GeneratedValue
	@Id
	private long uid;

}
