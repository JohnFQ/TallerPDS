package co.com.poli.pds.proyectos.service;

import java.util.List;

import co.com.poli.pds.proyectos.entity.Project;

public interface ProjectService {

	Project createProject(Project newProject);
		
	List<Project> viewProject();
}
