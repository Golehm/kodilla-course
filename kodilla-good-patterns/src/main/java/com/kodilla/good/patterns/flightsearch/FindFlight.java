package com.kodilla.good.patterns.flightsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFlight {
    private static final String WROCLAW = "Wroclaw";
    private static final String POZNAN = "Poznan";
    private static final String GDANSK = "Gdansk";
    private static final String LODZ = "Lodz";
    private static final String WARSZAWA = "Warszawa";
    private static final String RZESZOW = "Rzeszow";
    private static final String SZCZECIN = "Szczecin";
    private static final String KATOWICE = "Katowice";
    private static final String KRAKOW = "Krakow";
    public List<Airport> initialize(){
        List<Airport> airports = new ArrayList<>();
        List<String> krakow = Arrays.asList(WROCLAW, POZNAN, GDANSK);
        List<String> wroclaw = Arrays.asList(LODZ, WARSZAWA, GDANSK, POZNAN);
        List<String> lodz = Arrays.asList(WROCLAW, GDANSK);
        List<String> katowice = Arrays.asList(RZESZOW, GDANSK, POZNAN, SZCZECIN);
        List<String> szczecin = Arrays.asList(GDANSK, WARSZAWA, KRAKOW, KATOWICE, WROCLAW);
        List<String> poznan = Arrays.asList(WROCLAW, WARSZAWA, GDANSK, SZCZECIN);
        List<String> gdansk = Arrays.asList(SZCZECIN, POZNAN, WROCLAW, KATOWICE, KRAKOW, LODZ, WARSZAWA);
        List<String> rzeszow = Arrays.asList(KATOWICE, WROCLAW, POZNAN, GDANSK, WARSZAWA);
        List<String> warszawa = Arrays.asList(GDANSK, RZESZOW, SZCZECIN, WROCLAW);
        airports.add(new Airport(KRAKOW, krakow));
        airports.add(new Airport(WROCLAW, wroclaw));
        airports.add(new Airport(LODZ, lodz));
        airports.add(new Airport(KATOWICE, katowice));
        airports.add(new Airport(SZCZECIN, szczecin));
        airports.add(new Airport(POZNAN, poznan));
        airports.add(new Airport(GDANSK, gdansk));
        airports.add(new Airport(RZESZOW, rzeszow));
        airports.add(new Airport(WARSZAWA, warszawa));
        return airports;
    }
    public void flightsFromCity(String city, List<Airport> airports) {
        System.out.print("Flights to " + city + ": ");
        airports.stream().filter(a -> a.getName().equals(city))
                .map(a -> a.getDestinations()).forEach(System.out::println);
    }
    public void flightsToCity(String city, List<Airport> airports) {
        System.out.print("Flights to " + city + ": ");
        for (Airport airport: airports){
            if (airport.getDestinations().stream().anyMatch(c -> c.contains(city))){
                System.out.print(airport.getName() + ", ");
            }
        }
        System.out.println();
    }
    public void flightsTroughCity(String from, String to, List<Airport> airports) {
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
}
