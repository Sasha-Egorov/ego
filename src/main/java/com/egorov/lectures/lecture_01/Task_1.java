package com.egorov.lectures.lecture_01;
import java.util.*;
public class Task_1 {

        public static void main(String[] args) {
            System.out.println("\nTask A");
            int a=12;
            int b=4;
            int c;

            System.out.println("First number = "+a +"\nSecond number = " +b );



            c=b;
            b=a;
            a=c;
            System.out.println("First number = "+a +"\nSecond number = " +b );

            System.out.println("\nTask B");
            a=12;
            b=4;


            System.out.println("First number = "+a +"\nSecond number = " +b );
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("First number = "+a +"\nSecond number = " +b );

        }
    }



