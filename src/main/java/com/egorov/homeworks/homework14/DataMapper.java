package com.egorov.homeworks.homework14;


public class DataMapper {


    public static Person map(String text) {

        String[] words = text.split(",");
        return new Person.PersonBuilder()
                .name(words[0])
                .surname(words[1])
                .age(Integer.parseInt(words[2]))
                .height(Integer.parseInt(words[3]))
                .weight(Integer.parseInt(words[4]))
                .email(words[5])
                .build();


    }

}
