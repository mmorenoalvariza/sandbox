package com.mariano.sandbox.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@AllArgsConstructor
@Data
@ToString
@Table("people_by_first_name")
public class Person {

    @PrimaryKey
    private UUID key;

    @Column("last_name")
    private String lastName;

    @Column("first_name")
    private String firstName;

    @Column
    private double salary;
}