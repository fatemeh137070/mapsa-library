package com.mapsa.model;

import javax.persistence.*;
import lombok.Data;


@Entity
@Table
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
    private String codeMeli;

    public Person() {
    }
}