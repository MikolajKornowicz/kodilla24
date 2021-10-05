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
            Assertions.assertEquals(1, shapeCollector.getCollectionSize() );
        }
        @Test
        void testRemoveFigure () {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();
            Square square = new Square();
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            //when
            shapeCollector.removeFigure(square);
            //then
            Assertions.assertEquals(1, shapeCollector.getCollectionSize());
        }
        @Test
        void testGetFigure () {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();
            Square square = new Square();
            Circle circle2 = new Circle();
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(circle2);
            //when
            Shape shape = shapeCollector.getFigure(2);
            //then
            Assertions.assertEquals(circle2, shape);
        }
        @Test
        void testShowFigures () {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle();
            Square square = new Square();
            Triangle triangle = new Triangle();
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            //when
            shapeCollector.showFigures();
            //then

        }
    }
}