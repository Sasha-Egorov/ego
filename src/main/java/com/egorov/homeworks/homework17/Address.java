package com.egorov.homeworks.homework17;

import lombok.Data;

@Data
public class Address {
    String street;
    String suite;
    String city;
    int zipcode;
    Geo geo;
}
