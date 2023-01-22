package com.exercise.eam.repo;

import com.exercise.eam.models.InternApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InternApplicationRepo extends JpaRepository<InternApplication,Long> {
    @Override
    Optional<InternApplication> findById(Long id);

}
