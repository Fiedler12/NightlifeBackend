package com.company.model;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
public class Reviews {
    List<Review> reviews = new ArrayList<Review>();
    public Reviews() {
        for (int i = 0; i < 10; i++) {
            Review newReview = new Review(i, i, "I mean bar " + i + " is alright", 4.0);
            reviews.add(newReview);
        }
    }
}
