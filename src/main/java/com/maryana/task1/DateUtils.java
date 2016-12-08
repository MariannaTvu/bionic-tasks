package com.maryana.task1;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Maryana on 07.12.2016.
 */
public class DateUtils {

    private DateUtils() {}

    public static long getTimestamp(int year, int month, int dayOfMonth) {
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, dayOfMonth);
        Date date = calendar.getTime();
        return date.getTime();
    }
}
