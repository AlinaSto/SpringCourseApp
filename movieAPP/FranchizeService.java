package com.spring.apps.movieAPP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FranchizeService {

    private CharacterRepository characterRepository;
    private MovieRepository movieRepository;
    private FranchizeRepository franchizeRepository;

    public FranchizeService(@Autowired CharacterRepository characterRepository, @Autowired MovieRepository movieRepository, @Autowired FranchizeRepository franchizeRepository) {
        this.characterRepository = characterRepository;
        this.movieRepository = movieRepository;
        this.franchizeRepository = franchizeRepository;
    }

    //adaug un film intr-o franciza
//    public Franchize addMovieTofranchize(Movie movie, Franchize franchize) {
//        franchize.getMovies().add(movie);
//        movie.setFranchize(franchize);
//        return franchizeRepository.saveAll();
//    }
}