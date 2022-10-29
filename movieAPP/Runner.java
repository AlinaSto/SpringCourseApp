package com.spring.apps.movieAPP;

import com.spring.apps.courseAPP.TeamRepository;
import com.spring.apps.courseAPP.TeamService;
import com.spring.apps.courseAPP.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private CharacterRepository characterRepository;
    private MovieRepository movieRepository;

    private FranchizeRepository franchizeRepository;
    private MovieService movieService;
    private FranchizeService franchizeService;

    public Runner(@Autowired CharacterRepository characterRepository,@Autowired MovieRepository movieRepository,@Autowired FranchizeRepository franchizeRepository,@Autowired MovieService movieService,@Autowired FranchizeService franchizeService) {
        this.characterRepository = characterRepository;
        this.movieRepository = movieRepository;
        this.franchizeRepository = franchizeRepository;
        this.movieService = movieService;
        this.franchizeService = franchizeService;
    }

    @Override
    public void run(String... args) throws Exception {

//        Movie movie = new Movie();
//        movie.setName("movie1");
//        Movie savedMovie = movieRepository.save(movie);
//        Character character = new Character();
//        character.setFirstName("character1");
//        movieService.addCharacterToMovie(character,savedMovie);

        Franchize franchize = franchizeRepository.findById(3L).get();
        System.out.println(movieRepository.findAllByFranchize(franchize));

        Movie movie = movieRepository.findById(1L).get();
        characterRepository.findAllByMoviesContaining(movie);


    }
}