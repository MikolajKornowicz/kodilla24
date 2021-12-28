package com.kodilla.challenges.airport;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightRadar {

private final List<Flight> flightList = new ArrayList<>();

    public List <Flight> createFlightList (Flight flight) {
        flightList.add(flight);
        return flightList;
    }

    public void addingProcess (Flight flight){
        createFlightList(flight);
        flight.getFlightMap().put(flight.getDeparture(),flight.getArrival());
    }

public void process (Airport startingAirport, Airport destination){
        String flightToTake = flightList.stream()
                .filter(flight -> flight.getArrival().equals(destination))
                .filter(flight -> flight.getDeparture().equals(startingAirport))
                .map(Flight::getName)
                .collect(Collectors.joining());
    System.out.println("Take:" + flightToTake);
    if (flightToTake.length() == 0){
        String changeTo = flightList.stream()
                        .filter(flight -> flight.getArrival().equals(destination))
                                .map(Flight::getName)
                                        .collect(Collectors.joining());
      String changeDeparturesFrom = flightList.stream()
              .filter(flight -> flight.getName().contains(changeTo))
                        .map(Flight::getDeparture)
              .map(Airport::getAirportName)
                                .collect(Collectors.joining());

      String connectingFlight = flightList.stream()
                      .filter(flight -> flight.getDeparture().equals(startingAirport))
                              .filter(flight -> flight.getArrival().getAirportName().equals(changeDeparturesFrom))
                                      .map(Flight::getName)
                                              .collect(Collectors.joining());
        System.out.println("First take: " + connectingFlight + ", than change to: " + changeTo);
        if (connectingFlight.length() == 0){
            System.out.println("No such flight");
        }
    }
}
}
