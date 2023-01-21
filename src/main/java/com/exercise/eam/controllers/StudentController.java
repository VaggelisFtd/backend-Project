package com.exercise.eam.controllers;

import com.exercise.eam.models.Student;
import com.exercise.eam.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")

public class StudentController
{
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/All")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students= studentService.findAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }


    @PostMapping("/Add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student newStudent = studentService.addStudent(student);
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }
}
