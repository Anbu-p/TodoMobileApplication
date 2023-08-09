package com.example.todomobileapplication.model;

public class Project {

    private Long id;
    private String Label;
    private boolean checked;

    public Project(final Long id, final String label, final boolean checked) {
        this.id = id;
        Label = label;
        this.checked = checked;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(final String label) {
        Label = label;
    }
}
