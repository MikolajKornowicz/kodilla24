package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;
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
            //When
            for (int n = 0; n < 20; n++) {
                oddNumbersExterminator.numbers.add(random.nextInt(99 + 1));
            }
            oddNumbersExterminator.exterminate(oddNumbersExterminator.numbers);

            //Then
            System.out.println(oddNumbersExterminator.getEven());
            System.out.println(oddNumbersExterminator.getOdd());
        }
    @DisplayName("Testing empty list")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        oddNumbersExterminator.exterminate(oddNumbersExterminator.numbers);

        //Then

    }
    }