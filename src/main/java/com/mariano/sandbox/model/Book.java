package com.mariano.sandbox.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

//@Table
@Data
@AllArgsConstructor
@Builder
public class Book {
    /*@PrimaryKeyColumn(
            name = "isbn",
            ordinal = 2,
            type = PrimaryKeyType.CLUSTERED,
            ordering = Ordering.DESCENDING)*/
    private UUID id;
    /*@PrimaryKeyColumn(
            name = "title", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    */private String title;
    /*@PrimaryKeyColumn(
            name = "publisher", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    */private String publisher;
    //@Column
    private Set<String> tags = new HashSet<>();
    // standard getters and setters
}