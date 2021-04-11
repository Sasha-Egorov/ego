package com.egorov.homeworks.homework18;

public class Test {
    public static void main(String[] args) {
        int a=0;
        int b=3;
        try{
            int c = a/b;
        }
        catch (Exception e){
            System.out.println("Exception");
        }
        finally {
            System.out.println("Finally");
        }
    }
}
