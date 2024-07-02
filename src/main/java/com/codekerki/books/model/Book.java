package com.codekerki.books.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Book {
    
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String author;
    private boolean isAvailable;
    private String notes;

}
