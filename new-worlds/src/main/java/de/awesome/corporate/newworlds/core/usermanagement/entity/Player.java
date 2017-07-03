package de.awesome.corporate.newworlds.core.usermanagement.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
/**
 * Entity that represents an entity owning a corporation or state-like organization
 * @author Patrick Schmolke
 *
 */
public class Player {
	
	@Id
	@Column(name="uid")
	private String uid;
	
	@Column(name="useraccount")
	private String userAccount;
	
	@Column(name="playername")
	private String playername;
	
	@Column(name="associatedOrganizations")
	@OneToMany(mappedBy="owner")
	private Set<Organization> ownedOrganizations;
	
	@Column(name="balance")
	private double balance;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public Set<Organization> getOwnedOrganizations() {
		return ownedOrganizations;
	}

	public void setOwnedOrganizations(Set<Organization> ownedOrganizations) {
		this.ownedOrganizations = ownedOrganizations;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
