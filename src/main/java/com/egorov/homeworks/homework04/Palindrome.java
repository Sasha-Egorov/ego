package com.egorov.homeworks.homework04;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        printMessage("Enter your sentence: ");
        String text = scan();
        printMessage(checkSentence(text));

    }

    private static String scan() {
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        return number;
    }

    private static void printMessage(String text) {
        System.out.println(text);

    }

    private static String checkSentence(String text) {
        text = text.toUpperCase(Locale.ROOT);
        text = text.replaceAll("\\s+", "");
        char[] array = text.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return "Sentence is not palindrome";
            }
        }
        return "Sentence is palindrome";
    }
}
