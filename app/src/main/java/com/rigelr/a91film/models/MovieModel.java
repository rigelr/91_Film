package com.rigelr.a91film.models;

public class MovieModel {
    public String poster;
    public String title;
    public String rating;
    public String released;
    public String description;

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MovieModel(String poster, String title, String rating, String released, String description) {
        this.poster = poster;
        this.title = title;
        this.rating = rating;
        this.released = released;
        this.description = description;
    }
}
