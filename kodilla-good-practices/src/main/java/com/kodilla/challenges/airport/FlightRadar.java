package com.kodilla.challenges.airport;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightRadar {

private final List<Flight> flightList = List.of(
        new Flight("GDA", "WRO"),
        new Flight("WRO", "WAW"),
        new Flight("WAW", "WRO"),
        new Flight("GDA", "WAW"),
        new Flight("GDA", "KRK"),
        new Flight("WRO", "KRK"),
        new Flight ("WAW", "GDA")

);

public List<Flight> allFrom (String city) {
    return flightList.stream()
            .filter(flight -> flight.getDeparture().equals(city))
            .collect(Collectors.toList());
}
    public List<Flight> allTo (String city) {
        return flightList.stream()
                .filter(flight -> flight.getArrival().equals(city))
                .collect(Collectors.toList());
    }
public List<List <Flight>> allFlightsFromTo (String start, String destination) {
    List <Flight> allFrom = allFrom(start);
    List <Flight> allTo = allTo(destination);

    List <List <Flight>> flightList = new ArrayList<>();
    allFrom.stream()
            .filter(flight -> allTo.contains(new Flight(flight.getArrival(), destination)))
            .forEach(flight -> {
                flightList.add(List.of(
                        flight,
                        new Flight(flight.getArrival(), destination)
                ));
            });
    return flightList;
}
}
