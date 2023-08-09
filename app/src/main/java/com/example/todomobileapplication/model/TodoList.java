package com.example.todomobileapplication.model;

import java.util.List;
import java.util.stream.Collectors;

public class TodoList {

    private List<Todo> todoList;

    public void add(final Todo todo) {
        todoList.add(todo);
    }

    public void remove(final Long id) {
        todoList = todoList.stream().filter(todo -> todo.getId() != (id)).collect(Collectors.toList());
    }

    public List getAllList(final Long parentId) {
        if (parentId == null) {
            return todoList;
        }
        return  todoList.stream().filter(todo -> todo.getParentId().equals(parentId)).collect(Collectors.toList());
    }


}
