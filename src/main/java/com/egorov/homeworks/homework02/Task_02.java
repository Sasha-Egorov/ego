package com.egorov.homeworks.homework02;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        System.out.println("Enter a: ");
        int a = check();
        System.out.println("Enter b: ");
        int b = check();
        System.out.println("Enter c: ");
        int c = check();
        System.out.println("Triangle area is " +square(a,b,c));

    }
    public static double square(int a, int b, int c){
        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
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
