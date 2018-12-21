package org.application.consumer.contract;

import org.application.model.Reservation;

import java.util.List;

public interface ReservationDAO {

    void creerReservation(int idUser, int idLivre);

    List<Reservation> getListeReservations();

  //  List<Reservation> getReservationsByIdLivre;

}
