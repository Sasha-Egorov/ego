package com.egorov.homeworks.homework14;

import lombok.Builder;

import java.io.Serializable;

@Builder
public class Person implements Serializable {
    String name;
    String surname;
    int age;
    int height;
    int weight;
    String email;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getEmail() {
        return email;
    }
    public String getDomain() {
        String[] parts = this.email.split("@");
        return parts[1];
    }

    public Person(String name, String surname, int age, int height, int weight, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                " surname='" + surname + '\'' +
                " age=" + age +
                " height=" + height +
                " weight=" + weight +
                " email='" + email + '\'' +
                '}';
    }
}
