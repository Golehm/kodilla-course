package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFlight {
   private Map<String, Boolean> airportsMap;

    public FindFlight(Map<String, Boolean> airportsMap) {
        this.airportsMap = airportsMap;
    }
    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> searchedDeparture = airportsMap.entrySet().stream()
                .filter(map -> flight.getDepartureAirport().equals(map.getKey()))
                .collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue()));
        Map<String, Boolean> searchedArrival = airportsMap.entrySet().stream()
                .filter(map -> flight.getArrivalAirport().equals(map.getKey()))
                .collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue()));
        if(searchedDeparture.size() == 0 || searchedArrival.size() == 0){
            throw new RouteNotFoundException();
        }
        if(searchedDeparture.containsValue(Boolean.TRUE) && searchedArrival.containsValue(Boolean.TRUE)){
            System.out.println("Departure from " + searchedDeparture.keySet()
                                + " Arrival into " + searchedArrival.keySet());
        }
        if(searchedDeparture.containsValue(Boolean.TRUE) && searchedArrival.containsValue(Boolean.FALSE)){
            System.out.println("Departure from " + searchedDeparture.keySet()
                    + " Arrival into airport out of order " + searchedArrival.keySet());
        }
        if(searchedDeparture.containsValue(Boolean.FALSE) && searchedArrival.containsValue(Boolean.TRUE)){
            System.out.println("Departure from airport out of order " + searchedDeparture.keySet()
                    + " Arrival into " + searchedArrival.keySet());
        }
        if(searchedDeparture.containsValue(Boolean.FALSE) && searchedArrival.containsValue(Boolean.FALSE)){
            System.out.println("Departure from airport out of order " + searchedDeparture.keySet()
                    + " Arrival into airport out of order " + searchedArrival.keySet());
        }
        Map<String, Boolean> result = new HashMap<>();
        result.putAll(searchedDeparture);
        result.putAll(searchedArrival);
        return  result;
    }
}
