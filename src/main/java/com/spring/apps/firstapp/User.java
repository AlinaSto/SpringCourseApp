package com.spring.apps.firstapp;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;


    @Column(name = "first_name")
    private String firstNme;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "password")
    private String password;
    @Column(name = "email_address")
    private String emailAddress;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_type")
    private UserType userType;
    //cascade??????
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    List<Attendance> attendances;

    @ManyToOne
    @JoinColumn(name="team_id")
    private Team team;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Session> sessions;

    public User( String firstNme, String lastName, String password, String emailAddress, UserType userType) {
        this.firstNme = firstNme;
        this.lastName = lastName;
        this.password = password;
        this.emailAddress = emailAddress;
        this.userType = userType;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstNme() {
        return firstNme;
    }

    public void setFirstNme(String firstNme) {
        this.firstNme = firstNme;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public List<Attendance> getClassbookCheckers() {
        return attendances;
    }

    public void setClassbookCheckers(List<Attendance> attendances) {
        this.attendances = attendances;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }
}
