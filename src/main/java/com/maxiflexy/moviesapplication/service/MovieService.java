package com.maxiflexy.moviesapplication.service;

import com.maxiflexy.moviesapplication.entity.Movie;
import com.maxiflexy.moviesapplication.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
}
