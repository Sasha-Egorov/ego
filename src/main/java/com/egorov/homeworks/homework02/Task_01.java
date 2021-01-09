package com.egorov.homeworks.homework02;
import java.util.*;

public class Task_01 {
    public static void main(String[] args) {
        System.out.println("Enter a: ");
        int a = check();
        System.out.println("Enter b: ");
        int b = check();
        double c=log(a,b);
        System.out.println("log = " +c);
    }
    public static double log(int a,int b){
        double c=Math.log(b)/Math.log(a);
        return c;
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
