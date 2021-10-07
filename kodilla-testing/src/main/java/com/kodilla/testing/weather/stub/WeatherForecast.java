package com.kodilla.testing.weather.stub;

import java.rmi.MarshalledObject;
import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;
    private double sum;
    private double mean;
    private int quantity;
    private double median;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double meanCalculator () {
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
            quantity ++;

        }
        return mean = sum/quantity;
    }
    public double calculateMedian () {
        List <Double> temperaturesAscending = new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            temperaturesAscending.add(temperature.getValue());
        }
            Collections.sort(temperaturesAscending);
        if (temperaturesAscending.size() %2 != 0) {
            median = temperaturesAscending.get(temperaturesAscending.size()/2);
        } else {
            median = temperaturesAscending.get(temperaturesAscending.size()/2 + (temperaturesAscending.size() - 1)/2);
        }
        return median;
    }
}
