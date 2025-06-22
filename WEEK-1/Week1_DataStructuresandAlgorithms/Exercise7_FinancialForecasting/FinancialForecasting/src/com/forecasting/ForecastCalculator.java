package com.forecasting;

public class ForecastCalculator {
    public static double futureValueRecursive(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return futureValueRecursive(presentValue, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double presentValue = 10000; 
        double rate = 0.1; 
        int years = 5;

        double futureValue = futureValueRecursive(presentValue, rate, years);
        System.out.printf("Future Value after %d years = ₹%.2f%n", years, futureValue);
    }
}
