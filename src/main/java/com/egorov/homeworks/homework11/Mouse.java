package com.egorov.homeworks.homework11;

import java.util.Objects;

public class Mouse {
    String name;
    int kcal;

    public Mouse(String name, int kcal) {
        this.name = name;
        this.kcal = kcal;
    }

    @Override
    public String toString() {
        return "Mouse name='" + name + ", kcal=" + kcal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mouse mouse = (Mouse) o;
        return kcal == mouse.kcal && Objects.equals(name, mouse.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, kcal);
    }
}
