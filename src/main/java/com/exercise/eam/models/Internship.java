package com.exercise.eam.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Internship")
public class Internship {
    @Id
    @Column(nullable = false, updatable = false)
    private Long InternshipID;

    //on display in search position
    private String Title;
    private String DeptName;
    private boolean Duration;
    private boolean JobType;
    private String StartDate;
    private String JobDescription;
    private int Salary;
    @ManyToOne
    private Company Company;
    @OneToMany
    private List<InternApplication> internApplication;
}
