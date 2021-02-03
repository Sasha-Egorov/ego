package com.egorov.homeworks.homework08;

import java.util.Date;
import java.util.Objects;

public class Book {
    private Author author;
    private Date issueDate;
    private Genre genre;
    private Long isbn;

    public Book(Author author, Date issueDate, Genre genre, Long isbn) {
        this.author = author;
        this.issueDate = new Date(issueDate.getTime());
        this.genre = genre;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(issueDate, book.issueDate) && genre == book.genre && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, issueDate, genre, isbn);
    }

    @Override
    public String toString() {
        return "Book: " + author +
                ", Issue Date = " + issueDate +
                ", Genre = " + genre.getName() +
                ", Isbn = " + isbn;
    }

    public Genre getGenre() {
        return genre;
    }

    public Author getAuthor() {
        return author;
    }

    public Date getIssueDate() {
        return  new Date(this.issueDate.getTime());
    }

    public Long getIsbn() {
        return isbn;
    }
}
