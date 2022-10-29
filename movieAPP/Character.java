package com.spring.apps.movieAPP;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="characters")
public class Character {
    @Id
    @GeneratedValue
    private Long Id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @ManyToMany(mappedBy = "characters", cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    private Set<Movie> movies ;

    public Character(String firstName, String lastName, Set<Movie> movies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.movies = movies;
    }

    public Character() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Movie> getMovies() {
        if (this.movies==null){
            movies = new HashSet<>();
        }
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
