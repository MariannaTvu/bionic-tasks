package com.maryana.task1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by Maryana on 07.12.2016.
 */
public class DateUtils {

    private DateUtils() {}

    public static LocalDate getTimestamp(int year, int month, int dayOfMonth) {
        LocalDate date = LocalDate.of(year, month, dayOfMonth);
        return date;
    }

    public static long countDays(LocalDate purchaseDate, LocalDate saleDate){
        return ChronoUnit.DAYS.between(purchaseDate, saleDate);
    }
}
