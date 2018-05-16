package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {

    @Autowired
    private Display display;

    double add(double a, double b) {
        double c = a + b ;
        display.displayValue(c);
        return c ;
    }
    double sub(double a, double b) {
        double c = a - b ;
        display.displayValue(c);
        return c ;
    }
    double mul(double a, double b) {
        double c = a * b ;
        display.displayValue(c);
        return c ;
    }
    double div(double a, double b) throws ArithmeticException {
        double c = a / b;
        display.displayValue(c);
        return c;
    }
}
