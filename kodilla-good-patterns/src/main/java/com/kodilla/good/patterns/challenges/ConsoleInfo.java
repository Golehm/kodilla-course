package com.kodilla.good.patterns.challenges;

public class ConsoleInfo implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("User " + user.getName() + " " + user.getSurname() + " " + "orders ...");
    }
}
