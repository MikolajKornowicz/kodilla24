package com.kodilla.exception.test;

public class App {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Gdansk", "Poznan");
        Flight flight2 = new Flight("Krakow", "Warsaw");
        Flight flight3 = new Flight("Warsaw", "NY");
        Flight flight4 = new Flight("Poznan", "Amsterdam");

        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            flightFinder.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            flightFinder.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            flightFinder.findFlight(flight4);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}