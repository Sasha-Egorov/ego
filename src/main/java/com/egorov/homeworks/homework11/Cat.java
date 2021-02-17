package com.egorov.homeworks.homework11;

import java.util.LinkedList;
import java.util.Queue;

public class Cat {

    Queue<Mouse> stomach = new LinkedList<>();
    Queue<Mouse> substance = new LinkedList<>();

    public void eat(Mouse mouse) {
        if (stomach.size() == 5) {
            System.out.println("Belly full of mice, so the cat didn't eat the mouse " + mouse.name);
        } else stomach.add(mouse);
    }

    public Mouse naturalWay() {
        return stomach.remove();
    }

    public void laxative() {
        substance.addAll(stomach);
        stomach.clear();

    }
}
