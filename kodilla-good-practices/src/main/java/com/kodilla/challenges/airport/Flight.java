package com.kodilla.challenges.airport;

import java.util.HashMap;
import java.util.Map;

public class Flight {

    private Airport departure;
    private Airport arrival;
    private String name;
    private Map<Airport, Airport> flightMap = new HashMap<>();

    public Flight(Airport departure, Airport arrival, String name) {
        this.departure = departure;
        this.arrival = arrival;
        this.name = name;

    }

    public Airport getDeparture() {
        return departure;
    }

    public Airport getArrival() {
        return arrival;
    }

    public String getName() {
        return name;
    }

    public Map<Airport, Airport> getFlightMap() {
        return flightMap;
    }

    @Override
    public String toString() {
        return "Flight: " + name + ", from: " + departure + ", to: " + arrival;
    }
}
