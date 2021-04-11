package com.egorov.homeworks.homework18;

public class Main {
    private static Object Integer;

    public static void main(String[] args) {
        MyTree<Integer> tr = new MyTree<>();

        tr.add(5);
        tr.add(4);
        tr.add(14);
        tr.add(24);
        tr.add(15);
        tr.add(16);
        tr.add(18);
        tr.add(9);
        tr.add(8);
        tr.add(1);
        tr.add(2);

//        System.out.println(tr.find(425));


        tr.delete(24);
//
//        tr.printDfs();// (опционально) обойти дерево в глубину
//        System.out.println();
//        tr.printBfs(); // (опционально) обойти дерево в ширину

        MyLinkedList<Integer> s = new MyLinkedList<>();
        s.add(123);
        s.add(1412);
        s.add(12);
        s.add(13);

        System.out.println(s.size());
        System.out.println(s.get(3));
        System.out.println(s.isEmpty());

        s.removeValue(123);
        System.out.println(s);


    }


}
