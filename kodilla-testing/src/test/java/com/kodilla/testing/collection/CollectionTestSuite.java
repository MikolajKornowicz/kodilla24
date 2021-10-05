package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@DisplayName("Collection test suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

        Random random = new Random();

    @DisplayName("Testing normal list")
        @Test
        void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> expected = Arrays.asList(2,4);
        //When
            oddNumbersExterminator.exterminate(numbers);
            //Then
        Assertions.assertEquals(expected, oddNumbersExterminator.even);
        }
    @DisplayName("Testing empty list")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();
        //When
        oddNumbersExterminator.exterminate(numbers);

        //Then
        Assertions.assertEquals(expected, oddNumbersExterminator.even);
        }
    }