package com.mariano.sandbox.graphql;

import com.google.common.collect.ImmutableMap;
import com.mariano.sandbox.repository.AuthorRepository;
import com.mariano.sandbox.repository.BookRepository;
import com.mariano.sandbox.repository.MovieRepository;
import com.mariano.sandbox.repository.UserRepository;
import graphql.schema.DataFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.awt.print.PageFormat;
import java.awt.print.Pageable;
import java.awt.print.Printable;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.singletonList;
import static java.util.Optional.ofNullable;

@Component
public class GraphQLDataFetchers {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    MovieRepository movieRepository;
    @Autowired
    UserRepository userRepository;

    @Autowired
    AuthorRepository authorRepository;

    public DataFetcher getBookByIdDataFetcher() {
        return dataFetchingEnvironment -> {
            String bookId = dataFetchingEnvironment.getArgument("id");
            return bookRepository.findById(UUID.fromString(bookId)).orElse(null);
        };
    }
    public DataFetcher getBooksDataFetcher() {
        return dataFetchingEnvironment -> {
            return bookRepository.findAll();
        };
    }
    public DataFetcher getMoviesDataFetcher() {
        return dataFetchingEnvironment -> {
            return movieRepository.findAll().take(20).filter(movie -> Objects.nonNull(movie.getPoster())).map(movie -> {
                movie.setPoster(movie.getPoster().replace("http", "https"));
                return movie;
            }).collectList().block();
        };
    }

    public DataFetcher getAuthorDataFetcher() {
        return dataFetchingEnvironment -> {
            Map<String,String> book = dataFetchingEnvironment.getSource();
            String authorId = book.get("authorId");
            return authorRepository.findById(UUID.fromString(authorId))
                    .orElse(null);
        };
    }

    public DataFetcher getAuthorsDataFetcher() {
        return dataFetchingEnvironment -> {
            return authorRepository.findAll();
        };
    }
}