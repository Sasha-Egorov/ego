package com.egorov.homeworks.homework09;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Genre {

    Fantasy("Fantasy"), HORROR("Horror"), ROMANCE("Romance"), COOKBOOKS("Cookbooks"), FAIRY_TALE("Fairy tale");

    @Getter
    private final String name;
}
