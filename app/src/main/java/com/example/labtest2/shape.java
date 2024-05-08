package com.example.labtest2;


public abstract class shape {
    protected String name;

    public shape(String name) {
        this.name = name;
    }

    public abstract double area();
    public abstract double perimeter();
}
