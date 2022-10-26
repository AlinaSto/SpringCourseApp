package com.spring.apps.firstapp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {
    @Id
    @GeneratedValue
    private Long Id;
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<Module> moduleList;
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<User> userList;
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public Team() {

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

    public List<Module> getModuleList() {
        return moduleList;
    }

    public void setModuleList(List<Module> moduleList) {
        this.moduleList = moduleList;
    }

    public List<User> getUserList() {

        if (this.userList == null){
            this.userList = new ArrayList<>();
        }
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "Team{" +
                "Id=" + Id +
                ", moduleList=" + moduleList +
                ", userList=" + userList +
                ", name='" + name + '\'' +
                '}';
    }
}
