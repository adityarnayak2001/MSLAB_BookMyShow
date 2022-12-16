package com.example.movieservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Movie {
    @Id
    String id;
    @Column
    String name;
    @Column
    String genre;
    @Column
    String rating;
    @Column
    String formats;
    public Movie() {

    }
    public Movie(String id, String name, String genre, String rating, String formats) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.rating = rating;
        this.formats = formats;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getRating() {
        return rating;
    }

    public String getFormats() {
        return formats;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setFormats(String formats) {
        this.formats = formats;
    }
}
