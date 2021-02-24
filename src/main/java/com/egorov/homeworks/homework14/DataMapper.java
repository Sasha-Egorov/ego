package com.egorov.homeworks.homework14;


public class DataMapper {


    public static Person map(String text) {

        String[] words = text.split(",");
        return new Person(words[0], words[1], Integer.parseInt(words[2]), Integer.parseInt(words[3]), Integer.parseInt(words[4]), words[5]);

    }

}
