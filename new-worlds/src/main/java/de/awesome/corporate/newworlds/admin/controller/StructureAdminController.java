package de.awesome.corporate.newworlds.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Set;

import de.awesome.corporate.newworlds.admin.service.StructureProjectAdminService;
import de.awesome.corporate.newworlds.core.projects.StructureProject;

@RestController
@RequestMapping("/admin/structures")
public class StructureAdminController {

	@Autowired
	private StructureProjectAdminService structureProjectAdminService;
	
	@GetMapping
	public Set<StructureProject> getListOfProjects(){
		return structureProjectAdminService.getStructureProjects();
	}
	
	@PostMapping
	public void createNewProject(@RequestBody StructureProject structureProject){
		
	}
}
