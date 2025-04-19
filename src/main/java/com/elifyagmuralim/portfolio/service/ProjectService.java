package com.elifyagmuralim.portfolio.service;

import com.elifyagmuralim.portfolio.model.Project;
import com.elifyagmuralim.portfolio.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Optional<Project> getProjectById(Long id) {
        return projectRepository.findById(id);
    }

    public Project saveProject(Project portfolio) {
        return projectRepository.save(portfolio);
    }

    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }
}