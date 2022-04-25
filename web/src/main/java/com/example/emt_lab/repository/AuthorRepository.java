package com.example.emt_lab.repository;

import antlr.collections.List;
import com.example.emt_lab.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

@Repostiroy
public interface AuthorRepository extends JpaRepository<Author,Long> {


    List<Author> findAllByName(String text);

}
