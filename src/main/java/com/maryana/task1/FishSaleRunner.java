package com.maryana.task1;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Maryana on 07.12.2016.
 */
public class FishSaleRunner {

    public static void main(String[] args) {
        FishSaleOperation firstSalmonOperation = new FishSaleOperation("Salmon");
        firstSalmonOperation.setPurchasePricePerKg(BigDecimal.valueOf(100));
        firstSalmonOperation.setSalePricePerKg(BigDecimal.valueOf(150));
        firstSalmonOperation.setPurchaseDate(DateUtils.getTimestamp(2015, 5, 3));
        firstSalmonOperation.setSaleDate(DateUtils.getTimestamp(2015, 5, 5));
        firstSalmonOperation.setWeightOfSoldFish(500);

        FishSaleOperation secondSalmonOperation = new FishSaleOperation("Salmon");
        secondSalmonOperation.setPurchasePricePerKg(BigDecimal.valueOf(200));
        secondSalmonOperation.setSalePricePerKg(BigDecimal.valueOf(230));
        secondSalmonOperation.setPurchaseDate(DateUtils.getTimestamp(2015, 4, 29));
        secondSalmonOperation.setSaleDate(DateUtils.getTimestamp(2015, 5, 3));
        secondSalmonOperation.setWeightOfSoldFish(600);

        List<FishSaleOperation> operationList = new ArrayList<>();
        operationList.add(firstSalmonOperation);
        operationList.add(secondSalmonOperation);

    }
}
