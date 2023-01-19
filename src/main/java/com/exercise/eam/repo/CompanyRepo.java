package com.exercise.eam.repo;

import com.exercise.eam.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository<Company,Long>
{
}
