package com.cristianrita.springgraphqldemo.movie;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class MovieRepository {
    private List<Movie> mockMovies;

    @PostConstruct
    public void initializeMockMovies() {
        mockMovies = new ArrayList<>(List.of(
                new Movie(1L, "The Matrix", 1999, List.of("Action", "Sci-Fi"), "The Wachowskis"),
                new Movie(2L, "The Matrix Reloaded", 2003, List.of("Action", "Sci-Fi"), "The Wachowskis"),
                new Movie(3L, "The Matrix Revolutions", 2003, List.of("Action", "Sci-Fi"), "The Wachowskis")
        )
        );
    }

    public Movie getById(Long id) {
        return mockMovies.stream().filter(movie -> movie.id().equals(id)).findFirst().orElse(null);
    }

    public void addMovie(Movie movie) {
        mockMovies.add(movie);
    }
}
