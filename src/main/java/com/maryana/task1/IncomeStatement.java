package com.maryana.task1;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by Maryana on 07.12.2016.
 */
public class IncomeStatement {
    private Map<String, FishSaleOperations> fishNameToOperations = new HashMap<>();

    public void add(FishSaleOperation fishSaleOperation) {

        FishSaleOperations operations = fishNameToOperations.get(fishSaleOperation.getFishName());
        if (operations==null) {
            FishSaleOperations newOperations = new FishSaleOperations();
            newOperations.add(fishSaleOperation);
            fishNameToOperations.put(fishSaleOperation.getFishName(), newOperations);
        } else {
            operations.add(fishSaleOperation);
        }
    }

    public FishSaleOperations getOperations(String fishName) {
        return fishNameToOperations.get(fishName);
    }

    public BigDecimal getIncome(String fishName){
     return getOperations(fishName).getIncome();
    }
}
