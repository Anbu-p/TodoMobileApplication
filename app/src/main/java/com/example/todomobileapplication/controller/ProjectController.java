package com.example.todomobileapplication.controller;

import com.example.todomobileapplication.model.Project;
import com.example.todomobileapplication.service.Service;
import com.example.todomobileapplication.service.TodoProjectImpl;

import java.util.List;

public class ProjectController {

    private static final Service<Project> projectService = new TodoProjectImpl();

    public void add(final Project project){
        projectService.add(project);
    }

    public void remove(final long id) {
        projectService.remove(id);
    }

    List<Project> getAll() {
        return projectService.getAll();
    }
}
