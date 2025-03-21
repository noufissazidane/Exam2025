package org.example.exam2025.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "document_id", referencedColumnName = "id")
    private Document document;
    private Date dateBorrow;
    private Date returnDate;

    // Getters et Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Document getDocument() {
        return document;
    }
    public void setDocument(Document document) {
        this.document = document;
    }
    public Date getDateBorrow() {
        return dateBorrow;
    }

    public void setDateBorrow(Date dateBorrow) {
        this.dateBorrow = dateBorrow;
    }
    public Date getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;

    }


}