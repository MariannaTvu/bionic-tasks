package com.maryana.task3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 3.	Given an array of following objects:
 * -	squares (side length)
 * -	rectangles (width and height)
 * -	circles (radius)
 * Find general area of all these figures
 */

public class GeneralArea {
    public static BigDecimal getGeneralArea(List<Shape> shapes){
        BigDecimal generalArea = BigDecimal.valueOf(0);
        for (Shape shape : shapes){
            generalArea = generalArea.add(shape.getArea());
        }
        return generalArea;
    }

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Shape square = new Square(BigDecimal.valueOf(2));
        Shape rectangle = new Rectangle(BigDecimal.valueOf(2), BigDecimal.valueOf(4));
        Shape circle = new Circle(BigDecimal.valueOf(10));

        shapes.add(square);
        shapes.add(circle);
        shapes.add(rectangle);

        System.out.println("General area is: " + getGeneralArea(shapes));
    }
}
