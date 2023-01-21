package com.exercise.eam.services;

import com.exercise.eam.models.User;
import com.exercise.eam.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class UserService {
    Random rand = new Random();
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User addUser(User user) {
        user.setUserID(rand.nextLong());
        return userRepo.save(user);
    }
    public List<User> findAllUsers() {
        return userRepo.findAll();
    }

}
