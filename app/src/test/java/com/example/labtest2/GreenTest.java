package com.example.labtest2;

import junit.framework.TestCase;

import org.junit.Test;

public class GreenTest extends TestCase {
    @Test
    public void testColorNames()
    {
        Green g = new Green();
        assertEquals( g.name, "Green");


    }

}