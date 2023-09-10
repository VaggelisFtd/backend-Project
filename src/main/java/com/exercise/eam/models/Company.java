package com.exercise.eam.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Company")
public class Company implements Serializable {
    @Id
    @Column(nullable = false, updatable = false)
    private Long AFM;
    private String CompanyName;
    private String Expertise;
    private int PhoneNumber;
    private String Location;

    @OneToOne
    private User User;

    @OneToMany
    private List<Internship>Internship;
}
