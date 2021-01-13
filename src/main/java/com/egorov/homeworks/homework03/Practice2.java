package com.egorov.homeworks.homework03;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        print("Enter your weight: ");
        double weight = check();
        print(" Enter your height: ");
        double height = check();
        print(bmi(weight, height));


    }

    private static String bmi(double weight, double height) {
        double result = weight / (height * height);
        if (result <= 18.5) {
            return "Underweight";
        } else if (result <= 25.0) {
            return "Normal";
        } else if (result <= 30.0) {
            return "Overweight";
        } else
            return "Obese";
    }

    private static void print(String text) {
        System.out.println(text);

    }

    private static double check() {

        Scanner scan = new Scanner(System.in);
        double number = 0;
        boolean isExit = false;


        while (!isExit) {
            isExit = true;
            if (!scan.hasNextDouble()) {
                System.out.println("Это не число!");
                scan.next();
                isExit = false;
            } else {
                number = scan.nextDouble();
                if (number < 0) {
                    System.out.println("Вы ввели:" + number + "\nВведите положительное число:");
                    isExit = false;
                }
            }
        }
        return number;
    }
}
