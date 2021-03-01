package com.egorov.homeworks.homework14;


import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;
import java.util.ArrayList;

public class CsvDataProvider implements DataProviderImp {
    DataMapper dataMapper;


    public ArrayList<Person> provide(String nameFile) {
        ArrayList<Person> people = new ArrayList<>();

        try (FileReader fileReader = new FileReader(nameFile);
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


