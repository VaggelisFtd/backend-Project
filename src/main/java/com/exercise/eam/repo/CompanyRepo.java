package com.exercise.eam.repo;

import com.exercise.eam.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyRepo extends JpaRepository<Company,Long>
{
    @Override
    Optional<Company> findById(Long id);
}
