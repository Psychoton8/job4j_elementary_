package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumMinusAndDivide(double first, double second) {
        return minus(first, second) + divide(first, second);
    }

    public static double sumSumAndMultiplyAndMinusAndDivide(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + minus(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Result is: " + sumAndMultiply(10, 20));
        System.out.println("Sum of everything is: " + sumSumAndMultiplyAndMinusAndDivide(10, 10));
    }
}
