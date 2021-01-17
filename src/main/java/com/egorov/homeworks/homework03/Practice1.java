package com.egorov.homeworks.homework03;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        String text = "Enter the time in hours: ";
        print(text);
        double time = check();
        text = "You need to drink " + getLiters(time) + " liters of water";
        print(text);

    }


    private static int getLiters(double time) {
        time = time * 0.5;
        return (int) time;
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
