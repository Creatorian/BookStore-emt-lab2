package com.example.emt_lab.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Categories category;

    @ManyToOne
    private Author author;

    private Integer availableCopies;

    public Book() { }

    public Book(String name, Categories category, Author author, Integer availableCopies) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.availableCopies = availableCopies;
    }
}
