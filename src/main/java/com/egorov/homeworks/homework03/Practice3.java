package com.egorov.homeworks.homework03;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        print("Enter year: ");
        int year = check();
        int century = centuryFromYear(year);
        String result = "In " + year + " there was " + century;
        print(result);
    }

    private static int centuryFromYear(int years) {
        int century = years / 100;
        if (years % 100 != 0) {
            century++;
        }
        return century;
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

    private static void print(String text) {
        System.out.println(text);

    }

}
