package com.mariano.sandbox.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mariano.sandbox.model.Book;
import com.mariano.sandbox.repository.BookRepository;

import java.util.List;

public class Query implements GraphQLQueryResolver {
    private BookRepository bookRepository;
    public List<Book> getRecentBooks() {
        return bookRepository.findAll();
    }
}
