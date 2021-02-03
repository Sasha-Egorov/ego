package com.egorov.homeworks.homework09;

import java.time.LocalDate;


public final class Author {

    private final String firstName;
    private final String lastName;
    private final LocalDate dateOfBirth;

    public Author(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth =  dateOfBirth;
    }

    public LocalDate getDateOfBirth() {

        return this.dateOfBirth;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Author)) return false;
        final Author other = (Author) o;
        final Object this$firstName = this.getFirstName();
        final Object other$firstName = other.getFirstName();
        if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) return false;
        final Object this$lastName = this.getLastName();
        final Object other$lastName = other.getLastName();
        if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
        final Object this$dateOfBirth = this.getDateOfBirth();
        final Object other$dateOfBirth = other.getDateOfBirth();
        if (this$dateOfBirth == null ? other$dateOfBirth != null : !this$dateOfBirth.equals(other$dateOfBirth))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $firstName = this.getFirstName();
        result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
        final Object $lastName = this.getLastName();
        result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
        final Object $dateOfBirth = this.getDateOfBirth();
        result = result * PRIME + ($dateOfBirth == null ? 43 : $dateOfBirth.hashCode());
        return result;
    }

    public String toString() {
        return "Author(firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", dateOfBirth=" + this.getDateOfBirth() + ")";
    }
}
