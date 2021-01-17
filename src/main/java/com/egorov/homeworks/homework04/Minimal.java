package com.egorov.homeworks.homework04;

import java.util.Scanner;

public class Minimal {
    public static void main(String[] args) {
        printMessage("Enter the length of the array: ");
        int length = check();
        int array[] = fillArray(length);
        printArray(array);
        printMessage("\nMinimal of array: " + minimumOfArray(array));


    }


    private static int check() {

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

    private static int[] fillArray(int length) {
        int array[] = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    private static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void printMessage(String text) {
        System.out.println(text);

    }

    private static int minimumOfArray(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
