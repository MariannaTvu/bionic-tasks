package com.maryana.task3;

import java.math.BigDecimal;

/**
 * Created by Maryana on 08.12.2016.
 */
public class Square implements Shape {
    private BigDecimal sideLength;

    public Square(BigDecimal sideLength) {
    this.sideLength = sideLength;
    }

    @Override
    public BigDecimal getArea() {
        return sideLength.pow(2);
    }
}
