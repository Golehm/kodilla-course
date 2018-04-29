package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public interface ArrayOperations {
    static double getAverage(int[] numbers){
        IntStream.range(0, numbers.length)
                .forEach(System.out::println);
        OptionalDouble result = IntStream.range(0, numbers.length)
                .average();
        if(result.isPresent()){
        return result.getAsDouble();
        }
        else {
            return 0.0d;
        }
    }
}
