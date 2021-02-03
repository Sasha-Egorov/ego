package com.egorov.homeworks.homework08;

import java.util.Date;
import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;


    public Author(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = new Date(dateOfBirth.getTime());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName) && Objects.equals(dateOfBirth, author.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Author: " +
                "FirstName = '" + firstName + '\'' +
                ", LastName = '" + lastName + '\'' +
                ", Date Of Birth = " + dateOfBirth ;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {

        return new Date(this.dateOfBirth.getTime());
    }
}
