package org.jfrog;

import junit.framework.*;


/**
 * Created by aaronrhodes on 6/30/16.
 */
public class CalculatorTest extends TestCase {
    private Calculator c = new Calculator();

    public void testAdd() {
        int i = c.calculate(2, '+', 2);
        assertEquals(4, i);
    }

    public void testSubtract() {
        int i = c.calculate(2, '-', 2);
        assertEquals(0, i);
    }

    public void testMultiply() {
        int i = c.calculate(3, '*', 2);
        assertEquals(6, i);
    }

    public void testMultiply2() {
        int i = c.calculate(3, 'x', 2);
        assertEquals(6, i);
    }

    public void testDivide() {
        int i = c.calculate(4, '/', 2);
        assertEquals(2, i);
    }

    public void testDivide2() {
        int i = c.calculate(4, '÷', 1);
        assertEquals(4, i);
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
        int i = c.calculate("42", '+', "8");
        assertEquals(50, i);
    }

    public void testNegatives() {
        int i = c.calculate(2, '+', -4);
        assertEquals(-2, i);

        int j = c.calculate(-2, '-', -4);
        assertEquals(2, i);

        int k = c.calculate(-2, '*', 4);
        assertEquals(-8, i);

        int l = c.calculate(-12, '/', 4);
        assertEquals(-3, i);
    }

    public void testDoubles() {
        double i = c.calculate(2.5, '+', 3.14);
        assertEquals(i, 5.64);

        double j = c.calculate(2.5, '-', 3.14);
        assertEquals(i, -0.64);

        double k = c.calculate(2.5, '*', 3.14);
        assertEquals(i, 7.85);

        double l = c.calculate(5.5, '/', 4);
        assertEquals(i, 1.375);
    }

}