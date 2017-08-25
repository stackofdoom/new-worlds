package de.awesome.corporate.newworlds.admin.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.awesome.corporate.newworlds.core.projects.StructureProject;
import de.awesome.corporate.newworlds.core.projects.repository.StructureProjectRepository;

@Service
public class StructureProjectAdminService {
	
	@Autowired
	private StructureProjectRepository structureProjectRepository;

	public Set<StructureProject> getStructureProjects() {
		return new HashSet<StructureProject>(structureProjectRepository.findAll());
	}

}
