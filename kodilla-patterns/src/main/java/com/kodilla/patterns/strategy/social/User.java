package com.kodilla.patterns.strategy.social;

public class User {
    private String username;
    SocialPublisher socialPublisher;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    void sharePost(){
        System.out.println("User " + getUsername() + " shared post on " + socialPublisher.share());
    }
}
