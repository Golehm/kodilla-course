package com.kodilla.good.patterns.flightsearch;

import java.util.List;

public class Application {
    public static void flightsFromCity(String city, List<Airport> airports) {
        System.out.print("Flights to " + city + ": ");
        airports.stream().filter(a -> a.getName().equals(city))
                .map(a -> a.getDestinations()).forEach(System.out::println);
    }
    public static void flightsToCity(String city, List<Airport> airports) {
        System.out.print("Flights to " + city + ": ");
        for (Airport airport: airports){
            if (airport.getDestinations().stream().anyMatch(c -> c.contains(city))){
                System.out.print(airport.getName() + ", ");
            }
        }
        System.out.println();
    }
    public static void flightsTroughCity(String from, String to, List<Airport> airports) {
        List<String> troughListFrom = null;
        List<String> troughListTo = null;
        for (Airport airport: airports){
            if(airport.getName().equals(from)){
               troughListFrom = airport.getDestinations();
            }
            if(airport.getName().equals(to)){
                troughListTo = airport.getDestinations();
            }
        }
        System.out.println("Flights from " + from +  " trough Some City to " + to + ": ");
        troughListFrom.stream().filter(troughListTo::contains).forEach(System.out::println);
    }
    public static void main(String[] argv) {
        InitializeAirports initAir = new InitializeAirports();
        List<Airport> myAirports = initAir.initialize();
        flightsFromCity("Warszawa", myAirports);
        flightsToCity("Lodz", myAirports);
        flightsTroughCity("Warszawa", "Szczecin", myAirports);
        flightsTroughCity("Katowice", "Gdansk", myAirports);
    }
}
