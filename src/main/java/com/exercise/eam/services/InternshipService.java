package com.exercise.eam.services;

import com.exercise.eam.exception.notFoundException;
import com.exercise.eam.models.Internship;
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

    public Internship findById(Long InternshipId) {
        return internshipRepo.findById(InternshipId)
                .orElseThrow(() -> new notFoundException("Internship by id " + InternshipId + " was not found"));
    }
}
