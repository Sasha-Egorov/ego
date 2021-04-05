package com.egorov.homeworks.homework18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.System.currentTimeMillis;

public class Collections {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        LinkedList<Integer> linkedList = new LinkedList();
        TreeSet<Integer> treeSet = new TreeSet<>();
        HashSet<Integer> hashSet = new HashSet<>();

        System.out.println("Create Collections");
        System.out.println("ArrayList: " + generate(arrayList) + " milliseconds");
        System.out.println("LinkedList: " + generate(linkedList) + " milliseconds");
        System.out.println("TreeSet: " + generate(treeSet) + " milliseconds");
        System.out.println("HashSet: " + generate(hashSet) + " milliseconds");

        System.out.println("\n \nDelete first elements of collections");
        System.out.println("ArrayList: " + delete(arrayList, "first") + " milliseconds");
        System.out.println("LinkedList: " + delete(linkedList, "first") + " milliseconds");
        System.out.println("TreeSet: " + delete(treeSet, "first") + " milliseconds");
        System.out.println("HashSet: " + delete(hashSet, "first") + " milliseconds");

        System.out.println("\n \nAdd first elements of collections");
        System.out.println("ArrayList: " + add(arrayList, "first") + " milliseconds");
        System.out.println("LinkedList: " + add(linkedList, "first") + " milliseconds");
        System.out.println("TreeSet: " + add(treeSet, "first") + " milliseconds");
        System.out.println("HashSet: " + add(hashSet, "first") + " milliseconds");

        System.out.println("\n \nDelete mid elements of collections");
        System.out.println("ArrayList: " + delete(arrayList, "mid") + " milliseconds");
        System.out.println("LinkedList: " + delete(linkedList, "mid") + " milliseconds");
        System.out.println("TreeSet: " + delete(treeSet, "mid") + " milliseconds");
        System.out.println("HashSet: " + delete(hashSet, "mid") + " milliseconds");

        System.out.println("\n \nAdd mid elements of collections");
        System.out.println("ArrayList: " + add(arrayList, "mid") + " milliseconds");
        System.out.println("LinkedList: " + add(linkedList, "mid") + " milliseconds");
        System.out.println("TreeSet: " + add(treeSet, "mid") + " milliseconds");
        System.out.println("HashSet: " + add(hashSet, "mid") + " milliseconds");

        System.out.println("\n \nDelete last elements of collections");
        System.out.println("ArrayList: " + delete(arrayList, "last") + " milliseconds");
        System.out.println("LinkedList: " + delete(linkedList, "last") + " milliseconds");
        System.out.println("TreeSet: " + delete(treeSet, "last") + " milliseconds");
        System.out.println("HashSet: " + delete(hashSet, "last") + " milliseconds");

        System.out.println("\n \nAdd last elements of collections");
        System.out.println("ArrayList: " + add(arrayList, "last") + " milliseconds");
        System.out.println("LinkedList: " + add(linkedList, "last") + " milliseconds");
        System.out.println("TreeSet: " + add(treeSet, "last") + " milliseconds");
        System.out.println("HashSet: " + add(hashSet, "last") + " milliseconds");


        System.out.println("\n \nFind first elements of collections");
        System.out.println("ArrayList: " + find(arrayList, "first") + " milliseconds");
        System.out.println("LinkedList: " + find(linkedList, "first") + " milliseconds");
        System.out.println("TreeSet: " + find(treeSet, "first") + " milliseconds");
        System.out.println("HashSet: " + find(hashSet, "first") + " milliseconds");

        System.out.println("\n \nFind mid elements of collections");
        System.out.println("ArrayList: " + find(arrayList, "mid") + " milliseconds");
        System.out.println("LinkedList: " + find(linkedList, "mid") + " milliseconds");
        System.out.println("TreeSet: " + find(treeSet, "mid") + " milliseconds");
        System.out.println("HashSet: " + find(hashSet, "mid") + " milliseconds");

        System.out.println("\n \nFind last elements of collections");
        System.out.println("ArrayList: " + find(arrayList, "last") + " milliseconds");
        System.out.println("LinkedList: " + find(linkedList, "last") + " milliseconds");
        System.out.println("TreeSet: " + find(treeSet, "last") + " milliseconds");
        System.out.println("HashSet: " + find(hashSet, "last") + " milliseconds");

    }
    public static long find(List<Integer> list, String position) {
        long start = currentTimeMillis();

            if (position.equals("last")) {
                list.contains(999990);
            } else if (position.equals("first")) {
                list.contains(50);
            } else if (position.equals("mid")) {
                list.contains(500000);
            } else {
                System.out.println("ERROR!");
            }
        long end = currentTimeMillis();
        return end - start;

    }

    public static long find(Set<Integer> list, String position) {
        long start = currentTimeMillis();
        if (position.equals("last")) {
            list.contains(999990);
        } else if (position.equals("first")) {
            list.contains(50);
        } else if (position.equals("mid")) {
            list.contains(500000);
        } else {
            System.out.println("ERROR!");
        }
        long end = currentTimeMillis();
        return end - start;

    }

    public static long add(List<Integer> list, String position) {
        long start = currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            if (position.equals("last")) {
                list.add(list.size(), list.size() + i);
            } else if (position.equals("first")) {
                list.add(i, i);
            } else if (position.equals("mid")) {
                list.add(list.size() / 2, i);
            } else {
                System.out.println("ERROR!");
                break;
            }
        }
        long end = currentTimeMillis();
        return end - start;

    }

    public static long add(Set<Integer> list, String position) {
        long start = currentTimeMillis();
        int size = list.size() / 2 + 500;
        for (int i = 0; i < 1000; i++) {
            if (position.equals("last")) {
                list.add(list.size() + 1);
            } else if (position.equals("first")) {
                list.add(i + 1);
            } else if (position.equals("mid")) {
                list.add(size + i);
            } else {
                System.out.println("ERROR!");
                break;
            }
        }
        long end = currentTimeMillis();
        return end - start;

    }

    public static long delete(Set<Integer> list, String position) {
        long start = currentTimeMillis();
        int size = list.size() / 2;
        for (int i = 0; i < 1000; i++) {
            if (position.equals("last")) {
                list.remove((list.size() - 1));
            } else if (position.equals("first")) {
                list.remove(i + 1);
            } else if (position.equals("mid")) {

                list.remove(size + i);
            } else {
                System.out.println("ERROR!");
                break;
            }
        }
        long end = currentTimeMillis();
        return end - start;

    }

    public static long delete(List<Integer> list, String position) {
        long start = currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            if (position.equals("last")) {
                list.remove(list.size() - 1);
            } else if (position.equals("first")) {
                list.remove(0);
            } else if (position.equals("mid")) {
                list.remove((list.size() - 1) / 2);
            } else {
                System.out.println("ERROR!");
                break;
            }
        }
        long end = currentTimeMillis();
        return end - start;
    }

    public static long generate(List<Integer> list) {
        long start = currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long end = currentTimeMillis();
        return end - start;
    }

    public static long generate(Set<Integer> list) {
        long start = currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long end = currentTimeMillis();
        return end - start;
    }
}
