package de.awesome.corporate.newworlds.core.planets.city;

import javax.persistence.Embeddable;

@Embeddable
public class StructureModifier {
	
	private boolean disabled;
	
	private String message;
	
	private int timeLeft;

	public boolean isDisabled() {
		return disabled;
	}

	public String getMessage() {
		return message;
	}

	public int getTimeLeft() {
		return timeLeft;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setTimeLeft(int timeLeft) {
		this.timeLeft = timeLeft;
	}
	
	

}
