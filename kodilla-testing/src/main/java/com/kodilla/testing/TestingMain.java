package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.SimpleCalculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Testing calculator: \n");
        SimpleCalculator calculator = new SimpleCalculator(10,5);

        calculator.add();
        int addition = calculator.getAddresult();
        if (addition == calculator.getAddresult()){
            System.out.println("Addition works");
        } else {
            System.out.println("Addition error");
        }

        calculator.subtract();
        int subtraction = calculator.getSubresult();
        if (subtraction == calculator.getSubresult()){
            System.out.println("Subtraction works");
        } else {
            System.out.println("Subtraction error");
        }
    }
}