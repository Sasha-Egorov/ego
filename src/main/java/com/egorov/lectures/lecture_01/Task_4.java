package com.egorov.lectures.lecture_01;

import java.util.*;


public class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence");
        String s = scan.nextLine();

        char[] result = s.toCharArray();
        if (result[0]>=97 && result[0]<=122)
            result[0]-=32;
        for(int i=0;i<result.length-1;i++){


            if (result[i] == ' ' && result[i+1]>=97 && result[i+1]<=122)
                result[i+1]-=32;
            System.out.print(result[i]);
        }
    }
}
