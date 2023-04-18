package com.mariano.sandbox.repository;

import com.mariano.sandbox.model.Movie;
import com.mariano.sandbox.model.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User, String> {
}
