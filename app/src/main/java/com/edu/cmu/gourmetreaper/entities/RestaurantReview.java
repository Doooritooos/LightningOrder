/**
 * This class represents the model of a restaurant review
 * It contains rating and comment
 */
package com.edu.cmu.gourmetreaper.entities;

/**
 * @author Song Xiong
 * Team: Gourmet Reapers
 */
public class RestaurantReview {
    private int restaurantReviewID;
    private int rating;
    private String comment;

    public RestaurantReview(int rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }

    // Getters and setters

    public int getRestaurantReviewID() {
        return restaurantReviewID;
    }

    public void setRestaurantReviewID(int restaurantReviewID) {
        this.restaurantReviewID = restaurantReviewID;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String toString() {
        String rrToString = "";
        rrToString = comment + ", rating is " + rating;

        return rrToString;
    }
}