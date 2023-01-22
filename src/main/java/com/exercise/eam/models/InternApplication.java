package com.exercise.eam.models;

import jakarta.persistence.*;

@Entity
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
    public InternApplication(Long applicationID, String grades, String description, int saveStatus, int appliedStatus) {
        ApplicationID = applicationID;
        Grades = grades;
        Description = description;
        this.saveStatus = saveStatus;
        this.appliedStatus = appliedStatus;
    }

    public InternApplication() {

    }

    public Long getApplicationID() {
        return ApplicationID;
    }

    public void setApplicationID(Long applicationID) {
        ApplicationID = applicationID;
    }

    public String getGrades() {
        return Grades;
    }

    public void setGrades(String grades) {
        Grades = grades;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getSaveStatus() {
        return saveStatus;
    }

    public void setSaveStatus(int saveStatus) {
        this.saveStatus = saveStatus;
    }

    public int getAppliedStatus() {
        return appliedStatus;
    }

    public void setAppliedStatus(int appliedStatus) {
        this.appliedStatus = appliedStatus;
    }
}
