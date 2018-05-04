package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlightMain {
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

        FindFlight myTravel = new FindFlight(testAirports);

        Flight myFlight = new Flight("Warsaw","Minsk");
        try{
        myTravel.findFlight(myFlight);
        }
        catch(RouteNotFoundException r){
            System.out.println(r.getMessage());
        }
        Flight yourFlight = new Flight("York", "Oslo");
        try{
            myTravel.findFlight(yourFlight);
        }
        catch(RouteNotFoundException r){
            System.out.println(r.getMessage());
        }
        Flight hisFlight = new Flight("Paris","Tehran");
        try{
            myTravel.findFlight(hisFlight);
        }
        catch(RouteNotFoundException r){
            r.printStackTrace();
            System.out.println(r.getMessage());
        }
        Flight herFlight = new Flight("Barcelona", "Berlin");
        try{
            myTravel.findFlight(herFlight);
        }
        catch(RouteNotFoundException r){
            r.printStackTrace();
            System.out.println(r.getMessage());
        }
        Flight theirFlight = new Flight("New York", "Moscow");
        try{
            myTravel.findFlight(theirFlight);
        }
        catch(RouteNotFoundException r){
            r.printStackTrace();
            System.out.println(r.getMessage());
        }
    }
}
