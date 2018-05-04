package com.kodilla.good.patterns.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MovieStoreMain {
    public static void main(String[] argv){
        MovieStore movieStore = new MovieStore();

        List<String> listOfMovies = movieStore.getMovies().entrySet().stream()
                .flatMap(movies -> movies.getValue().stream())
                .collect(Collectors.toList());

        List<String> listToPrint = listOfMovies.stream().map(movie -> movie + "!").collect(Collectors.toList());

        listToPrint.forEach(System.out::print);
    }
}
