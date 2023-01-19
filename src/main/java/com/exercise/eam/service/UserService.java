package com.exercise.eam.service;

import com.exercise.eam.model.User;
import com.exercise.eam.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
   private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User addUser(User user) {
        user.setNewEntry(UUID.randomUUID().toString());
        return userRepo.save(user);
    }

    public List<User> findAllUsers() {
        return userRepo.findAll();
    }

    public User updateUser(User user) {
        return userRepo.save(user);
    }

//    public User findUserById(Long UserID)  {
//        return userRepo.findUserById(UserID)
//                .orElseThrow(()-> new UserNotFoundException("User by id "+UserID +" not found"));
//    }
////    public void deleteUser(User user) {
////        userRepo.delete(user);
////    }
//    public void deleteUserById(Long UserID) {
//        userRepo.deleteById(UserID);
//    }
}
