package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import java.util.*;
import java.util.List;
import java.lang.*;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class AdvStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatistics(){
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNamesList = Arrays.asList("Ben Hur","Tali Ban","Al Kaida","Cent Nar");

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(5);
        when(statisticsMock.commentsCount()).thenReturn(12);

        AdvStatistics advStat = new AdvStatistics();
        advStat.calculateAdvStatistics(statisticsMock);
        int users = advStat.numberOfUsers;
        int posts = advStat.numberOfPosts;
        int comments = advStat.numberOfCommnets;
        Assert.assertEquals(4, users);
        Assert.assertEquals(5, posts);
        Assert.assertEquals(12, comments);
        advStat.showStatistics();
    }
}
