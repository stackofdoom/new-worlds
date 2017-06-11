package de.awesome.corporate.newworlds.core.gameserver.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.awesome.corporate.newworlds.core.gameserver.entity.GameInfo;
import de.awesome.corporate.newworlds.core.gameserver.repository.GameInfoRepository;

@Service
public class GameTimerService {
	
	@Autowired
	private GameInfoRepository gameInfoRepository;
	private GameInfo gameinfo;
	private LocalDateTime time;
	
	public GameTimerService(){
		
	}
	
	public void startup(){
		gameinfo = gameInfoRepository.findByName("current");
		time = LocalDateTime.now();
	}
	
	public long getCurrentTurn(){
		return gameinfo.getTurn();
	}
}
