package de.awesome.corporate.newworlds.core.projects.types;

import javax.persistence.Embeddable;

/**
 * Represents the progress a project has. Contains a finished value and a value
 * that contains current progress.
 * 
 * @author captainish
 *
 */
@Embeddable
public class Progress {

	private double currentProgress;
	private double maxProgress;

	public double getProgress() {
		return currentProgress;
	}

	public double getMaxProgress() {
		return maxProgress;
	}

	public void setCurrentProgress(double progress) {
		this.currentProgress = progress;
	}

	public void setMaxProgress(double finished) {
		this.maxProgress = finished;
	}

	/**
	 * sets new value for finished. 
	 * Progress is set so that its relative progress stays the same
	 * @param newfinishedValue
	 */
	public void setNewMaxProgressRelative(double newfinishedValue){
		double fact = newfinishedValue / maxProgress;
		maxProgress = newfinishedValue;
		currentProgress = currentProgress * fact;
	}
}
