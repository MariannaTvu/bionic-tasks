package com.maryana.task1;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/**
 * Created by Maryana on 07.12.2016.
 */
public class FishSaleOperation implements Comparator<FishSaleOperation> {
    private String fishName;
    private BigDecimal purchasePricePerKg;
    private BigDecimal salePricePerKg;
    private int weightOfSoldFish;
    private long purchaseDate;
    private long saleDate;
    private BigDecimal constOverheads = BigDecimal.valueOf(20);


    public FishSaleOperation(String fishName) {
        this.fishName = fishName;
    }

    public BigDecimal calculateIncome() {
        long daysCount = TimeUnit.MILLISECONDS.toDays(saleDate - purchaseDate);
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

    public FishSaleOperation setPurchaseDate(long purchaseDate) {
        this.purchaseDate = purchaseDate;
        return this;
    }

    public FishSaleOperation setSaleDate(long saleDate) {
        this.saleDate = saleDate;
        return this;
    }

    @Override
    public int compare(FishSaleOperation f1, FishSaleOperation f2) {
        return f1.fishName.compareTo(f2.fishName);
    }
}

