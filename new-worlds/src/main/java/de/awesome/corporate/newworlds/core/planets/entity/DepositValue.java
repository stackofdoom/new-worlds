/**
 * 
 */
package de.awesome.corporate.newworlds.core.planets.entity;

import javax.persistence.Embeddable;

/**
 * @author captainish
 *
 */
@Embeddable
public class DepositValue {
	
	private double currentValue;
	private double MaxValue;
	
	public double getCurrentValue() {
		return currentValue;
	}
	public double getMaxValue() {
		return MaxValue;
	}
	public void setCurrentValue(double currentValue) {
		this.currentValue = currentValue;
	}
	public void setMaxValue(double maxValue) {
		MaxValue = maxValue;
	}

}
