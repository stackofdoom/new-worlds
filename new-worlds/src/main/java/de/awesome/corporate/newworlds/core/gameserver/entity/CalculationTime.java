package de.awesome.corporate.newworlds.core.gameserver.entity;

import java.time.LocalDate;

import javax.persistence.Embeddable;

@Embeddable
public class CalculationTime {

	private LocalDate turnCalcStart;
	private LocalDate turnCalcEnd;
	
	public LocalDate getTurnCalcStart() {
		return turnCalcStart;
	}
	public LocalDate getTurnCalcEnd() {
		return turnCalcEnd;
	}
	public void setTurnCalcStart(LocalDate turnCalcStart) {
		this.turnCalcStart = turnCalcStart;
	}
	public void setTurnCalcEnd(LocalDate turnCalcEnd) {
		this.turnCalcEnd = turnCalcEnd;
	}
	
}
