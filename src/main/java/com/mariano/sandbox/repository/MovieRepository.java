package com.mariano.sandbox.repository;

import com.mariano.sandbox.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {
}
