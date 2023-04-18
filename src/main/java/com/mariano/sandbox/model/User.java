package com.mariano.sandbox.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Data
public class User {
    @Id
    private String id;

    private String name;
    private String email;
    /*
    title
:
"The Arrival of a Train"
year
:
1896
runtime
:
1
released
:
1896-01-01T00:00:00.000+00:00
poster
:
"http://ia.media-imdb.com/images/M/MV5BMjEyNDk5MDYzOV5BMl5BanBnXkFtZTgw..."
plot
:
"A group of people are standing in a straight line along the platform o..."
fullplot
:
"A group of people are standing in a straight line along the platform o..."
lastupdated
:
2015-08-20T06:06:13.000+00:00
type
:
"movie"
     */
}
