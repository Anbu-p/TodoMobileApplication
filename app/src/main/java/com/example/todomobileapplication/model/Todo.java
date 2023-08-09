package com.example.todomobileapplication.model;

public class Todo {
    private Long id;
    private String label;
    private Long parentId;
    private boolean checked;

    public Todo(final Long id, final String label, final Long parentId) {
        this.id = id;
        this.label = label;
        this.parentId = parentId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked() {
        this.checked = !this.checked ;
    }
}
