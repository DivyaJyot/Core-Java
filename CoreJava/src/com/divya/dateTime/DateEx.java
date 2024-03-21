package com.divya.dateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateEx {
    public static void main(String[] args) {
        Instant  now = Instant.now();
        System.out.println(now);
        Instant now2 = now.truncatedTo(ChronoUnit.DAYS);
        System.out.println(now2);
        Period period = Period.of(1, 2, 5);
        LocalDate date = LocalDate.of(2022, 11, 20);
        date = date.plus(period);
        System.out.println(date);
    }
}
