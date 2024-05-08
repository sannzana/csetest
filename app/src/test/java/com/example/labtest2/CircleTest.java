package com.example.labtest2;

import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CircleTest {

    @Test
    public void testArea() {
        Circle circle = new Circle("Circle", 5.0);
        double calc = 3.1416 * 5.0 * 5.0;
        assertEquals( calc, circle.area(), 0.001);
    }

    @Test
    public void testPerimeter() {
        Circle circle = new Circle("Circle", 5.0);
        double calc = 2 * 3.1416 * 5.0;
        assertEquals(calc, circle.perimeter(), 0.001);
    }

}
