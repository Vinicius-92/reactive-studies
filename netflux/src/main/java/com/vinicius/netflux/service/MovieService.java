package com.vinicius.netflux.service;

import com.vinicius.netflux.domain.Movie;
import com.vinicius.netflux.domain.MovieEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MovieService {
    Mono<Movie> getMovieById(String id);
    Flux<Movie> getAllMovies();
    Flux<MovieEvent> streamMovieEvents(String id);
}
