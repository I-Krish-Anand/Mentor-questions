package com.day9;

import java.util.Scanner;

public class SeatingPosition {
//
//    Find the seating position of passengers on a flight. The seating arrangement of a flight will be as shown in the picture.
//
//
//
//    There are three types of seat positions
//
//1.Window Seat (WS) 2 Middle Seat (MS)
//
//3. Aisle Seat (AS)
//
//    Given a number print the corresponding seat position.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] seats = {"", "Window seat", "Middle seat", "Aisle seat"};

        int total_seats = scanner.nextInt();

        int seats_perRow = scanner.nextInt();

        int seat_no = scanner.nextInt();

        int row = seat_no / seats_perRow;

        int pos = seat_no % (seats_perRow / 2);

        pos = (pos==0?seats_perRow / 2:pos);

        if (row % 2 == 0) {

            if (seat_no % seats_perRow <= seats_perRow / 2)
                System.out.println(seats[pos]);
            else
                System.out.println(seats[seats.length - pos]);
        } else {

            if (seat_no % seats_perRow <= seats_perRow / 2)
                System.out.println(seats[seats.length - pos]);
            else
                System.out.println(seats[pos]);

        }


    }
}
