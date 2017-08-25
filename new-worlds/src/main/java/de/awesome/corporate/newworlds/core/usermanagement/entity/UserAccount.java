package de.awesome.corporate.newworlds.core.usermanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class UserAccount {
	
	@NotNull
	@Id
	private String accountName;
	@NotNull
	private String emailAddress;
	@NotNull
	private String passwordHash;
	@NotNull
	private String playerId;

	public String getAccountName() {
		return accountName;
	}
	
	@JsonIgnore
	public String getEmailAddress() {
		return emailAddress;
	}

	@JsonIgnore
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
