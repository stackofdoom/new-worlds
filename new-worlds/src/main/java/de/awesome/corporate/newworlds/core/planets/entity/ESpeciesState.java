package de.awesome.corporate.newworlds.core.planets.entity;

/**
 * The state of the species.
 * @author captainish
 *
 */
public enum ESpeciesState {
	//The species has been generated but not discovered
	UNDISCOVERED,
	//The species has been discovered, but nothing has been done to profit from that
	DISCOVERED,
	//The species has been discovered and it's been studied.
	STUDIED,
	//The species has been domesticated to a degree. 
	DOMESTICATED,
	//Unless a species is native to a domain, it may never reach its full potential unless it gets adapted to its new domain.
	//A species may also be adapted if it is native, as genetic modification is available to push its profit margin
	ADAPTED,
	//Species has dwindling numbers and may become extinct
	ENDANGERED,
	//Species is extinct and cannot be revived
	EXTINCT,
	//Species is extinct, but has been mapped genetically
	MAPPED
	
}
