package de.awesome.corporate.newworlds.core.usermanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserAccount {
	
	private String accountName;
	private String emailAddress;
	private String passwordHash;
	private String playerId;
	@Id
	private Long id;

	public String getAccountName() {
		return accountName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

}
