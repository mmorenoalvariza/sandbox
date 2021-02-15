package com.mariano.sandbox.controller;

import com.mariano.sandbox.model.Person;
import com.mariano.sandbox.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public Flux<Person> getAll() {
        return personRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Person> getEmployeeById(@PathVariable UUID id) {
        return personRepository.findById(id);
    }

    @PostMapping
    public Mono<Person> add(@RequestBody Person person) {
        person.setKey(UUID.randomUUID());
        return personRepository.save(person);
    }
}
