package com.kodilla.good.patterns.flightsearch;

import java.util.List;

public class Airport {
    private String name;
    List<String> destinations;

    public Airport(String name, List<String> destinations) {
        this.name = name;
        this.destinations = destinations;
    }

    public String getName() {
        return name;
    }

    public List<String> getDestinations() {
        return destinations;
    }
}
