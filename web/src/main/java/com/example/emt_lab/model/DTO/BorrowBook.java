package com.example.emt_lab.model.DTO;

import com.example.emt_lab.model.Categories;
import lombok.Data;

@Data
public class BorrowBook {

    private String name;
    private Categories category;
    private Long authorId;
    private Integer availableCopies;

    public BorrowBook(String name, Categories category, Long authorId, Integer availableCopies) {
        this.name = name;
        this.category = category;
        this.authorId = authorId;
        this.availableCopies = availableCopies;
    }

}
