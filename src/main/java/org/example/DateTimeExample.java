package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class DateTimeExample {
    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println("Current Date: " + currentDate);

        currentDate.setTime(currentDate.getTime() + 3600000);
        System.out.println("Modified Date: " + currentDate);


        Instant nowInstant = Instant.now();
        System.out.println("Current Instant: " + nowInstant);

        Instant newInstant = nowInstant.plusSeconds(3600);
        System.out.println("Original Instant after modification: " + nowInstant);
        System.out.println("New Instant: " + newInstant);


        LocalDate today = LocalDate.now();
        System.out.println("Today's LocalDate: " + today);

        LocalDate nextWeek = today.plusWeeks(1);
        System.out.println("LocalDate after one week: " + nextWeek);


        LocalTime currentTime = LocalTime.now();
        System.out.println("Current LocalTime: " + currentTime);



    }
}
