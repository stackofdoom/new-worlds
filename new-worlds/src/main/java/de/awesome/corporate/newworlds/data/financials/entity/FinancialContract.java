package de.awesome.corporate.newworlds.data.financials.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import de.awesome.corporate.newworlds.data.financials.service.ContractTerminationType;

/**
 * A financial contract is any contract that binds the owner financially.
 * <p>The owner is the entity that the control. This can either mean that someone has a financial obligation to him,
 * but may also mean that he is using his financial power to influence other entities. </p>
 * <p>Only State-like etities can be on either end of a financial contract</p>
 * @author Patrick Schmolke
 *
 */
@Entity
public class FinancialContract {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="uid")
	private Long uid;
	
	@Column(name="ownerId")
	private String ownerId;
	
	@Column(name="PartnerId")
	private String partnerId;
	
	@Column(name="toalValue")
	private double value;
	
	@Column(name="totalInterest")
	private double totalInterest;
	
	@Column(name="duration")
	private long duration;
	
	/*
	 * true if the owner is a player
	 */
	@Column(name="playerowned")
	private boolean playerOwned;
	
	/*
	 * Only an active contract will generate interest.
	 */
	@Column(name="isActive")
	private boolean active;
	
	/*
	 * Only contracts with automatic interest may recalculate interest rates.
	 * Interest rates will depend on central interest rating.
	 */
	@Column(name="automaticInterest")
	private boolean automaticInterest;
	
	/*
	 * if automaticInterest is true, this field has the information of which calculator to use.
	 */
	@Column(name="terminationType")
	private ContractTerminationType terminationType;
	
	/*
	 * interval for new interest calculation.
	 * 
	 */
	@Column(name="reevaluationTime")
	private long reevaluationTime;
	
	/*
	 * Start of contract.  
	 */
	@Column(name="initiationTime")
	private long initiationTime;

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getTotalInterest() {
		return totalInterest;
	}

	public void setTotalInterest(double totalInterest) {
		this.totalInterest = totalInterest;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}


	public boolean isPlayerOwned() {
		return playerOwned;
	}

	public void setPlayerOwned(boolean playerOwned) {
		this.playerOwned = playerOwned;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isAutomaticInterest() {
		return automaticInterest;
	}

	public void setAutomaticInterest(boolean automaticInterest) {
		this.automaticInterest = automaticInterest;
	}

	public long getReevaluationTime() {
		return reevaluationTime;
	}

	public void setReevaluationTime(long reevaluationTime) {
		this.reevaluationTime = reevaluationTime;
	}

	public long getInitiationTime() {
		return initiationTime;
	}

	public void setInitiationTime(long initiationTime) {
		this.initiationTime = initiationTime;
	}

	public ContractTerminationType getTerminationType() {
		return terminationType;
	}

	public void setTerminationType(ContractTerminationType terminationType) {
		this.terminationType = terminationType;
	}

	@Override
	public String toString() {
		return "FinancialContract [uid=" + uid + ", ownerId=" + ownerId + ", partnerId=" + partnerId + ", value="
				+ value + ", totalInterest=" + totalInterest + ", duration=" + duration + ", playerOwned=" + playerOwned
				+ ", active=" + active + ", automaticInterest=" + automaticInterest + ", terminationType="
				+ terminationType + ", reevaluationTime=" + reevaluationTime + ", initiationTime=" + initiationTime
				+ "]";
	}

}
