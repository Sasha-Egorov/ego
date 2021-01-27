package com.egorov.homeworks.homework06;

public class FractionMain {
    public static void main(String[] args) {
        FractionNumber num1 = new FractionNumber(1, 3);
        FractionNumber num2 = new FractionNumber(3, 9);

        System.out.println("Summa: " + num1.plus(num2));
        System.out.println("Subtraction: " + num1.minus(num2));
        System.out.println("Multiplication: " + num1.multiply(num2));
        System.out.println("Division: " + num1.divide(num2));

    }
}
