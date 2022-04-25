package com.example.emt_lab.service;

import com.example.emt_lab.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    Optional<Author> findById(Long id);
    void deleteById(Long id);
    List<Author> findAll();
}
