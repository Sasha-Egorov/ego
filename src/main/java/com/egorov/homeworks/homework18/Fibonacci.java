package com.egorov.homeworks.homework18;

import static java.lang.System.currentTimeMillis;

public class Fibonacci {
    public static void main(String[] args) {
        long start = currentTimeMillis();
        System.out.println(recursivelyFibonacci(55));
        long end = currentTimeMillis();
        System.out.println("Time: " + (end-start));

        start = currentTimeMillis();
        System.out.println(iterativelyFibonacci(55));
        end = currentTimeMillis();
        System.out.println("Time: " + (end-start));
//      Максимальное значние получилось вычислить равно 55 вызовам, что позволила машина

    }
    public static long iterativelyFibonacci(int n){
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        long previous = -1;
        long result = 1;

        for (int i = 0; i <= n; i++) {

            long sum = result + previous;
            previous = result;
            result = sum;
        }

        return result;

    }



    public static long recursivelyFibonacci(int n) {
        if(n == 0)
            return 0;
        else if(n == 1 || n == 2)
            return 1;
        else
            return recursivelyFibonacci(n - 1) + recursivelyFibonacci(n - 2);
    }
}
