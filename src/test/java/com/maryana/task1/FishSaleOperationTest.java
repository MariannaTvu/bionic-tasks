package com.maryana.task1;

import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Maryana on 07.12.2016.
 */
public class FishSaleOperationTest {
    @Test
    public void testIncomeResult() throws Exception {
        FishSaleOperation testOperation = createOperationOne();
        assertThat(testOperation.calculateIncome(), is(BigDecimal.valueOf(5000)));
    }

    @Test
    public void testArrayIncomeResult() throws Exception {
        IncomeStatement incomeStatement = new IncomeStatement();
        incomeStatement.add(createOperationOne());
        incomeStatement.add(createOperationOne());
        incomeStatement.add(getOperationTwo());

        assertThat(incomeStatement.getIncome("Salmon"), is(BigDecimal.valueOf(10000)));
        assertThat(incomeStatement.getIncome("Parrot fish"), is(BigDecimal.valueOf(5000)));
    }

    private FishSaleOperation getOperationTwo() {
        FishSaleOperation testOperationThree = new FishSaleOperation("Parrot fish");
        testOperationThree.setPurchasePricePerKg(BigDecimal.valueOf(100));
        testOperationThree.setSalePricePerKg(BigDecimal.valueOf(150));
        testOperationThree.setWeightOfSoldFish(500);
        testOperationThree.setPurchaseDate(DateUtils.getTimestamp(2015, 5, 3));
        testOperationThree.setSaleDate(DateUtils.getTimestamp(2015, 5, 5));
        return testOperationThree;
    }

    private FishSaleOperation createOperationOne() {
        FishSaleOperation testOperationOne = new FishSaleOperation("Salmon");
        testOperationOne.setPurchasePricePerKg(BigDecimal.valueOf(100));
        testOperationOne.setSalePricePerKg(BigDecimal.valueOf(150));
        testOperationOne.setWeightOfSoldFish(500);
        testOperationOne.setPurchaseDate(DateUtils.getTimestamp(2015, 5, 3));
        testOperationOne.setSaleDate(DateUtils.getTimestamp(2015, 5, 5));
        return testOperationOne;
    }
}