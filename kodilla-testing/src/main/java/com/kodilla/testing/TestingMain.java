package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        Calculator calculator = new Calculator();
        System.out.println("Adding 7 " + "and 13 gives " + calculator.add(7,13));
        System.out.println("Subtracting 13 " + "from 7 gives " + calculator.subtract(7,13));
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        // tu umieść kolejny test ->
        System.out.println("Test - pierwszy test jednostkowy:");
    }
}
