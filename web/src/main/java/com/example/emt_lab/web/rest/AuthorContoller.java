package com.example.emt_lab.web.rest;

import antlr.collections.List;
import com.example.emt_lab.model.Author;
import com.example.emt_lab.service.AuthorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/author")
public class AuthorContoller {

    private final AuthorService authorService;

    public AuthorContoller(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<Author> findAll() {
        return this.authorService.findAll();
    }


}
