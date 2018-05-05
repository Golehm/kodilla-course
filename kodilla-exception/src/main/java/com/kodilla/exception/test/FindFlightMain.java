package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFlightMain {
    Map<String, Boolean> airportsMap;
    public FindFlightMain(Map<String, Boolean> airportsMap) {
        this.airportsMap = airportsMap;
    }
    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> searchedDeparture = airportsMap.entrySet().stream()
                .filter(map -> flight.getDepartureAirport().equals(map.getKey()))
                .collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue()));
        Map<String, Boolean> searchedArrival = airportsMap.entrySet().stream()
                .filter(map -> flight.getArrivalAirport().equals(map.getKey()))
                .collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue()));
        if(searchedDeparture.containsValue(Boolean.TRUE) && searchedArrival.containsValue(Boolean.TRUE)){
            System.out.println("Departure from " + searchedDeparture.keySet()
                    + " Arrival into " + searchedArrival.keySet());
        }
        else{
            throw new RouteNotFoundException();
        }
        Map<String, Boolean> result = new HashMap<>();
        result.putAll(searchedDeparture);
        result.putAll(searchedArrival);
        return  result;
    }
    public static void main(String args[]){
        Map<String, Boolean> testAirports = new HashMap<String, Boolean>();

        testAirports.put("Berlin", true);
        testAirports.put("Warsaw", false);
        testAirports.put("New York",false);
        testAirports.put("Paris",true);
        testAirports.put("Beijing",true);
        testAirports.put("Barcelona", false);
        testAirports.put("Moscow", false);
        testAirports.put("Buenos Aires", true);
        testAirports.put("Tehran", true);
        testAirports.put("Minsk", true);

        FindFlightMain findFlightMain = new FindFlightMain(testAirports);
        Flight myFlight = new Flight("Warsaw","Minsk");
        try{
            findFlightMain.findFlight(myFlight);
        }
        catch(RouteNotFoundException r){
            System.out.println(r.getMessage());
        }
        finally {
            System.out.println("Search ended");
        }
        Flight yourFlight = new Flight("York", "Oslo");
        try{
            findFlightMain.findFlight(yourFlight);
        }
        catch(RouteNotFoundException r){
            System.out.println(r.getMessage());
        }
        finally {
            System.out.println("Search ended");
        }
        Flight hisFlight = new Flight("Paris","Tehran");
        try{
            findFlightMain.findFlight(hisFlight);
        }
        catch(RouteNotFoundException r){
            System.out.println(r.getMessage());
        }
        finally {
            System.out.println("Search ended");
        }
        Flight herFlight = new Flight("Barcelona", "Berlin");
        try{
            findFlightMain.findFlight(herFlight);
        }
        catch(RouteNotFoundException r){
            System.out.println(r.getMessage());
        }
        finally {
            System.out.println("Search ended");
        }
        Flight theirFlight = new Flight("New York", "Moscow");
        try{
            findFlightMain.findFlight(theirFlight);
        }
        catch(RouteNotFoundException r){
            System.out.println(r.getMessage());
        }
        finally {
            System.out.println("Search ended");
        }
    }
}
