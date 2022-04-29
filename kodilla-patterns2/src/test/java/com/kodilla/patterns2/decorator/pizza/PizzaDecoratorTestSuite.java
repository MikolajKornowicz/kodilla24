package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PizzaDecoratorTestSuite {

    @Test
    public void testMargheritaPizza(){
        //given
        PizzaRequest margherita = new BasicPizza();
        margherita = new PizzaDecoratorCheeseDecorator(margherita);
        //when
        String dough = margherita.getBottom();
        int toppings = margherita.getToppings().size();
        BigDecimal price = margherita.getPrice();
        //then
        assertEquals("basic dough", dough);
        assertEquals(2, toppings);
        assertEquals(new BigDecimal(19), price);

    }


    @Test
    public void testFullGrainPizza(){
        //given
        PizzaRequest margherita = new BasicPizza();
        margherita = new PizzaDecoratorCheeseDecorator(margherita);
        margherita = new PremiumDoughDecorator(margherita);
        //when
        String dough = margherita.getBottom();
        int toppings = margherita.getToppings().size();
        BigDecimal price = margherita.getPrice();
        //then
        assertEquals("Whole Grain Dough", dough);
        assertEquals(2, toppings);
        assertEquals(new BigDecimal(24), price);

    }

    @Test
    public void testProteinFullGrainPizza(){
        //given
        PizzaRequest margherita = new BasicPizza();
        margherita = new PizzaDecoratorCheeseDecorator(margherita);
        margherita = new PremiumDoughDecorator(margherita);
        margherita = new PizzaDecoratorProteinDecorator(margherita);
        //when
        String dough = margherita.getBottom();
        int toppings = margherita.getToppings().size();
        BigDecimal price = margherita.getPrice();
        //then
        assertEquals("Whole Grain Dough", dough);
        assertEquals(3, toppings);
        assertEquals(new BigDecimal(29), price);

    }

    @Test
    public void testVegetableProteinFullGrainPizza(){
        //given
        PizzaRequest margherita = new BasicPizza();
        margherita = new PizzaDecoratorCheeseDecorator(margherita);
        margherita = new PremiumDoughDecorator(margherita);
        margherita = new PizzaDecoratorProteinDecorator(margherita);
        margherita = new PizzaDecoratorVegetablesDecorator(margherita);
        //when
        String dough = margherita.getBottom();
        int toppings = margherita.getToppings().size();
        BigDecimal price = margherita.getPrice();
        //then
        assertEquals("Whole Grain Dough", dough);
        assertEquals(4, toppings);
        assertEquals(new BigDecimal(32), price);

    }
}