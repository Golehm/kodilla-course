package com.kodilla.testing.forum.statistics;

public class AdvStatistics {
    int numberOfUsers;
    int numberOfPosts;
    int numberOfCommnets;
    float averageOfUserPosts;
    float averageOfUserComments;
    float averageCommentsPerPost;
    void calculateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfCommnets = statistics.commentsCount();
        averageOfUserPosts = (float)numberOfPosts/(float)numberOfUsers;
        averageOfUserComments = (float)numberOfCommnets/(float)numberOfUsers;
        averageCommentsPerPost = (float)numberOfCommnets/(float)numberOfPosts;
    }
    void showStatistics(){
        System.out.println(" Number of users = " + numberOfUsers);
        System.out.println(" Number of posts = " + numberOfPosts);
        System.out.println(" Number of comments = " + numberOfCommnets);
        System.out.println(" Avg of user posts = " + averageOfUserPosts);
        System.out.println(" Avg of users comments = " + averageOfUserComments);
        System.out.println(" Avg comments per post = " + averageCommentsPerPost);
    }
}
