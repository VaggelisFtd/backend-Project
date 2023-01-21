package com.exercise.eam.repo;

import com.exercise.eam.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository<Company,Long>
{
}
