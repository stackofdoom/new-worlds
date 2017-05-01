package de.awesome.corporate.newworlds.core.gameserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.awesome.corporate.newworlds.core.gameserver.repository.GameInfoRepository;

@Service
public class GameTimerService {
	
	@Autowired
	private GameInfoRepository gameInfoRepository;
	
	public GameTimerService(){
		
	}

	private long currentTurn;
	
	public long getCurrentTurn(){
		return currentTurn;
	}
	
}
