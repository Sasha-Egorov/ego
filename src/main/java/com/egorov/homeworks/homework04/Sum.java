package com.egorov.homeworks.homework04;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        printMessage("Enter the length of the array A: ");
        int lengthA = check();
        int arrayA[] = fillArray(lengthA);

        printMessage("Enter the length of the array B: ");
        int lengthB = check();
        int arrayB[] = fillArray(lengthB);

        printMessage("\nArray A: ");
        printArray(arrayA);
        printMessage("\nArray B: ");
        printArray(arrayB);

        printMessage("\nSum of arrays by index");
        printArray(sumOfArray(arrayA, arrayB));
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

    private static int[] sumOfArray(int arr1[], int arr2[]) {
        int length;
        if (arr1.length <= arr2.length) {
            length = arr2.length;
        } else {
            length = arr1.length;
        }
        int array[] = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i < arr1.length ? arr1[i] : 0) + (i < arr2.length ? arr2[i] : 0);
        }
        return array;
    }
}
