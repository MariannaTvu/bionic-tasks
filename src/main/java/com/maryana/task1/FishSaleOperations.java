package com.maryana.task1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Maryana on 08.12.2016.
 */
public class FishSaleOperations {
    private List<FishSaleOperation> operationList = new LinkedList<>();

    public void add(FishSaleOperation fishSaleOperation) {
        operationList.add(fishSaleOperation);
    }

    public BigDecimal getIncome() {
        BigDecimal sum = BigDecimal.valueOf(0);
        for (FishSaleOperation operation : operationList) {
            sum = sum.add(operation.calculateIncome());
        }
        return sum;
    }
}
