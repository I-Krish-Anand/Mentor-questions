package com.day8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InbetweenDays {

    public static void main(String[] args) {

        String fromDateString = "25-08-1998";
        String toDateString = "27-09-2020";

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date fromDate = null;
        Date toDate = null;

        try {
            fromDate = formatter.parse(fromDateString);
            toDate = formatter.parse(toDateString);

        } catch (ParseException e) {}

        long diffInMilliseconds = toDate.getTime() - fromDate.getTime();
        int totalDays = (int)(diffInMilliseconds / (1000 * 60 * 60 * 24)) ;

        System.out.println(totalDays);
    }
}
