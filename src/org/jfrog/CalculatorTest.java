package org.jfrog;
import junit.framework.*;

public class CalculatorTest extends TestCase {
    private Calculator c = new Calculator();
    public void testAdd(){
        int i = c.calculate(2, '+', 2);
        assertEquals(i, 4);
    }
}