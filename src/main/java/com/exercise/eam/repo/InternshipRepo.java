package com.exercise.eam.repo;

import com.exercise.eam.models.Internship;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InternshipRepo extends JpaRepository<Internship,Long> {
    @Override
    Optional<Internship> findById(Long id);
}
