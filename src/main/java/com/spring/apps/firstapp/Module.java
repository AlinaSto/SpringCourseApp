package com.spring.apps.firstapp;

import com.spring.apps.firstapp.Session;
import com.spring.apps.firstapp.Team;

import javax.persistence.*;
import java.util.List;

//cum folosesc localDate with after and before????
@Entity
public class Module {
    @Id
    @GeneratedValue
    private Long Id;
    @Column(name = "title")
    private String name;
    @Column(name = "start_date")
    private String startDate;
    @Column(name = "end_date")
    private String endDate;


    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;


    @OneToMany (mappedBy = "module", cascade = CascadeType.ALL)
    private List<Session> sessionList;

    public Module(String name, String startDate, String endDate) {
       this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Module() {

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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "com.spring.apps.firstapp.Module{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
