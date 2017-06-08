/**
 * 
 */
package de.awesome.corporate.newworlds.core.planets.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import de.awesome.corporate.newworlds.core.planets.entity.enums.EDepositState;

/**
 * Represents a resource deposit on a stellar body. Deposits can be exploited to
 * reap benefit from the availability of that resource. Resources can be
 * blocked, so they get inaccessible, by enemy action or natural catastrophes.
 * Some Resources may even be "destroyed" by player action
 * 
 * @author captainish
 *
 */
@Entity
public class ResourceDeposit {

	@Id
	@Column(name="UID")
	private String uid;
	//State of the deposit, e.g. unexploited, exploited, blocked etc.
	private EDepositState depositState;
	//The current progress of expoitation
	@Embedded
	private ExploitationProgress exploitationProgress;
	//the deposits health value. if it reaches 0, its state is set to blocked.
	@Embedded
	private EntityHealth health;
	
	//The value this deposit brings
	@Embedded
	private DepositValue value;
	//The Name of the resource deposit
	private String name;
	//the resource it carries
	private String resource;
	
	public EDepositState getDepositState() {
		return depositState;
	}
	
	public ExploitationProgress getExploitationProgress() {
		return exploitationProgress;
	}
	
	public EntityHealth getHealth() {
		return health;
	}
	
	public DepositValue getValue() {
		return value;
	}
	
	public String getName() {
		return name;
	}
	
	public String getResource() {
		return resource;
	}
	
	public void setDepositState(EDepositState depositState) {
		this.depositState = depositState;
	}
	
	public void setExploitationProgress(ExploitationProgress exploitationProgress) {
		this.exploitationProgress = exploitationProgress;
	}
	
	public void setHealth(EntityHealth health) {
		this.health = health;
	}
	
	public void setValue(DepositValue value) {
		this.value = value;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setResource(String resource) {
		this.resource = resource;
		}
}
