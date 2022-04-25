package com.example.emt_lab.service.Impl;

import com.example.emt_lab.model.Author;
import com.example.emt_lab.model.Book;
import com.example.emt_lab.model.Categories;
import com.example.emt_lab.model.exceptions.CopiesUnavailable;
import com.example.emt_lab.repository.AuthorRepository;
import com.example.emt_lab.repository.BookRepository;
import com.example.emt_lab.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    public BookServiceImpl(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public Book findById(Long id) {
        return this.bookRepository.findById(id).orElseThrow(NullPointerException::new);
    }

    @Override
    public List<Book> listAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public Book save(String name, Categories category, Long authorId, Integer availableCopies) {
        Author author = authorRepository.findById(authorId).orElseThrow(RuntimeException::new);
        Book book = new Book(name,category,author,availableCopies);
        bookRepository.save(book);
        return this.bookRepository.save(book);
    }

    @Override
    public Book edit(Long id, String name, Categories category, Long authorId, Integer availableCopies) {
        Book book = this.bookRepository.findById(id).orElseThrow(NullPointerException::new);
        book.setName(name);
        book.setCategory(category);
        Author author = authorRepository.findById(authorId).orElseThrow(RuntimeException::new);
        book.setAuthor(author);
        book.setAvailableCopies(availableCopies);
        return this.bookRepository.save(book);
    }



    @Override
    public Book delete(Long id) {
        Book book = this.bookRepository.findById(id).orElseThrow(NullPointerException::new);
        this.bookRepository.delete(book);
        return book;
    }

    @Override
    public Book markAsTaken(Long id) {



        Book book = this.bookRepository.findById(id).orElseThrow(NullPointerException::new);
        int n = book.getAvailableCopies();
        if(n>0){
            n=n-1;
            book.setAvailableCopies(n);
            return this.bookRepository.findById(id).orElseThrow(NullPointerException::new);
        }
        else {
            throw  new CopiesUnavailable();
        }


    }
}
