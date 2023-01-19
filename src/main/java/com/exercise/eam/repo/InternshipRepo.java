package com.exercise.eam.repo;

import com.exercise.eam.model.Internship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternshipRepo extends JpaRepository<Internship,Long> {
}
