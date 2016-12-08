package com.maryana.task3;

import java.math.BigDecimal;

/**
 * Created by Maryana on 08.12.2016.
 */
public class Rectangle implements Shape {
    private BigDecimal heigth;
    private BigDecimal width;

    public Rectangle (BigDecimal heigth, BigDecimal width) {
        this.heigth = heigth;
        this.width = width;
    }

    @Override
    public BigDecimal getArea() {
        return heigth.multiply(width);
    }
}
