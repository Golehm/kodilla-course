package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]){
        SecondChallenge secondChallenge = new SecondChallenge();
        String returnValue = "Not done, yet.";
        System.out.println("\n" + "Will throw an Exception");
        try{
            returnValue = secondChallenge.probablyIWillThrowException(2.0, 0.0);
        }
        catch (Exception e){
            System.out.println("\n" + e);
        }
        finally {
            System.out.println("\n" + returnValue);
        }
        System.out.println("\n" + "Will not throw an Exception");
        try{
            returnValue = secondChallenge.probablyIWillThrowException(1.5, 1.0);
        }
        catch (Exception e){
            System.out.println("\n" + e);
        }
        finally {
            System.out.println("\n" + returnValue);
        }
    }
}
