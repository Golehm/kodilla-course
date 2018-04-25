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
    }
    @Test
    public void testCalculateAdvStatisticsPosts() {
        tester(4, 5, 12);
        tester(4, 0, 12);//zero posts
        tester(4, 1000, 12);//1000 posts
    }
    @Test
    public void  testCalculateAdvStatisticsComments() {
        tester(4, 5, 0);//zero comments
        tester(4, 6, 3);//comments < posts
        tester(4, 3, 7);//comments > posts
    }
    @Test
    public void testCalculateAdvStatisticsUsers(){
        tester(0,25,142);//0 users
        tester(100,50,126);//100 users
    }
}
