package com.exercise.eam.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table (name="user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long UserID;
    private String Username;
    private String Password;
    private String Email;
    private String newEntry;

    public User(Long userID, String username, String password, String email, String newEntry) {
        this.UserID = userID;
        this.Username = username;
        this.Password = password;
        this.Email = email;
        this.newEntry = newEntry;
    }

    public User() {

    }

    public Long getUserID() {
        return UserID;
    }

    public void setUserID(Long userID) {
        UserID = userID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNewEntry() {
        return newEntry;
    }

    public void setNewEntry(String newEntry) {
        this.newEntry = newEntry;
    }
}