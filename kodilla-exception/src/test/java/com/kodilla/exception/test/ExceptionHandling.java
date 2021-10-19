package com.kodilla.exception.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.1, 2.2);
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
        Assertions.assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.1,2.2));
    }
    /* @Test
    void testException () {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        String exception = "Wrong data type";
        //when&then
        Assertions.assertThrows(SecondChallenge.class, secondChallenge.probablyIWillThrowException(1,1));
    }

     */
}