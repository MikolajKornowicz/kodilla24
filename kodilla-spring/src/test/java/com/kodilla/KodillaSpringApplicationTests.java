package com.kodilla;

import com.kodilla.shape.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class KodillaSpringApplicationTests {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("Test Circle Loaded")
    @Test
    void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.shape");
        Shape shape = context.getBean(Circle.class);

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a circle.", name);
    }

    @DisplayName("Test Triangle Loaded")
    @Test
    void testTriangleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.shape");
        Shape shape = context.getBean(Triangle.class);

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a triangle.", name);
    }

    @DisplayName("Void test")
    @Test
    void contextLoads() {
    }

    @DisplayName("Test Square Loaded")
    @Test
    void testSquareLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.shape");
        Shape shape = context.getBean(Square.class);
        //When
        String name = shape.getShapeName();
        //Then
        assertEquals("This is a square.", name);
    }

    // inne metody

    @DisplayName("Test Circle Loaded method (Shape) get name")
    @Test
    void testCircleLoadedIntoContainer1() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.shape");
        Shape shape = (Shape)context.getBean("circle");

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a circle.", name);
    }

    @DisplayName("Test Triangle Loaded method (Shape) get name")
    @Test
    void testTriangleLoadedIntoContainer1() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.shape");
        Shape shape = (Shape)context.getBean("triangle");

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a triangle.", name);
    }

    @DisplayName("Test Square Loaded method (Shape) get name")
    @Test
    void testSquareLoadedIntoContainer1() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.shape");
        Shape shape = (Shape)context.getBean("createSquare");

        //When
        String name = shape.getShapeName();

        //Then
        assertEquals("This is a square.", name);
    }

   /* @DisplayName("Test Random Shape Loaded method (Shape) get name")
    @Test
    void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.shape");
        Shape shape = (Shape)context.getBean("chosenShape");

        //When
        String name = shape.getShapeName();

        //Then
        System.out.println("Chosen shape says: " + name);


  }

    */
}
