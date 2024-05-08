package com.example.labtest2;

import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTest {

    @Test
    public void testArea() {
        Triangle triangle = new Triangle("Triangle", 3.0, 4.0, 5.0);
        double s = (3.0 + 4.0 + 5.0) / 2;
        double calc = Math.sqrt(s * (s - 3.0) * (s - 4.0) * (s - 5.0));
        assertEquals(calc, triangle.area(), 0.001);
    }

    @Test
    public void testPerimeter() {
        Triangle triangle = new Triangle("Triangle", 3.0, 4.0, 5.0);
        double calc = 3.0 + 4.0 + 5.0;
        assertEquals(calc, triangle.perimeter(), 0.001);
    }
}
