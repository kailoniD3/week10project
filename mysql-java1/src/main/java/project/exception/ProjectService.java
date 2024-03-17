package project.exception;

import java.util.List;
import java.util.NoSuchElementException;

import project.dao.ProjectDao;
import project.entity.Project;

public class ProjectService {
	
	private ProjectDao projectDao = new ProjectDao();
	
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}

 
public List<Project> fetchAllProjects() {
	return projectDao.fetchAllProjects();
}

public Project fetchProjectById(Integer projectId) {
	return projectDao.fetchProjectById(projectId).orElseThrow(() -> new NoSuchElementException("Project with project ID= " + projectId + " does not exist."));
}


public <Project> Project addProject(Project project) {
	// TODO Auto-generated method stub
	return null;
}
	}