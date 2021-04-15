package com.egorov.homeworks.homework18;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("А роза упала на лапу Азора"));
    }

    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\s+", "");
        text = text.toLowerCase();
        char[] a = text.toCharArray();
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
