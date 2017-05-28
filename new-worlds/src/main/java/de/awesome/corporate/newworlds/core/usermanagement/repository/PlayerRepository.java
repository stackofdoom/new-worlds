package de.awesome.corporate.newworlds.core.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.awesome.corporate.newworlds.core.usermanagement.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String>{

}
