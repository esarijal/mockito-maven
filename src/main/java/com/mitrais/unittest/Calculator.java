package com.mitrais.unittest;

public class Calculator {
    private ICalculatorInterface calculator;

    public Calculator(ICalculatorInterface calculator) {
        this.calculator = calculator;
    }

    public int add(int first, int second){
        return calculator.add(first, second);
    }

    public int reduce(int number, int reducer){
        return calculator.reduce(number, reducer);
    }

    public int multiply(int first, int second){
        return calculator.multiply(first, second);
    }

    public double divide(int dividen, int divider){
        return calculator.divide(dividen, divider);
    }
}
