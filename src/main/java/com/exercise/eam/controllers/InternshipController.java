package com.exercise.eam.controllers;

import com.exercise.eam.models.Internship;
import com.exercise.eam.services.InternshipService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Internship")

public class InternshipController
{
    private final InternshipService internshipService;

    public InternshipController(InternshipService internshipService) {
        this.internshipService = internshipService;
    }

    @GetMapping("/All")
    public ResponseEntity<List<Internship>> getAllInternships() {
        List<Internship> internships= internshipService.findAllInternships();
        return new ResponseEntity<>(internships, HttpStatus.OK);
    }

    @PostMapping("/Add")
    public ResponseEntity<Internship> addInternship(@RequestBody Internship internship) {
        Internship newInternship = internshipService.addInternship(internship);
        return new ResponseEntity<>(newInternship, HttpStatus.CREATED);
    }
    @GetMapping("/Find/{id}")
    public ResponseEntity<Internship> getInternshipById (@PathVariable("id") Long id) {
        Internship internship = internshipService.findById(id);
        return new ResponseEntity<>(internship, HttpStatus.OK);
    }
}
