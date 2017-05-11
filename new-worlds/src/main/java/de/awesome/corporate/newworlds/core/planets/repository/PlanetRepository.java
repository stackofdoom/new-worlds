package de.awesome.corporate.newworlds.core.planets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.awesome.corporate.newworlds.core.planets.entity.Planet;

public interface PlanetRepository extends JpaRepository<Planet, String> {

}
