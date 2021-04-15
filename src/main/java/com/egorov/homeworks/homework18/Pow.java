package com.egorov.homeworks.homework18;

public class Pow {
    public static void main(String[] args) {
        System.out.println(iterativelyPow(2,31));
        System.out.println(recursivelyPow(2,31));

    }
    public static long iterativelyPow(int n, int m){
        long res = 1;
        for (int i = 0; i < m; i++) {
            res = res * n;
        }
        return res;

    }
    public static long recursivelyPow(int n, int m){

        if (m==0) return 1;

        return n * recursivelyPow(n, m - 1);
    }
}
