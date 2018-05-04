package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
    @Override
    public String getMessage() {
        return "Route not Found";
    }
}
