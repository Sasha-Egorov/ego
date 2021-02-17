package com.egorov.homeworks.homework11;

import java.util.*;

public class Cat {

    TreeSet<Mouse> stomach = new TreeSet<>(new Comparator<Mouse>() {
        @Override
        public int compare(Mouse o2, Mouse o1) {
            return o2.kcal - o1.kcal;
        }
    });


    public boolean eat(Mouse mouse) {
        if (stomach.size() == 5) {
            System.out.println("Belly full of mice, so the cat didn't eat the mouse " + mouse.name);
            return false;
        } else stomach.add(mouse);
        return true;
    }

    public boolean naturalWay() {

        return stomach.remove(stomach.first());
    }

    public HashSet<Mouse> laxative() {
        HashSet<Mouse> substance = new HashSet<>(stomach);
        stomach.clear();
        return substance;
    }
}
