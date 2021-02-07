package com.egorov.homeworks.homework09;

import lombok.Value;

import java.time.LocalDate;

@Value
public class Author {
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
}
