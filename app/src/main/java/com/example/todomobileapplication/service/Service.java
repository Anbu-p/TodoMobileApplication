package com.example.todomobileapplication.service;

public interface Service<T> {

    void add(final T type);

    void remove(final long id);

    T getAll();
}
