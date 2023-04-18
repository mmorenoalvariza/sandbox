package com.mariano.sandbox.repository;

import com.mariano.sandbox.model.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface AuthorRepository extends CrudRepository<Author, UUID> {
}
