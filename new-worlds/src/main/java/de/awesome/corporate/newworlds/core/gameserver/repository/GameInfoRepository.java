package de.awesome.corporate.newworlds.core.gameserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.awesome.corporate.newworlds.core.gameserver.entity.GameInfo;

public interface GameInfoRepository extends JpaRepository<GameInfo, Integer>{

	public GameInfo findByName(String current);

}
