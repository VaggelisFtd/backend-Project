package com.exercise.eam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Internship")
public class Internship {
    @Id
    @Column(nullable = false, updatable = false)
    private Long InternshipID;
    private String DeptName;
    private String Duration;
    private String JobType;
    private String StartingDate;
    private String Title;
    private int Salary;
    private String Profession;
    private String Status;


    public Internship(Long internshipID, String deptName, String duration, String jobType, String startingDate, String title, int salary, String profession, String status) {
        InternshipID = internshipID;
        DeptName = deptName;
        Duration = duration;
        JobType = jobType;
        StartingDate = startingDate;
        Title = title;
        Salary = salary;
        Profession = profession;
        Status = status;
    }

    public Internship() {

    }

    public Long getInternshipID() {
        return InternshipID;
    }

    public void setInternshipID(Long internshipID) {
        InternshipID = internshipID;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public String getJobType() {
        return JobType;
    }

    public void setJobType(String jobType) {
        JobType = jobType;
    }

    public String getStartingDate() {
        return StartingDate;
    }

    public void setStartingDate(String startingDate) {
        StartingDate = startingDate;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String profession) {
        Profession = profession;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
