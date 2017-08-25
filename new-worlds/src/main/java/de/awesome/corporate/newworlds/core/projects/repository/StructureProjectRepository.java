package de.awesome.corporate.newworlds.core.projects.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.awesome.corporate.newworlds.core.projects.StructureProject;

@Repository
public interface StructureProjectRepository extends JpaRepository<StructureProject, String>{

	public StructureProject findByName(String name);
	
}
