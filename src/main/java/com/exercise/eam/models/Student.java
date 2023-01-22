package com.exercise.eam.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
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

    public Student(Long studentID, String firstName, String lastName, String location, String university, int phoneNumber) {
        StudentID = studentID;
        FirstName = firstName;
        LastName = lastName;
        Location = location;
        University = university;
        PhoneNumber = phoneNumber;
    }

    public Student() {

    }

    public Long getStudentID() {
        return StudentID;
    }

    public void setStudentID(Long studentID) {
        StudentID = studentID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String university) {
        University = university;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

}
