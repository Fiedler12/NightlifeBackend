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
    public Bar(int id, String name, double rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }
}
