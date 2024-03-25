package dev.innomo.movieapi.service;

import dev.innomo.movieapi.model.Movie;
import dev.innomo.movieapi.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private MongoTemplate mongoTemplate;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
}
