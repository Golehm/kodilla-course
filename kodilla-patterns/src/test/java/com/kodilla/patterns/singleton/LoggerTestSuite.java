package com.kodilla.patterns.singleton;

import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog(){
        //Given
        Logger logA = Logger.getInstance();
        Logger logB = Logger.getInstance();
        //When
        logA.log("Awruk");
        logB.log("Nyterk");
        //Then
        System.out.println("Test logsA: " + logA.getLastLog());
        System.out.println("Test logsB: " + logB.getLastLog());
    }
}
