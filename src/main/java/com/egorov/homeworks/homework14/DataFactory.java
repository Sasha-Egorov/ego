package com.egorov.homeworks.homework14;

public class DataFactory {
    String name;

    public DataFactory(String name) {
        this.name = name;
    }

    public DataProviderImp createData(String name) {
        if (name.contains(".csv")){
            return new CsvDataProvider();
        } else {
            return new DataProvider();
        }
    }
}
