package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import com.kodilla.testing.shape.*;

@DisplayName("TDD shape collector test suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Testing shape collector")
    class ShapeTester {

        @Test
        void testAddFigure () {
            //given
         ShapeCollector shapeCollector = new ShapeCollector();
         Circle circle = new Circle();
            //when
            shapeCollector.addFigure(circle);
            //then
            Assertions.assertEquals("Circle", shapeCollector.collection.get(0));
        }
        @Test
        void testRemoveFigure () {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();
            Square square = new Square();
            //when
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.removeFigure(square);
            //then
            Assertions.assertNotEquals(1, shapeCollector.collection.size());
        }

    }
}