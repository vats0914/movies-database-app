package dev.vatsal.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;


    public List<movies> allMovies() {
        System.out.println(movieRepository.findAll().toString());
        return movieRepository.findAll();
    }

    public Optional<movies> singleMovie(ObjectId id) {
        return movieRepository.findById(id);
    }
}
