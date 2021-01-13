package com.egorov.homeworks.homework03;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        print("Enter yor age: ");
        int age = check();
        print(describeAge(age));


    }

    private static String describeAge(int age) {
        String result = "You're a(n) " + (age <= 12 ? "kid" : age <= 17 ? "teenager" : age <= 64 ? "adult" : "elderly");
        return result;
    }

    private static void print(String text) {
        System.out.println(text);

    }

    public static int check() {

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
}
