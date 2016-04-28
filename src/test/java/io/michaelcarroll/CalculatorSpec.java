package io.michaelcarroll;


import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorSpec {

    @Test
    public void sumTest(){
        Calculator calculator = new Calculator();
        int expectedSum = 4;
        int actualSum = calculator.sum(2,2);
        assertEquals("The expected value should be 4", expectedSum, actualSum);

    }

    @Test
    public void subtractTest(){
        Calculator calculator = new Calculator();
        int expectedSum = 6;
        int actualSum = calculator.subtract(10,4);
        assertEquals("The expected value should be 6", expectedSum, actualSum);
    }

    @Test
    public void multiplyTest(){
        Calculator calculator = new Calculator();
        int expectedSum = 25;
        int actualSum = calculator.multiply(5,5);
        assertEquals("The expected value should be 25", expectedSum, actualSum);
    }

    @Test
    public void divideTest(){
        Calculator calculator = new Calculator();
        int expectedSum = 4;
        int actualSum = calculator.divide(24, 6);
        assertEquals("The expected value should be 4", expectedSum, actualSum);
    }
}
