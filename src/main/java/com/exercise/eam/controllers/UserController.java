package com.exercise.eam.controllers;

import com.exercise.eam.models.User;
import com.exercise.eam.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")

public class UserController
{
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/All")
    public ResponseEntity< List<User> > getAllUsers () {
        List<User> users = userService.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/Add")
    public ResponseEntity<User> addUser(@RequestBody User user) {
       User newUser = userService.addUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }
  }
