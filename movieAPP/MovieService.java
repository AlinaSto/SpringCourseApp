package com.spring.apps.movieAPP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MovieService {

    private CharacterRepository characterRepository;
    private FranchizeRepository franchizeRepository;
    private MovieRepository movieRepository;

    public MovieService(@Autowired CharacterRepository characterRepository, @Autowired FranchizeRepository franchizeRepository, @Autowired MovieRepository movieRepository) {
        this.characterRepository = characterRepository;
        this.franchizeRepository = franchizeRepository;
        this.movieRepository = movieRepository;
    }


//adaug un caracter intr-un film
    public Movie addCharacterToMovie(Character character,Movie movie){
        movie.getCharacters().add(character);
        character.getMovies().add(movie);
        return movieRepository.save(movie);
    }
}
