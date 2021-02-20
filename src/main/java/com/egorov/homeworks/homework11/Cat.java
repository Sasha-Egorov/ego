package com.egorov.homeworks.homework11;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;


public class Cat {
    PriorityBlockingQueue<Mouse> stomach = new PriorityBlockingQueue<>(5,idComparator);

    public static Comparator<Mouse> idComparator = new Comparator<Mouse>(){

        @Override
        public int compare(Mouse o1, Mouse o2) {
            System.out.println(o2.kcal - o1.kcal);
            return (o1.getKcal() - o2.getKcal());

        }
    };

    public boolean eat(Mouse mouse) {
        if (stomach.size() == 5) {
            System.out.println("Belly full of mice, so the cat didn't eat the mouse " + mouse.name);
            return false;

        } else stomach.add(mouse);
        return true;
    }

    public Mouse naturalWay() {

        return stomach.remove();
    }

    public HashSet<Mouse> laxative() {
        HashSet<Mouse> substance = new HashSet<>(stomach);
        stomach.clear();
        return substance;
    }
}
