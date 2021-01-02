package com.egorov.lectures.lecture_01;

import java.util.*;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Enter size figures: ");
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        System.out.println("First figure:");
        for(int i=0; i<a;i++){
            for (int j=0; j<a;j++) {
                if(i==0 || i==a-1 || j==0 || j==a-1)
                    System.out.print("#");
                else
                    System.out.print(" ");
                System.out.print(" ");

            }
            System.out.println();

        }
        System.out.println("\nSecond figure:");
        for(int i=0; i<a;i++){
            for (int j=0; j<a;j++) {
                if(i==0 || i==a-1 || j==i )
                    System.out.print("#");
                else
                    System.out.print(" ");
                System.out.print(" ");

            }
            System.out.println();

        }
        System.out.println("\nThird  figure:");
        for(int i=0; i<a;i++){
            for (int j=0; j<a;j++) {
                if(i==0 || i==a-1 || j+i==a )
                    System.out.print("#");
                else
                    System.out.print(" ");
                System.out.print(" ");

            }
            System.out.println();

        }
    }
}