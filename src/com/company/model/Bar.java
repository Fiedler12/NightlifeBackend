package com.company.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Bar {
    int id;
    String name;
    double rating;
    String description;
    public Bar(int id, String name, double rating, String description) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.description = description;
    }
}
