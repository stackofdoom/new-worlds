package de.awesome.corporate.newworlds.core.usermanagement.service;

import de.awesome.corporate.newworlds.data.entity.Player;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
	
	public Player registerPlayer(Player player){
		player.setUid(UUID.randomUUID().toString());
		//TODO: remove dummy register in service
		return player;
	}

}
