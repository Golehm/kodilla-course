package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]){
        SecondChallenge secondChallenge = new SecondChallenge();
        String returnValue = "Not done, yet.";
        System.out.println("Will throw an Exception");
        try{
            returnValue = secondChallenge.probablyIWillThrowException(2.0, 0.0);
        }
        catch (Exception e){
            System.out.println("Something went wrong with probablyIWillThrowException(2.0, 0.0);");
            e.printStackTrace();
            System.out.println("Catched Exception name is : " + e.toString());
        }
        finally {
            System.out.println(returnValue);
        }
        System.out.println("Will not throw an Exception");
        try{
            returnValue = secondChallenge.probablyIWillThrowException(1.5, 1.0);
        }
        catch (Exception e){
            System.out.println("Something went wrong with probablyIWillThrowException(1.5, 1.0) ");
            e.printStackTrace();
            System.out.println("Catched Exception name is : " + e.toString());
        }
        finally {
            System.out.println(returnValue);
        }
    }
}
