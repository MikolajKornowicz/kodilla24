package com.kodilla.challenges.airport;

import java.util.List;
class FlightCompanyApp {

    public static void main (String [] args ) {

        FlightRadar flightRadar = new FlightRadar();
        List<Flight> flightList = flightRadar.allFrom("WAW");
        System.out.println(flightList);
        List<Flight> flightsTo = flightRadar.allTo("KRK");
        System.out.println(flightsTo);
        List<List <Flight>> allToFrom = flightRadar.allFlightsFromTo("WAW", "KRK");
        System.out.println(allToFrom);

    }
}
