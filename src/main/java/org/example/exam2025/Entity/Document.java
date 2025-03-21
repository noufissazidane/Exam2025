package org.example.exam2025.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    private Date dateCreate;

    // Getters et Setters
    public long getID(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public Date getDateCreate(){
        return dateCreate;
    }
    public void setID(long id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setDateCreate(Date dateCreate){
        this.dateCreate = dateCreate;
    }


}







