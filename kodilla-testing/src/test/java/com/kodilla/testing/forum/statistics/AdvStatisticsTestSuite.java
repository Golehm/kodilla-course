package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.List;
import java.lang.*;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class AdvStatisticsTestSuite {
    Statistics statisticsMock;
    AdvStatistics statisticsCalculator;
    List<String> usersNamesList = new ArrayList<String>();
    List<String> hundredUsersList = new ArrayList<String>();
    @Before
    public void initialize() {
        statisticsMock = mock(Statistics.class);
        statisticsCalculator = new AdvStatistics();
        usersNamesList.add("Al Kaida");
        usersNamesList.add("Boko Haram");
        usersNamesList.add("Daesz");
        usersNamesList.add("Irgun");
        for(int i = 0; i <100;i++){
            hundredUsersList.add("Ben Hur " + i);
        }
    }
    @Test
    public void testCalculateAdvStatisticsPostsExist() {
        //Given
        int posts = 1000;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int postsCount = statisticsCalculator.getPostsCount();
        int usersCount = statisticsCalculator.getUsersCount();
        Double avgPosts = statisticsCalculator.getAveragePostsPerUser();
        //Then
        Assert.assertEquals(1000, postsCount);
        Assert.assertEquals(new Double(1000/usersCount), avgPosts );
        statisticsCalculator.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsPostsNotExist() {
        //Given
        int posts = 0;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int postsCount = statisticsCalculator.getPostsCount();
        int usersCount = statisticsCalculator.getUsersCount();
        Double avgPosts = statisticsCalculator.getAveragePostsPerUser();
        //Then
        Assert.assertEquals(0, postsCount);
        Assert.assertEquals(new Double(0/usersCount), avgPosts );
        statisticsCalculator.showStatistics();
    }

    @Test
    public void testCalculateAdvStatisticsCommentsNotExist() {
        //Given
        int comments = 0;
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int commentsCount = statisticsCalculator.getCommentsCount();
        int usersCount = statisticsCalculator.getUsersCount();
        Double avgComments = statisticsCalculator.getAverageCommentsPerUser();
        //Then
        Assert.assertEquals(0, commentsCount);
        Assert.assertEquals(new Double(0/usersCount), avgComments );
        statisticsCalculator.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsMoreCommentsThenPosts() {
        //Given
        int comments = 12;
        int posts = 3;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int postsCount = statisticsCalculator.getPostsCount();
        int commentsCount = statisticsCalculator.getCommentsCount();
        //Then
        Assert.assertEquals(3, postsCount);
        Assert.assertEquals(12, commentsCount );
        statisticsCalculator.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsLessCommentsThenPosts() {
        //Given
        int posts = 6;
        int comments =4;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int postsCount = statisticsCalculator.getPostsCount();
        int commentsCount = statisticsCalculator.getCommentsCount();
        //Then
        Assert.assertEquals(6, postsCount);
        Assert.assertEquals(4,commentsCount );
        statisticsCalculator.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsZeroUsers() {
        //Given
        List<String> emptyUsersList = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(emptyUsersList);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int usersCount = statisticsCalculator.getUsersCount();
        //Then
        Assert.assertEquals(0, usersCount);
        statisticsCalculator.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsSomeUsers() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(hundredUsersList);
        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        int usersCount = statisticsCalculator.getUsersCount();
        //Then
        Assert.assertEquals(100, usersCount);
        statisticsCalculator.showStatistics();
    }
}
