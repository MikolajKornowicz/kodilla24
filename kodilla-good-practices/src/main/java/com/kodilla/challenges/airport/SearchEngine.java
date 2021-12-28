package com.kodilla.challenges.airport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchEngine {

    private List<Airport> destinationList = new ArrayList<>();
    private List<Flight> flightList = new ArrayList<>();
    private List<Airport> flightsFrom = new ArrayList<>();
    private List<Airport> flightsTo = new ArrayList<>();
    private Map<Airport, Airport> flightMap = new HashMap<>();
    private List<String> plausibleFlights = new ArrayList<>();

    public List<Airport> flightMapSetter (Flight flight){
     flightsFrom.add(flight.getDeparture());
     flightsTo.add(flight.getArrival());
     flightMap.put(flight.getDeparture(), flight.getArrival());
     flightList.add(flight);
     return flightsTo;
    }

    public List<String> flightRadar (Airport from, Airport to) {
        if(flightsFrom.contains(from) && flightsTo.contains(to)){
       plausibleFlights = flightMap.entrySet().stream()
                 .filter(airportAirportEntry -> airportAirportEntry.getKey().equals(from))
                 .filter(airportAirportEntry -> airportAirportEntry.getValue().equals(to))
                 .map(airportAirportEntry -> airportAirportEntry.getKey().getAirportName())
                 .collect(Collectors.toList());

            System.out.println("Success!");
       return plausibleFlights;

        }else {
            System.out.println("Error! Unable to find flight");
        }
        return plausibleFlights;
    }

    /*public List<Flight> flightFinder (Airport from, Airport to){
        if (flightMap.containsKey(
    }

     */
    public Map<Airport, Airport> getFlightMap() {
        return flightMap;
    }
    public List<Airport> getDestinationList() {
        return destinationList;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public List<Airport> getFlightsFrom() {
        return flightsFrom;
    }

    public List<Airport> getFlightsTo() {
        return flightsTo;
    }

    public List<String> getPlausibleFlights() {
        return plausibleFlights;
    }
}
