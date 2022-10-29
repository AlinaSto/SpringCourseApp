package com.spring.apps.movieAPP;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="movies")
public class Movie {
    @Id
    @GeneratedValue
    private Long Id;

    @Column(name = "title")
    private String name;

    @ManyToOne
    @JoinColumn(name = "franchize_id")
    private Franchize franchize;

    @ManyToMany (cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "movie_character",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "character_id")
    )
    private Set<Character> characters;

    public Movie(String name, Franchize franchize, Set<Character> characters) {
        this.name = name;
        this.franchize = franchize;
        this.characters = characters;
    }

    public Movie() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Franchize getFranchize() {
        return franchize;
    }

    public void setFranchize(Franchize franchize) {
        this.franchize = franchize;
    }

    public Set<Character> getCharacters() {
        if (this.characters==null){
            this.characters = new HashSet<>();
        }
        return characters;
    }

    public void setCharacters(Set<Character> characters) {
        this.characters = characters;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", franchize=" + franchize +

                '}';
    }
}

