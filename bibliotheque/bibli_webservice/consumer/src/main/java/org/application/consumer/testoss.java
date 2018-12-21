package org.application.consumer;

import org.application.consumer.impl.ReservationDaoImpl;
import org.application.model.Reservation;

import java.util.Calendar;
import java.util.Date;


public class testoss {
    public static void main (String [] args) {

        Reservation reservation = new Reservation();
        Calendar now = Calendar.getInstance();
        Date dateReservation = now.getTime();
       // reservation.setDateReservation(dateReservation);
        java.util.Date date = new java.util.Date(System.currentTimeMillis());
        java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());

        reservation.setDateReservation(timestamp);
        System.out.println("date :: "+date);
        System.out.println("timestamp :: "+timestamp);
        System.out.println("date resa " +dateReservation);
        System.out.println(reservation.getDateReservation());

    }
}
