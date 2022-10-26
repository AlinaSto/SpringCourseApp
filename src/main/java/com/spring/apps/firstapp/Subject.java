package com.spring.apps.firstapp;

import javax.persistence.*;

@Entity
public class Subject {
    @Id
    @GeneratedValue
    private Long Id;
    @Column(name = "title")
    private String name;

    @OneToOne
    @JoinColumn(name = "session_id")
    private Session session;

    public Subject(String name) {
        this.name = name;
    }

    public Subject() {

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
        return "com.spring.apps.firstapp.Subject{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
