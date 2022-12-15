package com.example.bookingservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Booking {
    @Id private String id;
    @Column private String name;
    @Column private String DOB;
    @Column private String email;
    @Column private String mobileNo;
    @Column private String movieId;
    @Column private String movieFormat;
    @Column private String language;
    @Column private String selectedSeats;

    public Booking(String id, String name, String DOB, String email, String mobileNo, String movieId, String movieFormat, String language, String selectedSeats) {
        this.id = id;
        this.name = name;
        this.DOB = DOB;
        this.email = email;
        this.mobileNo = mobileNo;
        this.movieId = movieId;
        this.movieFormat = movieFormat;
        this.language = language;
        this.selectedSeats = selectedSeats;
    }
    public Booking(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieFormat() {
        return movieFormat;
    }

    public void setMovieFormat(String movieFormat) {
        this.movieFormat = movieFormat;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSelectedSeats() {
        return selectedSeats;
    }

    public void setSelectedSeats(String selectedSeats) {
        this.selectedSeats = selectedSeats;
    }
}
