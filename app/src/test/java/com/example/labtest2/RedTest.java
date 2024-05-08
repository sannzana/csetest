package com.example.labtest2;

import junit.framework.TestCase;

import org.junit.Test;

public class RedTest extends TestCase {
    @Test
    public void testColorNames() {
        Red red = new Red();


        assertEquals( red.name, "Red");

    }

}