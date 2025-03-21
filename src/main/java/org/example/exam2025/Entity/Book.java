package org.example.exam2025.Entity;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Book extends Document {
    private String author;
    private String isbn;
    private Date datePublication;

    // Getters et Setters
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public Date getDatePublication() {
        return datePublication;
    }
    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

}