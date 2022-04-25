package com.example.emt_lab.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;
@Data
@Entity
public class Country{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String continent;

    public Country() { }

    public Country(String name, String continent) {
        this.name = name;
        this.continent = continent;
    }
}
