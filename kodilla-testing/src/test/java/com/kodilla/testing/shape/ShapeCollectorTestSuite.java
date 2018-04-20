package com.kodilla.testing.shape;

import com.sun.prism.shader.DrawCircle_LinearGradient_PAD_AlphaTest_Loader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//import com.kodilla.testing.shape.ShapeCollector;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(3.1415926);
        Triangle triangle = new Triangle(3.0);
        Rectangle rectangle = new Rectangle(3.3);
        Square square = new Square(3.333);
        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(rectangle);
        shapeCollector.addFigure(square);
        //Then
        Assert.assertEquals(4, shapeCollector.size());
    }
    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(3.1415926);
        Triangle triangle = new Triangle(3.0);
        Rectangle rectangle = new Rectangle(3.3);
        Square square = new Square(3.333);
        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(rectangle);
        shapeCollector.addFigure(square);
        boolean bool1 = shapeCollector.removeFigure(rectangle);
        boolean bool2 = shapeCollector.removeFigure(circle);
        boolean bool3 = shapeCollector.removeFigure(square);
        boolean bool4 = shapeCollector.removeFigure(triangle);
        //Then
        Assert.assertTrue(bool1);
        Assert.assertTrue(bool2);
        Assert.assertTrue(bool3);
        Assert.assertTrue(bool4);
        Assert.assertEquals(0, shapeCollector.size());
    }
    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(3.1415926);
        Triangle triangle = new Triangle(3.0);
        Rectangle rectangle = new Rectangle(3.3);
        Square square = new Square(3.333);
        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(rectangle);
        shapeCollector.addFigure(square);
        Shape retrievedShape = shapeCollector.getFigure(2);
        //Then
        Assert.assertEquals(rectangle, retrievedShape);
    }
    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(3.1415926);
        Triangle triangle = new Triangle(3.0);
        Rectangle rectangle = new Rectangle(3.3);
        Square square = new Square(3.333);
        //When
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(rectangle);
        shapeCollector.addFigure(square);
        //Then
        System.out.println("Testing showFigures:");
        shapeCollector.showFigures();
    }
}
