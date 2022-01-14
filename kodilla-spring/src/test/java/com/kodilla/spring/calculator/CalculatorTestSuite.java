package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;
    private double a = 5;
    private double b = 7;

    @Test
    void testCalculatorAdd () {
        //given
        //when
        double result = calculator.add(a, b);
        //then
        Assertions.assertEquals(12, result);
    }
    @Test
    void testCalculatorSubtract () {
        //given
        //when
        double result = calculator.subtract(a, b);
        //then
        Assertions.assertEquals(-2, result);
    }
    @Test
    void testCalculatorMultiply () {
        //given
        //when
        double result = calculator.multiply(a, b);
        //then
        Assertions.assertEquals(35, result);
    }

    @Test
    void testCalculatorDivide () {
        //given
        //when
        double result = calculator.divide(a, b);
        //then
        Assertions.assertEquals(0.7142857142857143, result);
    }
}
