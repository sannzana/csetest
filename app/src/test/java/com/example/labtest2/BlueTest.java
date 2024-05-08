package com.example.labtest2;

import junit.framework.TestCase;

import org.junit.Test;

public class BlueTest extends TestCase {
    @Test
    public void testColorNames() {
        Blue b = new Blue();


        assertEquals( b.name, "Blue");

    }


}