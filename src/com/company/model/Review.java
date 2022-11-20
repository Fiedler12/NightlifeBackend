package com.company.model;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Review {
    int id;
    int barId;
    String review;
    double rating;

    public Review(int id, int barId, String review, double rating) {
        this.id = id;
        this.barId = barId;
        this.review = review;
        this.rating = rating;
    }
}
