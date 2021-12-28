package com.kodilla.challenges.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private String airportName;
    private String shortName;
    private List<Airport> destinations = new ArrayList<>();

    public Airport(String shortName, String name) {
        this.shortName = shortName;
        this.airportName = name;
    }

    public String getAirportName() {
        return airportName;
    }

    public String getShortName() {
        return shortName;
    }

    public List<Airport> getDestinations() {
        return destinations;
    }


    @Override
    public String toString() {
        return "Airport: " + getAirportName() + ", abbreviation: " + getShortName() + "\n";
    }
}
