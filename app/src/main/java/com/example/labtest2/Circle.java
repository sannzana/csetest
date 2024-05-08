package com.example.labtest2;

public class Circle extends shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        return  3.142*(radius)*(radius);
    }

    @Override
    public double perimeter() {
        return 2*3.1416*radius;
    }
}
