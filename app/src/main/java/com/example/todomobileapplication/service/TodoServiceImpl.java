package com.example.todomobileapplication.service;

import com.example.todomobileapplication.model.Todo;

import java.util.List;
import java.util.stream.Collectors;

public class TodoServiceImpl implements Service<Todo> {

    private List<Todo> todoList;

    @Override
    public void add(final Todo todo) {
        todoList.add(todo);
    }

    @Override
    public void remove(final long id) {
        todoList = todoList.stream().filter(todo -> todo.getId() != (id)).collect(Collectors.toList());
    }

    @Override
    public List<Todo> getAll() {
        return todoList;
    }
}
