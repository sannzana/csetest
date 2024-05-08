package com.example.labtest2;

public class Color {
    protected String name;

    public Color(String name) {
        this.name = name;
    }

    public void showColor() {
        System.out.println("The color is: " + name);
    }
}