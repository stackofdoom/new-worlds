package de.awesome.corporate.newworlds.core.projects.types;

public enum EProjectType {
	//A One-Time Project that has a permanent benefit, but may also come at cost
	//needs industry or commerce
	PROJECT,
	//A buildable structure that provides some kind of benefit.
	//needs industry
	STRUCTURE,
	//A repeatable project that may find possible exploitations, information about the planet or the space around it.
	//Needs Research
	RESEARCH,
	//Once per deposit exloitation setup that incrases potential of resource contained
	//Needs Industry.
	EXPLOITATION,
	//A semi-permanent investment that has some benefits while it is pursued/funded, a balance must be found. If funds are withdrawn, diminishing effects may be observed
	//Does use Administration
	GOVERNMENT,
	//A one-time investment that unlocks access to other projects.
	//Needs Research
	TECHNOLOGY,
	//Allows to extend headquarters to accomodate more Administration, build up security forces, military and to build more Secrets.
	//Needs Industry and Commerce
	HEADQUARTERS,
	//Produces a transferable, sellable object of some sort that can be used for different purposes
	//Needs Industry
	PRODUCTION,
	//A Secret structure that cannot be conventionally spied upon by other players and may be difficult to spy upon with military intelligence
	SECRET
}
