package de.awesome.corporate.newworlds.core.usermanagement.controller.rest;

public class PlayerRegistrationOrganisationSetupBody {

	private String organizationName;
	private String specialization;
	private int numberOfCapsules;
	private int industry;
	private int population;
	private int crops;
	private int cattle;
	private String playerid;

	public String getOrganizationName() {
		return organizationName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public int getNumberOfCapsules() {
		return numberOfCapsules;
	}

	public int getIndustry() {
		return industry;
	}

	public int getPopulation() {
		return population;
	}

	public int getCrops() {
		return crops;
	}

	public int getCattle() {
		return cattle;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public void setNumberOfCapsules(int numberOfCapsules) {
		this.numberOfCapsules = numberOfCapsules;
	}

	public void setIndustry(int industry) {
		this.industry = industry;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public void setCrops(int crops) {
		this.crops = crops;
	}

	public void setCattle(int cattle) {
		this.cattle = cattle;
	}

	public String getPlayerid() {
		return playerid;
	}

	public void setPlayerid(String playerid) {
		this.playerid = playerid;
	}

}
