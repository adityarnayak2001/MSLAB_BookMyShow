package com.example.movieservice;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Service;
import java.util.List;
//@SpringBootApplication
//@EnableDiscoveryClient

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }
    public  Movie getByMovieId(String movieId){
        return movieRepository.findById(movieId).orElse(null);
    }

    public Movie createMovie(Movie movie){
        return movieRepository.save(movie);
    }

    public void deleteMovieById(String movieId){
        movieRepository.deleteById(movieId);
    }
}