package com.example.todomobileapplication.model;

import java.util.List;
import java.util.stream.Collectors;

public class ProjectList {

    private List<Project> projectList;

    public void add(final Project project) {
        projectList.add(project);
    }

    public void remove(final Long id) {
        projectList = projectList.stream().filter(project -> project.getId() != (id)).collect(Collectors.toList());
    }

    public List<Project> getAllList() {
        return projectList;
    }
}
