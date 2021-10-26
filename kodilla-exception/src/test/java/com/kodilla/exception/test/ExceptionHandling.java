package com.kodilla.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(2, 0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Wrong data type" + e);
        } finally {
            System.out.println("There had to be an exception");
        }
    }


    @Test
    void testNoException () {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when&then
        Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1,2));
    }

   @Test
    void testException () {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //when&then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1.5));
    }

    @Test
    void assertAllTests () {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When&Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1.5))

        );
    }

}