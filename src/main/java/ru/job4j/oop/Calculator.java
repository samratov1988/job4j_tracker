package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int z) {
        return sum(z) + multiply(z) + minus(z) + divide(z);
    }

    public static void main(String[] args) {
        int rslSum = Calculator.sum(10);
        System.out.println(rslSum);
        Calculator calculator = new Calculator();
        int rslMul = calculator.multiply(10);
        System.out.println(rslMul);
        int rslMin = minus(10);
        System.out.println(rslMin);
        int rslDiv = calculator.divide(10);
        System.out.println(rslDiv);
        int rslSumAll = calculator.sumAllOperation(10);
        System.out.println(rslSumAll);
    }
}
