package com.exercise.eam.repo;

import com.exercise.eam.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
//
//       Optional<User> findUserById(Long UserID);
//    default void deleteUserById(Long UserID) {

    }

