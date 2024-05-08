package com.example.labtest2;

import junit.framework.TestCase;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareTest {

    @Test
    public void testArea() {
        Square square = new Square("Square", 4.0);
        double calc = 4.0 * 4.0;
        assertEquals(calc, square.area(), 0.001);
    }

    @Test
    public void testPerimeter() {
        Square square = new Square("Square", 4.0);
        double calc = 4 * 4.0;
        assertEquals(calc, square.perimeter(), 0.001);
    }
}

