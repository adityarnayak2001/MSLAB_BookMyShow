package com.example.movieservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/movies")
@RestController

public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }
    @GetMapping("/getAllMovies")
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }
    @GetMapping("/getByMovieId/{movieId}")
    public Movie getByMovieId(@PathVariable String movieId){
        return  movieService.getByMovieId(movieId);
    }
    @PostMapping("/createMovie")
    public Movie createMovie(@RequestBody Movie movie){
        return movieService.createMovie(movie);
    }
    @DeleteMapping("/deleteMovieById/{movieId}")
    public String deleteMovieById(@PathVariable String movieId){
        movieService.deleteMovieById(movieId);
        return "Movie Deleted";
    }
}
