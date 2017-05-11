package de.awesome.corporate.newworlds.core.planets.entity;

/**
 * The state of the deposit. Only for non-living resources.
 * 
 * @author captainish
 *
 */
public enum EDepositState {
    // Resource has been exploited and is available on the local market
	EXPLOITED,
    // Resource has been discovered, but hasnt been exploited yet.
	UNEXPLOITED,
    // Resource has been generated, but not yet discovered
	UNDISCOVERED,
    // Resource has been previously exploited, but somehow been blocked from
    // access and needs unblocking before continued exploitation
	BLOCKED,
    // By some means, this resource has been permanently destroyed (or is
    // depleted)
	DESTROYED
}
