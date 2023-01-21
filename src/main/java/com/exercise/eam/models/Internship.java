package com.exercise.eam.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
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

    public Internship(Long internshipID, String title, String deptName, boolean duration, boolean jobType, String startDate, String jobDescription, int salary) {
        InternshipID = internshipID;
        Title = title;
        DeptName = deptName;
        Duration = duration;
        JobType = jobType;
        StartDate = startDate;
        JobDescription = jobDescription;
        Salary = salary;
    }

    public Internship() {

    }

    public Long getInternshipID() {
        return InternshipID;
    }

    public void setInternshipID(Long internshipID) {
        InternshipID = internshipID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public boolean isDuration() {return Duration;}

    public void setDuration(boolean duration) {Duration = duration;}

    public boolean isJobType() {
        return JobType;
    }

    public void setJobType(boolean jobType) {
        JobType = jobType;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public int getSalary() {return Salary;}

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getJobDescription() {
        return JobDescription;
    }

    public void setJobDescription(String jobDescription) {
        JobDescription = jobDescription;
    }
}
