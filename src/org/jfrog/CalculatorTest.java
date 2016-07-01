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
        assertEquals(5.5, i);

        double j = c.calculate(2.5, '-', 3.14);
        assertEquals(-0.64, j);

        double k = c.calculate(2.5, '*', 3.14);
        assertEquals(7.85, k);

        double l = c.calculate(5.5, '/', 4);
        assertEquals(1.375, l);
    }

    public void testFibinacciSequence(){
        //1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 , 55 , 89 , 144

        int i = c.fibinacci(1);
        assertEquals(1, i);

        int j = c.fibinacci(2);
        assertEquals(1, j);

        int k = c.fibinacci(5);
        assertEquals(5, k);

        int l = c.fibinacci(8);
        assertEquals(21, l);

        int m = c.fibinacci(20);
        assertEquals(6765, m);
    }

}