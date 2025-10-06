package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int a) {
        return a - x;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(15);
        System.out.println(result);
        Calculator calculator = new Calculator();
        result = calculator.multiply(15);
        System.out.println(result);
        result = Calculator.minus(15);
        System.out.println(result);
        result = calculator.divide(15);
        System.out.println(result);
        result = calculator.sumAllOperation(15);
        System.out.println(result);
    }
}