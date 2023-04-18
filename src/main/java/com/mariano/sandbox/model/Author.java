package com.mariano.sandbox.model;

import java.util.UUID;

public class Author extends Person{
    public Author(UUID key, String lastName, String firstName, double salary) {
        super(key, lastName, firstName, salary);
    }
}
