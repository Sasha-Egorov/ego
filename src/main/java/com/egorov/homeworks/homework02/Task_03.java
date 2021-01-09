package com.egorov.homeworks.homework02;

import java.util.Arrays;
import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        System.out.println("Enter a: ");
        int a = check();
        System.out.println("Enter b: ");
        int b = check();
        System.out.println("Enter c: ");
        int c = check();
        int[] array = new int[2];
        array=equation(a,b,c);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
    public static int[] equation (int a, int b, int c){
        int[] array = new int[2];
        double d = Math.sqrt(Math.pow(b,2)-4*a*c);
        array[0]=(int)(-1*b-d)/2*a;
        array[1]=(int)(-1*b+d)/2*a;
        return array;
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
                if (number == 0) {
                    System.out.println("Вы ввели:" + number + "\nВведите целое число не равное нулю.:");
                    isExit = false;
                }
            }
        }
        return number;
    }
}
