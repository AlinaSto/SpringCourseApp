package com.spring.apps.movieAPP;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="franchises")
public class Franchize {
    @Id
    @GeneratedValue
    private Long Id;
    private String name;


    @OneToMany(mappedBy = "franchize", cascade = CascadeType.ALL)
    Set<Movie> movies;

    public Franchize(String name, Set<Movie> movies) {
        this.name = name;
        this.movies = movies;
    }

    public Franchize() {

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

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Franchize{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
