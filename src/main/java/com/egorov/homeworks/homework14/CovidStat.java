package com.egorov.homeworks.homework14;

import java.util.*;
import java.util.stream.Collectors;

public class CovidStat {
    ArrayList<Person> person;

    public CovidStat(ArrayList<Person> person) {
        this.person = person;
    }


    public String getMostPopularName() {
        Set<Map.Entry<String, Integer>> set = person.stream()
                .collect(Collectors.toMap(p->p.getName(), word -> 1, Integer::sum)).entrySet();

        int max = Collections
                .max(set, (a, b) -> Integer.compare(a.getValue(), b.getValue())).getValue();

        List<String> list = set.stream()
                .filter(entry -> entry.getValue() == max)
                .sorted(Comparator.comparing(String::valueOf))
                .map(Map.Entry::getKey).collect(Collectors.toList());

        return list.get(0);
    }

    public String getPopularSurname() {
        Set<Map.Entry<String, Integer>> set = person.stream()
                .collect(Collectors.toMap(p->p.getSurname(), word -> 1, Integer::sum)).entrySet();

        int max = Collections
                .max(set, (a, b) -> Integer.compare(a.getValue(), b.getValue())).getValue();

        List<String> list = set.stream()
                .filter(entry -> entry.getValue() == max)
                .sorted(Comparator.comparing(String::valueOf))
                .map(Map.Entry::getKey).collect(Collectors.toList());

        return list.get(0);
    }

    public String getPopularMailDomain() {
        Set<Map.Entry<String, Integer>> set = person.stream()
                .collect(Collectors.toMap(p->p.getDomain(), word -> 1, Integer::sum)).entrySet();

        int max = Collections
                .max(set, (a, b) -> Integer.compare(a.getValue(), b.getValue())).getValue();

        List<String> list = set.stream()
                .filter(entry -> entry.getValue() == max)
                .sorted(Comparator.comparing(String::valueOf))
                .map(Map.Entry::getKey).collect(Collectors.toList());

        return list.get(0);
    }




    public double getAverageAge() {
        return person.stream().mapToInt(Person::getAge).average().getAsDouble();
    }

    public double getAverageHeight() {
        return person.stream().mapToInt(Person::getHeight).average().getAsDouble();
    }

    public double getAverageWeight() {
        return person.stream().mapToInt(Person::getWeight).average().getAsDouble();
    }
}
