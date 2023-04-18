package com.mariano.sandbox.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.mariano.sandbox.model.Author;
import com.mariano.sandbox.model.Book;
import com.mariano.sandbox.repository.AuthorRepository;
import com.mariano.sandbox.repository.PersonRepository;

public class BookResolver implements GraphQLResolver<Book> {
    private AuthorRepository authorRepository;

    public Author getAuthor(Book book) {
        return authorRepository.findById(book.getAuthorId()).orElseThrow();
    }
}
