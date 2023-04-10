package com.cristianrita.springgraphqldemo.actor;

import com.cristianrita.springgraphqldemo.movie.Movie;

import java.util.List;

public record Actor(Long id, String name, String birthDate, List<Movie> movies) {

}

