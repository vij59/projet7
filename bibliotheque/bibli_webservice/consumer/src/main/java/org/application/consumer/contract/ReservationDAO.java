package org.application.consumer.contract;

import org.application.model.Reservation;

import java.util.List;

public interface ReservationDAO {

    void creerReservation(Reservation reservation);

    List<Reservation> getListeReservations();

  //  List<Reservation> getReservationsByIdLivre;

}
