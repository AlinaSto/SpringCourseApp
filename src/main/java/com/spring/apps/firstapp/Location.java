package com.spring.apps.firstapp;

import com.spring.apps.firstapp.Session;

import javax.persistence.*;
import java.util.List;

@Entity
public class Location {
    @Id
    @GeneratedValue
    private Long Id;
    @Column(name = "location")
    private String name;


    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<Session> sessionList;
    public Location(String name) {
        this.name = name;
    }

    public Location() {

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

    @Override
    public String toString() {
        return "com.spring.apps.firstapp.Location{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
