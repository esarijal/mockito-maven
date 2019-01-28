package com.mitrais.unittest;

public class DigitalCalculator implements ICalculatorInterface {
    @Override
    public int add(int first, int second) {
        return first + second;
    }

    @Override
    public int reduce(int number, int reducer) {
        return number - reducer;
    }

    @Override
    public int multiply(int first, int second) {
        return first * second;
    }

    @Override
    public double divide(int dividend, int divider) {
        if(divider == 0)
            throw new IllegalArgumentException("Cannot divide by zero");
        return (double) (dividend/divider);
    }
}
