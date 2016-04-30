package io.michaelcarroll;

public class Calculator {

    Display display = new Display();

    public void updateNumberOnDisplay(double value){
        display.setCurrentNumberOnDisplay(value);
    }

    public double sum(double value1, double value2) {
        return value1 + value2;
    }


    public double subtract(double value1, double value2) {
        return value1 - value2;
    }

    public double multiply(double value1, double value2) {
        return value1 * value2;
    }


    public double divide(double value1, double value2) {
        return value1 / value2;
    }


    public double calculateSquareRootOfNumberOnDisplay(double value) {
        return Math.sqrt(value);
    }

    public double calculateTheSquareOfNumberOnDisplay(double value) {
        return value * value;
    }

    public double calculateInverseOfNumberOnDisplay(double value) {
        return 1 / value;
    }

    public double calculateVariableExponentiation(double value, double power) {
        return Math.pow(value, power);
    }

    public void clearNumberOnDisplay(){
       updateNumberOnDisplay(0);
    }

public void invertSignOfCurrentNumberOnDisplay(){
    double currentNumber = display.getCurrentNumberOnDisplay();
    updateNumberOnDisplay(currentNumber * -1);
   }




}


