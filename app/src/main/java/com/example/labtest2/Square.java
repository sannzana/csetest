package com.example.labtest2;

public class Square extends shape {
    private double sideLength;

    public Square(String name, double sideLength) {
        super(name);
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }

    @Override
    public double perimeter() {
        return 4 * sideLength;
    }
}
