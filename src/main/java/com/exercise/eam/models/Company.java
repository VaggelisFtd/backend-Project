package com.exercise.eam.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
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

    public Company(Long AFM, String companyName, String expertise, int phoneNumber, String location) {
        this.AFM = AFM;
        CompanyName = companyName;
        Expertise = expertise;
        PhoneNumber = phoneNumber;
        Location = location;
    }

    public Company() {

    }

    public Long getAFM() {
        return AFM;
    }

    public void setAFM(Long AFM) {
        this.AFM = AFM;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getExpertise() {
        return Expertise;
    }

    public void setExpertise(String expertise) {
        Expertise = expertise;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}
