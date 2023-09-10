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
@Table(name="Student")
public class Student {
    @Id
    @Column(nullable = false, updatable = false)
    private Long StudentID;
    private String FirstName;
    private String LastName;
    private String Location;
    private String University;
    private int PhoneNumber;


    @OneToOne
    private User User;
    @OneToMany
    private List<InternApplication> InternApplication;
}
