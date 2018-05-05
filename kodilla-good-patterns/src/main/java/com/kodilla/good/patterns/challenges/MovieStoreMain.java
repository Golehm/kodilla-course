package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreMain {
    public static void main(String[] argv){

        MovieStore movieStore = new MovieStore();

                movieStore.getMovies().entrySet().stream()
                .flatMap(movies -> movies.getValue().stream())
                .collect(Collectors.toList()).stream().
                        map(movie -> movie + "!").
                        collect(Collectors.toList())
                        .forEach(System.out::print);
    }
}
