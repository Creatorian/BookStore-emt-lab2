package com.example.emt_lab.repository;

import com.example.emt_lab.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

    Optional<Book> findByName(String name);

}
