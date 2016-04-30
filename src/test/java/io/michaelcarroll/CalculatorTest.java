package io.michaelcarroll;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void sumTest() {
        Calculator calculator = new Calculator();
        double expectedSum = 4.2;
        double actualSum = calculator.sum(2.1, 2.1);
        assertEquals("The expected value should be 4", expectedSum, actualSum, Math.ulp(0));

    }

    @Test
    public void subtractTest() {
        Calculator calculator = new Calculator();
        double expectedSum = 6;
        double actualSum = calculator.subtract(10, 4);
        assertEquals("The expected value should be 6", expectedSum, actualSum, Math.ulp(0));
    }

    @Test
    public void multiplyTest() {
        Calculator calculator = new Calculator();
        double expectedSum = 25;
        double actualSum = calculator.multiply(5, 5);
        assertEquals("The expected value should be 25", expectedSum, actualSum, Math.ulp(0));
    }

    @Test
    public void divideTest() {
        Calculator calculator = new Calculator();
        double expectedSum = 4;
        double actualSum = calculator.divide(24, 6);
        assertEquals("The expected value should be 4", expectedSum, actualSum, Math.ulp(0));
    }

    @Test
    public void squareRootCalculationTest() {
        Calculator calculator = new Calculator();
        double expectedValue = 5;
        double actualValue = calculator.calculateSquareRootOfNumberOnDisplay(25);
        assertEquals("The expected value should be 5", expectedValue, actualValue, Math.ulp(0));
    }

    @Test
    public void squareOfNumberOnDisplayTest() {
        Calculator calculator = new Calculator();
        double expectedValue = 25;
        double actualValue = calculator.calculateTheSquareOfNumberOnDisplay(5);
        assertEquals("The expected value should be 25", expectedValue, actualValue, Math.ulp(0));
    }

@Test
    public void calculateInverseOfNumberOnDisplay(){
    Calculator calculator = new Calculator();
    double expectedValue = 0.1;
    double actualValue = calculator.calculateInverseOfNumberOnDisplay(10);
    assertEquals("The expected value should be 0.1", expectedValue, actualValue, Math.ulp(0));

}
    @Test
    public void calculateVariableExponentiation(){
        Calculator calculator = new Calculator();
        double expectedValue = 32;
        double actualValue = calculator.calculateVariableExponentiation(2, 5);
        assertEquals("The expected value should 32", expectedValue, actualValue, Math.ulp(0));
    }

@Test
    public void clearCurrentNumberonDisplayTest(){
    Calculator calculator = new Calculator();
    Display display = new Display();
    display.setCurrentNumberOnDisplay(25);
    double expectedValue = 0;
    calculator.clearNumberOnDisplay();
    double actualValue = display.getCurrentNumberOnDisplay();
    assertEquals("The expected value should be 0", expectedValue, actualValue, Math.ulp(0));

}
    @Test
    public void invertSignOfCurrentNumberOnDisplayTest(){
        Calculator calculator = new Calculator();
        Display display = new Display();
        display.setCurrentNumberOnDisplay(25);
        double expectedValue = -25;
        calculator.invertSignOfCurrentNumberOnDisplay();
        double actualValue = display.getCurrentNumberOnDisplay();
        assertEquals("The expected value should be -25",expectedValue, actualValue, Math.ulp(0));
    }



}
