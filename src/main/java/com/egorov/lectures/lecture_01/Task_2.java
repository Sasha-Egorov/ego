package com.egorov.lectures.lecture_01;

import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter HumanYears: ");
        int humanYears=scan.nextInt();
        int catYears=0;
        int dogYears=0;
        switch (humanYears) {
            case 1:
                catYears=15;
                dogYears=15;
                break;
            case 2:
                catYears=24;
                dogYears=24;
            default:
                catYears=(humanYears-2)*4 +24;
                dogYears=(humanYears-2)*5 +24;
                break;
        }

        System.out.println("Cat years is " +catYears);
        System.out.println("Dog years is " +dogYears);
    }
}

