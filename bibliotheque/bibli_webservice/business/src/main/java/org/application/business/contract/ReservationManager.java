package org.application.business.contract;

import org.application.model.Reservation;

import java.util.List;

public interface ReservationManager {

    public List<Reservation> getListeReservations();

    void creerReservation(int idUser, int idLivre);

    public List<Reservation> getReservationsByIdLivre();
}
