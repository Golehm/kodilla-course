package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import java.util.*;
import java.util.List;
import java.lang.*;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class AdvStatisticsTestSuite {
    public void tester(int users, int posts, int comments){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<String>();
        for(int i = 0; i < users; i++) {
            usersNamesList.add("Ben Hur");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        AdvStatistics advStat = new AdvStatistics();
        advStat.calculateAdvStatistics(statisticsMock);
        //When
        int usersStat = advStat.numberOfUsers;
        int postsStat = advStat.numberOfPosts;
        int commentsStat = advStat.numberOfCommnets;
        //Then
        Assert.assertEquals(users, usersStat);
        Assert.assertEquals(posts, postsStat);
        Assert.assertEquals(comments, commentsStat);
        advStat.showStatistics();
        System.out.println();
    }
    @Test
    public void testCalculateAdvStatisticsPostsExists() {
        tester(4, 15, 12);//comments < posts
        tester(24, 1000, 12);
        tester(3, 3, 7);//comments > posts
    }
    @Test
    public void testCalculateAdvStatisticsNoPosts(){
        tester(12, 0, 0);//
        tester(7, 0, 0);
    }
    @Test
    public void  testCalculateAdvStatisticsNoComments() {
        tester(5, 5, 0);
        tester(1, 0, 0);

    }
    @Test
    public void testCalculateAdvStatisticsUsers(){
        tester(0,25,142);
        tester(100,50,126);

    }
}
