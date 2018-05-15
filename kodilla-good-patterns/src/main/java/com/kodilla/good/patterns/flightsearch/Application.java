package com.kodilla.good.patterns.flightsearch;

import java.util.List;

public class Application {
    public static void main(String[] argv) {
        FindFlight initAir = new FindFlight();
        List<Airport> myAirports = initAir.initialize();
        initAir.flightsFromCity("Warszawa", myAirports);
        initAir.flightsToCity("Lodz", myAirports);
        initAir.flightsTroughCity("Warszawa", "Szczecin", myAirports);
        initAir.flightsTroughCity("Katowice", "Gdansk", myAirports);
    }
}
