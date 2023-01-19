package com.exercise.eam.controller;

import com.exercise.eam.model.InternApplication;
import com.exercise.eam.service.InternApplicationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/InternApplication")

public class InternApplicationController
{
    private final InternApplicationService internApplicationService;

    public InternApplicationController(InternApplicationService internApplicationService) {
        this.internApplicationService = internApplicationService;
    }

    @GetMapping("/All")
    public ResponseEntity<List<InternApplication>> getAllInternApplications() {
        List<InternApplication> internApplications= internApplicationService.findAllInternApplications();
        return new ResponseEntity<>(internApplications, HttpStatus.OK);
    }


    @PostMapping("/Add")
    public ResponseEntity<InternApplication> addInternApplication(@RequestBody InternApplication internApplication) {
        InternApplication newInternApplication= internApplicationService.addInternApplication(internApplication);
        return new ResponseEntity<>(newInternApplication, HttpStatus.CREATED);
    }

    @PutMapping("/Update")
    public ResponseEntity<InternApplication> updateInternApplication(@RequestBody InternApplication internApplication) {
        InternApplication updateInternApplication =internApplicationService.updateInternApplication(internApplication);
        return new ResponseEntity<>(updateInternApplication, HttpStatus.OK);
    }

}
