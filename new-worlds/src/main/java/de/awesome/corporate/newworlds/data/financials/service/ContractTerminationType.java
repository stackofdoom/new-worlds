package de.awesome.corporate.newworlds.data.financials.service;

/**
 * Determines how a FinancialContract is terminated
 *
 */
public enum ContractTerminationType {
	//Contract is not terminated unless player has paid off the complete loan including the interest.
	//Cannot be paid off unless player has trade relations with the Terran Federation
	UNLIMITED_TERRATRADE,  
	//Contract is not terminated unless player has paid off the complete loan including the interest.
	UNLIMITED, 
	//Contract has a fixed length that cannot be paid off more than a fixed percentage per turn based on contract length
	FIXED,
	//Contract has a fixed length and can be paid off early, however interest will be calculated at the beginning of each cylce
	//If a player fails to pay it off, he has to pay another round of interest on what is left of his loan.
	AUTORENEW
}
