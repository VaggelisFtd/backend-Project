package com.exercise.eam.repo;

import com.exercise.eam.models.InternApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternApplicationRepo extends JpaRepository<InternApplication,Long> {

}
