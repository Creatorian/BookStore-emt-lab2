package com.example.emt_lab.service;

import com.example.emt_lab.model.Author;
import com.example.emt_lab.model.Book;
import com.example.emt_lab.model.Categories;

import java.util.List;

public interface BookService {

    Book findById(Long id);

    Book save(String name, Categories category, Long author, Integer availableCopies);

    Book edit(Long id, String name, Categories category, Long author, Integer availableCopies);

    Book delete(Long id);

    List<Book> listAll();

}
