package com.mitrais.unittest;

public class StaticCalculator {
    public static int add(int first, int second){
        return first + second;
    }

    public static int reduce(int number, int reducer){
        return number - reducer;
    }

    public static int multiply(int first, int second){
        return first * second;
    }

    public static double divide(int dividend, int divisor){
        if(divisor == 0)
            throw new IllegalArgumentException("Cannot divide by zero (0)");
        return (double) dividend / (double) divisor;
    }
}
