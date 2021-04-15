package com.egorov.homeworks.homework18;


public class Factorial {

    public static void main(String[] args) {

        System.out.println(iterativelyFactorial(25));

        System.out.println(recursivelyFactorial(25));
//      Факториал числа 25 максимальное которое возможно вычислить с типом long
    }

    public static long iterativelyFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * iterativelyFactorial(n - 1);
    }

    public static long recursivelyFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }
}
