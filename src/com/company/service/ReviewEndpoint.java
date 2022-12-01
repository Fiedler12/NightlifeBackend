package com.company.service;

import com.company.model.Review;
import com.company.model.Reviews;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.List;

@Produces(MediaType.APPLICATION_JSON)
@Path("review")
public class ReviewEndpoint {

    //Get reviews r
    @GET
    public List<Review> getAll() {
        Reviews review = new Reviews();
        return review.getReviews();
    }

    @GET
    @Path("/{id}")
    public List<Review> getReviews(@PathParam("id") int id) {
        List<Review> matching = new ArrayList<>();
        Reviews reviews = new Reviews();
        for (int i = 0; i < reviews.getReviews().size(); i++) {
            Review review = reviews.getReviews().get(i);
            if (review.getId() == id) {
                matching.add(review);
            }
        }
        return matching;
    }


    //Get specific review
}
