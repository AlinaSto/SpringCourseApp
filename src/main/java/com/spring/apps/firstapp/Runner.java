package com.spring.apps.firstapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private UserRepository userRepository;
    private TeamRepository teamRepository;

    private TeamService teamService;

    @Autowired
    private UserService userService;

    public Runner(@Autowired UserRepository userRepository, @Autowired TeamRepository teamRepository , @Autowired TeamService teamService) {
        this.userRepository = userRepository;
        this.teamRepository = teamRepository;
        this.teamService = teamService;
    }

    @Override
    public void run(String... args) throws Exception {
//        User user = new com.spring.apps.firstapp.User("Nicu", "Gh.", "123", "nicu@yahoo.com", com.spring.apps.firstapp.UserType.STUDENT);
//        User user2 = new com.spring.apps.firstapp.User("Gogu", "Ion", "456", "gogu@yahoo.com", com.spring.apps.firstapp.UserType.STUDENT);
//        User user3 = new com.spring.apps.firstapp.User("Man", "Balan", "789", "man@yahoo.com", com.spring.apps.firstapp.UserType.STUDENT);
//        User user4 = new com.spring.apps.firstapp.User("Oana", "Patrachi", "111", "oana@yahoo.com", com.spring.apps.firstapp.UserType.TRAINER);
//        User user5 = new com.spring.apps.firstapp.User("Dan", "Tanase", "222", "dan@yahoo.com", com.spring.apps.firstapp.UserType.ADMIN);
//        User savedUser = userRepository.save(user);
//        userRepository.save(user2);
//        userRepository.save(user3);
//        userRepository.save(user4);
//        userRepository.save(user5);
//
//        Team team = new com.spring.apps.firstapp.Team("Beginner");
//        Team team1 = new com.spring.apps.firstapp.Team("Advanced");
//        Team team2 = new com.spring.apps.firstapp.Team("Intermediate");
//        Team savedTeam = teamRepository.save(team);
//        teamRepository.save(team1);
//        teamRepository.save(team2);
//        System.out.println(teamService.addUserToTeam(1L,6L));
//
//        teamService.removeUserFromTeam(savedUser,savedTeam);

        User user = userRepository.findById(2L).get();
        userService.findUserModules(user);

    }
}
