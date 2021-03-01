package com.egorov.homeworks.homework14;

import java.io.*;
import java.util.ArrayList;

public class DataProvider {
    DataMapper dataMapper;


    public ArrayList<Person> provide() {
        ArrayList<Person> people = new ArrayList<>();

        try (FileReader fileReader = new FileReader("not.txt");
             BufferedReader reader = new BufferedReader(fileReader)) {
            String str;

            while ((str = reader.readLine()) != null) {

                people.add(dataMapper.map(str));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return people;
    }
}


