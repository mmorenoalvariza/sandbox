package com.mariano.sandbox.controller;

import com.mariano.sandbox.model.Book;
import com.mariano.sandbox.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Controller
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    //@GetMapping(path = "/api/books")
    @RequestMapping("/books")
    public ResponseEntity<Iterable<Book>> getBooks() {
        Iterable<Book> books = bookRepository.findAll();
        return ResponseEntity.ok(books);
    }

    @RequestMapping("/newbook")
    public ResponseEntity<List<Book>> newBook() {
        Book book = Book.builder().publisher("Mariano").tags(Set.of("foo")).title("The title").id(UUID.randomUUID()).build();
        bookRepository.save(book);
        //List<Book> books = bookRepository.findAll();
        return ResponseEntity.ok(List.of(book));
    }
    @RequestMapping("/echo/{value}")
    public ResponseEntity<String> echo(@PathVariable String value) {
        return ResponseEntity.ok(value);
    }
}
