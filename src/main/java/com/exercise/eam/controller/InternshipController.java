package com.exercise.eam.controller;

import com.exercise.eam.model.Internship;
import com.exercise.eam.service.InternshipService;
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

    @PutMapping("/Update")
    public ResponseEntity<Internship> updateInternship(@RequestBody Internship internship) {
        Internship updateInternship =internshipService.updateInternship(internship);
        return new ResponseEntity<>(updateInternship, HttpStatus.OK);
    }

}
