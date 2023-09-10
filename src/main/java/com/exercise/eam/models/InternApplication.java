package com.exercise.eam.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="InternApplication")
public class InternApplication {
    @Id
    @Column(nullable = false, updatable = false)
    private Long ApplicationID;
    private String Grades;
    private String Description;
    private int saveStatus;
    private int appliedStatus;
//    private boolean isDeleted;

    @ManyToOne
    private Student Student;

    @ManyToOne
    private Internship internship;
}
