package com.egorov.homeworks.homework9;

import lombok.Value;

import java.time.LocalDate;

@Value
public class Author {
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
}
