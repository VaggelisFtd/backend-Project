package com.exercise.eam.service;

import com.exercise.eam.model.Internship;
import com.exercise.eam.repo.InternshipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class InternshipService {
    Random rand = new Random();
    private final InternshipRepo internshipRepo;

    @Autowired
    public InternshipService(InternshipRepo internshipRepo) {
        this.internshipRepo = internshipRepo;
    }

    public Internship addInternship(Internship internship) {
        internship.setInternshipID(rand.nextLong());
        return internshipRepo.save(internship);
    }

    public List<Internship> findAllInternships() {
        return internshipRepo.findAll();
    }

    public Internship updateInternship(Internship internship) {
        return internshipRepo.save(internship);
    }
}
