package org.jfrog;

import junit.framework.*;


/**
 * Created by aaronrhodes on 6/30/16.
 */
public class CalculatorTest extends TestCase {
    private Calculator c = new Calculator();

    public void testAdd() {
        double i = c.calculate(2, '+', 2);
        assertEquals(4.0, i);
    }

    public void testSubtract() {
        double i = c.calculate(2, '-', 2);
        assertEquals(0.0, i);
    }

    public void testMultiply() {
        double i = c.calculate(3, '*', 2);
        assertEquals(6.0, i);
    }

    public void testDivide() {
        double i = c.calculate(4, '/', 2);
        assertEquals(2.0, i);
    }

}