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
        for (int m = 0; m < oddNumbersExterminator.even.size(); m++) {
            if (oddNumbersExterminator.even.get(m) % 2 == 0) {
                System.out.println("Even works");
            } else {
                System.out.println("Even error");
            }
        }
        for (int o = 0; o < oddNumbersExterminator.odd.size(); o++) {
            if (oddNumbersExterminator.odd.get(o) % 2 != 0) {
                System.out.println("Odd works");
            } else {
                System.out.println("Odd error");
            }
        }
        }
    @DisplayName("Testing empty list")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //When
        oddNumbersExterminator.exterminate(oddNumbersExterminator.numbers);

        //Then
        if (oddNumbersExterminator.exterminate(oddNumbersExterminator.numbers).size() == 0) {
            System.out.println("Empty list works");
        }else {
            System.out.println("Empty list error");
        }

    }
    }