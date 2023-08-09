package com.example.todomobileapplication.controller;

import com.example.todomobileapplication.model.Project;
import com.example.todomobileapplication.model.Todo;
import com.example.todomobileapplication.service.Service;
import com.example.todomobileapplication.service.TodoProjectImpl;
import com.example.todomobileapplication.service.TodoServiceImpl;

import java.util.List;

public class TodoController {

    private static final Service<Todo> projectService = new TodoServiceImpl();

    public void add(final Todo todo) {
        projectService.add(todo);
    }

    public void remove(final long id) {
        projectService.remove(id);
    }

    List<Todo> getAll() {
        return projectService.getAll();
    }
}
