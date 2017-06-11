package de.awesome.corporate.newworlds.core.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.awesome.corporate.newworlds.core.usermanagement.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, String>{
	
	Player findByUserAccount(String useraccount);
	
}
