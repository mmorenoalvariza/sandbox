package com.mariano.sandbox.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
@Data
@AllArgsConstructor
public class Movie {
    @Id
    private String id;

    private String title;
    private Integer year;
    private String poster;
    private String plot;

}
