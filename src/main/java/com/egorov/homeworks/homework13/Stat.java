package com.egorov.homeworks.homework13;

import java.util.Arrays;

public class Stat<T extends Number> {
    private T[] data;

    public Stat(T[] data) {
        this.data = data;
    }

    public void printData() {
        System.out.println(Arrays.toString(data));
    }

    public double average() {
        double sum = 0;
        for (T dataArray : data) {
            sum += dataArray.doubleValue();
        }
        return sum / data.length;
    }


    public boolean isSameAverage(Stat<?> stat) {
        return average() == stat.average();
    }
}
