package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        double result = 0.0d;
        try {
            result = firstChallenge.divide(3, 0);
        }
        catch(ArithmeticException e){
            System.out.println("Something went wrong");
            e.printStackTrace();
            System.out.println("Catched Exception name is : " + e.toString());
        }
        finally {
            System.out.println("Finnaly: pamietaj cholero, nie dziel przez zero.");
        }
            System.out.println(result);
    }
}
