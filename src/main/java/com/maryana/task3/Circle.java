package com.maryana.task3;

import java.math.BigDecimal;

/**
 * Created by Maryana on 08.12.2016.
 */
public class Circle implements Shape {
    private BigDecimal radius;

    public Circle(BigDecimal radius) {
        this.radius = radius;
    }

    @Override
    public BigDecimal getArea() {
        return radius.multiply(radius).multiply(BigDecimal.valueOf(Math.PI));
    }
}
