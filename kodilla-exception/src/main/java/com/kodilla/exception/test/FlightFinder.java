package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Krakow", true);
        flightMap.put("Poznan", true);
        flightMap.put("Warsaw", true);
        flightMap.put("Gdansk", true);
        flightMap.put("Amsterdam", false);

        Boolean departureAirport = flightMap.get(flight.getDepartureAirport());
        Boolean arrivalAirport = flightMap.get(flight.getArrivalAirport());
        if(arrivalAirport == null || !arrivalAirport){
            throw new RouteNotFoundException("No such flight"  + flight);
        }
        if(departureAirport == null || !departureAirport){
            throw new RouteNotFoundException("No such flight: " + flight);
        }
        System.out.println("Flight found: " + flight);
    }
}
