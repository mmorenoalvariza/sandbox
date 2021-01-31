package com.mariano.sandbox.repository;

import com.mariano.sandbox.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository

//public interface BookRepository extends CassandraRepository<Book, UUID> {
public interface BookRepository extends CrudRepository<Book, UUID> {
    //
}