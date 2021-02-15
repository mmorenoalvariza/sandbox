package com.mariano.sandbox.repository;

import com.mariano.sandbox.model.Person;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepository extends ReactiveCassandraRepository<Person, UUID> {
}
