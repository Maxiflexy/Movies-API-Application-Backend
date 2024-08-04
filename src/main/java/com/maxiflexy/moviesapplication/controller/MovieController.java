package com.maxiflexy.moviesapplication.controller;

import com.maxiflexy.moviesapplication.entity.Movie;
import com.maxiflexy.moviesapplication.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/movies")
public class MovieController {

    private final MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<>(movieService.allMovies(), HttpStatus.OK);
    }
}
