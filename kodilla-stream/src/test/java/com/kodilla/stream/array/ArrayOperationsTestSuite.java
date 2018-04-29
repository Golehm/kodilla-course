package com.kodilla.stream.array;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class ArrayOperationsTestSuite {
    int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    @Test
    public void testGetAverage() {
        double average = ArrayOperations.getAverage(numbers);
        assertEquals(9.5d, average);
        System.out.println("Average is " + average);
    }
}
