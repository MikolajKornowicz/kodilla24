package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
private String username;
private char gender;
private LocalDate dob;
private int iD;
private int numberOfPosts;

    public ForumUser(String username, char gender, LocalDate dob,  int iD, int numberOfPosts) {
        this.username = username;
        this.gender = gender;
        this.dob = dob;
        this.iD =iD;
        this.numberOfPosts = numberOfPosts;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public int getID() {
        return iD;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", date of birth" + dob +
                ", user ID'" + iD + '\'' +
                '}';
    }
}
