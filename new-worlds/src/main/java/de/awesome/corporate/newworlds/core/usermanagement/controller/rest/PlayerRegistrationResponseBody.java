package de.awesome.corporate.newworlds.core.usermanagement.controller.rest;

public class PlayerRegistrationResponseBody {

	private String playername;
	private String uuid;

	public String getPlayername() {
		return playername;
	}

	public String getUuid() {
		return uuid;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
