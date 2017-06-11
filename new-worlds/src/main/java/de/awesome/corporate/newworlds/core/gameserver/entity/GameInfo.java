package de.awesome.corporate.newworlds.core.gameserver.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity; 
import javax.persistence.Id;

/**
 * contains general information about the game, 
 * eg. turn, time and date when the turn was started, number of players active etc.
 * @author captainish
 *
 */
@Entity
public class GameInfo {

	@Column(name="name")
	private String name;
	
	@Id
	@Column(name="turn")
	private long turn;
	
	@Column(name="date")
	private LocalDateTime date;
	
	@Embedded
	private CalculationTime calculationTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getTurn() {
		return turn;
	}

	public void setTurn(long turn) {
		this.turn = turn;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public CalculationTime getCalculationTime() {
		return calculationTime;
	}

	public void setCalculationTime(CalculationTime calculationTime) {
		this.calculationTime = calculationTime;
	}
	
	
	
	
}
