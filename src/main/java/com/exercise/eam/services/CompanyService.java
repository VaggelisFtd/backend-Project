package com.exercise.eam.services;

import com.exercise.eam.exception.notFoundException;
import com.exercise.eam.models.Company;
import com.exercise.eam.repo.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class CompanyService {
    Random rand = new Random();
    private final CompanyRepo companyRepo;

    @Autowired
    public CompanyService(CompanyRepo companyRepo) {
        this.companyRepo = companyRepo;
    }

    public Company addCompany(Company company) {
        company.setAFM(rand.nextLong());
        return companyRepo.save(company);
    }

    public List<Company> findAllCompanies() {
        return companyRepo.findAll();
    }

    public Company findById(Long CompanyId)
    {
        return companyRepo.findById(CompanyId)
                .orElseThrow(() -> new notFoundException("Application by id " + CompanyId + " was not found"));
    }
}
