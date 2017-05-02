package de.awesome.corporate.newworlds.data.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import de.awesome.corporate.newworlds.data.financials.entity.FinancialContract;

@Entity
/**
 * a state-like organization controlled by a player or an AI Player.
 * @author Patrick Schmolke
 *
 */
public class Organization {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="uid")
	private String uid;
	
	@Column(name="organizationName")
	private String organizationName;
	
	@Column(name="owner")
	private String owner;
	
	@Column(name="liquidAssets")
	private double liquidAssets;
	
	@OneToMany
	@Column(name="financialContracts")
	private List<FinancialContract> finContracts;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getLiquidAssets() {
		return liquidAssets;
	}

	public void setLiquidAssets(double liquidAssets) {
		this.liquidAssets = liquidAssets;
	}

	public List<FinancialContract> getFinContracts() {
		return finContracts;
	}

	public void setFinContracts(List<FinancialContract> finContracts) {
		this.finContracts = finContracts;
	}
	
}
