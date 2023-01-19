package com.exercise.eam.service;

import com.exercise.eam.model.InternApplication;
import com.exercise.eam.repo.InternApplicationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class InternApplicationService {
    Random rand = new Random();
    private final InternApplicationRepo internApplicationRepo;

    @Autowired
    public InternApplicationService(InternApplicationRepo internApplicationRepo) {
        this.internApplicationRepo = internApplicationRepo;
    }

    public InternApplication addInternApplication(InternApplication internApplication) {
        internApplication.setApplicationID(rand.nextLong());
        return internApplicationRepo.save(internApplication);
    }

    public List<InternApplication> findAllInternApplications() {
        return internApplicationRepo.findAll();
    }

    public InternApplication updateInternApplication(InternApplication internApplication) {
        return internApplicationRepo.save(internApplication);
    }
}
