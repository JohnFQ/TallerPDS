package co.com.poli.pds.proyectos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.com.poli.pds.proyectos.entity.Project;
import co.com.poli.pds.proyectos.repository.ProjectRepository;

public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public Project createProject(Project newProject) {
		if(newProject != null && newProject.getId() != 0) {
			System.out.print("Ayuda con el LOMBOK");
		}
		return null;
	}

	@Override
	public List<Project> viewProject() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
