package com.egorov.homeworks.homework04;

import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        printMessage("Enter your number: ");
        int number = scan();
        printMessage(check(number));


    }


    private static String check(int number) {
        int sum = 0;
        int result = number;
        while (number != 0) {
            sum = sum + factorial(number % 10);
            number = number / 10;
        }
        if (result == sum) {
            return "Number is Strong";
        } else
            return "Number is not Strong";
    }

    private static int scan() {

        Scanner scan = new Scanner(System.in);
        int number = 0;
        boolean isExit = false;


        while (!isExit) {
            isExit = true;
            if (!scan.hasNextInt()) {
                System.out.println("Это не целое число!");
                scan.next();
                isExit = false;
            } else {
                number = scan.nextInt();
                if (number <= 0) {
                    System.out.println("Вы ввели:" + number + "\nВведите положительное целое число:");
                    isExit = false;
                }
            }
        }
        return number;
    }

    private static int factorial(int number) {
        if (number == 1 || number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }


    private static void printMessage(String text) {
        System.out.println(text);

    }
}
