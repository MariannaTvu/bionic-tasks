package com.maryana.task1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/**
 * Created by Maryana on 07.12.2016.
 */
public class FishSaleOperation{
    private String fishName;
    private BigDecimal purchasePricePerKg;
    private BigDecimal salePricePerKg;
    private int weightOfSoldFish;
    private LocalDate purchaseDate;
    private LocalDate saleDate;
    private BigDecimal constOverheads = BigDecimal.valueOf(20);


    public FishSaleOperation(String fishName) {
        this.fishName = fishName;
    }

    public BigDecimal calculateIncome() {
        long daysCount = DateUtils.countDays(purchaseDate, saleDate);
        BigDecimal priceOfStorage = constOverheads.multiply(BigDecimal.valueOf(daysCount));
        BigDecimal incomePerKg = salePricePerKg.subtract(purchasePricePerKg).subtract(priceOfStorage);

        return incomePerKg.multiply(BigDecimal.valueOf(weightOfSoldFish));
    }

    public String getFishName() {
        return fishName;
    }

    public FishSaleOperation setPurchasePricePerKg(BigDecimal purchasePricePerKg) {
        this.purchasePricePerKg = purchasePricePerKg;
        return this;
    }

    public FishSaleOperation setSalePricePerKg(BigDecimal salePricePerKg) {
        this.salePricePerKg = salePricePerKg;
        return this;
    }

    public FishSaleOperation setWeightOfSoldFish(int weightOfSoldFish) {
        this.weightOfSoldFish = weightOfSoldFish;
        return this;
    }

    public FishSaleOperation setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
        return this;
    }

    public FishSaleOperation setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
        return this;
    }
}

