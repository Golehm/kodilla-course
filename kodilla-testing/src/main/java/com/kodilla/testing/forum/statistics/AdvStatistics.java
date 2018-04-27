package com.kodilla.testing.forum.statistics;

public class AdvStatistics {
    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;
    void calculateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        averagePostsPerUser = (double)numberOfPosts/(double)numberOfUsers;
        averageCommentsPerUser = (double)numberOfComments/(double)numberOfUsers;
        averageCommentsPerPost = (double)numberOfComments/(double)numberOfPosts;
    }
    public int getUsersCount(){
        return numberOfUsers;
    }
    public int getPostsCount(){
        return numberOfPosts;
    }
    public int getCommentsCount(){
        return numberOfComments;
    }
    public double getAverageCommentsPerUser(){
        return averageCommentsPerUser;
    }
    public double getAverageCommentsPerPost(){
        return averageCommentsPerPost;
    }
    public double getAveragePostsPerUser(){
        return averagePostsPerUser;
    }
    void showStatistics(){
        System.out.println(" Number of users = " + numberOfUsers);
        System.out.println(" Number of posts = " + numberOfPosts);
        System.out.println(" Number of comments = " + numberOfComments);
        System.out.println(" Avg of user posts = " + averagePostsPerUser);
        System.out.println(" Avg of users comments = " + averageCommentsPerUser);
        System.out.println(" Avg comments per post = " + averageCommentsPerPost);
        System.out.println();
    }
}
