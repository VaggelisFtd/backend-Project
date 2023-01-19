package com.exercise.eam.controller;

import com.exercise.eam.model.User;
import com.exercise.eam.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")

public class UserController
{
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers () {
        List<User> employees = userService.findAllUsers();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

//    @GetMapping("/find/{id}")
//    public ResponseEntity<Employee> getEmployeeById (@PathVariable("id") Long id) {
//        Employee employee = employeeService.findEmployeeById(id);
//        return new ResponseEntity<>(employee, HttpStatus.OK);
//    }

    @PostMapping("/add")
    public ResponseEntity<User> addEmployee(@RequestBody User user) {
       User newUser = userService.addUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<User> updateEmployee(@RequestBody User user) {
        User updateUser = userService.updateUser(user);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id) {
//        employeeService.deleteEmployee(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
}
