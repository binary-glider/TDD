package org.jfrog;

import junit.framework.*;


/**
 * Created by aaronrhodes on 6/30/16.
 */
public class CalculatorTest extends TestCase {
    private Calculator c = new Calculator();

    public void testAdd(){
        int i = c.calculate(2, "+", 2);
        assertEquals(i, 4);
    }

    public void testSubtract(){
        int i = c.calculate(2, "-", 2);
        assertEquals(i, 0);
    }
}