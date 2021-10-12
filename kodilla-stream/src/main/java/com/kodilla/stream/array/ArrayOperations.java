package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public final class ArrayOperations {

    public static Double getAverage(int [] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(index -> System.out.println(numbers[index]));
        Double avg = IntStream.of(numbers).average().orElse(0.0);
        return avg;
    }
}
