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

        getAgeInMonth(birthDate);
        getAgeInDays(birthDate);
        dayOfTheWeek(birthDate);
    }

    private static void getAgeInMonth(LocalDate birthDate) {
        Period age = Period.between(birthDate, LocalDate.now());
        System.out.println("Your are " + age.toTotalMonths() + " month old");
    }

    private static void getAgeInDays(LocalDate birthDate) {
        long days = ChronoUnit.DAYS.between(birthDate, LocalDate.now());
        System.out.println("Your are " + days + " days old");
    }

    private static void dayOfTheWeek(LocalDate birthDate) {
        System.out.println("You were born on " + birthDate.getDayOfWeek().toString().toLowerCase());
    }
}
