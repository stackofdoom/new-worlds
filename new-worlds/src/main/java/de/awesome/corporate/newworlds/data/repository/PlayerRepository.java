package de.awesome.corporate.newworlds.data.repository;

import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

@Component
public interface PlayerRepository extends Repository<PlayerRepository, String> {

}
