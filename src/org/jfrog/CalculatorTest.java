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

    public void testMultiply2() {
        double i = c.calculate(3, 'x', 2);
        assertEquals(6.0, i);
    }

    public void testDivide() {
        double i = c.calculate(4, '/', 2);
        assertEquals(2.0, i);
    }

    public void testDivide2() {
        double i = c.calculate(4, '÷', 1);
        assertEquals(4.0, i);
    }

    public void testDivideByZero() throws Exception {
        try {
            c.calculate(4, '/', 0);
            fail("division by zero should throw an exception!");
        } catch (RuntimeException expected) {
            // this is exactly what you expect so
            // just ignore it and let the test pass
        }
    }


    public void testIntStrings() {
        double i = c.calculate("4", '+', "2");
        assertEquals(6.0, i);
    }
}