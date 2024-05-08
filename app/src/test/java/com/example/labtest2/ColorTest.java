package com.example.labtest2;

import junit.framework.TestCase;

import org.junit.Test;

public class ColorTest extends TestCase {

    @Test
    public void testColorNames() {
        Red red = new Red();
        Blue blue = new Blue();
        Green green = new Green();

        assertEquals("Red", red.name, "Color name should be Red");
        assertEquals("Blue", blue.name, "Color name should be Blue");
        assertEquals("Green", green.name, "Color name should be Green");
    }


}