package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        Millenials milten = new Millenials("Milten");
        YGeneration ygrek = new YGeneration("Ygrek");
        ZGeneration zet = new ZGeneration("Zet");
        //When
        milten.sharePost();
        ygrek.sharePost();
        zet.sharePost();
        //Then
        Assert.assertEquals("Facebook",milten.socialPublisher.share());
        Assert.assertEquals("Twitter",ygrek.socialPublisher.share());
        Assert.assertEquals("Snapchat",zet.socialPublisher.share());
    }
    @Test
    public void testIndividualSharingStrategy(){
        //Given
        Millenials milten = new Millenials("Milten");
        milten.socialPublisher = new TwitterPublisher();
        YGeneration ygrek = new YGeneration("Ygrek");
        ygrek.socialPublisher = new SnapchatPublisher();
        ZGeneration zet = new ZGeneration("Zet");
        zet.socialPublisher = new FacebookPublisher();
        //When
        System.out.println();
        milten.sharePost();
        ygrek.sharePost();
        zet.sharePost();
        //Then
        Assert.assertEquals("Twitter",milten.socialPublisher.share());
        Assert.assertEquals("Snapchat",ygrek.socialPublisher.share());
        Assert.assertEquals("Facebook",zet.socialPublisher.share());
    }
}
