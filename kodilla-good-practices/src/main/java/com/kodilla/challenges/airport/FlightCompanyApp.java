package com.kodilla.challenges.airport;

public class FlightCompanyApp {

    public static void main (String [] args ) {

        Airport airport1 = new Airport("GDA", "Gdańsk");
        Airport airport2 = new Airport("POZ", "Poznań");
        Airport airport3 = new Airport("WAW", "Warszawa");
        Airport airport4 = new Airport("WRC", "Wrocław");
        Airport airport5 = new Airport("NYC", "New York");

        Flight flight01 = new Flight(airport1, airport2, "Flight 01");
        Flight flight02 = new Flight(airport2, airport1, "Flight 02");
        Flight flight03 = new Flight(airport1, airport3, "Flight 03");
        Flight flight04 = new Flight(airport2, airport3, "Flight 04");
        Flight flight05 = new Flight(airport4, airport1, "Flight 05");
        Flight flight06 = new Flight(airport2, airport4, "Flight 06" );
        Flight flight07 = new Flight(airport4, airport3, "Flight 07");
        Flight flight08 = new Flight(airport3,airport5,"Flight 08");

        FlightRadar flightRadar = new FlightRadar();
        flightRadar.addingProcess(flight01);
        flightRadar.addingProcess(flight02);
        flightRadar.addingProcess(flight03);
        flightRadar.addingProcess(flight04);
        flightRadar.addingProcess(flight05);
        flightRadar.addingProcess(flight06);
        flightRadar.addingProcess(flight07);
        flightRadar.addingProcess(flight08);

       flightRadar.process(airport2,airport5);

    }
}
