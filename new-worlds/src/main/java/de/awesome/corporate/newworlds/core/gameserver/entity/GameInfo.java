package de.awesome.corporate.newworlds.core.gameserver.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
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

	@Id
	@Column(name="turn")
	private long turn;
	
	@Column(name="date")
	private LocalDateTime date;
	
	
}
