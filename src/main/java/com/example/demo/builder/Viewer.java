package com.example.demo.builder;

import com.example.demo.model.ViewerType;

public interface Viewer<T> {
    ViewerType getType();
    void view(T object);
}
