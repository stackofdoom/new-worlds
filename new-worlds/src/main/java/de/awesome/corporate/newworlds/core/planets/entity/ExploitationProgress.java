package de.awesome.corporate.newworlds.core.planets.entity;

import javax.persistence.Embeddable;

@Embeddable
public class ExploitationProgress {
	private long progressNecessary;
	private long progressCurrent;
	
	public ExploitationProgress(){
		//Empty default constructor
	}

	public long getProgressNecessary() {
		return progressNecessary;
	}

	public long getProgressCurrent() {
		return progressCurrent;
	}

	public void setProgressNecessary(long progressNecessary) {
		this.progressNecessary = progressNecessary;
	}

	public void setProgressCurrent(long progressCurrent) {
		this.progressCurrent = progressCurrent;
	}
	
	public boolean isFinished(){
		return (progressCurrent >= progressNecessary ? true : false);
	}
}
