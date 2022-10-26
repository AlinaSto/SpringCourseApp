package com.spring.apps.firstapp;

import javax.persistence.*;
import java.util.List;
//name dl manytoone location id????
@Entity
public class Session {
    @Id
    @GeneratedValue
    private Long Id;

    @Column(name = "start_time")
    private String startDate;
    @Column(name = "end_time")
    private String endDate;
    @Column(name = "date")
    private String date;

    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "module_id")
    private Module module;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @OneToOne(mappedBy = "session", cascade = CascadeType.ALL)
    private Subject subject;


    @OneToMany(mappedBy = "session", cascade = CascadeType.ALL)
    private List<Attendance> attendanceList;

    public Session(String startDate, String endDate, String date) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.date = date;
    }

    public Session() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "com.spring.apps.firstapp.Session{" +
                "Id=" + Id +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
