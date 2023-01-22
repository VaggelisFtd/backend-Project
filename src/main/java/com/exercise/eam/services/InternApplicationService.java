package com.exercise.eam.services;

import com.exercise.eam.exception.notFoundException;
import com.exercise.eam.models.InternApplication;
import com.exercise.eam.repo.InternApplicationRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@Transactional
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

    public InternApplication updateApplication(InternApplication internApplication) {
        return internApplicationRepo.save(internApplication);
    }
    public InternApplication findById(Long ApplicationId) {
        return internApplicationRepo.findById(ApplicationId)
                .orElseThrow(() -> new notFoundException("Application by id " + ApplicationId + " was not found"));
    }
}
