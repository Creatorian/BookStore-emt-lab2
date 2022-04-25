package com.example.emt_lab.service.Impl;

import antlr.collections.List;
import com.example.emt_lab.model.Author;
import com.example.emt_lab.repository.AuthorRepository;
import com.example.emt_lab.service.AuthorService;
import com.google.common.base.Optional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Optional<Author> findById(Long id) {
        Author author = authorRepository.findById(id).orElseThrow(RuntimeException::new);
        return Optional.of(author);
    }


    @Override
    public void deleteById(Long id) {
        authorRepository.deleteById(id);
    }

    @Override
    public List<Author> findAll() {

        return authorRepository.findAll();
    }

}
