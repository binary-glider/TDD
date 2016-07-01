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

    public void testdoubleStrings() {
        double i = c.calculate("42", '+', "8");
        assertEquals(50.0, i);
    }

    public void testNegatives() {
        double i = c.calculate(2, '+', -4);
        assertEquals(-2.0, i);

        double j = c.calculate(-2, '-', -4);
        assertEquals(2.0, j);

        double k = c.calculate(-2, '*', 4);
        assertEquals(-8.0, k);

        double l = c.calculate(-12, '/', 4);
        assertEquals(-3.0, l);
    }

    public void testDoubles() {
        double i = c.calculate(2.5, '+', 3.0);
        assertEquals(i, 5.5);

        double j = c.calculate(2.5, '-', 3.14);
        assertEquals(j, -0.64);

        double k = c.calculate(2.5, '*', 3.14);
        assertEquals(k, 7.85);

        double l = c.calculate(5.5, '/', 4);
        assertEquals(l, 1.375);
    }

}