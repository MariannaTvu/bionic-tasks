package com.maryana.task4;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Created by Maryana on 08.12.2016.
 */
public class TimeCounter {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1963, 5, 19);

        System.out.println("Your are " + getAgeInMonth(birthDate) + " month old");
        System.out.println("Your are " + getAgeInDays(birthDate) + " days old");
        System.out.println("You were born on " + dayOfTheWeek(birthDate));
    }

    private static long getAgeInMonth(LocalDate birthDate) {
        Period age = Period.between(birthDate, LocalDate.now());
        return age.toTotalMonths();
    }

    private static long getAgeInDays(LocalDate birthDate) {
        return ChronoUnit.DAYS.between(birthDate, LocalDate.now());
    }

    private static String dayOfTheWeek(LocalDate birthDate) {
       return birthDate.getDayOfWeek().toString().toLowerCase();
    }
}
