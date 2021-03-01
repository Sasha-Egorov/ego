package com.egorov.homeworks.homework14;

import java.io.*;
import java.util.ArrayList;

public class DataProvider implements DataProviderImp {


    public ArrayList<Person> provide(String fileName) {
        ArrayList<Person> people = new ArrayList<>();

        try (ObjectInputStream obj = new ObjectInputStream(new FileInputStream(fileName))) {
            Object o = obj.readObject();
            people = (ArrayList<Person>) o;

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return people;
    }
}


