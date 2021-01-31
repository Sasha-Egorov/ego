package com.egorov.homeworks.homework08;

public enum Genre {
    Fantasy("Fantasy"),HORROR("Horror"),ROMANCE("Romance"),COOKBOOKS("Cookbooks"),FAIRY_TALE("Fairy tale");

    private String name;

    public String getName() {
        return name;
    }

    Genre(String name) {
        this.name = name;
    }
}
