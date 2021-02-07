package com.egorov.homeworks.homework9;

import lombok.Value;

import java.time.LocalDate;

@Value
public class Book {
    Author author;
    LocalDate issueDate;
    Genre genre;
    Long isbn;
}
