package de.awesome.corporate.newworlds.core.planets.entity;

import javax.persistence.Embeddable;

/**
 * 
 * @author captainish
 *
 */
@Embeddable
public class EnvironmentInfluence {

	//the chance of storms
	private double stormchance;
	//the maximum intensitof storms
	private double stormintensity;
	//the chance for rain
	private double rainchance;
	//the maximum intensity for rain
	private double rainintensity;
	
	private double averageTemperature;
	//highest temperature
	private double peaktemperature;
	//lowest temperature
	private double lowestTemperature;
	
	public double getStormchance() {
		return stormchance;
	}
	public double getStormintensity() {
		return stormintensity;
	}
	public double getRainchance() {
		return rainchance;
	}
	public double getRainintensity() {
		return rainintensity;
	}
	public double getAverageTemperature() {
		return averageTemperature;
	}
	public double getPeaktemperature() {
		return peaktemperature;
	}
	public double getLowestTemperature() {
		return lowestTemperature;
	}
	public void setStormchance(double stormchance) {
		this.stormchance = stormchance;
	}
	public void setStormintensity(double stormintensity) {
		this.stormintensity = stormintensity;
	}
	public void setRainchance(double rainchance) {
		this.rainchance = rainchance;
	}
	public void setRainintensity(double rainintensity) {
		this.rainintensity = rainintensity;
	}
	public void setAverageTemperature(double averageTemperature) {
		this.averageTemperature = averageTemperature;
	}
	public void setPeaktemperature(double peaktemperature) {
		this.peaktemperature = peaktemperature;
	}
	public void setLowestTemperature(double lowestTemperature) {
		this.lowestTemperature = lowestTemperature;
	}
	
	
	
}
