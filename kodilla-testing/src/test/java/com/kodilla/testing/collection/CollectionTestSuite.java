package com.kodilla.testing.collection;

import java.util.*;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyListestCaseUsername(){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyNumbers = new ArrayList<Integer>();
        //When
        oddNumbersExterminator.exterminate(emptyNumbers);
        //Then
            System.out.println("Exterminate with empty list");
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator oddNumbersExterminatorFull = new OddNumbersExterminator();
        ArrayList<Integer> fullNumbers = new ArrayList<Integer>();
        ArrayList<Integer> resultNumbers = new ArrayList<Integer>();
        fullNumbers.add(0);
        fullNumbers.add(1);
        fullNumbers.add(2);
        fullNumbers.add(3);
        fullNumbers.add(4);
        fullNumbers.add(5);
        fullNumbers.add(6);
        //When
        resultNumbers = oddNumbersExterminatorFull.exterminate(fullNumbers);
        //Then
        System.out.println("Testing " + resultNumbers.get(0));
        System.out.println("Testing " + resultNumbers.get(1));
        System.out.println("Testing " + resultNumbers.get(2));
    }
}
