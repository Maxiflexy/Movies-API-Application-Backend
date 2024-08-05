package com.maxiflexy.moviesapplication.controller;

import com.maxiflexy.moviesapplication.entity.Review;
import com.maxiflexy.moviesapplication.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/reviews")
@CrossOrigin(origins = "http://localhost:3000")
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload){
        return new ResponseEntity<>(reviewService.createReview(
                payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.CREATED);
    }
}
