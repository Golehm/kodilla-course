package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int uniqeID;
    private String userName;
    private char sex;
    private LocalDate dateOfBirth;
    private int numberOfPosts;

    public ForumUser(int uniqeID, String userName, char sex, LocalDate dateOfBirth, int numberOfPosts) {
        this.uniqeID = uniqeID;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public String getUserName() {
        return userName;
    }

    public int getUniqeID() {
        return uniqeID;
    }
    @Override
    public String toString() {
        return "User " +
                "with ID " + getUniqeID()  +
                ", has name " + getUserName()  +
                ", his sex is " + getSex() +
                ", was born " + getDateOfBirth() +
                ", had written " + getNumberOfPosts() +
                " posts";
    }
}
